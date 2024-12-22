package org.example.factory.factoryMethod;

public class ErrorLogger implements Ilogger{
    @Override
    public void log(String message) {
        System.out.println("[ERROR] " + message );
    }
}
