package com.codekul.interactivitycommunication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    public static final String KEY_CITY = "city";
    public static final String KEY_COMPANY = "company";
    public static final int REQ_NEXT = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startNextActivity();
            }
        });
    }

    private void startNextActivity(){

        Intent intent =
                new Intent(this, NextActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString(KEY_CITY,"pune");
        bundle.putString(KEY_COMPANY,"codekul.com");

        intent.putExtras(bundle);

        //startActivity(intent);
        startActivityForResult(intent,REQ_NEXT); // not enough
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQ_NEXT){
            if(resultCode == RESULT_OK){

                String dataRaw = data.getExtras().getString(NextActivity.KEY_DATA_RES);
                ((Button)findViewById(R.id.btnNext)).setText(dataRaw);
            }
        }
        if(requestCode == 2345){

        }
    }
}
