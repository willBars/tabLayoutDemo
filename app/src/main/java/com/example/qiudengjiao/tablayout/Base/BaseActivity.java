package com.example.qiudengjiao.tablayout.Base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by qiudengjiao on 2017/5/8.
 */

public class BaseActivity extends AppCompatActivity {

    private BaseActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;
    }
}
