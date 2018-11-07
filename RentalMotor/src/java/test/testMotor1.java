/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.motorHelper;
import java.util.List;
import pojos.Motor;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testMotor1 {

    public static void main(String[] args) {
        motorHelper helper = new motorHelper();
        List<Motor> list = helper.getMotor();
//        Gson gson = new Gson();
//        String json = gson.toJson(list);
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getJenis());
            System.out.println(list.get(i).getWarna());
            System.out.println(list.get(i).getPlatNomor());
            System.out.println(list.get(i).getStatus());
        }
    }
}
