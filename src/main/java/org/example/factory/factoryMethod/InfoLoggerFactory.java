package org.example.factory.factoryMethod;

import org.example.factory.factoryMethod.InfoLoggerFactory;

public class InfoLoggerFactory extends LoggerFactory{
    @Override
    public Ilogger createLogger() {
        return new InfoLoggerImpl();
    }
}
