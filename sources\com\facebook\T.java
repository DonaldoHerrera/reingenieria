package com.facebook;

import android.content.Intent;
import com.facebook.internal.ia;
import com.facebook.internal.ja;

/* compiled from: ProfileManager */
public final class T {
    private static volatile T a;
    private final C1600pd b;
    private final S c;
    private Profile d;

    T(C1600pd pdVar, S s) {
        ja.a((Object) pdVar, "localBroadcastManager");
        ja.a((Object) s, "profileCache");
        this.b = pdVar;
        this.c = s;
    }

    static T b() {
        if (a == null) {
            synchronized (T.class) {
                if (a == null) {
                    a = new T(C1600pd.a(B.e()), new S());
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    public Profile a() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        Profile b2 = this.c.b();
        if (b2 == null) {
            return false;
        }
        a(b2, false);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(Profile profile) {
        a(profile, true);
    }

    private void a(Profile profile, boolean z) {
        Profile profile2 = this.d;
        this.d = profile;
        if (z) {
            if (profile != null) {
                this.c.a(profile);
            } else {
                this.c.a();
            }
        }
        if (!ia.a(profile2, profile)) {
            a(profile2, profile);
        }
    }

    private void a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.b.a(intent);
    }
}
