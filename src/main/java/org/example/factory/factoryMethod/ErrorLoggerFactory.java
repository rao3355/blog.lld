package org.example.factory.factoryMethod;

public class ErrorLoggerFactory extends LoggerFactory{
    @Override
    public Ilogger createLogger() {
        return new ErrorLogger();
    }
}
