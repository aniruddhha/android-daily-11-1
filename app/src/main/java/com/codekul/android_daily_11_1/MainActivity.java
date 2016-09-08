package com.codekul.android_daily_11_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edtUserName = (EditText) findViewById(R.id.edtUserName);
                EditText edtPassword = (EditText) findViewById(R.id.edtPassword);

                TextView text = (TextView) findViewById(R.id.textStatus);

                if(edtUserName.getText().toString().equals("android")
                        && edtPassword.getText().toString().equals("android") ){
                    text.setText("Success");
                }
                else {
                    text.setText("Fail");
                }
            }
        });
    }
}
