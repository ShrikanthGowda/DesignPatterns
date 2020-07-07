package creational.factoryPattern.withFactory;

import creational.factoryPattern.model.BusTravel;
import creational.factoryPattern.model.FlightTravel;
import creational.factoryPattern.model.TrainTravel;
import creational.factoryPattern.model.TravelBooking;

public class BookingFactory {

  static TravelBooking getTravelType(String type) {

    if(type == null)
      return null;

    if(type.equalsIgnoreCase("Bus"))
      return new BusTravel();
    if(type.equalsIgnoreCase("Train"))
      return new TrainTravel();
    if(type.equalsIgnoreCase("Flight"))
      return new FlightTravel();

    return null;
  }
}
