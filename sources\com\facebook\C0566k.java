package com.facebook;

import android.content.Intent;
import com.facebook.internal.C0551l;

/* renamed from: com.facebook.k reason: case insensitive filesystem */
/* compiled from: CallbackManager */
public interface C0566k {

    /* renamed from: com.facebook.k$a */
    /* compiled from: CallbackManager */
    public static class a {
        public static C0566k a() {
            return new C0551l();
        }
    }

    boolean onActivityResult(int i, int i2, Intent intent);
}
