package videoproject;
public class View {
    private Viewer spectator;
    private Video videoWatched;

    public View(Viewer spectator, Video video) {
        this.spectator = spectator;
        this.videoWatched = video;
        this.spectator.totWatched++;
        this.videoWatched.views++;
        this.videoWatched.play();
        this.spectator.winXp();
    }

    public void toRate(){
        this.videoWatched.review = 5;
        this.spectator.winXp();
    }
    
    public void toRate(int rate){
        this.videoWatched.review = rate;
        this.spectator.winXp();
    }
    
    public void toRate(float percent){
        int total = 0;
        if (percent <=20){
            total = 3;
        } else if (percent<=50) {
            total = 5;
        } else if (percent <=90) {
            total = 8;
        } else {
            total = 10;
        }
        this.spectator.winXp();
        this.videoWatched.review = total;
    }
    
    public Viewer getSpectator() {
        return spectator;
    }

    public Video getVideo() {
        return videoWatched;
    }

    @Override
    public String toString() {
        return "View{" + "spectator=" + spectator + ", video=" + videoWatched + '}';
    }
  
}
