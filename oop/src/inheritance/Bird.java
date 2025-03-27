package inheritance;

public abstract class Bird{

   private static String name;
   private String PlumageColor;
   

    public Bird(String name, String plumageColor) {
        this.name = name;
        this.PlumageColor = plumageColor;

    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Bird.name = name;
    }

    public String getPlumageColor() {
        return PlumageColor;
    }

    public void setPlumageColor(String plumageColor) {
        PlumageColor = plumageColor;
    }

   public abstract void sing();

    


}