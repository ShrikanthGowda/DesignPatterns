package creational.factoryPattern.withFactory;

import creational.factoryPattern.model.TravelBooking;

public class ClientDemo {

  public static void main(String args[]) {

    TravelBooking travelBooking = BookingFactory.getTravelType("Bus");
    travelBooking.confirmBooking("Professor", "Spain", "Gold Reservoir");

    travelBooking = BookingFactory.getTravelType("Train");
    travelBooking.confirmBooking("Tokyo", "Rio", "Denver");

    travelBooking = BookingFactory.getTravelType("Flight");
    travelBooking.confirmBooking("Berlin", "Palerma", "Professor");

    travelBooking = BookingFactory.getTravelType("Fly");
    try {
      travelBooking.confirmBooking("Raquel", "Police Dept", "Robbery");
    }
    catch (NullPointerException e) {
      System.out.println("Fly not supported");
    }
  }
}
