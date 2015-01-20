package com.lucasurbas.fixedtoolbar.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.lucasurbas.fixedtoolbar.R;

/**
 * Created by Lucas on 1/20/15.
 */
public class DefaultToolbarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_toolbar);

        final Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar_1);
        toolbar1.inflateMenu(R.menu.test_overflow_menu);
        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar_2);
        toolbar2.inflateMenu(R.menu.test_menu);
        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Toolbar toolbar3 = (Toolbar) findViewById(R.id.toolbar_3);
        toolbar3.inflateMenu(R.menu.test_overflow_menu);

        Toolbar toolbar4 = (Toolbar) findViewById(R.id.toolbar_4);
        toolbar4.inflateMenu(R.menu.test_menu);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }
}
