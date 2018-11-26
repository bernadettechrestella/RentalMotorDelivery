/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
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
public class testCariPesanan1 {

    public static void main(String[] args) {
            String noIdentitas = "123456789987654";
            String platNomor = "";
            pesananHelper helper = new pesananHelper();
            System.out.println(new Gson().toJson(helper.searchPesanan(noIdentitas, platNomor)));
        }
}
