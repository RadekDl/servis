import java.time.LocalDate;

public class Truck {
    private String name;
    private String typ;
    private Driver driver;
    private LocalDate registration;
    private int intNumber;
    private String vin;
    private String spz;
    private double km;


    public Truck(String name, String typ, Driver driver, LocalDate registration,
                 int intNumber, String vin, String spz, double km) {
        this.name = name;
        this.typ = typ;
        this.driver = driver;
        this.registration = registration;
        this.intNumber = intNumber;
        this.vin = vin;
        this.spz = spz;
        this.km = km;
    }

    public Truck(LocalDate registration, int intNumber, String vin, String spz){
        this(null,null,null,registration,intNumber,vin,spz,0);
    }

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

    public int getIntNumber() {
        return intNumber;
    }

    public void setIntNumber(int intNumber) {
        this.intNumber = intNumber;
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

    @Override
    public String toString() {
        return "Truck{" +
                "jméno = '" + name + '\'' +
                ", typ = '" + typ + '\'' +
                ", řidič = " + driver +
                ", registrace = " + registration +
                ", int číslo = " + intNumber +
                ", VIN = '" + vin + '\'' +
                ", SPZ = '" + spz + '\'' +
                ", km = " + km +
                '}';
    }
}
