package behavioral.observerPattern.withObserver.model;

public class AverageScoreDisplay implements Observer {

  private float runRate;
  private int predictedScore;

  private void display() {
    System.out.println("\nAverage Score Display:\n" + "Run Rate: " + runRate + "\nPredictedScore: " + predictedScore);
  }

  @Override
  public void update(int score, int wickets, float overs) {

    runRate = (float)score/overs;
    predictedScore = (int) (runRate * 50);
    display();
  }
}
