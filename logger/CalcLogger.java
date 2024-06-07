package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcLogger {
    private Logger logger = Logger.getLogger(CalcLogger.class.getName());
    public void initLogger(String message) {
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.info(message);
        //logger.log(Level.INFO, message);
    }
}
