package a5835512035.tem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private EditText edg1,edg2;
     private TextView ca,ca2;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcf(View view) {
        EditText edg1 = findViewById(R.id.edg1);
        TextView ca = findViewById(R.id.ca);
        String sedg1 = edg1.getText().toString();
        if (TextUtils.isEmpty(sedg1)){
            edg1.setError("Error");


        }
        else {
            double caa = Double.parseDouble(String.valueOf(edg1.getText()));
            caa = (caa * (9.0/5.0 )) +32;
            ca.setText(caa + "Fahrenheit") ;

        }

    }


    public void calfc(View view) {
        EditText edg2 = findViewById(R.id.edg2);
        TextView ca2 =  findViewById(R.id.ca2);
        String sedg2 = edg2.getText().toString();
        if (TextUtils.isEmpty(sedg2)){
            edg2.setError("Error");


        }
        else {
            double caaa = Double.parseDouble(String.valueOf(edg2.getText()));
            caaa = (caaa-32) * (5.0/9.0 );
            ca2.setText(caaa + "Celsius") ;

        }

    }
}
