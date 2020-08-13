package com.example.walcius.dzielnypacjent;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

import com.example.walcius.dzielnypacjent.Pomocnik.PowiadomieniaPageAdapter;
import com.example.walcius.dzielnypacjent.Powiadomienia.PowiadomieniaLekiFragment;

public class PowiadomieniaActivity extends FragmentBaseActivity{

    private ViewPager viewPager;
    private PowiadomieniaPageAdapter mAdapter;

    private String[] tabs = {"Pomiary cukru","Pomiary ciśnienia","Leki"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powiadomienia);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PowiadomieniaLekiFragment hello = new PowiadomieniaLekiFragment();
        fragmentTransaction.add(R.id.pager, hello, "HELLO");
        fragmentTransaction.commit();
//
//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
//        ActionBar actionBar = getActionBar();
//        viewPager = (ViewPager) findViewById(R.id.pager);
//
//        mAdapter = new PowiadomieniaPageAdapter(getSupportFragmentManager());
//
//        viewPager.setAdapter(mAdapter);
//        //   actionBar.setHomeButtonEnabled(false);
//        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//
//        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
//            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
//                // show the given tab
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
//                // hide the given tab
//            }
//
//            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
//                // probably ignore this event
//            }};
//
//           // for (int i = 0; i < 3; i++) {
//                actionBar.addTab(
//                        actionBar.newTab()
//                                .setText("Leki")
//                                .setTabListener(tabListener));
//           // }
//



    }


}
