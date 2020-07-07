package behavioral.observerPattern.withoutObserver.model;

public class AverageScoreDisplay {

  private float runRate;
  private int predictedScore;

  public void display() {
    System.out.println("\nAverage Score Display:\n" + "Run Rate: " + runRate + "\nPredictedScore: " + predictedScore);
  }

  public void update(int score, int wickets, float overs) {
    runRate = (float)score/overs;
    predictedScore = (int) (runRate * 50);
    display();
  }
}
