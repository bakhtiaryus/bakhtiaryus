package com.example.d2j_00.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public barang[] arrbarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);




        showString ="Manipulasi Java android";
        addseparator();


        initbarang();
       // showString += arrbarang[5].toString();
        //addseparator();
       //showString += arrbarang[1].toString();
       // showText.setText(showString);

        transaksi trans1 = new transaksi();
        trans1.addBarang(arrbarang[3]);
        trans1.addBarang(arrbarang[7]);
        trans1.addBarang(arrbarang[1]);
        showString +=trans1.printTransaksi();
        showString += "rata-rata harga barang yang dibeli :"+
                trans1.averageTransaksi() ;
        showString +=trans1.maxBarang();
        showText.setText(showString);

    }


    public void addseparator(){
        showString +="\n------------------\n";
    }


    public void initbarang(){
        arrbarang [0] = new barang("Laptop",1,70000000);
        arrbarang [1] = new barang("Printer",barang.ELEKTRONIK,2500000);
        arrbarang [2] = new barang("Monitor",barang.ELEKTRONIK,1000000);
        arrbarang [3] = new barang("Scanner",barang.ELEKTRONIK,2000000);
        arrbarang [4] = new barang("Handphone",barang.ELEKTRONIK,1500000);
        arrbarang [5] = new barang("PC",barang.ELEKTRONIK,150000);
        arrbarang [6] = new barang("Ces Laptop",barang.ELEKTRONIK,500000);
        arrbarang [7] = new barang("Speaker",barang.ELEKTRONIK,15000000);
        arrbarang [8] = new barang("Camera",barang.ELEKTRONIK,2500000);
        arrbarang [9] = new barang("Kipas angin",barang.ELEKTRONIK,50000);

    }
}
