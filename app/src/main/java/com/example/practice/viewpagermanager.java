package com.example.practice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewpagermanager extends FragmentPagerAdapter {
    public viewpagermanager(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new Fragment1();
        else if (position==1)
            return  new Fragment2();
        else
            return  new Fragment3();
    }




    @Override
    public int getCount() {return 3;}

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0)
            return "Fragment 1";
        else if (position==1)
            return "Fragment 2";
        else
            return "Fragment 3";
    }
}
