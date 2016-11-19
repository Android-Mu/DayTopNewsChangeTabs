package com.example.mjj.daytopnewschangetabs.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Description：解决嵌套显示不全问题
 * <p>
 * Created by Mjj on 2016/11/18.
 */

public class OtherGridView extends GridView {

    public OtherGridView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
