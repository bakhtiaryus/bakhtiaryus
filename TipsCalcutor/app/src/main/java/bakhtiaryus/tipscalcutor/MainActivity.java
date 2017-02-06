package bakhtiaryus.tipscalcutor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void calculate(View view) {

        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);
        TextView hasil = (TextView) findViewById(R.id.result);
        double tagihan,tip,jmlorg,tip2,total,org2;
        tagihan = Double.parseDouble(input1.getText().toString());
        tip = Double.parseDouble(input2.getText().toString());
        jmlorg  = Double.parseDouble(input3.getText().toString());

        tip2 = tagihan*tip/100;
        total = tagihan+tip2;
        org2 = total/jmlorg;

        hasil.setText   ("TIPS :"+Double.toString(tip2)+"\n"+
                        "TOTAL :"+Double.toString(total)+"\n"+
                        "Per Orang:"+Double.toString(org2));





    }

    }


