package com.facebook.internal;

import android.app.Activity;
import com.facebook.r;

/* renamed from: com.facebook.internal.n reason: case insensitive filesystem */
/* compiled from: FacebookDialogBase */
public abstract class C0553n<CONTENT, RESULT> implements r<CONTENT, RESULT> {
    protected static final Object a = new Object();
    private final Activity b;
    private final L c;
    private int d;

    protected C0553n(Activity activity, int i) {
        ja.a((Object) activity, "activity");
        this.b = activity;
        this.c = null;
        this.d = i;
    }

    protected C0553n(L l, int i) {
        ja.a((Object) l, "fragmentWrapper");
        this.c = l;
        this.b = null;
        this.d = i;
        if (l.a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
