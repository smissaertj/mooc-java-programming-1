
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Object comparedObj){
        // Is the memory address the same?
        if (this == comparedObj){
            return true;
        }

        // is the compared Object an instance of this class?
        if (!(comparedObj instanceof Person)){
            return false;
        }

        // Now that we now that comparedObj is a Person
        // Convert the compared object of the Object class to a Person object
        Person comparedPersonObj = (Person) comparedObj;

        // Check if the variables have the same value, if yes then the objects are equal
        if (
            (this.name.equals(comparedPersonObj.name)) &&
            this.height == comparedPersonObj.height &&
            this.weight == comparedPersonObj.weight &&
            this.birthday.getDay() == comparedPersonObj.birthday.getDay() &&
            this.birthday.getMonth() == comparedPersonObj.birthday.getMonth() &&
            this.birthday.getYear() == comparedPersonObj.birthday.getYear()
        ){ return true; }

        // Otherwise, objects are not equal
        return false;
    }
}
