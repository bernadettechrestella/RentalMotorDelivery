/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.pesananHelper;

/**
 *
 * @author Wewen
 */
public class testUpdatePesanan1 {

    public static void main(String[] args) {
        String noIdentitas = "543215432112345";
        String platNomor = "BK 8564 II";
        String status = "Kembali";
        pesananHelper helper = new pesananHelper();
        helper.updateStatusPesanan(noIdentitas, platNomor, status);
    }
}
