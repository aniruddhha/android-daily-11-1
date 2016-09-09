package com.codekul.compoundviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout =
                (LinearLayout) findViewById(R.id.linearLayout);
        //LinearLayout.LayoutParams
        //RelativeLayout.LayoutParams
        //ViewGroup.LayoutParams
        //FrameLayout.LayoutParams


        LayoutInflater infalter =
                getLayoutInflater();

                 /*Or*/

        infalter = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);

        View compoundView =
                infalter.inflate(R.layout.compound_view,layout,true);

        ImageView imageView = (ImageView) compoundView.findViewById(R.id.imageView);

        TextView textView = (TextView) compoundView.findViewById(R.id.textView);
    }
}
