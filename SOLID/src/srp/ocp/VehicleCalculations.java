package srp.ocp;

public class VehicleCalculations {
    public double calculateValue(Vehicle v) {
        double value=0;
        if (v instanceof Car) {
            value= v.getValue() * 0.8;
        }
        if (v instanceof Bike) {
           value= v.getValue() * 0.5;
        }
        return value ;
    }
}
