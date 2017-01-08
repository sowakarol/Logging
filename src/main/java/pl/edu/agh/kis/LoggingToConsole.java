package pl.edu.agh.kis;

/**
 * Created by karl on 11/26/16.
 */
public class LoggingToConsole extends LoggingAbstract{
    /**
     * Wypisuje logi w zależności od wartości loggingValue do konsoli
     */
    @Override
    public void print() {
        for (Log log: arrayListOfLogs) {
            if(log.getValue() >= loggingValue){
                System.out.println(log.toString());
            }
        }
    }

    public static void main(String[] args) {
        LoggingToConsole l = new LoggingToConsole();
        l.config("CRITICAL");
        l.critical("" +"val1: " +  12 + " val2" + 4);
        l.critical("" +"val1: " +  24 + " val2" + 114);

        l.info("" + "vvv " + "qwe");
        l.print();
    }
}
