package org.example.factory.factoryMethod;

public class InfoLoggerImpl implements Ilogger{
    @Override
    public void log(String message) {
        System.out.println("[INFO] " + message );
    }
}
