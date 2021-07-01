package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers=new ArrayList<Word>();
        numbers.add(new Word("one","lutti"));
        numbers.add(new Word("two","loop"));
        numbers.add(new Word("three","fgdfgi"));
        numbers.add(new Word("four","gdfgi"));
        numbers.add(new Word("five","lgdfti"));
        numbers.add(new Word("six","ndfdghti"));



        WordAdapter adapter=
                new WordAdapter(this,numbers);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}