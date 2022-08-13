public class Person {

    protected String name;
    protected String familyName;
    protected int ticketsAmount;

    public Person(String name, String familyName, int ticketsAmount) {
        this.name = name;
        this.familyName = familyName;
        this.ticketsAmount = ticketsAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getTicketsAmount() {
        return ticketsAmount;
    }

    public void setTicketsAmount(int ticketsAmount) {
        this.ticketsAmount = ticketsAmount;
    }

    @Override
    public String toString() {
        return name + " " + familyName + " прокатился на аттракционе";
    }
}
