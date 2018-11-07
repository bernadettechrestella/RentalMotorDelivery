/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.penyewaHelper;
import helper.transaksiHelper;
import java.util.List;
import pojos.Transaksi;

/**
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
public class testTransaksi1 {
    public static void main(String[] args) {
        transaksiHelper helper = new transaksiHelper();
        List<Transaksi> list = helper.getTransaksi();
//        Gson gson = new Gson();
//        String json = gson.toJson(list);
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdTransaksi());
            System.out.println(list.get(i).getPenyewa());
            System.out.println(list.get(i).getLamaSewa());
            System.out.println(list.get(i).getTanggalMulai());
            System.out.println(list.get(i).getTanggalSelesai());
            System.out.println(list.get(i).getJamPengantaran());
            System.out.println(list.get(i).getJamPenjemputan());
            System.out.println(list.get(i).getJenisMotor());
            System.out.println(list.get(i).getWarna());
            System.out.println(list.get(i).getMotor());
            System.out.println(list.get(i).getStatus());
            System.out.println(list.get(i).getStatus());
        }
    }
}
