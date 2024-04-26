package designPatterns.creational.abstract_factory;

public class VehicleFactoryProducer {
    public static VehicleFactory getVehicleFactory(String input){
        return switch(input){
            case "LUXURY" -> new LuxuryVehicleFactory();
            case "ORDINARY" -> new OrdinaryVehicleFactory();
            default -> null;
        };
    }

}
