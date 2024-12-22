package org.example.observer;

public class AverageScoreObserver implements Observer{
    @Override
    public void update(Long score) {
        System.out.println("average score: " + score);
    }
}
