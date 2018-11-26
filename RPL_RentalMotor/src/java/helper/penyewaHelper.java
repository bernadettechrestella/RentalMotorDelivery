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
import util.NewHibernateUtil;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class penyewaHelper {
    public penyewaHelper() {
    }

    public List<Penyewa> getPenyewa() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
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
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Penyewa penyewa = new Penyewa(nama, noIdentitas, noHp, alamat);
        session.close();
    }
    
    public List<Penyewa> searchPenyewa(
            String noIdentitas) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String query = "from Penyewa where noIdentitas=:noIdentitas";
        Query q = session.createQuery(query);
        q.setParameter("noIdentitas", noIdentitas);
        List<Penyewa> list = q.list();
        tx.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
