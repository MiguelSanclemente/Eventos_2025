public class Human {

    private String name;
    private byte age;
    private String identification_Number;

    public Human(String newName, byte newAge, String newIdentification){
        name = newName;
        age = newAge;
        identification_Number = newIdentification;
    }

    public Human(){

    }

    public void greet(){
        System.out.println("Helloo my frien, mi identification number is " + identification_Number);
    }


    public void presentation(){
        System.out.println("My name is " + name + " and i have " + age + " age.");

    }

    public String stract(int salary){

        if(salary==0){
            return "0";
        }else{
            return "3";
        }

    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;

    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getIdentification_Number() {
        return identification_Number;
    }

    public void setIdentification_Number(String identification_Number) {
        this.identification_Number = identification_Number;
    }

    

}
