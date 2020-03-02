package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {
    int[] images;
    String[] names;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        images= new int[]{R.drawable.zvcxbcvb, R.drawable.sasasdf,
                R.drawable.cvbvhjkbn};

        names= new String[]{"zvcxbcvb", "sasasdf", "cvbvhjkbn"};

        LinearLayoutManager linearLayoutManager=
                new LinearLayoutManager(DashboardActivity.this);

        VersionAdapter adapter=
                new VersionAdapter(DashboardActivity.this,getList(images,names),this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<AndroidVersion> getList(int[] images, String[] names){

        List<AndroidVersion> list=new ArrayList<>();
        for (int i=0;i<images.length;i++){
            AndroidVersion version=new AndroidVersion();
            version.setImage(images[i]);
            version.setName(names[i]);
            list.add(version);
        }
        return list;
    }

}

