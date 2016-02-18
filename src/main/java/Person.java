import helperclasses.GenderPerson;

/**
 * Created by filipve on 17/02/2016.
 */
public abstract class Person {

    private String name;
    private String familyName;
    private int age; // TODO: Geboortedatum maken aan de hand van berekening uit een datum object
    private GenderPerson gender;

    public Person( String name, String familyName, int age, GenderPerson gender ) {
        setName ( name );
        setFamilyName ( familyName );
        setAge ( age );
        setGender ( gender );
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName( String familyName ) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public GenderPerson getGender() {
        return gender;
    }

    public void setGender( GenderPerson gender ) {
        this.gender = gender;
    }
}
