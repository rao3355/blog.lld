package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketMatch implements Subject{
    private List<Observer> observers; //this can be any type of collection like set, map. choose based on the use case .
    private Long score; //
    public CricketMatch(){
        observers = new ArrayList<Observer>();
        score = 0L;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(score);
        }
    }
    public void setScore(Long score) {
        this.score = score;
        notifyObservers();
    }
}
