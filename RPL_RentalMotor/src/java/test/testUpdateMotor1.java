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
public class testUpdateMotor1 {

    public static void main(String[] args) {
        String jenis = "AA9845GB";
        String status = "Disewa";
        motorHelper helper = new motorHelper();
        helper.updateStatusMotor(jenis, status);
    }
}
