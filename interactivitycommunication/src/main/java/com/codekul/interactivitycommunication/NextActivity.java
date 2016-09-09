package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NextActivity extends AppCompatActivity {

    public static final String KEY_DATA_RES = "dataResult";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent responsibleIntent = getIntent();
        final Bundle bundle = responsibleIntent.getExtras();
        if(bundle != null){
            ((EditText)findViewById(R.id.edtResult))
                    .setText(bundle.getString(MainActivity.KEY_COMPANY)+" - "+ bundle.getString(MainActivity.KEY_CITY));
        }

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent data = new Intent(); // data transporter

                String dataRaw = ((EditText)findViewById(R.id.edtResult))
                        .getText()
                        .toString();

                Bundle bundleData = new Bundle();
                bundleData.putString(KEY_DATA_RES,dataRaw);

                data.putExtras(bundleData);
                setResult(RESULT_OK,data);
                finish();
            }
        });
    }
}
