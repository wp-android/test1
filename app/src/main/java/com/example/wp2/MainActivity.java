package com.example.wp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView) findViewById(R.id.list_item);
        String[] datas={"a","b","c"};
        MyAdapter myAdapter=new MyAdapter(this,datas);
        listView.setAdapter(myAdapter);
    }
}
