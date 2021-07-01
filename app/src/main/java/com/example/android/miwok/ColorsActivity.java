package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers=new ArrayList<Word>();
        numbers.add(new Word("black","lutti",R.drawable.color_black,R.raw.number_one));
        numbers.add(new Word("red","loop",R.drawable.color_red,R.raw.number_one));
        numbers.add(new Word("blue","fgdfgi",R.drawable.color_brown,R.raw.number_one));
        numbers.add(new Word("white","gdfgi",R.drawable.color_white,R.raw.number_one));
        numbers.add(new Word("green","lgdfti",R.drawable.color_green,R.raw.number_one));
        numbers.add(new Word("yellow","ndfdghti",R.drawable.color_mustard_yellow,R.raw.number_one));



        WordAdapter adapter=
                new WordAdapter(this,numbers);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}