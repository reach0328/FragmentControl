package com.android.jh.fragmentcontrol2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListFragment.Listener {
    ListFragment list;
    DetailFragment detail;
    String datas[] = {"월","화","수","목","금"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ListFragment();
        detail = new DetailFragment();
    }

    public void goDetail(int position) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment, detail);
        transaction.commit();
    }
    public void goList(){

    }

    @Override
    public String[] getData() {
        return datas;
    }
}
