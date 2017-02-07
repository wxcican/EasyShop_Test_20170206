package com.fuicuiedu.xc.easyshop_test_20170206.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fuicuiedu.xc.easyshop_test_20170206.R;
import com.fuicuiedu.xc.easyshop_test_20170206.commons.ActivityUtils;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private ActivityUtils activityUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        activityUtils = new ActivityUtils(this);


        // TODO: 2017/2/7 0007 环信登录相关
        // TODO: 2017/2/7 0007 判断用户是否登录，自动登录

        //1.5秒后跳转到主页
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                activityUtils.startActivity(MainActivity.class);
                finish();
            }
        },1500);

    }
}
