package Transporte;

public interface Transport {

    public Combustion getCombustion();
    public String combustionReload();
    public int getPasagerNumber();
    public String acelerationShape();
    public String decelerateShape();
    public String onShape();
    public String spinShape();
    public String curbShape();
    public String reverseShape();
    
}
