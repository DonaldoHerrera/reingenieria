package com.soundcloud.android.profile;

import android.view.View;
import com.soundcloud.android.ia.l;

/* renamed from: com.soundcloud.android.profile.yb reason: case insensitive filesystem */
/* compiled from: UserFollowersFragment.kt */
public final class C5876yb implements C6837lJa {
    private final boolean a;

    public C5876yb(boolean z) {
        this.a = z;
    }

    public void a(View view, C6973nJa nja) {
        C7471uYa.b(view, "view");
        C7471uYa.b(nja, "errorType");
        a.a(this, view, nja);
    }

    public void b(View view) {
        C7471uYa.b(view, "view");
        a.b(this, view);
    }

    public int c() {
        return a.c(this);
    }

    public int d() {
        return a.a(this);
    }

    public int b() {
        return this.a ? l.emptyview_no_followers_logged_in_user : l.emptyview_no_followers;
    }

    public void a(View view) {
        C7471uYa.b(view, "view");
        a.a((C6837lJa) this, view);
    }

    public int a(C6973nJa nja) {
        C7471uYa.b(nja, "legacyError");
        return a.a((C6837lJa) this, nja);
    }

    public int a() {
        return a.b(this);
    }
}
