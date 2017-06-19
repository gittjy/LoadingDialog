package com.android.tu.mloadingdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.tu.loadingdialog.LoadingDailog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadingDailog.Builder builder=new LoadingDailog.Builder(this)
                .setShowMessage(false)
                .setCancelable(false)
                .setCancelOutside(false);
        builder.create().show();
    }
}
