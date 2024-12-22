package org.example.observer;

public class RunsAganistPlayer implements Observer{
    @Override
    public void update(Long score) {
        System.out.println("runs by player one: " + score);
    }
}
