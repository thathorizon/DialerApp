package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // кнопки от 0 до 9
        List<Button> buttons = new ArrayList<>();
        buttons.add(findViewById(R.id.btnOne));
        buttons.add(findViewById(R.id.btnTwo));
        buttons.add(findViewById(R.id.btnThree));
        buttons.add(findViewById(R.id.btnFour));
        buttons.add(findViewById(R.id.btnFive));
        buttons.add(findViewById(R.id.btnSix));
        buttons.add(findViewById(R.id.btnSeven));
        buttons.add(findViewById(R.id.btnEight));
        buttons.add(findViewById(R.id.btnNine));
        buttons.add(findViewById(R.id.btnZero));

        // поле с номером
        TextView numberTv = findViewById(R.id.tvPhoneNumber);
        // кнопка *
        Button starButton = findViewById(R.id.btnStarSign);
        // кнопка #
        Button hashButton = findViewById(R.id.btnHashSign);
        // кнопка удаления последней цифры
        ImageButton backspaceButton = findViewById(R.id.btnDelete);
        // кнопка вызова
        ImageButton callButton = findViewById(R.id.btnCall);
    }
}
