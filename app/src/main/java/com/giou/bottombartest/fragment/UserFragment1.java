package com.giou.bottombartest.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.giou.bottombartest.utils.UIUtils;

/**
 * Description:
 * Author:Giousa
 * Date:2016/12/8
 * Email:65489469@qq.com
 */
public class UserFragment1 extends MyBaseFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TextView textView = new TextView(UIUtils.getContext());
        textView.setText("第一个界面");
        textView.setTextColor(Color.RED);

        return textView;
    }
}
