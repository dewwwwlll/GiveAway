package com.example.owner.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class nav extends AppCompatActivity {

//    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch(menuItem.getItemId()){
                case R.id.navigation_home: selectedFragment = new HomeFragment();
                break;
                case R.id.navigation_donations: selectedFragment = new AddDonationsFragment();
                break;
                case R.id.navigation_notifications: selectedFragment = new NotificationFragment();
                break;
                case R.id.navigation_user_profile: selectedFragment = new UserProfileFragment();
                break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    selectedFragment).commit();
            return true;

        }

//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment selectedFragment = null;
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
////                    mTextMessage.setText(R.string.title_home);
//                      selectedFragment
//                case R.id.navigation_donations:
//                    mTextMessage.setText(R.string.title_donations);
//                    return true;
//                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
//                    return true;
//                case R.id.navigation_user_profile:
//                    mTextMessage.setText(R.string.title_user_profile);
//                    return true;
//            }
//            return false;
//        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(navListner);
    }

}
