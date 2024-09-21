package com.android.customlistview;

import android.os.Bundle;
import android.widget.ListView;

import com.android.customlistview.Adapter.Adapter;
import com.android.customlistview.Model.Model;
import com.android.customlistview.R;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Model> models = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        BindData();

    }

    void BindData() {
        models.add(new Model("Simple",R.drawable.c1));
        models.add(new Model("RENEE",R.drawable.c2));
        models.add(new Model("INSIGHT",R.drawable.c3));
        models.add(new Model("OLAY",R.drawable.c4));
        models.add(new Model("LOTUS",R.drawable.c5));
        models.add(new Model("Aqualogica",R.drawable.c6));
        models.add(new Model("BELLAVITTA",R.drawable.c7));
        models.add(new Model("Anomaly",R.drawable.c8));

        adapter = new Adapter(getApplicationContext(), models);
        lv.setAdapter(adapter);
    }
}
