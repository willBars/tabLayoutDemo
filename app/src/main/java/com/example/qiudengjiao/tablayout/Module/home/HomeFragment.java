package com.example.qiudengjiao.tablayout.Module.home;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiudengjiao.tablayout.Adapter.TopAdapter;
import com.example.qiudengjiao.tablayout.Base.BaseFragment;
import com.example.qiudengjiao.tablayout.R;
import com.example.qiudengjiao.tablayout.databinding.FragmentHomeBinding;
import com.example.qiudengjiao.tablayout.top.Fragment1;
import com.example.qiudengjiao.tablayout.top.Fragment2;
import com.example.qiudengjiao.tablayout.top.Fragment3;

import java.util.ArrayList;
import java.util.List;

/**
 * 主界面 - 首页Fragment
 * Created by qiudengjiao on 2017/5/6.
 */

public class HomeFragment extends BaseFragment {
    private FragmentPagerAdapter mAdapter;
    private List<Fragment> mFragment;
    private List<String> mTitle;
    private FragmentHomeBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        initTabFragment();
        return mBinding.getRoot();
    }
    private void initTabFragment() {

        //初始化Fragment
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();

        //将Fragment装进列表中
        mFragment = new ArrayList<>();
        mFragment.add(fragment1);
        mFragment.add(fragment2);
        mFragment.add(fragment3);

        //将名称添加daoTab列表
        mTitle = new ArrayList<>();
        mTitle.add("Tab1");
        mTitle.add("Tab2");
        mTitle.add("Tab3");

        //为TabLayout添加Tab名称
        mBinding.topTabLayout.addTab(mBinding.topTabLayout.newTab().setText(mTitle.get(0)));
        mBinding.topTabLayout.addTab(mBinding.topTabLayout.newTab().setText(mTitle.get(1)));
        mBinding.topTabLayout.addTab(mBinding.topTabLayout.newTab().setText(mTitle.get(2)));


        mAdapter = new TopAdapter(getActivity().getSupportFragmentManager(), mFragment, mTitle);

        //ViewPager加载Adapter
        mBinding.topViewPager.setAdapter(mAdapter);

        //TabLayout加载ViewPager
        mBinding.topTabLayout.setupWithViewPager(mBinding.topViewPager);
    }
}
