package org.example.factory.factoryMethod;

public class DebugLoggerFactory extends LoggerFactory{
    @Override
    public Ilogger createLogger() {
        return new DebugLogger();
    }
}
