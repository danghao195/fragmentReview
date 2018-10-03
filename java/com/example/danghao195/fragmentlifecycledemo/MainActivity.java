package com.example.danghao195.fragmentlifecycledemo;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.danghao195.fragmentlifecycledemo.fragment.Fragment1;
import com.example.danghao195.fragmentlifecycledemo.fragment.Fragment2;

public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener, Fragment2.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment1 fragment1 = Fragment1.newInstance("abc","123");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fm, fragment1);
        fragmentTransaction.commit();



    }

    public void viewFragment1(View view) {
        Fragment1 fragment1 = Fragment1.newInstance("abc","123");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fm, fragment1);
        fragmentTransaction.commit();
    }

    public void viewFragment2(View view) {
        Fragment2 fragment2 = Fragment2.newInstance("abc","123");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fm, fragment2);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
