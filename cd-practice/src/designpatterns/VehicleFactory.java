package designpatterns;

public class VehicleFactory  {
		public static Vehicle getVehicle(String type) {
			switch (type) {
			case "car": {
				return new Car();
			}
			case "bike": {
				return new Bike();
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + type);
			}
		}
}
