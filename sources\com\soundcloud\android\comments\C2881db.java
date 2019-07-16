package com.soundcloud.android.comments;

import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.comments.db reason: case insensitive filesystem */
/* compiled from: ReportedCommentStorage_Factory */
public final class C2881db implements C4961HMa<C2878cb> {
    private final C7054oVa<SharedPreferences> a;

    public C2881db(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C2881db a(C7054oVa<SharedPreferences> ova) {
        return new C2881db(ova);
    }

    public C2878cb get() {
        return new C2878cb((SharedPreferences) this.a.get());
    }
}
