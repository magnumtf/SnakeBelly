package com.buber.snakebelly;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SnakeBellyActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return SnakeBellyFragment.newInstance();
    }
}
