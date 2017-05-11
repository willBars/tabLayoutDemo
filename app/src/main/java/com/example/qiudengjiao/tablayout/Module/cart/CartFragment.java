package com.example.qiudengjiao.tablayout.Module.cart;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiudengjiao.tablayout.R;
import com.example.qiudengjiao.tablayout.databinding.FragmentCartBinding;

/**
 * 主界面 - 购物车Fragment
 * Created by qiudengjiao on 2017/5/6.
 */

public class CartFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCartBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cart, container, false);
        return binding.getRoot();
    }
}
