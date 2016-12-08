package com.giou.bottombartest;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.giou.bottombartest.fragment.UserFragmentFactory;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {

                switch (tabId){
                    case R.id.tab_favorites:
                        Log.d(TAG,"001 "+"被点击了");
                        changeFragment(UserFragmentFactory.createFragment(0));
                        break;

                    case R.id.tab_nearby:
                        Log.d(TAG,"002 "+"被点击了");
                        changeFragment(UserFragmentFactory.createFragment(1));
                        break;

                    case R.id.tab_friends:
                        Log.d(TAG,"003 "+"被点击了");
                        changeFragment(UserFragmentFactory.createFragment(2));
                        break;

                    case R.id.tab_friends2:
                        Log.d(TAG,"004 "+"被点击了");
                        changeFragment(UserFragmentFactory.createFragment(3));
                        break;

                    case R.id.tab_friends3:
                        Log.d(TAG,"005 "+"被点击了");
                        changeFragment(UserFragmentFactory.createFragment(4));
                        break;
                }
            }
        });
    }

    private void changeFragment(Fragment targetFragment) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contentContainer, targetFragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}
