package com.filme.mamovieprojects;

import android.app.Activity;


public class ListActivity extends Activity {
    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
        setContentView(R.layout.activity_list);
    }
}
