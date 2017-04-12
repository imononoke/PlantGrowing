package com.isa.growing;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Izumi on 17/4/10.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<String> tabsList;
    private int[] imageResId;

    public ViewPagerAdapter(FragmentManager fm, Context context, List<String> list, int[] imageResId) {
        super(fm);
        this.context = context;
        this.tabsList = list;
        this.imageResId = imageResId;
    }

    @Override
    public Fragment getItem(int position) {
        //        return PageFragment.newInstance(position + 1);

        switch (position) {
            case 0:
                return new VarietyFragment();

            case 1:
            default:
                return new MineFragment();
        }
    }

    @Override
    public int getCount() {
        return tabsList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabsList.get(position);
    }

    public View getTabView(int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_tab_item, null);
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        tvName.setText(tabsList.get(position));
        ImageView imageView = (ImageView) view.findViewById(R.id.tabImage);
        imageView.setImageResource(imageResId[position]);
        return view;
    }
}
