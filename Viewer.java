package videoproject;
public class Viewer extends User {
    private String login;
    private int totWatched;

    public Viewer(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.totWatched = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }

    @Override
    public String toString() {
        return "Viewer{" +super.toString() + ", login=" + login + ", totWatched=" + totWatched + '}';
    }
}
