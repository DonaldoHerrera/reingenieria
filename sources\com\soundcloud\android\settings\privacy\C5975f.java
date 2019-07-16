package com.soundcloud.android.settings.privacy;

import com.soundcloud.android.ia.p;

/* renamed from: com.soundcloud.android.settings.privacy.f reason: case insensitive filesystem */
/* compiled from: AdvertisingSettingsPresenter.kt */
final class C5975f<T> implements C6776kQa<T> {
    final /* synthetic */ C5979j a;
    final /* synthetic */ C5981l b;

    C5975f(C5979j jVar, C5981l lVar) {
        this.a = jVar;
        this.b = lVar;
    }

    /* renamed from: a */
    public final void accept(Boolean bool) {
        C5981l lVar = this.b;
        C7471uYa.a((Object) bool, "it");
        boolean booleanValue = bool.booleanValue();
        String string = this.a.c.getString(p.privacy_settings_advertising_header);
        C7471uYa.a((Object) string, "context.getString(R.stri…tings_advertising_header)");
        String string2 = this.a.c.getString(p.privacy_settings_advertising_description);
        C7471uYa.a((Object) string2, "context.getString(R.stri…_advertising_description)");
        lVar.a(new C5982m(booleanValue, string, string2));
    }
}
