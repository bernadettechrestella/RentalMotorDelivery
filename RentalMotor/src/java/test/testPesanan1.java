/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.pesananHelper;
import java.util.List;
import pojos.Pesanan;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testPesanan1 {
    public static void main(String[] args) {
        pesananHelper helper = new pesananHelper();
        List<Pesanan> list = helper.getPesanan();
//        Gson gson = new Gson();
//        String json = gson.toJson(list);
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getNoIdentitas());
            System.out.println(list.get(i).getNoHp());
            System.out.println(list.get(i).getAlamat());
            System.out.println(list.get(i).getLamaSewa());
            System.out.println(list.get(i).getTanggalMulai());
            System.out.println(list.get(i).getTanggalSelesai());
            System.out.println(list.get(i).getJamPengantaran());
            System.out.println(list.get(i).getJamPenjemputan());
            System.out.println(list.get(i).getJenisMotor());
            System.out.println(list.get(i).getWarna());
            System.out.println(list.get(i).getPlatNomor());
            System.out.println(list.get(i).getStatus());
        }
    }
}
