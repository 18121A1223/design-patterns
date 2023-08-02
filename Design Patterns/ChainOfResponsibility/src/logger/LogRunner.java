package logger;

public class LogRunner {
    public static void main(String args[]){

        Logger obj = new TraceLogger(new DebugLogger(new InfoLogger(new WarnLogger(new ErrorLogger(null)))));

        obj.setLoggerLevel(LogLevels.INFO);
        System.out.println(obj.getLoggerLevel());
        obj.log(LogLevels.ERROR,"error occured in line 26");
        obj.log(LogLevels.TRACE,"error occured in line 26");



    }
}
