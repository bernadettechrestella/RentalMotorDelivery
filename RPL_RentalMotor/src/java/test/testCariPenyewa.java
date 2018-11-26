/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.penyewaHelper;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testCariPenyewa {
    public static void main(String[] args) {
        String noIdentitas = "123456789987654";
        penyewaHelper helper = new penyewaHelper();
        System.out.println(new Gson().toJson(helper.searchPenyewa(noIdentitas)));
    }
}
