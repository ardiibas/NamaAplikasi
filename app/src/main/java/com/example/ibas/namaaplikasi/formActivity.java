package com.example.ibas.namaaplikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class formActivity extends AppCompatActivity {

    EditText edNama, edEmail, edAlamat, edPesan;
    RadioGroup radioJK;
    Button btnKirim,btnKembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        edNama = (EditText) findViewById(R.id.edt_nama);
        edAlamat = (EditText) findViewById(R.id.edt_alamat);
        edEmail = (EditText) findViewById(R.id.edt_email);
        edPesan = (EditText) findViewById(R.id.edt_pesan);
        radioJK = (RadioGroup) findViewById(R.id.radioJK);

        btnKirim = (Button) findViewById(R.id.btn_kirim);
        btnKembali = (Button) findViewById(R.id.btn_kembali);

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(formActivity.this, "Data Berhasil Dikirim", Toast.LENGTH_SHORT).show();
                Intent KirimData = new Intent(formActivity.this,PesanDetail.class);

                //penyimpan data
                Bundle TempatData = new Bundle();

                TempatData.putString("nama",edNama.getText().toString());
                TempatData.putString("email",edEmail.getText().toString());
                TempatData.putString("alamat",edAlamat.getText().toString());
                TempatData.putString("pesan",edPesan.getText().toString());

                int id = radioJK.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(id);
                TempatData.putString("jeniskelamin",radioButton.getText().toString());

                KirimData.putExtras(TempatData);
                startActivity(KirimData);
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bcakMenu = new Intent(formActivity.this,MainActivity.class);
                startActivity(bcakMenu);
            }
        });

    }
}
