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
import pojos.Motor;
import util.NewHibernateUtil;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class motorHelper {
    public motorHelper() {
    }
    
    public List<Motor> getMotor() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Motor";
        Query q = session.createQuery(query);
        List<Motor> list = q.list();
        return list;
    }
    
    public void addNewMotor(
            String jenis,
            String warna,
            String platNomor,
            String status) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Motor motor = new Motor(platNomor, jenis, warna, status);
        session.saveOrUpdate(motor);
        transaction.commit();
        session.close();
    }
    
    public List<Motor> searchMotor(
            String platNomor) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String query = "from Motor where platNomor=:platNomor";
        Query q = session.createQuery(query);
        q.setParameter("platNomor", platNomor);
        List<Motor> list = q.list();
        tx.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
    
}
