public class Cylindred extends Circle{

    private float hight;
    
    
    
    public Cylindred(float radio, float hight) {
        super(radio);
        this.hight = hight;
    }


    
    public float getArea(){
        return super.getArea() * hight;
    }
}
