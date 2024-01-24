package com.example.class_work_02_062;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = findViewById(R.id.button1);
        CardView cardView = findViewById(R.id.card_view);

        buttonOne.setOnClickListener(v -> {
            if (cardView.getAlpha() == 1) {
                cardView.animate().alpha(0);
            } else {
                cardView.animate().alpha(1);
            }
            LinearLayout container = findViewById(R.id.container);

            findViewById(R.id.big_button).setOnClickListener(v1 -> {
                if (container.getVisibility() == View.INVISIBLE) {
                    container.setVisibility(View.VISIBLE);
                } else {
                    container.setVisibility(View.INVISIBLE);
                }
            });

        });
        EditText editText = findViewById(R.id.edit_text);
        findViewById(R.id.circle).setOnClickListener(v -> {
            Toast.makeText(this, editText.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}