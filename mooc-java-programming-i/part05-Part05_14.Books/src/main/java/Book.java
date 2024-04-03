
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared){
        // If the objects are located on the same memory address, then they are equal.
        if (this == compared){
            return true;
        }

        // If the compared object is not an instance of this class, they can't be equal.
        if(!(compared instanceof Book)){
            return false;
        }

        // The compard object is an instance of this class, we can now compare the instance variables
        Book comparedBookObj = (Book) compared;
        if(
            this.name.equals(comparedBookObj.name) &&
            this.publicationYear == comparedBookObj.publicationYear
        ){return true;}

        // else, the objects are not equal
        return false;
    }

}
