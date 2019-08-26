package com.iwacchi.bottomnaviviewfragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.iwacchi.bottomnaviviewfragment.fragments.DashboardFragment;
import com.iwacchi.bottomnaviviewfragment.fragments.HomeFragment;
import com.iwacchi.bottomnaviviewfragment.fragments.NotificationsFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;



public class BottomNavigationViewActivity extends AppCompatActivity {

    // Fragmentをセットするためのトランザクション
    private FragmentTransaction fragmentTransaction;

    // それぞれのFragmentクラス
    private HomeFragment homeFragment = new HomeFragment();
    private DashboardFragment dashboardFragment = new DashboardFragment();
    private NotificationsFragment notificationsFragment = new NotificationsFragment();

    /**
     * BottomNavigationViewがタップされた時のAction
     */
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            fragmentTransaction = getSupportFragmentManager().beginTransaction();

            switch (item.getItemId()) {

                case R.id.navigation_home:

                    // HomeFragmentを表示する
                    fragmentTransaction.show(homeFragment);
                    fragmentTransaction.hide(dashboardFragment);
                    fragmentTransaction.hide(notificationsFragment);
                    // 変更を反映する
                    fragmentTransaction.commit();

                    return true;

                case R.id.navigation_dashboard:

                    // DashboardFragmentを表示する
                    fragmentTransaction.hide(homeFragment);
                    fragmentTransaction.show(dashboardFragment);
                    fragmentTransaction.hide(notificationsFragment);
                    // 変更を反映する
                    fragmentTransaction.commit();

                    return true;


                case R.id.navigation_notifications:

                    // NotificationsFragmentを表示する
                    fragmentTransaction.hide(homeFragment);
                    fragmentTransaction.hide(dashboardFragment);
                    fragmentTransaction.show(notificationsFragment);
                    // 変更を反映する
                    fragmentTransaction.commit();

                    return true;

            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation_view);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // BottomNavigationViewにActionを適用
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // トランザクションにFragmentクラスを追加する
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.FrameLayout, homeFragment);
        fragmentTransaction.add(R.id.FrameLayout, dashboardFragment);
        fragmentTransaction.add(R.id.FrameLayout, notificationsFragment);
        // アプリケーション起動時にHomeFragmentを表示する
        fragmentTransaction.show(homeFragment);
        fragmentTransaction.hide(dashboardFragment);
        fragmentTransaction.hide(notificationsFragment);
        // 変更を反映する
        fragmentTransaction.commit();

    }

}
