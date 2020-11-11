package com.example.mislugares.presentacion;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.example.mislugares.R;

public class PreferencesFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.main_preferences, rootKey);
    }

}