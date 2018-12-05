/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.penyewaHelper;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wewen
 */
public class testPenyewa2 {

    public static void main(String[] args) throws ParseException {

        try {
//           SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//           Date date = format.parse("19740124");
//           String noRm = "123457";
            penyewaHelper test = new penyewaHelper();
            test.addNewPenyewa("Yova", "543216789", "081224567603", "Paingan");
        } catch (Exception ex) {
            Logger.getLogger(testPenyewa2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
