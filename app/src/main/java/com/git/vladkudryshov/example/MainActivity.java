package com.git.vladkudryshov.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "MainActivity";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        Log.d(Tag, "Some text");
=======
        Log.d(Tag, "Cherry pic");
>>>>>>> 679865e5bc2720932fba15090d17012b8e10ef68
    }
}
