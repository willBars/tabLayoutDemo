package com.example.qiudengjiao.tablayout.top;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiudengjiao.tablayout.Base.BaseFragment;
import com.example.qiudengjiao.tablayout.R;
import com.example.qiudengjiao.tablayout.databinding.Fragment2Binding;

/**
 * Created by qiudengjiao on 2017/5/8.
 */

public class Fragment2 extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Fragment2Binding binding = DataBindingUtil.inflate(inflater, R.layout.fragment2, container, false);

        return binding.getRoot();
    }
}
