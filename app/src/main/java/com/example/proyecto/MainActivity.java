package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button buttonCompare;
    private TextView textViewResult;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        buttonCompare = findViewById(R.id.buttonCompare);
        textViewResult = findViewById(R.id.textViewResult);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        buttonCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();

                boolean areEqual = viewModel.compareStrings(str1, str2);

                if (areEqual) {
                    textViewResult.setText("Las cadenas son iguales.");
                } else {
                    textViewResult.setText("Las cadenas son diferentes.");
                }
            }
        });
    }
}
