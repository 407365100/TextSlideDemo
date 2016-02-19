package com.luomo.demo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.widget.TextView;
import com.luomo.demo.R;
import com.luomo.demo.view.LazyViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * ÃÓ≥‰ViewPagerµƒ“≥√Ê  ≈‰∆˜
 */
public class LViewPagerAdapter extends PagerAdapter {
    private Context context;
    private String[] texts;
    private List<View> list;

    public LViewPagerAdapter(Context context, String[] texts) {
        this.context = context;
        this.texts = texts;
        list = new ArrayList<View>();
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((LazyViewPager) container).removeView(list.get(position));
    }

    @Override
    public Object instantiateItem(View container, int position) {
        View view = View.inflate(context, R.layout.layout_slide_item, null);
        TextView textView = (TextView) view.findViewById(R.id.tv_text);
        textView.setText(texts[position]);
        list.add(view);
        ((LazyViewPager) container).addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }
}
