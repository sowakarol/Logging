package pl.edu.agh.kis;

import java.util.ArrayList;

/**
 * Created by karl on 11/26/16.
 */
abstract public class LoggingAbstract implements LoggingInterface {
    /**
     * ustala dla biblioteki wartość int z INFO, CRITICAL,ERROR,WARNING, można zmienić przez metodę config()
     */
    protected int loggingValue = 0; // NOTSET
    /**
     * ArrayList przechowujący logi, które doda biblioteka
     */
    protected ArrayList<Log> arrayListOfLogs = new ArrayList<Log>();


    @Override
    public void config(String... args) {
        if (args.length > 0) {
            loggingValue = Log.stringToIntValueOfLog(args[0]);
        } else {
            loggingValue = Log.stringToIntValueOfLog("");
        }
    }

    @Override
    public void critical(String... args) {
        Log newLog = new Log("CRITICAL", args);
        arrayListOfLogs.add(newLog);
    }

    @Override
    public void error(String... args) {
        Log newLog = new Log("ERROR", args);
        arrayListOfLogs.add(newLog);

    }

    @Override
    public void info(String... args) {
        Log newLog = new Log("INFO", args);
        arrayListOfLogs.add(newLog);

    }

    @Override
    public void warning(String... args) {
        Log newLog = new Log("WARNING", args);
        arrayListOfLogs.add(newLog);

    }

    public abstract void print();


}
