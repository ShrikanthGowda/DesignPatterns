package behavioral.observerPattern.withObserver;

import behavioral.observerPattern.withObserver.model.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CricketData implements Subject {

  private int score, wickets;
  private float overs;
  private List<Observer> observerList;

  CricketData() {
    observerList = new ArrayList<>();
  }

  @Override
  public void subscribeObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void unsubscribeObserver(Observer observer) {
    observerList.remove(observerList.indexOf(observer));
  }

  @Override
  public void notifyObserver() {

    Iterator<Observer> observerIterator = observerList.iterator();
    while(observerIterator.hasNext()) {
      Observer observer = observerIterator.next();
      observer.update(score, wickets, overs);
    }
  }

  private int getLatestScore() {
    return 70;
  }

  private int getLatestWickets() {
    return 3;
  }

  private float getLatestOvers() {
    return (float) 10.1;
  }

  public void updateDisplayData() {

    this.score = getLatestScore();
    this.wickets = getLatestWickets();
    this.overs = getLatestOvers();
    notifyObserver();
  }
}
