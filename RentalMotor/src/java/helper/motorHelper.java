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
import pojos.Motor;
import util.HibernateUtil;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class motorHelper {

    public motorHelper() {
    }
    
    public List<Motor> getMotor() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String query = "from Motor";
        Query q = session.createQuery(query);
        List<Motor> list = q.list();
        return list;
    }
    
    public void addNewMotor(
            String jenis,
            String warna,
            String platNo,
            String status) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Motor motor = new Motor(jenis, warna, platNo, status);
        session.saveOrUpdate(motor);
        transaction.commit();
        session.close();
    }
}
