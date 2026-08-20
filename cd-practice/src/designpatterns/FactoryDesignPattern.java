package designpatterns;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		Vehicle vehicle = VehicleFactory.getVehicle("car");
		vehicle.drive();
	}
}
