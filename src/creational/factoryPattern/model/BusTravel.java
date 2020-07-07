package creational.factoryPattern.model;

public class BusTravel implements TravelBooking {

  @Override
  public void confirmBooking(String name, String source, String dest) {
    System.out.println("Bus Ticket Booking confirmed for " + name + " from " + source + " to " + dest);
  }
}
