public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String university = "Valle";
        boolean ganareOE = true;
        Human human1 = new Human() ;
        human1.setName("Josefalo");
        human1.setAge((byte)33);
        Human human2 = new Human("Miguel",(byte)19,"23123") ;

        System.out.println("Hello events!");
        System.out.println(human2.getName());
        System.out.println(human1.getName());
        System.out.println(human1.getAge());
        human1.greet();
        human2.greet();
        human1.presentation();
        human2.presentation();
        String stractgeronimo = human1.stract(89797987);
        System.out.println(stractgeronimo); 
        
    }
}