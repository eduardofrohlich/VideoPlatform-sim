package videoproject;
public class VideoProject {
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Java Lesson 1");
        v[1] = new Video("Java Lesson 2");
        v[2] = new Video("Java Lesson 3");
        
        Viewer vi[] = new Viewer[2];
        vi[0] = new Viewer("Edward", 18, "M", "edufroh");
        vi[1] = new Viewer("Vinicius", 20, "M", "vinifroh");
        
        View vw[] = new View[3];
        vw[0] = new View(vi[0], v[0]); //Edward watched Java Lesson 1
        vw[0].toRate(90.0f);
        v[0].like();
        System.out.println(vw[0]);
        
        vw[1] = new View(vi[1], v[0]); //Vinicius watched Java Lesson 1
        vw[1].toRate();
        System.out.println(vw[1]);
        
       
        vw[2] = new View(vi[1], v[2]); //Vinicius watched Java Lesson 3
        vw[2].toRate(7);
        v[2].like();
        System.out.println(vw[2]);
        
        //---------VIDEO AND VIEWERS INFOS---------//
        System.out.println("-----VIDEOS-----");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        
        System.out.println("-----VIEWERS-----");
        System.out.println(vi[0]);
        System.out.println(vi[1]);
        
    }
    
}
