public abstract class Media {
    String title;
    public String creator;

    public Media () {
        this.title = "Unknown Title";
        this.creator = "Unknown Creator";
    }
    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }
    public String getTitle() {
        return title;
    }
    public String getCreator() {
        return creator;
    }
}