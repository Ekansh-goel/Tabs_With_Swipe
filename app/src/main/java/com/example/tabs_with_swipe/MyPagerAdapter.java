package com.example.tabs_with_swipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int tabcout;

    public MyPagerAdapter(FragmentManager fm, int tabcout) {
        super(fm);
        this.tabcout = tabcout;
    }

    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                fragment_1 fragment1 = new fragment_1();
                return fragment1;

            case 1:
                fragment_2 fragment2 = new fragment_2();
                return fragment2;

            case 2:
                fragment_3 fragment3 = new fragment_3();
                return fragment3;
            default:
                return (null);
        }
    }

    @Override
    public int getCount() {
        return tabcout;
    }
}
