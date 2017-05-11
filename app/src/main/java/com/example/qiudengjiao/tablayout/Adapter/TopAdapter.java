package com.example.qiudengjiao.tablayout.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 顶部导航栏 Adapter
 * Created by qiudengjiao on 2017/5/8.
 */

public class TopAdapter extends FragmentPagerAdapter {

    //Fragment列表
    private List<Fragment> mFragment;

    //Tab名列表
    private List<String> mTitle;

    public TopAdapter(FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);

        this.mFragment = fragments;
        this.mTitle = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mTitle.size();
    }

    //此方法用来显示Tab上的名字
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }
}
