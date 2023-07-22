package latihanuas;

public class TokoPrint {
    private double printwarna;
    private double printhitamputih;
    private final int jumlahTransaksi;
    
    public TokoPrint(double printwarna, double printhitamputih, int jumlahTransaksi){
        this.printwarna = printwarna;
        this.printhitamputih = printhitamputih;
        this.jumlahTransaksi = jumlahTransaksi;
    }

    public void setPrintwarna(double printwarna) {
        this.printwarna = printwarna;
    }

    public void setPrinthitamputih(double printhitamputih) {
        this.printhitamputih = printhitamputih;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
        
    public double getPrintwarna() {
        return printwarna;
    }

    public double getPrinthitamputih() {
        return printhitamputih;
    }
    
    public double hargaPrintwarna(){
        return getPrintwarna()* 1000;
    }
    
    public double hargaPrinthitamputih(){
        return getPrinthitamputih()* 500;
    }
    
    public double totalHarga(){
        return hargaPrintwarna() + hargaPrinthitamputih();       
    }
        
}
