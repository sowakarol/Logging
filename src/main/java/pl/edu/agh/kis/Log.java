package pl.edu.agh.kis;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by karl on 11/26/16.
 */

class Log implements Comparable<Log> {
    /**
     * Wartość int logu zależna od INFO,CRITICAL,WARNING,ERROR
     */
    final private int value;
    String communicate = "";

    /**
     * @param s    obowiązkowy parametr, określa wartość int ze wzgledu na ważność logu
     * @param args dodatkowe parametry
     *             Konstruktor pojedynczego loga
     */
    Log(String s, String[] args) {
        if (s == null) {
            value = stringToIntValueOfLog("NOTSET"); //default value
        } else {
            value = stringToIntValueOfLog(s);
        }
        //System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            communicate += args[i];
        }

    }

    /**
     * @param s String ważności loga
     * @return zwraca wartość int
     */
    static int stringToIntValueOfLog(String s) {
        switch (s) {
            case "INFO":
                return 20;
            case "WARNING":
                return 30;
            case "ERROR":
                return 40;
            case "CRITICAL":
                return 50;
            default:
                return 0; //equals NOTSET
        }
    }

    /**
     * @param n zamienia int na Stringa ważności
     * @return w zależności od stopnia ważności String ważności
     */
    static String intToStringValueOfLog(int n) {
        switch (n) {
            case 20:
                return "INFO";
            case 30:
                return "WARNING";
            case 40:
                return "ERROR";
            case 50:
                return "CRITICAL";
            default:
                return "NOTSET";
        }
    }

    /**
     * @return metoda zwraca datę utworzenia logu
     */
    private String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    @Override
    public String toString() {
        String ret = intToStringValueOfLog(this.value) + ": ";
        return ret + getDate() + " " + communicate;
    }

    @Override
    public int compareTo(Log o) {
        if (this.value > o.value) {
            return 1;
        } else if (this.value == o.value) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * @return getter wartości value
     */
    public int getValue() {
        return value;
    }
}
