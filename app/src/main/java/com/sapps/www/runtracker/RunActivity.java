package com.sapps.www.runtracker;

import android.support.v4.app.Fragment;

public class RunActivity extends SingleFragmentActivity {

    public Fragment createFragment() {
        return new RunFragment();
    }
}
