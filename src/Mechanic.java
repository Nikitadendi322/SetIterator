public class Mechanic {
    private String name;
    private String middleName;
    private String company;

    public Mechanic(String name, String middleName, String company){
        this.name=name;
        this.middleName=middleName;
        this.company=company;



    }
    public String getName() {
        return name;
    }



    public String getMiddleName() {
        return middleName;
    }



    public String getCompany() {
        return company;
    }



    public void fixTheCar(Bus bus) {
    }

    public void performMaintenance(Bus bus) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}