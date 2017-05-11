package com.example.qiudengjiao.tablayout.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.qiudengjiao.tablayout.MainActivity;
import com.example.qiudengjiao.tablayout.Module.cart.CartFragment;
import com.example.qiudengjiao.tablayout.Module.category.CategoryFragment;
import com.example.qiudengjiao.tablayout.Module.home.HomeFragment;
import com.example.qiudengjiao.tablayout.Module.hot.HotFragment;
import com.example.qiudengjiao.tablayout.Module.mine.MineFragment;

/**
 * 适配器
 * Created by qiudengjiao on 2017/5/6.
 */

public class MainTabAdapter extends FragmentPagerAdapter {

    private MainActivity mContext;

    private HomeFragment homeFragment;
    private HotFragment hotFragment;
    private CategoryFragment categoryFragment;
    private CartFragment cartFragment;
    private MineFragment mineFragment;

    public MainTabAdapter(MainActivity mainActivity) {
        super(mainActivity.getSupportFragmentManager());
        this.mContext = mainActivity;

        //初始化Fragment
        homeFragment = new HomeFragment();
        hotFragment = new HotFragment();
        categoryFragment = new CategoryFragment();
        cartFragment = new CartFragment();
        mineFragment = new MineFragment();
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return homeFragment;
        } else if (position == 1) {
            return hotFragment;
        } else if (position == 2) {
            return categoryFragment;
        } else if (position == 3) {
            return cartFragment;
        } else if (position == 4) {
            return mineFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
