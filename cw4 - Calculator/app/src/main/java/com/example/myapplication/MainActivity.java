package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        TextView title = findViewById(R.id.title);
        ImageView catImage = findViewById(R.id.image);

        EditText firstNumber = findViewById(R.id.editText);
        EditText secondNumber = findViewById(R.id.editText2);

        Button calculate = findViewById(R.id.button);

        TextView total = findViewById(R.id.textView);
        TextView sharingTotal = findViewById(R.id.textView3);



        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int num1 = Integer.parseInt(firstNumber.getText().toString());
                int num2 = Integer.parseInt(secondNumber.getText().toString());

                int result = num1 + num2;

                sharingTotal.setText(String.valueOf(result));

            }
        });







    }
}