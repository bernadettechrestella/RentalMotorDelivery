package pojos;
// Generated Nov 26, 2018 5:25:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pesanan generated by hbm2java
 */
public class Pesanan  implements java.io.Serializable {


     private Integer idPesanan;
     private String noIdentitas;
     private String platNomor;
     private String lamaSewa;
     private Date tanggalMulai;
     private Date tanggalSelesai;
     private String jamPengantaran;
     private String jamPenjemputan;
     private String status;
     private String biaya;

    public Pesanan() {
    }

	
    public Pesanan(String noIdentitas, String platNomor, String lamaSewa, Date tanggalMulai, String jamPengantaran, String status, String biaya) {
        this.noIdentitas = noIdentitas;
        this.platNomor = platNomor;
        this.lamaSewa = lamaSewa;
        this.tanggalMulai = tanggalMulai;
        this.jamPengantaran = jamPengantaran;
        this.status = status;
        this.biaya = biaya;
    }
    public Pesanan(String noIdentitas, String platNomor, String lamaSewa, Date tanggalMulai, Date tanggalSelesai, String jamPengantaran, String jamPenjemputan, String status, String biaya) {
       this.noIdentitas = noIdentitas;
       this.platNomor = platNomor;
       this.lamaSewa = lamaSewa;
       this.tanggalMulai = tanggalMulai;
       this.tanggalSelesai = tanggalSelesai;
       this.jamPengantaran = jamPengantaran;
       this.jamPenjemputan = jamPenjemputan;
       this.status = status;
       this.biaya = biaya;
    }
   
    public Integer getIdPesanan() {
        return this.idPesanan;
    }
    
    public void setIdPesanan(Integer idPesanan) {
        this.idPesanan = idPesanan;
    }
    public String getNoIdentitas() {
        return this.noIdentitas;
    }
    
    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }
    public String getPlatNomor() {
        return this.platNomor;
    }
    
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    public String getLamaSewa() {
        return this.lamaSewa;
    }
    
    public void setLamaSewa(String lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
    public Date getTanggalMulai() {
        return this.tanggalMulai;
    }
    
    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }
    public Date getTanggalSelesai() {
        return this.tanggalSelesai;
    }
    
    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }
    public String getJamPengantaran() {
        return this.jamPengantaran;
    }
    
    public void setJamPengantaran(String jamPengantaran) {
        this.jamPengantaran = jamPengantaran;
    }
    public String getJamPenjemputan() {
        return this.jamPenjemputan;
    }
    
    public void setJamPenjemputan(String jamPenjemputan) {
        this.jamPenjemputan = jamPenjemputan;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBiaya() {
        return this.biaya;
    }
    
    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }




}


