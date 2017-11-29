package com.hengsheng.bottomsheetdemo.transformer;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by zb on 2017/11/29/029.
 */

public class RotateTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setRotationY(position * -30);
    }
}
