package videoproject;
public class Video implements VideoActions {
    
    private String title;
    private int review;
    private int views;
    private int likes;
    private boolean playing;

    public Video(String title) {
        this.title = title;
        this.review = 1;
        this.views = 0;
        this.likes = 0;
        this.playing = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        int newReview;
        newReview = ((this.review + review) / this.views);
        this.review = newReview;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    
    @Override
    public void play() {
        this.playing = true;
    }

    @Override
    public void pause() {
        this.playing = false;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Video{" + "title=" + title + ", review=" + review + ", views=" + views + ", likes=" + likes + ", playing=" + playing + '}';
    }
    

}
