package com.study.train.view.scroll;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class CustomListViewForScroll extends ListView {

    public CustomListViewForScroll(Context context) {
        super(context);
    }

    public CustomListViewForScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomListViewForScroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomListViewForScroll(Context context, AttributeSet attrs, int defStyleAttr,
            int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,//右移运算符，相当于除于4
                MeasureSpec.AT_MOST);//测量模式取最大值
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);//重新测量高度

    }
}
