package com.lucasurbas.guidelinescompat.sample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.lucasurbas.guidelinescompat.sample.R;

public class GuidelinesCompatToolbarActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidelines_compat_toolbar);
        getSupportActionBar().setTitle(R.string.guidelined_title);

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
        toolbar3.inflateMenu(R.menu.test_menu);

        Button bActionMode = (Button) findViewById(R.id.bActionMode);
        bActionMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActionMode(new ActionMode.Callback() {
                    @Override
                    public boolean onCreateActionMode(final ActionMode mode, final Menu menu) {
                        mode.setTitle(R.string.action_mode_title);
                        MenuInflater inflater = getMenuInflater();
                        inflater.inflate(R.menu.test_overflow_menu, menu);
                        return true;
                    }

                    @Override
                    public boolean onPrepareActionMode(final ActionMode mode, final Menu menu) {
                        return false;
                    }

                    @Override
                    public boolean onActionItemClicked(final ActionMode mode, final MenuItem item) {
                        return false;
                    }

                    @Override
                    public void onDestroyActionMode(final ActionMode mode) {

                    }
                });
            }
        });

        Button bStart = (Button) findViewById(R.id.bStart);
        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GuidelinesCompatToolbarActivity.this, DefaultToolbarActivity.class);
                startActivity(i);
                overridePendingTransition(0, 0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.test_overflow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
