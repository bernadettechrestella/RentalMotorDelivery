/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.penyewaHelper;
import java.util.List;
import pojos.Penyewa;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testPenyewa1 {

    public static void main(String[] args) {
        penyewaHelper helper = new penyewaHelper();
        List<Penyewa> list = helper.getPenyewa();
//        Gson gson = new Gson();
//        String json = gson.toJson(list);
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getNoIdentitas());
            System.out.println(list.get(i).getNoHp());
            System.out.println(list.get(i).getAlamat());
        }
    }
}
