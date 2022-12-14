package videoproject;
public class Viewer extends User {
    private String login;
    protected int totWatched;

    public Viewer(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.totWatched = 0;
    }

    public String getLogin() {
        return login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    @Override
    public String toString() {
        return "Viewer{" +super.toString() + ", login=" + login + ", totWatched=" + totWatched + '}';
    }
}
