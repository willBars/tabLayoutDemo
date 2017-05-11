package com.example.qiudengjiao.tablayout.Base;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by qiudengjiao on 2017/5/8.
 */

public class BaseFragment extends Fragment {

    protected Activity mContext;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = getActivity();
    }
}
