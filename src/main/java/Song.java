public class Song extends Media implements IPlayable {
    double duration;
    public Song() {
        title = "Unknown Title";
        creator = "Unknown Creator";
        duration = 1;
    }
    public Song(String title, String creator, double duration) {
        this.title = title;
        this.creator = creator;
        this.duration = duration;
    }
    @Override
    public void playMedia() {
        System.out.println("Playing");
    }

    @Override
    public void pauseMedia() {
        System.out.println("Pausing");
    }

    @Override
    public void stopMedia() {
        System.out.println("Stopping");
    }
}
