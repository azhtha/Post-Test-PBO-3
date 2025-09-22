package model;

public class CasualOutfit extends Outfit {
    private String aktivitas;

    public CasualOutfit(String atasan, String bawahan, String aksesoris, String aktivitas) {
        super(atasan, bawahan, aksesoris);
        this.aktivitas = aktivitas;
    }

    public String getAktivitas() {
        return aktivitas;
    }

    public void setAktivitas(String aktivitas) {
        this.aktivitas = aktivitas;
    }

    public void pakaiCasual() {
        System.out.println("Memakai outfit casual untuk aktivitas: " + aktivitas);
    }
}
