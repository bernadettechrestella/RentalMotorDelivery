/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.motorHelper;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testMotor2 {
    public static void main(String[] args) throws ParseException {

       try {
//           SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//           Date date = format.parse("19740124");
//           String noRm = "123457";
           motorHelper test = new motorHelper();
           test.addNewMotor("Yamaha Mio", "Hitam", "B 4567 A", "Disewa");
       } catch (Exception ex) {
           Logger.getLogger(testMotor2.class.getName()).log(Level.SEVERE,null,ex);
       }
      
   }
}
