package logger;

public class TraceLogger extends Logger{
    public TraceLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LogLevels logLevel, String message) {
        if (logLevel == LogLevels.TRACE && (logLevel.ordinal()>=super.getLoggerLevel().ordinal())){
            System.out.println("TRACE :"+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}

