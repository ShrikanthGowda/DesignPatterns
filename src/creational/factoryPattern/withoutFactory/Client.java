package creational.factoryPattern.withoutFactory;

import creational.factoryPattern.model.BusTravel;
import creational.factoryPattern.model.FlightTravel;
import creational.factoryPattern.model.TrainTravel;
import creational.factoryPattern.model.TravelBooking;

public class Client {

  static TravelBooking getTravelType(String type) {

    if(type.equalsIgnoreCase("Bus"))
      return new BusTravel();
    if(type.equalsIgnoreCase("Train"))
      return new TrainTravel();
    if(type.equalsIgnoreCase("Flight"))
      return new FlightTravel();
    return null;
  }


  public static void main(String args[]) {
    TravelBooking travelBooking = getTravelType("Bus");
    travelBooking.confirmBooking("Professor", "Spain", "Gold Reservoir");

    travelBooking = getTravelType("Train");
    travelBooking.confirmBooking("Tokyo", "Rio", "Denver");

    travelBooking = getTravelType("Flight");
    travelBooking.confirmBooking("Berlin", "Palerma", "Professor");

    travelBooking = getTravelType("Fly");
    try {
      travelBooking.confirmBooking("Raquel", "Police Dept", "Robbery");
    }
    catch (NullPointerException e) {
      System.out.println("Fly not supported");
    }

  }

}
