package com.example.walcius.dzielnypacjent.Pomocnik;


  import android.support.v4.app.Fragment;
  import android.support.v4.app.FragmentManager;
  import android.support.v4.app.FragmentPagerAdapter;

  import com.example.walcius.dzielnypacjent.Powiadomienia.PowiadomieniaLekiFragment;


/**
 * Created by Walcius on 2016-04-06.
 */
public class PowiadomieniaPageAdapter extends FragmentPagerAdapter {

    public PowiadomieniaPageAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new PowiadomieniaLekiFragment();
          //  case 1:
                // Games fragment activity
              //  return new GamesFragment();
          //  case 2:
                // Movies fragment activity
              //  return new MoviesFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}
