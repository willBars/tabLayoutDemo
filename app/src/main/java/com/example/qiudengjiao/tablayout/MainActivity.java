package com.example.qiudengjiao.tablayout;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.example.qiudengjiao.tablayout.Adapter.MainTabAdapter;
import com.example.qiudengjiao.tablayout.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private FragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏系统自带的状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //隐藏掉整个ActionBar
        getSupportActionBar().hide();
     /*通过DataBing来绑定布局视图*/
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //初始化适配器-添加所需要的fragment
        mAdapter = new MainTabAdapter(this);

        binding.viewPager.setAdapter(mAdapter);


        //将TabLayout和ViewPager关联起来
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        binding.viewPager.setOffscreenPageLimit(5);


        initTab();
    }

    /**
     * 设置添加Tab
     */
    private void initTab() {

        binding.tabLayout.getTabAt(0).setCustomView(R.layout.tab_home);
        binding.tabLayout.getTabAt(1).setCustomView(R.layout.tab_hot);
        binding.tabLayout.getTabAt(2).setCustomView(R.layout.tab_category);
        binding.tabLayout.getTabAt(3).setCustomView(R.layout.tab_cart);
        binding.tabLayout.getTabAt(4).setCustomView(R.layout.tab_mine);

        //默认选中的Tab
        binding.tabLayout.getTabAt(0).getCustomView().setSelected(true);

    }

}
