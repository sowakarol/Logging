package pl.edu.agh.kis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by karl on 11/26/16.
 */
public class LoggingToFile extends LoggingAbstract {
    String fileName;

    /**
     * @param fileName nazwa pliku do którego zostaną zapisane logi
     */
    public LoggingToFile(String fileName) {
        this.fileName = fileName;
    }

    /**
     * domyślny konstruktor który zapisuje logi do pliku logs.txt
     */
    public LoggingToFile() {
        this("logs.txt");
    }

    public static void main(String[] args) {
        LoggingToFile l = new LoggingToFile();
        l.config("ERROR");
        l.critical("val1: " + 12 + " val2" + 4);
        l.critical("val1: " + 24 + " val2" + 114);

        l.error("x=" + 4);
        l.warning("y=" + 1111);

        l.info("vvv " + "qwe");
        l.print();
    }

    /**
     * Wypisuje logi w zależności od wartości loggingValue do pliku fileName
     */
    @Override
    public void print() {
        File f = new File(fileName);
        try {
            PrintWriter writer = new PrintWriter(f);
            for (Log log : arrayListOfLogs) {
                if (log.getValue() >= loggingValue) {
                    writer.write(log.toString());
                    writer.write("\n");
                }
            }

            writer.close();
            //writer.write();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
