/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Pesanan;
import util.NewHibernateUtil;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class pesananHelper {

    public pesananHelper() {
    }

    public List<Pesanan> getPesanan() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Pesanan";
        Query q = session.createQuery(query);
        List<Pesanan> list = q.list();
        return list;
    }

    public void addNewPesanan(
            String noIdentitas,
            String platNomor,
            String lamaSewa,
            Date tanggalMulai,
            Date tanggalSelesai,
            String jamPengantaran,
            String jamPenjemputan,
            String status,
            String biaya) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Pesanan pesanan = new Pesanan(noIdentitas, platNomor,
                lamaSewa, tanggalMulai, tanggalSelesai,
                jamPengantaran, jamPenjemputan, status, biaya);
        session.saveOrUpdate(pesanan);
        transaction.commit();
        session.close();
    }

    public List<Pesanan> searchPesanan(
            String noIdentitas,
            String platNomor) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String query = "from Pesanan where noIdentitas=:noIdentitas AND platNomor=:platNomor";
        Query q = session.createQuery(query);
        q.setParameter("noIdentitas", noIdentitas);
        q.setParameter("platNomor", platNomor);
        List<Pesanan> list = q.list();
        tx.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
    
    public void updateStatusPesanan(
            String noIdentitas,String platNomor, String status) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Pesanan> list = searchPesanan(noIdentitas,platNomor);
        Pesanan pesanan = new Pesanan();
        pesanan.setIdPesanan(list.get(0).getIdPesanan());
        pesanan.setNoIdentitas(list.get(0).getNoIdentitas());
        pesanan.setPlatNomor(list.get(0).getPlatNomor());
        pesanan.setLamaSewa(list.get(0).getLamaSewa());
        pesanan.setTanggalMulai(list.get(0).getTanggalMulai());
        pesanan.setTanggalSelesai(list.get(0).getTanggalSelesai());
        pesanan.setJamPengantaran(list.get(0).getJamPengantaran());
        pesanan.setJamPenjemputan(list.get(0).getJamPenjemputan());
        pesanan.setBiaya(list.get(0).getBiaya());
        pesanan.setStatus(status);
        session.update(pesanan);
        transaction.commit();
        session.close();
    }
}
