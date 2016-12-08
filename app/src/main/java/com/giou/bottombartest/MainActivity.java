package com.giou.bottombartest;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
                        break;

                    case R.id.tab_nearby:
                        Log.d(TAG,"002 "+"被点击了");
                        break;

                    case R.id.tab_friends:
                        Log.d(TAG,"003 "+"被点击了");
                        break;

                    case R.id.tab_friends2:
                        Log.d(TAG,"004 "+"被点击了");
                        break;

                    case R.id.tab_friends3:
                        Log.d(TAG,"005 "+"被点击了");
                        break;
                }
            }
        });
    }
}
