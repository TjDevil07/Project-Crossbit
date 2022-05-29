package com.example.crossbit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;


public class MainActivity extends AppCompatActivity {

    String[] ar={"false","false","false","false"};
    SharedPreferences sp1;
    public void load(View view)
    {
        ImageView v=(ImageView) view;
        v.setImageResource(R.drawable.checked);
        switch (v.getId())
        {
            case R.id.imageView1:
                ar[0]="true";
                break;

            case R.id.imageView2:
                ar[1]="true";
                break;

            case R.id.imageView3:
                ar[2]="true";
                break;

            case R.id.imageView4:
                ar[3]="true";
                break;
        }
        sp1.edit().putString("save",new Gson().toJson(ar)).apply();
    }


    public void reset(View view)
    {
        ImageView v1=findViewById(R.id.imageView1);
        v1.setImageResource(R.drawable.book);
        ImageView v2=findViewById(R.id.imageView2);
        v2.setImageResource(R.drawable.run);
        ImageView v3=findViewById(R.id.imageView3);
        v3.setImageResource(R.drawable.dumbbell);
        ImageView v4=findViewById(R.id.imageView4);
        v4.setImageResource(R.drawable.walker);
        for(int i=0;i<4;i++)
        {
            ar[i]="false";
        }
        sp1.edit().putString("save",new Gson().toJson(ar)).apply();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*sp1 = this.getSharedPreferences("com.example.crossbit", 0);
        ar = new Gson().fromJson(sp1.getString("save", "true"), ar.getClass());

        for (int i = 0; i < 4; i++) {
            if (ar[i] == "false") {
                switch (i)
                {
                    case 0:
                        ImageView v1 = findViewById(R.id.imageView1);
                        v1.setImageResource(R.drawable.book);
                        break;

                    case 1:
                        ImageView v2 = findViewById(R.id.imageView2);
                        v2.setImageResource(R.drawable.run);
                        break;

                    case 2:
                        ImageView v3 = findViewById(R.id.imageView3);
                        v3.setImageResource(R.drawable.dumbbell);
                        break;

                    case 3:
                        ImageView v4 = findViewById(R.id.imageView4);
                        v4.setImageResource(R.drawable.walker);
                        break;
                }
            }
            if (ar[i] == "true") {
                switch (i)
                {
                    case 0:
                        ImageView v1 = findViewById(R.id.imageView1);
                        v1.setImageResource(R.drawable.checked);
                        break;

                    case 1:
                        ImageView v2 = findViewById(R.id.imageView2);
                        v2.setImageResource(R.drawable.checked);
                        break;

                    case 2:
                        ImageView v3 = findViewById(R.id.imageView3);
                        v3.setImageResource(R.drawable.checked);
                        break;

                    case 3:
                        ImageView v4 = findViewById(R.id.imageView4);
                        v4.setImageResource(R.drawable.checked);
                        break;
                }
            }
        }*/
    }

}