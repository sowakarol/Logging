package pl.edu.agh.kis;


/**
 * Created by karl on 11/26/16.
 */


interface LoggingInterface {
    /**
     * @param args pierwszy argument ustala do jakiego priorytetu mają zostać wypisane dane (możliwość rozbudowy na więcej argumentów)
     */
    void config(String... args);

    /**
     * @param args dodaje Log info, z możliwością podania argumentów
     */
    void info(String... args);

    /**
     * @param args dodaje Log warning, z możliwością podania argumentów
     */
    void warning(String... args);

    /**
     * @param args dodaje Log error, z możliwością podania argumentów
     */
    void error(String... args);

    /**
     * @param args dodaje Log critical, z możliwością podania argumentów
     */
    void critical(String... args);

    /**
     * Wypisuje logi, zależne od konfiguracji
     */
    void print();
}
