import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        TruckManager truckManager = new TruckManager();
        DriverManager manager = new DriverManager();

        Driver d1 = new Driver("Jan Novák", "123456789");
        Driver d2 = new Driver("Jan Novák", "987654321");

        Truck t1 = new Truck(LocalDate.of(2025,9,4),1,
                "12345678901234567","ABC1234");
        Truck t2 = new Truck(LocalDate.of(2025,9,5),2,
                "AB34567890B1234567","ABC1235");

        manager.addDriver(d1);
        manager.addDriver(d2);

        truckManager.addTruck(t1);

//        System.out.println(manager.getAllDrivers().get(0).getName()+ " " + manager.getAllDrivers().get(0).getId());
//        System.out.println(manager.getAllDrivers().get(1).getName()+ " " + manager.getAllDrivers().get(1).getId());

        for (Truck t : truckManager.getAllTrucks()){
            System.out.println(t);
        }
        System.out.println(" ");


        // automaticky zavolá d.toString()
        for (Driver d : manager.getAllDrivers()) {
            System.out.println(d);
        }

// Smažeme prvního Jana Nováka podle jeho ID
        boolean removed = manager.removeDriverById(d1.getId());

        if (removed) {
            System.out.println("Řidič smazán.");
        } else {
            System.out.println("Řidič nenalezen.");
        }
        List<Driver> seznam = manager.getAllDrivers();

        System.out.println("výpis po výmazu řidiče/ů");

        for (Driver d : manager.getAllDrivers()) {
            System.out.println(d); // automaticky zavolá d.toString()
        }







    }
}