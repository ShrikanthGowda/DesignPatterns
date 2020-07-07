package behavioral.observerPattern.withoutObserver.model;

public class CurrentScoreDisplay {

  private int score, wickets;
  private float overs;

  public void display() {
    System.out.println("\nCurrent Score Display: \n" + "Score: " + score +"\nWickets:" + wickets + "\nOvers: " + overs);
  }

  public void update(int score, int wickets, float overs) {
    this.score = score;
    this.wickets = wickets;
    this.overs = overs;
    display();
  }
}
