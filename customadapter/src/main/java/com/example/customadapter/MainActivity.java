package com.example.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cstAdp();
    }

    private void cstAdp() {
        List<ImgItm> dtSt = new ArrayList<>();
        dtSt.add(
                new ImgItm(
                        R.mipmap.ic_launcher,
                        "Windows"
                )
        );
        dtSt.add(
                new ImgItm(
                        R.mipmap.ic_launcher,
                        "Mac"
                )
        );
        dtSt.add(
                new ImgItm(
                        R.drawable.ic_launcher_background,
                        "IBM"
                )
        );
        dtSt.add(
                new ImgItm(
                        R.drawable.ic_launcher_foreground,
                        "Quantum"
                )
        );
        dtSt.add(
                new ImgItm(
                        R.drawable.ic_launcher_foreground,
                        "Dell"
                )
        );

        ImgAdapter adapter = new ImgAdapter(
                this,
                dtSt
        );

        ListView lstView = findViewById(R.id.lstVw);
        lstView.setAdapter(adapter);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
