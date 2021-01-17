package com.example.study00;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        List<String> data = new ArrayList<>();//데이터를 저장할 리스트 생성

        //리스트와, 리스트 뷰를 연결해주는 어뎁터 필요.어댑터를 생성해준다.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        //어뎁터를 연결해준다.
        list.setAdapter(adapter);
        //아이템을 추가해준다.
        data.add("item1");
        data.add("item2");
        data.add("item3");
        adapter.notifyDataSetChanged();
    }

}
