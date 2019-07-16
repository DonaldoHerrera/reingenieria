package com.soundcloud.android.settings.privacy;

import com.soundcloud.android.ia.p;

/* compiled from: AnalyticsSettingsPresenter.kt */
final class s<T> implements C6776kQa<T> {
    final /* synthetic */ w a;
    final /* synthetic */ y b;

    s(w wVar, y yVar) {
        this.a = wVar;
        this.b = yVar;
    }

    /* renamed from: a */
    public final void accept(Boolean bool) {
        y yVar = this.b;
        C7471uYa.a((Object) bool, "it");
        boolean booleanValue = bool.booleanValue();
        String string = this.a.c.getString(p.privacy_settings_analytics_header);
        C7471uYa.a((Object) string, "context.getString(R.stri…ettings_analytics_header)");
        yVar.a(new z(booleanValue, string));
    }
}
