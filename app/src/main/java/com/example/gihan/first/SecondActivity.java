package com.example.gihan.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void back(View view) {
        finish();
    }
    int index=0;
    int[] picArr={R.drawable.cars1,R.drawable.cars2,R.drawable.cars3};

    public void setImage(View view) {
        ImageView imgpic=(ImageView)findViewById(R.id.first);
        imgpic.setImageResource(picArr[index]);
        index++;
        if(index>picArr.length-1)
        {
            index=0;
        }
    }
}
