import java.util.UUID;

public class Driver {
    private final String id;
    private String name;
    private String jobTelefonNumber;
    private String telefonNumber2;


    public Driver(String name, String jobTelefonNumber, String telefonNumber2) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.jobTelefonNumber = jobTelefonNumber;
        this.telefonNumber2 = telefonNumber2;
    }

    public Driver(String name, String jobTelefonNumber){
        this(name, jobTelefonNumber, null);

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTelefonNumber() {
        return jobTelefonNumber;
    }

    public void setJobTelefonNumber(String jobTelefonNumber) {
        if (jobTelefonNumber != null && jobTelefonNumber.matches("\\d{9}")) {
            this.jobTelefonNumber = jobTelefonNumber;
        } else {
            throw new IllegalArgumentException("telefoní číslo musí být devítimístné 123456789 ");
        }
    }


    public String getTelefonNumber2() {
        return telefonNumber2;
    }

    public void setTelefonNumber2(String telefonNumber2) {
        this.telefonNumber2 = telefonNumber2;
    }

    @Override
    public String toString() {
        return "Řidič {" +
                "id ='" + id + '\'' +
                ", jméno ='" + name + '\'' +
                ", pracovní telefon='" + jobTelefonNumber + '\'' +
                ", další telefon ='" + telefonNumber2 + '\'' +
                '}';
    }
}
