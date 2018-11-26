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
            Integer idPesanan,
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
        Pesanan pesanan = new Pesanan(noIdentitas, platNomor, lamaSewa, tanggalMulai, tanggalSelesai, jamPengantaran, jamPenjemputan, status, biaya);
        session.close();
    }
    
    public List<Pesanan> searchPesanan(
            String noIdentitas,
            String platNomor) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String query = "from Pesanan where noIdentitas=:noIdentitas OR platNomor=:platNomor";
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
}
