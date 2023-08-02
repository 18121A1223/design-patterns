package logger;

import java.util.Scanner;
import java.util.logging.Level;

public abstract class Logger {
    private Logger nextLogger;
    private static LogLevels LoggerLevel = LogLevels.TRACE;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }



    public LogLevels getLoggerLevel() {
        return LoggerLevel;
    }

    public void setLoggerLevel(LogLevels loggerLevel) {
        LoggerLevel = loggerLevel;
    }

    public void log(LogLevels logLevel, String message){
        if (nextLogger!=null)
            nextLogger.log(logLevel,message);
    }
}
