package com.moat.analytics.mobile.scl;

import android.util.Log;

class l extends Exception {
    l() {
    }

    static void a(Exception exc) {
        if (u.d().b()) {
            Log.e("MoatException", Log.getStackTraceString(exc));
        }
    }
}
