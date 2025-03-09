import java.util.ArrayList;
public class QuestionADriver {
    public static void main(String[] args) {
        ArrayList<Media> myArrayList = new ArrayList<>();
        Song mySong = new Song("Fifteen", "Taylor Swift", 4.55);
        Book myBook = new Book("Dracula", "Bram Stroker", "Simon & Shuster");
        myArrayList.add(mySong);
        myArrayList.add(myBook);
    }
}
