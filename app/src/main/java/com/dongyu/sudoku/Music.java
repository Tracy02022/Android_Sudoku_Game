package com.dongyu.sudoku;

/**
 * Created by Dongyu on 9/21/2015.
 */
import android.content.Context;
import android.media.MediaPlayer;

public class Music {

    private static MediaPlayer mp;

    public static void play( Context context, int musicid ) {
        stop( context );
        if ( Prefs.isMusicOn(context) ) {
            mp = MediaPlayer.create(context, musicid);
            mp.setLooping(true);
            mp.start();
        }
    }

    public static void stop( Context context ) {
        if ( mp != null ) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}