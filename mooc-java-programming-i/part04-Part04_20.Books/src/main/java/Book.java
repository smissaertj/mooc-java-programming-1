public class Book {
    private String bookName;
    private int numberOfPages;
    private int publicationYear;


    public Book(String bookName, int numberOfPages, int publicationYear){
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return this.bookName;
    }

    public int getPages(){
        return this.numberOfPages;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    @Override
    public String toString(){
        return this.bookName + ", " + this.numberOfPages + " pages, " + this.publicationYear;
    }
    
}
