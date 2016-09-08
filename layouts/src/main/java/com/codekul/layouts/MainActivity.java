package com.codekul.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nested_laout);

        findViewById(R.id.btnCircle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(R.drawable.circle);
            }
        });

        findViewById(R.id.btnMy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(R.drawable.my);
            }
        });

        findViewById(R.id.btnPin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(R.drawable.pin);
            }
        });

        findViewById(R.id.btnSeo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(R.drawable.a);
            }
        });
    }

    private void changeImage(int image){
        ((ImageView)findViewById(R.id.imageView))
                .setImageResource(image);
    }
}
