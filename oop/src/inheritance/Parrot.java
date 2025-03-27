package inheritance;

public class Parrot extends Bird{

    String lenguage;
    String race;

    public Parrot(String name, String plumageColor, String lenguage, String race) {
        super(name, plumageColor);
        this.lenguage = lenguage;
        this.race = race;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
    @Override
    public void sing(){
        System.out.println("quiere cacao??");
    }
}
 