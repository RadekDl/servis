import java.time.LocalDate;

public class Truck {
    private String name;
    private String typ;
    private Driver driver;
    private LocalDate registration;
    private int intNuber;
    private String vin;
    private String spz;
    private double km;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }

    public int getIntNuber() {
        return intNuber;
    }

    public void setIntNuber(int intNuber) {
        this.intNuber = intNuber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        if (vin != null && vin.length()== 17){
            this.vin = vin.toUpperCase();
        }else {
            throw new IllegalArgumentException("VIN musí mít 17 znaků.");
            }

        }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
