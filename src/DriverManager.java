import java.util.ArrayList;
import java.util.List;

public class DriverManager {
    private List<Driver> drivers;

    public DriverManager() {
        drivers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public List<Driver> getAllDrivers() {
        return drivers;
    }

    public Driver findDriverByName(String name) {
        for (Driver driver : drivers) {
            if (driver.getName().equalsIgnoreCase(name)) {
                return driver;
            }
        }
        return null;
    }

    public boolean removeDriverById(String id) {
        for (Driver driver : drivers) {
            if (driver.getId().equals(id)) {
                drivers.remove(driver);
                return true;
            }
        }
        return false;
    }
}