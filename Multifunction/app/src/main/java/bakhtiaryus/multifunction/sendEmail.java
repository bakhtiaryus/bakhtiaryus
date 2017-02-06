package bakhtiaryus.multifunction;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class sendEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
    }
    public void sendEmail(View view){
        EditText txtPenerima = (EditText) findViewById(R.id.penerima);
        EditText txtJudul = (EditText) findViewById(R.id.judul);
        EditText txtKonten = (EditText) findViewById(R.id.konten);

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri..parse("mail to : "+txtPenerima.getText().toString());
        emailIntent.setType("TEXT/PLAIN");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "yusufbakhtiar98@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,txtJudul.getText().toString());
        emailIntent.putExtra(Intent.EXTRA_TEXT, txtKonten.getText().toString());

        startActivity(emailIntent);


    }

}
