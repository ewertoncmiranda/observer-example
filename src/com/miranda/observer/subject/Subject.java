package com.miranda.observer.subject;

import com.miranda.observer.observer.CharObserver;

public interface Subject {
    public void registerObserver(CharObserver observer);
    public void removeObserver(CharObserver observer);
    public void notifyObservers();
}
