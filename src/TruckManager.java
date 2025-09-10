import java.util.ArrayList;
import java.util.List;

public class TruckManager {
    private List<Truck> trucks;

    public TruckManager(){
        trucks = new ArrayList<>();
    }

    public List<Truck> getTrucks() {
        return trucks;
    }

    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    public List<Truck> getAllTrucks() {
        return trucks;
    }

    public Truck findTruckById(int intNumber){
        for (Truck truck : trucks){
            if (truck.getIntNumber() == intNumber) {
                return truck;
            }
        }
        return  null;
    }

    public Truck findTruckBySpz(String spz){
        for ( Truck truck : trucks){
            if (truck.getSpz().equalsIgnoreCase(spz)){
                return truck;
            }
        }
        return null;
    }

    public Truck findTruckByVin(String vin){
        for (Truck truck : trucks){
            if (truck.getVin().equalsIgnoreCase(vin)){
                return truck;
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

    //        Toto je lambda výraz – zkrácená anonymní funkce.//


    public boolean removeTruckById(int intNumber) {
        return trucks.removeIf(truck -> truck.getIntNumber() == intNumber);
    }

    public boolean removeTruckBySpz(String spz) {
        return trucks.removeIf(truck -> truck.getSpz().equalsIgnoreCase(spz));
    }

    public boolean removeTruckByVin(String vin) {
        return trucks.removeIf(truck -> truck.getVin().equalsIgnoreCase(vin));
    }

}
