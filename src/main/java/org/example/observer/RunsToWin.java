package org.example.observer;

public class RunsToWin implements Observer {
    @Override
    public void update(Long score) {
        System.out.println("Runs to win: " + score);
    }
}
