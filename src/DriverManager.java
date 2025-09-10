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

//    ❗ Problém: ConcurrentModificationException
//
//    V Javě není bezpečné měnit (remove) kolekci během for-each cyklu.
//    Pokud drivers je instance ArrayList, může tento kód vyhodit výjimku:
//    ✅ Oprava pomocí lambda (removeIf)//
//    Bezpečně a jednoduše můžeš použít lambda výraz s metodou removeIf:

    public boolean removeDriverById(String id) {
        return drivers.removeIf(driver -> driver.getId().equals(id));
//        Toto je lambda výraz – zkrácená anonymní funkce.//
//        Překlad://
//       „Pro každý driver v seznamu drivers zjisti, jestli driver.getId().equals(id) je pravda.“//
//        Co znamená://
//        Pokud ID řidiče je stejné jako hledané id, vrať true → tento řidič bude odstraněn.
    }
}