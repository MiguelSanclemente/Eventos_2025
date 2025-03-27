package inheritance;

public abstract class Bird{

   private String name;
   private String PlumageColor;

    public Bird(String name, String plumageColor) {
        this.name = name;
        PlumageColor = plumageColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlumageColor() {
        return PlumageColor;
    }

    public void setPlumageColor(String plumageColor) {
        PlumageColor = plumageColor;
    }

   public abstract void sing();

    


}