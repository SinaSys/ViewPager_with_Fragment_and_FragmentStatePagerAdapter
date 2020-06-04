package com.sriyanksiddhartha.fragmentpageradapter.app;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.sriyanksiddhartha.fragmentpageradapter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        CustomAdapter adapter = new CustomAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
