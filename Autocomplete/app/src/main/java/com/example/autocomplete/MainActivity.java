package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    AutoCompleteTextView edit1; //untuk autocomplete1
    AutoCompleteTextView edit2; //untuk autocomplete2
    String [] sq = {"Aloy", "AM", "AR", "BIG", "BG", "BOSS", "Dalomies",
            "Daloman", "Elite", "Elgya", "Good Girls", "Good Boys", "HJ", "Hybe", "Ibuana", "Joker",
            "JB", "Korsa", "Korsi", "Loius", "LAKIK", "Mas", "Mbak"}; //data yang akan masuk kedalam list autocomplete1
    String [] nama = {"Algar", "Atha", "Bangor", "Bagas", "Cheva", "Clay",
            "Dewa", "Dean", "Emil", "Eka", "Friska", "Floy", "Gray", "Genta", "Gentala", "Harsa", "Hito",
            "Ivan", "Ihsan", "Jenna", "Jombi", "Karina", "Kissyn", "Letta", "Luther", "Mala", "Mila", "Nesa",
            "Netta", "Ofan", "Ogar", "Prakasa", "Pinta", "Qilla", "Qalla", "Rijal", "Rita", "Sober", "Sinta",
            "Thifal", "Timmy", "Ujang", "Uta", "Vina", "Vano", "Wicak", "Wagir", "Xilla", "Xisya", "Yoki",
            "Yohan", "Zulfa", "Zilfa"};//data yang akan masuk kedalam list autocomplete2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk menghubungkan variable dengan id autocomplete yang sudah dibuat di xml
        edit1 = (AutoCompleteTextView) findViewById(R.id.auto1);
        edit2 = (AutoCompleteTextView) findViewById(R.id.auto2);

        //untuk memanggil atau menghubungkan string tadi dengan autocomplete ke 1 dan ke 2
        edit1.addTextChangedListener(this);
        edit1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sq));
        edit2.addTextChangedListener(this);
        edit2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, nama));
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}