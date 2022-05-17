public class CDs implements Packable{

    double weight;
    String artist;
    String title;
    int publicationYear;

    public CDs(String artist, String title, int publicationYear){
        this.artist = artist;
        this.title = title;
        this.weight = .1;
        this.publicationYear = publicationYear;

    }
    public double weight() {
        return weight;
    }

    public String toString() {
        return artist + ": " + title + " ("+publicationYear+")";
    }
}
