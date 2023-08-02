package logger;

public class DebugLogger extends Logger{

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LogLevels logLevel, String message) {
        if ((logLevel == LogLevels.DEBUG) && (logLevel.ordinal()>=super.getLoggerLevel().ordinal())){
            System.out.println("DEBUG :"+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
