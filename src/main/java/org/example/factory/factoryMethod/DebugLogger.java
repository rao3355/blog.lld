package org.example.factory.factoryMethod;

public class DebugLogger implements Ilogger{
    @Override
    public void log(String message) {
        System.out.println("[DEBUG] " + message );
    }
}
