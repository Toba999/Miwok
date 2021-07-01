package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> family=new ArrayList<Word>();
        family.add(new Word("ohfdhfne","ldfhutti"));
        family.add(new Word("thdfhfdhwo","rtyhloop"));
        family.add(new Word("tffhfhhree","fghhdfgi"));
        family.add(new Word("fhfhfhfour","gdhdhfgi"));
        family.add(new Word("fhfhdfhive","lgdfti"));
        family.add(new Word("shhdfhix","ndfdghdfhti"));



        WordAdapter adapter=
                new WordAdapter(this,family);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}