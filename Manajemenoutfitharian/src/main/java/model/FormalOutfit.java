package model;

public class FormalOutfit extends Outfit {
    private String acara;

    public FormalOutfit(String atasan, String bawahan, String aksesoris, String acara) {
        super(atasan, bawahan, aksesoris);
        this.acara = acara;
    }

    public String getAcara() {
        return acara;
    }

    public void setAcara(String acara) {
        this.acara = acara;
    }

    public void pakaiFormal() {
        System.out.println("Memakai outfit formal untuk acara: " + acara);
    }
}
