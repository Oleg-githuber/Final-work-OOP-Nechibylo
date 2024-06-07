package logger;

import java.util.logging.Logger;

public class CalcLogger {
    private Logger logger = Logger.getLogger(CalcLogger.class.getName());
    public void printLog(String message) {
        logger.info(message);
    }
}
