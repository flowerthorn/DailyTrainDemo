package com.study.train.view.scroll;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import com.study.train.R;

import androidx.annotation.Nullable;

public class ListViewAndScrollViewDemo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_and_scrollview);
        ListView listView = findViewById(R.id.listView);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add("这是数据" + i);
        }
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list));

    }

}
