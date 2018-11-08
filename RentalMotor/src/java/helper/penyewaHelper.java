/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Penyewa;
import util.HibernateUtil;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class penyewaHelper {

    public penyewaHelper() {
    }

    public List<Penyewa> getPenyewa() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String query = "from Penyewa";
        Query q = session.createQuery(query);
        List<Penyewa> list = q.list();
        return list;
    }

    public void addNewPenyewa(
            String nama,
            String noIdentitas,
            String noHp,
            String alamat) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Penyewa penyewa = new Penyewa(0, nama, 0, alamat);
        session.close();
    }
}
