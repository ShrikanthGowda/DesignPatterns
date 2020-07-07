package behavioral.observerPattern.withObserver;

import behavioral.observerPattern.withObserver.model.AverageScoreDisplay;
import behavioral.observerPattern.withObserver.model.CurrentScoreDisplay;

public class DemoMain {

  public static void main(String args[]) {

    CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
    AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();

    CricketData cricketData = new CricketData();

    cricketData.subscribeObserver(currentScoreDisplay);
    cricketData.subscribeObserver(averageScoreDisplay);
    cricketData.updateDisplayData();

    cricketData.unsubscribeObserver(averageScoreDisplay);
    cricketData.updateDisplayData();
  }
}
