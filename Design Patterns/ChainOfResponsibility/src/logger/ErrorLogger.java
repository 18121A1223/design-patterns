package logger;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(LogLevels logLevel, String message) {
        if (logLevel == LogLevels.ERROR && (logLevel.ordinal()>=super.getLoggerLevel().ordinal())){
            System.out.println("Error :"+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
