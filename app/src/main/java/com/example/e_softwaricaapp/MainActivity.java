package com.example.e_softwaricaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.e_softwaricaapp.Models.Students;
import com.example.e_softwaricaapp.StudentFragment.Fragment_About;
import com.example.e_softwaricaapp.StudentFragment.Fragment_Add;
import com.example.e_softwaricaapp.StudentFragment.Fragment_Home;
import com.example.e_softwaricaapp.Models.Students;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    FrameLayout main_layout;
    public static List<Students> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        main_layout = findViewById(R.id.main_layout);
        students.add(new Students("Suraj Puri", 22, "male", "kalanki", R.drawable.a));
        students.add(new Students("Bikash Thapa", 20, "Male", "baktapur", R.drawable.b));
        students.add(new Students("Sujeet katwal", 22, "Female", "Lalitpur", R.drawable.d));

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.Nav_Home:
                        fragment = new Fragment_Home();
                        break;
                    case R.id.Nav_AboutUs:
                        fragment = new Fragment_About();
                        break;
                    case R.id.Nav_AddStudent:
                        fragment = new Fragment_Add();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,
                        fragment).commit();
                return true;

            }
        });
    }
}



