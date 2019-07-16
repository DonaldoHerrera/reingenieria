package com.soundcloud.android.signupsignature;

import android.util.Log;

@EVa(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\t\u0010\t\u001a\u00020\bH R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/soundcloud/android/signupsignature/Crasher;", "", "()V", "initializationSucceeded", "", "getInitializationSucceeded", "()Z", "fakeCrash", "", "fakeNativeCrash", "signupsignature_release"}, mv = {1, 1, 15})
/* compiled from: Crasher.kt */
public final class Crasher {
    private static final boolean a;
    public static final Crasher b = new Crasher();

    static {
        boolean z;
        try {
            System.loadLibrary("crasher");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("Crasher", "Failed to load crash native library", e);
            z = false;
        }
        a = z;
    }

    private Crasher() {
    }

    private final native String fakeNativeCrash();

    public final String a() {
        return fakeNativeCrash();
    }

    public final boolean b() {
        return a;
    }
}
