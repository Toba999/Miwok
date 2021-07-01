package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word>numbers=new ArrayList<Word>();
        numbers.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
        numbers.add(new Word("two","loop",R.drawable.number_two,R.raw.number_two));
        numbers.add(new Word("three","fgdfgi",R.drawable.number_three,R.raw.number_three));
        numbers.add(new Word("four","gdfgi",R.drawable.number_four,R.raw.number_four));
        numbers.add(new Word("five","lgdfti",R.drawable.number_five,R.raw.number_five));
        numbers.add(new Word("six","ndfdghti",R.drawable.number_six,R.raw.number_six));



        WordAdapter adapter=
                 new WordAdapter(this,numbers);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=numbers.get(position);
                mMediaPlayer=MediaPlayer.create(NumbersActivity.this,word.getAudioRedourceId());
            }
        });

    }
}