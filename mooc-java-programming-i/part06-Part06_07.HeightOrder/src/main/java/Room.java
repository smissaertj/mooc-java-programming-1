import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public boolean isEmpty(){
        if (this.persons.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        if (this.isEmpty()){
            return null;
        }

        Person returnPerson = this.persons.get(0);

        for (Person person: persons){
            if (returnPerson.getHeight() > person.getHeight()){
                returnPerson = person;
            }
        }

        return returnPerson;
    }

    public Person take(){
        if (this.persons.isEmpty()){
            return null;
        }

        Person shortestPerson = this.shortest();
        persons.remove(shortestPerson);
        return shortestPerson;
    }
}
