public class car {

    private String brand;
    private short cylinder_capacity;
    private byte pasagerNumber;
    private boolean government;

    

    public car(String brand, short cylinder_capacity, byte pasagerNumber, boolean government) {
        this.brand = brand;
        this.cylinder_capacity = cylinder_capacity;
        this.pasagerNumber = pasagerNumber;
        this.government = government;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public short getCylinder_capacity() {
        return cylinder_capacity;
    }

    public void setCylinder_capacity(short cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }

    public byte getPasagerNumber() {
        return pasagerNumber;
    }

    public void setPasagerNumber(byte pasagerNumber) {
        this.pasagerNumber = pasagerNumber;
    }

    public boolean isGovernment() {
        return government;
    }
    
    public void setGovernment(boolean government) {
        this.government = government;
    }
 

    
    
}
