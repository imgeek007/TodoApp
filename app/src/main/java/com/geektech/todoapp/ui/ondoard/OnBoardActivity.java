package com.geektech.todoapp.ui.ondoard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geektech.todoapp.MainActivity;
import com.geektech.todoapp.Prefs;
import com.geektech.todoapp.R;

public class OnBoardActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

    }

    public void onSkip(View v) {
        Prefs.getInstance(this).saveShown();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
