package com.sriyanksiddhartha.fragmentpageradapter.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sriyanksiddhartha.fragmentpageradapter.fragments.FragmentFive;
import com.sriyanksiddhartha.fragmentpageradapter.fragments.FragmentFour;
import com.sriyanksiddhartha.fragmentpageradapter.fragments.FragmentOne;
import com.sriyanksiddhartha.fragmentpageradapter.fragments.FragmentSix;
import com.sriyanksiddhartha.fragmentpageradapter.fragments.FragmentThree;
import com.sriyanksiddhartha.fragmentpageradapter.fragments.FragmentTwo;

public class CustomAdapter extends FragmentStatePagerAdapter { // Replace and use FragmentPagerAdapter as per your requirement

    private final int ITEMS = 6;

    public CustomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return ITEMS;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();
            case 4:
                return new FragmentFive();
            case 5:
                return new FragmentSix();

            default:
                return new FragmentOne();
        }
    }
}
