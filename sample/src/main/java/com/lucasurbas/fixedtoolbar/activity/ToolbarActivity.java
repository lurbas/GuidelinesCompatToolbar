package com.lucasurbas.fixedtoolbar.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ResponsiveToolbar;
import android.view.View;

import com.lucasurbas.fixedtoolbar.R;

/**
 * Created by Lucas on 1/10/15.
 */
public class ToolbarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        ResponsiveToolbar toolbar1 = (ResponsiveToolbar) findViewById(R.id.toolbar_1);
        toolbar1.inflateMenu(R.menu.test_overflow_menu);
        toolbar1.setTitle(R.string.title);
        toolbar1.setContentInsetsRelative(getResources().getDimensionPixelSize(R.dimen.keyline), 0);
        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ResponsiveToolbar toolbar2 = (ResponsiveToolbar) findViewById(R.id.toolbar_2);
        toolbar2.inflateMenu(R.menu.test_menu);
        toolbar2.setTitle(R.string.title);
        toolbar2.setNavigationIcon(R.drawable.ic_menu_white_24dp);
        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ResponsiveToolbar toolbar3 = (ResponsiveToolbar) findViewById(R.id.toolbar_3);
        toolbar3.inflateMenu(R.menu.test_overflow_menu);
        toolbar3.setTitle(R.string.title);

        ResponsiveToolbar toolbar4 = (ResponsiveToolbar) findViewById(R.id.toolbar_4);
        toolbar4.inflateMenu(R.menu.test_menu);
        toolbar4.setTitle(R.string.title);
    }
}
