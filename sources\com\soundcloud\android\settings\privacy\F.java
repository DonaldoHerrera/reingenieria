package com.soundcloud.android.settings.privacy;

import com.soundcloud.android.ia.p;

/* compiled from: CommunicationsSettingsPresenter.kt */
final class F<T> implements C6776kQa<T> {
    final /* synthetic */ J a;
    final /* synthetic */ L b;

    F(J j, L l) {
        this.a = j;
        this.b = l;
    }

    /* renamed from: a */
    public final void accept(Boolean bool) {
        L l = this.b;
        C7471uYa.a((Object) bool, "it");
        boolean booleanValue = bool.booleanValue();
        String string = this.a.c.getString(p.privacy_settings_communications_header);
        C7471uYa.a((Object) string, "context.getString(R.stri…gs_communications_header)");
        String string2 = this.a.c.getString(p.privacy_settings_communications_description);
        C7471uYa.a((Object) string2, "context.getString(R.stri…mmunications_description)");
        l.a(new M(booleanValue, string, string2));
    }
}
