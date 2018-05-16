package lombok;

public class PersonVanillaJava {
    private String firstName;

    public PersonVanillaJava(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "PersonVanillaJava(firstName=" + this.firstName + ")";
    }
}
