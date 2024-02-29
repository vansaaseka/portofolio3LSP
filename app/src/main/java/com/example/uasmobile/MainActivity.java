package com.example.uasmobile;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button checkout;
    EditText jmlBarang;
    EditText diskon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkout = (Button) findViewById(R.id.button2);
        jmlBarang = (EditText) findViewById(R.id.jumlahBarang);
        diskon = (EditText) findViewById(R.id.diskon);

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlahBarang = jmlBarang.getText().toString();
                int potongan = 40*Integer.parseInt(diskon.getText().toString())/100;
                int harga = Integer.parseInt(jumlahBarang)*40-potongan;
                Intent intent = new Intent(getApplicationContext(), ProsesPembayaran.class);
                intent.putExtra("harga", harga);
                startActivity(intent);
            }
        });

    }
}