package behavioral.observerPattern.withoutObserver;

import behavioral.observerPattern.withoutObserver.model.AverageScoreDisplay;
import behavioral.observerPattern.withoutObserver.model.CurrentScoreDisplay;

public class CricketData {

  private int score, wickets;
  private float overs;
  private CurrentScoreDisplay currentScoreDisplay;
  private AverageScoreDisplay averageScoreDisplay;

  CricketData(CurrentScoreDisplay currentScoreDisplay, AverageScoreDisplay averageScoreDisplay) {
    this.currentScoreDisplay = currentScoreDisplay;
    this.averageScoreDisplay = averageScoreDisplay;
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
    currentScoreDisplay.update(score, wickets, overs);
    averageScoreDisplay.update(score, wickets, overs);
  }
}
