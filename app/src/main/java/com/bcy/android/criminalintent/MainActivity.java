package com.bcy.android.criminalintent;

//import android.os.Bundle;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import java.util.UUID;
//import androidx.fragment.app.FragmentManager;

public class MainActivity extends SingleFragmentActivity {
    public static final String EXTRA_CRIME_ID = "com.bcy.android.criminalintent_crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, MainActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_fragment);
//        FragmentManager fm = getSupportFragmentManager();  // 获取FragmentManager本身
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//
//        if (fragment == null) {
//            fragment = new CrimeFragment();
//            fm.beginTransaction()
//                    .add(R.id.fragment_container, fragment)
//                    .commit();
//        }
//    }
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}