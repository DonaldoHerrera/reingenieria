package com.soundcloud.android.main;

import android.net.Uri;
import com.soundcloud.android.deeplinks.e;

/* compiled from: NavigationIntentHelper */
final class Y {
    private Y() {
    }

    static boolean a(Uri uri) {
        return c(uri) || b(uri);
    }

    static boolean b(Uri uri) {
        return e.b(uri).equals(e.SEARCH);
    }

    static boolean c(Uri uri) {
        e b = e.b(uri);
        return b.equals(e.HOME) || b.equals(e.STREAM);
    }
}
