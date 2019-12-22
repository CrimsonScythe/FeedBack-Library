package com.crimsonscythe.feedback;

import android.content.Context;
import android.widget.Toast;

public class FeedBackMain {

    public static void Init (Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

}
