package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //membuat variabel
    EditText namapanjang, namapanggilan, tempatlahir, alamat, hobby, pekerjaan;
    Spinner jkelamin;
    Button tgllahir, proses;
    TextView pengenalandiri;
    private int mTahun, mBulan, mHari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menguhubungkan variabel dengan id yang sudah dibuat di dalam xml
        namapanjang = (EditText) findViewById(R.id.editnamapanjang);
        namapanggilan = (EditText) findViewById(R.id.editnamapanggilan);
        tempatlahir= (EditText) findViewById(R.id.editttl);
        alamat = (EditText) findViewById(R.id.editalamat);
        hobby = (EditText) findViewById(R.id.edithobby);
        pekerjaan = (EditText) findViewById(R.id.editpekerjaan);

        jkelamin = (Spinner) findViewById(R.id.spnjkelamin);

        tgllahir = (Button) findViewById(R.id.btntl);
        proses = (Button) findViewById(R.id.btnproses);

        pengenalandiri = (TextView) findViewById(R.id.txtpengenalan);

        //membuat data list yang akan dimasukkan kedalam spinner
        List<String> listKelamin = new ArrayList<String>();
        listKelamin.add("Laki - Laki");
        listKelamin.add("Perempuan");

        //membuat adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listKelamin);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jkelamin.setAdapter(adapter);

        //membuat button tanggal lahir
        tgllahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                mTahun = cal.get(Calendar.YEAR);
                mBulan = cal.get(Calendar. MONTH);
                mHari = cal.get(Calendar. DAY_OF_MONTH);

                DatePickerDialog nDateDialog  = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tgllahir.setText(String.valueOf(dayOfMonth)+"-"+String.valueOf(month)+"-"+String.valueOf(year));
                    }
                },mTahun, mBulan, mHari);
                nDateDialog.setTitle("Pilih Tanggal Lahir");
                nDateDialog.show();
            }
        });
        //bagian button proses, dan menampilkan text view
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pengenalandiri.setText("Hai nama saya adalah "+namapanjang.getText().toString()+", saya biasa dipanggil "
                        +namapanggilan.getText().toString()+". Saya lahir di "+tempatlahir.getText().toString()+
                        ", " +tgllahir.getText().toString()
                        +". Saya tinggal di "+alamat.getText().toString()+". Hobby saya adalah "
                        +hobby.getText().toString()+ ". Dan pekerjaan saya adalah "+pekerjaan.getText().toString()
                        +". Senang berkenalan dengan kalian.");
            }
        });
    }
}