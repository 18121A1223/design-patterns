package logger;

public class InfoLogger extends Logger {


    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LogLevels logLevel, String message) {
        if (logLevel == LogLevels.TRACE && (logLevel.ordinal()>=super.getLoggerLevel().ordinal())){
            System.out.println("INFO :"+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
