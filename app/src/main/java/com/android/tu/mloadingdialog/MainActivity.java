package com.android.tu.mloadingdialog;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.tu.loadingdialog.LoadingDailog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.style1_btn);
        btn2= (Button) findViewById(R.id.style2_btn);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.style1_btn:
                LoadingDailog.Builder builder1=new LoadingDailog.Builder(MainActivity.this)
                        .setMessage("加载中...")
                        .setCancelable(false);
                final LoadingDailog dialog1=builder1.create();
                dialog1.show();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        dialog1.dismiss();
                    }
                },2000);
                break;
            case R.id.style2_btn:
                LoadingDailog.Builder builder2=new LoadingDailog.Builder(MainActivity.this)
                        .setShowMessage(false)
                        .setCancelable(false);
                final LoadingDailog dialog2=builder2.create();
                dialog2.show();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        dialog2.dismiss();
                    }
                },2000);
                break;
        }
    }

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
}
