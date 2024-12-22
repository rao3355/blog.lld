package org.example.factory.factoryMethod;

public class Factory {
    //first create a factory object.
    //then use the factory object to create Ilogger object
    public static void main(String[] args) {
        LoggerFactory infoLogger = new InfoLoggerFactory();
        Ilogger infoLoggerLogger = infoLogger.createLogger();
        infoLoggerLogger.log("call to info");

        LoggerFactory debugLogger = new DebugLoggerFactory();
        Ilogger debugLoggerLogger = debugLogger.createLogger();
        debugLoggerLogger.log("call to debug");

        LoggerFactory errorLogger = new ErrorLoggerFactory();
        Ilogger errorLog = errorLogger.createLogger();
        errorLog.log("call to error");
    }




}
