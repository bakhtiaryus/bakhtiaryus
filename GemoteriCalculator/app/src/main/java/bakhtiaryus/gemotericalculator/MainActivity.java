package bakhtiaryus.gemotericalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements  AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.geometri);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.geo_operator, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView text1 = (TextView) findViewById(R.id.txt1);
        TextView text2 = (TextView) findViewById(R.id.txt2);
        TextView text3 = (TextView) findViewById(R.id.txt3);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);
        String operator = parent.getItemAtPosition(position).toString();
        if (operator.equalsIgnoreCase("Lingkaran")) {
            text1.setText("Jari-Jari");
            input2.setEnabled(false);
            input3.setEnabled(false);

            text2.setText("");
            text3.setText("");
        } else if (operator.equalsIgnoreCase("segitiga")) {
            text1.setText("Alas");
            input2.setEnabled(true);
            input3.setEnabled(false);
            text2.setText("Tinggi");
            text3.setText("");
        } else if (operator.equalsIgnoreCase("Persegi panjang")) {
            text1.setText("Panjang");
            input2.setEnabled(true);
            input3.setEnabled(false);
            text2.setText("Lebar");
            text3.setText("");
        } else if (operator.equalsIgnoreCase("Balok")) {
            text1.setText("Panjang");

            text2.setText("Lebar");
            input2.setEnabled(true);
            input3.setEnabled(true);
            text3.setText("Tinggi");
        } else
        {
            text1.setText("Jari-Jari");
            input2.setEnabled(false);

            input3.setEnabled(false);
            text2.setText("");
            text3.setText("");
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void calculate(View view){

        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);
        Spinner spinner = (Spinner) findViewById(R.id.geometri);
        double inp1 = 0 ,inp2 = 0 ,inp3 = 0;

        String operator = spinner.getSelectedItem().toString();
        String hasil = "";
         inp1 = Double.parseDouble(input1.getText().toString());

        if(input2.isEnabled())
        {
            inp2 = Double.parseDouble(input2.getText().toString());
        }
        if(input3.isEnabled())
        {
            inp3 = Double.parseDouble(input3.getText().toString());
        }

        if(operator.equalsIgnoreCase("Lingkaran")){
            hasil = "luas dari Lingkaran adalah : "+(Math.PI*inp1*inp1)+"\n";
            hasil += "Keliling dari Lingkaran adalah : "+(2*Math.PI*inp1)+"\n";
        }
        else if (operator.equalsIgnoreCase("Segitiga"))
        {
            hasil = "luas dari Segitiga adalah : "+(inp1*inp2/2)+"\n";
            double phy=Math.sqrt((inp1*inp1)+(inp2*inp2)/2);
            hasil += "Keliling dari Segitiga adalah : "+(inp1+inp2+phy)+"\n";
        }
        else if (operator.equalsIgnoreCase("Persegi"))
        {
            hasil = "luas dari Persegi panjang adalah adalah : "+(inp1*inp2)+"\n";
            hasil += "Keliling dari persegi panjang adalah : "+(2*(inp1+inp2))+"\n";
        }
        else if (operator.equalsIgnoreCase("Balok"))
        {
            hasil = "luas dari Balok adalah adalah : "+(2 *((inp1 * inp2)+(inp1 * inp3)+(inp2 * inp3)))+"\n";
            hasil += "volume dari Balok adalah : "+(inp1*inp2*inp3)+"\n";
        }
        else
        {
            hasil = "Luas permukaannya = "+((3.14*inp1*inp1)*4)+"\n";
            hasil += "Volumenya = "+(((3.14*inp1*inp1*inp1)*4)/3)+"\n";
        }
            TextView result=(TextView) findViewById(R.id.result);
        result.setText(hasil);

    }

}

