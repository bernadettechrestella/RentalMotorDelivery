/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Motor;
import pojos.Penyewa;
import pojos.Pesanan;
import util.HibernateUtil;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class pesananHelper {
    public pesananHelper() {
    }

    public List<Pesanan> getPesanan() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String query = "from Pesanan";
        Query q = session.createQuery(query);
        List<Pesanan> list = q.list();
        return list;
    }

    public void addNewPesanan(
            int idPesanan,
            Penyewa penyewa,
            String lamaSewa,
            Date tanggalMulai,
            Date tanggalSelesai,
            Time jamPengantaran,
            Time jamPenjemputan,
            Motor motor,
            String status) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Pesanan pesanan = new Pesanan(penyewa, motor, lamaSewa, tanggalMulai, tanggalSelesai, jamPengantaran, jamPenjemputan, status);
        session.close();
    }
}
