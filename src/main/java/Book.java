public class Book extends Media {
    private String publisher;
    public Book() {
        this.title = "Unknown Title";
        this.creator = "Unknown Creator";
        this.publisher = "Unknown Publisher";
    }
    public Book(String title, String creator, String publisher) {
        this.title = title;
        this.creator = creator;
        this.publisher = publisher;
    }
    public String getPublisher () {
        return publisher;
    }
}
