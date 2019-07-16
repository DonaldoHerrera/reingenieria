package com.soundcloud.android.ads;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.ads.C3676c;

/* renamed from: com.soundcloud.android.ads.ua reason: case insensitive filesystem */
/* compiled from: AdItemRenderer.kt */
public abstract class C2629ua<BaseT> implements C6289dFa<BaseT> {
    private final C6781kVa<C2617ra> a;

    public C2629ua() {
        C6781kVa<C2617ra> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public final C6781kVa<C2617ra> a() {
        return this.a;
    }

    public final void a(View view) {
        C7471uYa.b(view, "whyAdsButton");
        view.setOnClickListener(new C2621sa(this));
    }

    public final OnClickListener a(C3676c cVar) {
        C7471uYa.b(cVar, "adData");
        return new C2625ta(this, cVar);
    }
}
