package com.gitproject.y34h1a.coordinatorlayout.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.gitproject.y34h1a.coordinatorlayout.Fragment.UserInfo;
import com.gitproject.y34h1a.coordinatorlayout.R;

public class MainActivity extends AppCompatActivity implements AppBarLayout.OnOffsetChangedListener {
    Context context;
    TabLayout tabLayout;
    ViewPager viewPager;
    AppBarLayout appbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabsAdapter(context, getSupportFragmentManager()));
        viewPager.setAdapter(new TabsAdapter(context, getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        appbarLayout = (AppBarLayout) findViewById(R.id.appBarLayout);
        appbarLayout.addOnOffsetChangedListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMail();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {

    }


    class TabsAdapter extends FragmentPagerAdapter {

        Context context;

        public TabsAdapter(Context con , FragmentManager fm) {
            super(fm);
            this.context = con;
        }


        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return UserInfo.newInstance("","");
                case 1:
                    //add your fragment
                    return UserInfo.newInstance("","");
                case 2:
                    //add your fragment
                    return UserInfo.newInstance("","");
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Tab 1";
                case 1:
                    return "Tab 2";
                case 2:
                    return "Tab 3";
            }
            return "";
        }
    }

    private void sendMail(){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, "yeahia.arif@gmail.com");
        startActivity(Intent.createChooser(intent, "Send Email"));
    }
}
