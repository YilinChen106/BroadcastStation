package com.nutomic.syncthingandroid.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.nutomic.syncthingandroid.R;
import com.nutomic.syncthingandroid.SyncthingApp;
import com.nutomic.syncthingandroid.service.Constants;

import javax.inject.Inject;

/**
 * Provides a themed instance of AppCompatActivity.
 */
public class ThemedAppCompatActivity extends AppCompatActivity {

    private static final String FOLLOW_SYSTEM = "-1";

    @Inject
    SharedPreferences mPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((SyncthingApp) getApplication()).component().inject(this);
        // Load theme.
        //For api level below 28, Follow system fall backs to light mode
        int prefAppTheme = Integer.parseInt(mPreferences.getString(Constants.PREF_APP_THEME, FOLLOW_SYSTEM));

        if (prefAppTheme == 69) {
            prefAppTheme = AppCompatDelegate.MODE_NIGHT_YES;
            setTheme(R.style.Theme_Syncthing_Black);
        }

        AppCompatDelegate.setDefaultNightMode(prefAppTheme);
        super.onCreate(savedInstanceState);
    }

}
