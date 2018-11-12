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
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testPenyewa2 {
    public static void main(String[] args) throws ParseException {

       try {
//           SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//           Date date = format.parse("19740124");
//           String noRm = "123457";
           penyewaHelper test = new penyewaHelper();
           test.addNewPenyewa("Via", "123456789", "081234567890", "Monjali");
       } catch (Exception ex) {
           Logger.getLogger(testMotor2.class.getName()).log(Level.SEVERE,null,ex);
       }
      
   }
}
