package com.example.d2j_00.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class transaksi {

    private ArrayList<barang> listBarang = new ArrayList<>();

    public void addBarang(barang barang) {
        this.listBarang.add(barang);

    }

    public int totalTransaksi() {
        int hasil = 0;
        for (int i = 0; i < listBarang.size(); i++) {
            hasil += listBarang.get(i).getHarga();
        }
        return hasil;
    }

    public String printTransaksi() {
        String Text = "Barang yang dibeli pada Transaksi ini adalah:\n";
        Text += "========================================\n";
        for (int i = 0; i < listBarang.size(); i++) {
            Text += listBarang.get(i).toString();
        }
        Text += "========================================= \n";
        Text += "Total Pembelian: " + totalTransaksi() + " \n";
        Text += "========================================== \n";

        return Text;
    }

    public double averageTransaksi() {
        double hasil = 0;

        hasil = totalTransaksi() / listBarang.size();
        return hasil;
    }

    public String maxBarang() {
        barang max;
        max = listBarang.get(0);
        for (int i = 0; i < listBarang.size(); i++) {
            if (listBarang.get(i).getHarga() > max.getHarga()) {
                max = listBarang.get(i);
            }

        }

        String namaBarang = max.getNama();
        String Text = " barang termahal pada transaksi adalah  " + namaBarang;
        return Text;

    }
}





