
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object comparedObj){

        // is the memory address the same?
        if (this == comparedObj){
            return true;
        }

        // is the compared object an instance of this class?
        if (!(comparedObj instanceof Song)){
            return false; // If not an instance of Song, then the objects can't be equal
        }

        // convert the object into a Song object for further comparison later on
        Song comparedSongObj = (Song) comparedObj;

        // Are the values of the objects equal?
        if (
            this.artist.equals(comparedSongObj.artist) &&
            this.name.equals(comparedSongObj.name) &&
            this.durationInSeconds == comparedSongObj.durationInSeconds
        ) { return true; }

        // otherwise the objects are not equal
        return false;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
