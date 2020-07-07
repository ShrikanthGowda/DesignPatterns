package behavioral.observerPattern.withObserver.model;

public class CurrentScoreDisplay implements Observer {

  private int score, wickets;
  private float overs;

  private void display() {
    System.out.println("\nCurrent Score Display: \n" + "Score: " + score +"\nWickets:" + wickets + "\nOvers: " + overs);
  }

  @Override
  public void update(int score, int wickets, float overs) {

    this.score = score;
    this.wickets = wickets;
    this.overs = overs;
    display();
  }
}
