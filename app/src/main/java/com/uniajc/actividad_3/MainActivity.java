package com.uniajc.actividad_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView txtV;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;

    public void operation(View view) {
        try {
            String valor1 = num1.getText().toString();
            String valor2 = num2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);

            if  (rb1.isChecked() == true){
                txtV.setText(String.valueOf(n1+n2));
            }
            if  (rb2.isChecked() == true){
                txtV.setText(String.valueOf(n1-n2));
            }
            if  (rb3.isChecked() == true){
                txtV.setText(String.valueOf( Math.pow(n1,n2)));
            }
            if  (rb4.isChecked() == true){
                txtV.setText("A = "+ String.valueOf(Math.sqrt(n1)) +"\n B = "+ String.valueOf(Math.sqrt(n2)) );
            }

        } catch (Exception e) {
            // TODO: handle exception
            txtV.setText("Primero selecciona una opción");
        }
    }



    public EditText getNum1() {
        return num1;
    }

    public EditText getNum2() {
        return num2;
    }

    public void setTxtV(TextView txtV) {
        this.txtV = txtV;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        txtV = findViewById(R.id.txtV);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
    }
}