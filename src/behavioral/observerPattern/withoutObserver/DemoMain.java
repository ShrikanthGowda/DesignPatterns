package behavioral.observerPattern.withoutObserver;

import behavioral.observerPattern.withoutObserver.model.AverageScoreDisplay;
import behavioral.observerPattern.withoutObserver.model.CurrentScoreDisplay;

public class DemoMain {

  public static void main(String args[]) {

    CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
    AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();

    CricketData cricketData = new CricketData(currentScoreDisplay, averageScoreDisplay);
    cricketData.updateDisplayData();
  }
}
