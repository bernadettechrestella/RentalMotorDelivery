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
 * @author ASUS
 */
public class testCariMotor2 {

    public static void main(String[] args) {
        String jenis = "Yamaha Mio";
        motorHelper helper = new motorHelper();
        System.out.println(new Gson().toJson(helper.searchJenis(jenis)));
    }
}
