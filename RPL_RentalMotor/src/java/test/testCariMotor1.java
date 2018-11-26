/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.motorHelper;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testCariMotor1 {
    public static void main(String[] args) {
        String platNomor = "B 4567 A";
        motorHelper helper = new motorHelper();
        System.out.println(new Gson().toJson(helper.searchMotor(platNomor)));
    }
}
