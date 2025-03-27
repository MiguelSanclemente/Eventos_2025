package inheritance;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Parrot parrot1 = new Parrot("Jaimito", "Green", "Spanish", "Colombian");
       // Bird Bird1 = new Bird( "Jose", "Black");
       Dove dove1 = new Dove ("jose", "Black");
       parrot1.sing();
       dove1.sing();
       Bird dove2 = new Dove("Jose", "amarillo");

       ArrayList <Bird> list = new ArrayList<Bird>();  
       list.add(dove1);
       list.add(parrot1);
       for(Bird bird: list){
        Bird.getName();
        if(bird.getClass().equals(Parrot.class)){
            ((Parrot)bird).sing();
        }
       }
    }
   

}