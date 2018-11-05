/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.sql.Time;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
            String nama,
            String noIdentitas,
            String noHp,
            String alamat,
            String lamaSewa,
            Date tanggalMulai,
            Date tanggalSelesai,
            Time jamPengantaran,
            Time jamPenjemputan,
            String jenisMotor,
            String warna,
            String platNomor,
            String status) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Pesanan pesanan = new Pesanan(nama, noIdentitas, noHp, alamat, lamaSewa, tanggalMulai, tanggalSelesai, jamPengantaran, jamPenjemputan, jenisMotor, warna, platNomor, status);
        transaction.commit();
        session.close();
    }
}
