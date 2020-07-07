package creational.factoryPattern.model;

public class TrainTravel implements TravelBooking {


  @Override
  public void confirmBooking(String name, String source, String dest) {
    System.out.println("Train Ticket Booking confirmed for " + name + " from " + source + " to " + dest);
  }
}
