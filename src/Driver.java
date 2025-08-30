public class Driver {
    private String name;
    private String jobTelefonNumber;
    private String telefonNumber2;


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
}
