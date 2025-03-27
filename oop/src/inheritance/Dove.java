package inheritance;

public class Dove extends Bird{

    public Dove(String name, String plumageColor) {
        super(name, plumageColor);
       
    }

    @Override
    public void sing() {
        System.out.println("currucucu");
    }

    



}