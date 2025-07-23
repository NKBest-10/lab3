package com.example.lab3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public static void main(String[] args) {
        Note note1 = new Note();
        note1.title = "-Hate-";
        note1.context = "I hate everything";
        note1.getSummery();

        User userA =new User();
        userA.fullname ="Naruebet khunchan";
        userA.gender = "male";
        userA.age = 21;
        userA.getSummary();

        User userB =new User();
        userB.fullname ="Natthakit Puangmalai";
        userB.gender = "male";
        userB.age = 22;
        userB.getSummary();
    }
}