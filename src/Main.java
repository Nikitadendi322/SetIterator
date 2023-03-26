import java.util.*;

public class Main {

    public static void main(String[] args) throws TransportTypeException {
        for (int i = 1; i <= 4; i++) {
//            DriverB driverB = new DriverB("Driver №" + i, true, 5 + i);
//            Car car = new Car(
//                    "Car brand №" + i,
//                    "Car model №" + i,
//                    1.4,
//                    driverB,
//                    BodyType.CROSSOVER,
//                    );
//            DriverC driverC = new DriverC("Driver №" + i, true, 7 + i);
//            Truck truck = new Truck(
//                    "Truck brand №" + i,
//                    "Truck model №" + i,
//                    4.0,
//                    driverC,
//                    );
//            DriverD driverD = new DriverD("Driver №" + i, true, 10 + i);
//            Bus bus = new Bus(
//                    "Bus brand №" + i,
//                    "Bus model №" + i,
//                    4.8,
//                    driverD,
//                    BodyType.COUPE,
//
//                    );
//            printInfo(car);
//            printInfo(bus);
//            printInfo(truck);
//
//            System.out.println(truck.passDiagnostic());
//            System.out.println(car.passDiagnostic());
//            System.out.println();
//
//            truck.passDiagnostic();
//            car.passDiagnostic();
//            bus.passDiagnostic();
//            TestCar.checkTransport(bus, truck, truck);

            Mechanic mechanicIvan = new Mechanic("Ivan", "Ivanon", "Z-Auto");
            Mechanic mechanicPetr = new Mechanic("Petr", "Pavlov", "Z-Auto");
            Mechanic mechanicViktor = new Mechanic("Viktor", "Pavlov", "Z-Auto");

            Car car = new Car("Opel", "Corsa", 12, "B", BodyType.HATCHBACK, List.of(mechanicIvan));
            Bus bus = new Car("Mersedes", "Conecto", 12, "C", BodyType.CROSSOVER, List.of(mechanicPetr));
            Truck truck = new Car("Белаз", "75231", 12, "D", BodyType.COUPE, List.of(mechanicViktor));
            System.out.println(bus.getDriver());
            System.out.println(bus.getMechanics());

            DriverB driverB = new DriverB("Ivan", true, 20);
            DriverC driverC = new DriverC("Petr", true, 1);
            DriverD driverD = new DriverD("Viktor", true, 4);

            List<Transport> racers = new ArrayList<>();

            racers.add(car);
            racers.add(truck);
            racers.add(bus);

            mechanicIvan.fixTheCar(bus);
            mechanicIvan.performMaintenance(bus);


            List<Driver> drivers = new ArrayList<>();
            drivers.add(driverB);
            drivers.add(driverC);
            drivers.add(driverD);

            List<Mechanic> mechanics = new ArrayList<>();


            Mechanic mechanic1 = new Mechanic("Алексей", "Павлов", "Zed-Company");
            Mechanic mechanic2 = new Mechanic("Иван", "Иванов", "Red-Company");
            Mechanic mechanic3 = new Mechanic("Cергей", "Cергеевич", "Blue-Company");

            car.addDriver(driverB);
            car.addDriver(driverC);
            car.addMechanic(mechanic1);
            bus.addDriver(driverD);
            bus.addMechanic(mechanic3);
            truck.addDriver(driverC);
            truck.addMechanic(mechanic2);

            Map<Transport, Mechanic> map = new HashMap<>();

            for (Transport transport : racers) {
                map.put(transport, (Mechanic) transport.getMechanicList().get(0));
            }


            Set<Driver> driverSet = new HashSet<>();

            for (Driver driver : drivers) {
                driverSet.add(driver);
            }
            Iterator<Driver>iterator=driverSet.iterator();

            while (iterator.hasNext()){
                Driver driver=iterator.next();
                System.out.println(driver);
            }
        }
    }
}
