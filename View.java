package videoproject;
public class View {
    private Viewer spectator;
    private Video videoWatched;

    public View(Viewer spectator, Video video) {
        this.spectator = spectator;
        this.videoWatched = video;
        this.spectator.setTotWatched(this.spectator.getTotWatched()+1);
        this.videoWatched.setViews(this.videoWatched.getViews()+1);
        this.videoWatched.play();
    }

    public void toRate(){
        this.videoWatched.setReview(5);
    }
    
    public void toRate(int rate){
        this.videoWatched.setReview(rate);
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
        this.videoWatched.setReview(total);
    }
    
    
    public Viewer getSpectator() {
        return spectator;
    }

    public void setSpectator(Viewer spectator) {
        this.spectator = spectator;
    }

    public Video getVideo() {
        return videoWatched;
    }

    public void setVideo(Video videoWatched) {
        this.videoWatched = videoWatched;
    }

    @Override
    public String toString() {
        return "View{" + "spectator=" + spectator + ", video=" + videoWatched + '}';
    }
  
}
