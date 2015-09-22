package com.dongyu.sudoku;

/**
 * Created by Dongyu on 9/21/2015.
 */
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class Prefs extends PreferenceActivity {

    private static String OPT_MUSIC_KEY = "music";
    private static boolean OPT_MUSIC_DEF = true;
    private static String OPT_HINTS_KEY = "hints";
    private static boolean OPT_HINTS_DEF = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        addPreferencesFromResource( R.xml.settings );
    }

    public static boolean isMusicOn( Context context ) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_MUSIC_KEY, OPT_MUSIC_DEF);
    }

    public static boolean isHintsOn( Context context ) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_HINTS_KEY, OPT_HINTS_DEF);
    }

}