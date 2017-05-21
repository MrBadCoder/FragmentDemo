package com.example.fragment_demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
    Button btnFirFragment,btnSenFragment,btnFirSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView() {
        btnFirFragment = (Button) findViewById(R.id.button);
        btnFirFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment_1 fragment_1 = new Fragment_1();
                ft.add(R.id.fragment_container,fragment_1);
                ft.commit();
            }
        });
        btnSenFragment = (Button) findViewById(R.id.button2);
        btnSenFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                Fragment_2 fragment_2 = new Fragment_2();
                transaction.replace(R.id.fragment_container,fragment_2);
                transaction.commit();
            }
        });
    }
}
