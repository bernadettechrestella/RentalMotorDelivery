package pojos;
// Generated Nov 6, 2018 12:40:46 PM by Hibernate Tools 4.3.1



/**
 * Motor generated by hbm2java
 */
public class Motor  implements java.io.Serializable {


     private String platNomor;
     private String jenis;
     private String warna;
     private String status;
     private Pesanan pesanan;

    public Motor() {
    }

	
    public Motor(String platNomor, String jenis, String warna, String status) {
        this.platNomor = platNomor;
        this.jenis = jenis;
        this.warna = warna;
        this.status = status;
    }
    public Motor(String platNomor, String jenis, String warna, String status, Pesanan pesanan) {
       this.platNomor = platNomor;
       this.jenis = jenis;
       this.warna = warna;
       this.status = status;
       this.pesanan = pesanan;
    }
   
    public String getPlatNomor() {
        return this.platNomor;
    }
    
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    public String getJenis() {
        return this.jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getWarna() {
        return this.warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Pesanan getPesanan() {
        return this.pesanan;
    }
    
    public void setPesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
    }




}


