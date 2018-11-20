/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.pesananHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testPesanani2 {

    public static void main(String[] args) throws ParseException {

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = format.parse("20181106");
            Date date2 = format.parse("20181112");
//            DateFormat jam = new SimpleDateFormat("HH:mm:ss");
//            Date jam1 = format.parse("13:00:00");
//            Date jam2 = format.parse("13:00:00");
//           String noRm = "123457";
            pesananHelper test = new pesananHelper();
//            test.("Stella", "987654321", "081248002829", "Paingan", "7 Hari", date, date2, Time.valueOf("13:00:00"), Time.valueOf("13:00:00"), "Honda Beat", "Hitam", "B 1234 KMU", "Disewa");
//        test.addNewPesanan(0, noIdentitas, lamaSewa, date2, date2, jamPengantaran, jamPenjemputan, platNomor, status, biaya);
        } catch (Exception ex) {
            Logger.getLogger(testPesanani2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
