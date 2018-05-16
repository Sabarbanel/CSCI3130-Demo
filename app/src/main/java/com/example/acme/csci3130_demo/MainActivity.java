package com.example.acme.csci3130_demo;
/*
Sarah Abarbanel
B0071030
sr07162
Assignment 1
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View a)
            {
                TextView helloworld = findViewById(R.id.textView);
                EditText text = findViewById(R.id.editText);
                helloworld.setText(text.getText());
            }
        });
    }
}
