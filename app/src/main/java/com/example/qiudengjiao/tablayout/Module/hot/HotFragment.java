package com.example.qiudengjiao.tablayout.Module.hot;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiudengjiao.tablayout.R;
import com.example.qiudengjiao.tablayout.databinding.FragmentHotBinding;

/**
 * 主界面 - 热卖Fragment
 * Created by qiudengjiao on 2017/5/6.
 */

public class HotFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentHotBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_hot, container, false);

        return binding.getRoot();
    }
}
