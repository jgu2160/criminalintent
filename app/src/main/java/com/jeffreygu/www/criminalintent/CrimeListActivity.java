package com.jeffreygu.www.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jgu2160 on 12/24/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
