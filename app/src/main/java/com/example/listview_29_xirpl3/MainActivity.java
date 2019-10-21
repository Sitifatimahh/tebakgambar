package com.example.listview_29_xirpl3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView List;

    String [] namabuah = {
            "Alpukat",
            "Apel",
            "Ceri",
            "Durian",
            "Jambu Air",
            "Manggis ",
            "Strawberry"
    };
    int[] gambarbuah ={
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry,
    };
    int [] suarabuah = {
            R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambuair,
            R.raw.manggis,
            R.raw.strawberry,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List = findViewById(R.id.list_view);
        CustomListAdapter adapter = new CustomListAdapter(MainActivity.this, namabuah, gambarbuah);
        List.setAdapter(adapter);

        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                MediaPlayer.create(MainActivity.this, suarabuah[position]).start();
            }
        });




    }
}
