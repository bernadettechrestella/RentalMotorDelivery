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
import pojos.Transaksi;
import util.HibernateUtil;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class transaksiHelper {
    public transaksiHelper() {
    }

    public List<Transaksi> getTransaksi() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String query = "from Transaksi";
        Query q = session.createQuery(query);
        List<Transaksi> list = q.list();
        return list;
    }

    public void addNewTransaksi(
            int idTransaksi,
            Penyewa penyewa,
            String lamaSewa,
            Date tanggalMulai,
            Date tanggalSelesai,
            Time jamPengantaran,
            Time jamPenjemputan,
            String jenisMotor,
            String warna,
            Motor motor,
            String status) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Transaksi transaksi = new Transaksi(penyewa, lamaSewa, tanggalMulai, tanggalSelesai, jamPengantaran, jamPenjemputan, jenisMotor, motor, warna, status);
        session.close();
    }
}
