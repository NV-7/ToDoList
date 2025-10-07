package com.example.todolist;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTask;
    private EditText editTextTime;
    private ListView listView;
    private Button button;
    public static final String SHARED_PREFS = "sharedPrefs";

    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        @Override
                protected void onCreate(Bundle savedInstanceState) {
            sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            sharedPreferences settings = getSharedPreferences(SHARED_PREFS, 0);
            getSharedPreferences(SHARED_PREFS, 0);


        }
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


            editTextTask = findViewById(R.id.editTextTask);
            editTextTime = findViewById(R.id.editTextTime);
            listView = findViewById(R.id.listViewTask);
            button = findViewById(R.id.buttonSubmit);


        };
    }
