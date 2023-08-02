package logger;

public class WarnLogger extends Logger{
    public WarnLogger(Logger nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(LogLevels logLevel, String message) {
        if (logLevel == LogLevels.WARNING && (logLevel.ordinal()>=super.getLoggerLevel().ordinal())){
            System.out.println("WARNING :"+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
