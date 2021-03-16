package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Picture> pictureList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPictures();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //默认是纵向排列，调用方法设置为横向排列
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        PictureAdapter adapter = new PictureAdapter(pictureList);
        recyclerView.setAdapter(adapter);
    }

    private void initPictures(){
        for(int i = 0; i < 5; i++){
            Picture pic1 = new Picture("Pic1", R.drawable.timg3);
            pictureList.add(pic1);

            Picture pic2 = new Picture("Pic2", R.drawable.timg14);
            pictureList.add(pic2);

            Picture pic3 = new Picture("Pic3", R.drawable.timg22);
            pictureList.add(pic3);
        }
    }

}
