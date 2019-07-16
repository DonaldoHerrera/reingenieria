package com.soundcloud.android.listeners.dev;

import com.soundcloud.android.signupsignature.Crasher;

/* renamed from: com.soundcloud.android.listeners.dev.u reason: case insensitive filesystem */
/* compiled from: DevDrawerFragment.kt */
final class C4021u extends C7540vYa implements PXa<RVa> {
    public static final C4021u a = new C4021u();

    C4021u() {
        super(0);
    }

    public final void d() {
        if (Crasher.b.b()) {
            Crasher.b.a();
            return;
        }
        SDb.b("Crash native library failed to load. NOT Crashing. Check the logs for an error.", new Object[0]);
    }
}
