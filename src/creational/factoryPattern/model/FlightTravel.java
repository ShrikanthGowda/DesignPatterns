package creational.factoryPattern.model;

public class FlightTravel implements TravelBooking {


  @Override
  public void confirmBooking(String name, String source, String dest) {
    System.out.println("Flight Ticket Booking confirmed for " + name + " from " + source + " to " + dest);
  }
}
