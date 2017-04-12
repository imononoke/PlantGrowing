package com.isa.growing;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private TabLayout.Tab tabVariety;
    private TabLayout.Tab tabMine;

    private ViewPager viewPager;

    private FragmentPagerAdapter pagerAdapter;

    private List<String> tabList;

    private int[] imageResId = {
            R.drawable.flower,
            R.drawable.favorite

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        tabList = new ArrayList<>();
        tabList.add("Variety");
        tabList.add("Mine");
    }

    private void initView() {
        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), this, tabList, imageResId);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(pagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        tabVariety = tabLayout.getTabAt(0);
        tabVariety.setIcon(R.drawable.flower);

        tabMine = tabLayout.getTabAt(1);
        tabMine.setIcon(R.drawable.favorite);
    }
}
