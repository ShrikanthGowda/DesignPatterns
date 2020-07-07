package behavioral.observerPattern.withObserver;

import behavioral.observerPattern.withObserver.model.Observer;

public interface Subject {

  void subscribeObserver(Observer observer);
  void unsubscribeObserver(Observer observer);
  void notifyObserver();
}
