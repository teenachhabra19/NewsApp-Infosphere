package com.example.newsappjava.ui.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.newsappjava.ui.fragments.EntertainmentFragment;
import com.example.newsappjava.ui.fragments.HealthFragment;
import com.example.newsappjava.ui.fragments.HomeFragment;
import com.example.newsappjava.ui.fragments.ScienceFragment;
import com.example.newsappjava.ui.fragments.SportsFragment;
import com.example.newsappjava.ui.fragments.TechnologyFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    int tabcount;

    public ViewPagerAdapter(@NonNull FragmentManager fm,int behaviour) {
        super(fm,behaviour);
        tabcount=behaviour;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch(position)
       {
           case 0:
               return new HomeFragment();
           case 1:
               return new SportsFragment();
           case 2:
               return new HealthFragment();
           case 3:
               return new ScienceFragment();
           case 4:
               return new EntertainmentFragment();
           case 5:
               return new TechnologyFragment();
           default:
               return null;
       }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
