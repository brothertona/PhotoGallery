package com.bignerdranch.android.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by andrew on 6/22/2015.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment(){
        return new PhotoPageFragment();
    }
}
