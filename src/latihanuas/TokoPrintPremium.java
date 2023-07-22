
package latihanuas;


public class TokoPrintPremium extends TokoPrint {
    private double diskon;

    public TokoPrintPremium(int printwarna, int printhitamputih, int jumlahTransaksi) {
        super(printwarna, printhitamputih, jumlahTransaksi);
        this.diskon = 5000;
    }

    @Override
    public double totalHarga() {
        double hargaAwal = super.totalHarga();
        if(hargaAwal > 50000){
        return hargaAwal * diskon;
        }
        else {
            return super.totalHarga();
        }
    }

    public double getBonus() {
        return diskon;
    }

    public void setBonus(double diskon) {
        this.diskon = diskon;
    }
}


