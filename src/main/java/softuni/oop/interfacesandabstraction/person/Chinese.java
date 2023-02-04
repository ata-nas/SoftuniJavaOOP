package softuni.oop.interfacesandabstraction.person;

public class Chinese extends BasePerson implements Person{
    private String name;

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
