package org.example.factory;

public class LoggerImpl {
    public interface Ilogger{
       void log(String logMessage);
    }
    //Now Implementation of Info Logger
    public static class InfoLogger implements Ilogger{
        @Override
        public void log(String logMessage) {
            System.out.println("Info: " + logMessage);
        }
    }

    //Now Implementation of Debug Logger
    public static class DebugLogger implements Ilogger{
        @Override
        public void log(String logMessage) {
            System.out.println("Debug: " + logMessage);
        }
    }

    //Now Implementation of Error Logger
    public static class ErrorLogger implements Ilogger{
        @Override
        public void log(String logMessage) {
            System.out.println("Error: " + logMessage);
        }
    }

    //Now Factory Method to create Loggers
    public static class LoggerFactory{
        public static Ilogger getLogger(String type){
            if(type.equalsIgnoreCase("INFO")){
                return new InfoLogger();
            }else if(type.equalsIgnoreCase("DEBUG")){
                return new DebugLogger();
            } else if(type.equalsIgnoreCase("ERROR")){
                return new ErrorLogger();
            } else {
                throw new IllegalArgumentException("Invalid Logger Type");
            }
        }
    }
    public static void main(String[] args) {
        Ilogger info= LoggerFactory.getLogger("INFO");
        Ilogger debug = LoggerFactory.getLogger("DEBUG");
        Ilogger error = LoggerFactory.getLogger("ERROR");
       info.log("call to info logger");
       debug.log("call to debug logger");
       error.log("call to error logger");

    }


}
