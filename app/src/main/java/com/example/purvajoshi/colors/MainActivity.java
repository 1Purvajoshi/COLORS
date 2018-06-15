package com.example.purvajoshi.colors;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPage = (ViewPager) findViewById(R.id.myPager);

        myPage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[] = {"Blue", "Brown", "Green", "Grey", "Orange", "Pink", "Red", "Violet", "White", "Yellow"};

        public MyOwnPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new Blue();
            }
            if (position == 1) {
                return new Brown();
            }
            if (position == 2) {
                return new Green();
            }
            if (position == 3) {
                return new Grey();
            }
            if (position == 4) {
                return new Orange();
            }
            if (position == 5) {
                return new Pink();

            }
            if (position == 6) {
                return new Red();
            }
            if (position == 7) {
                return new Violet();
            }
            if (position == 8) {
                return new White();
            }
            if (position == 9) {
                return new Yellow();
            }


            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }

    }
}






