public class Books implements Packable{

    double weight;
    String author;
    String title;

    public Books(String author, String title, double weight){
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return author + ": " + title;
    }

    public double weight() {
        return weight;
    }
}
