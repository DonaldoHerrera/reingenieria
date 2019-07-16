package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.playback.ui.La.a;

/* compiled from: AudioAdPresenter.kt */
final class Na<T> implements C6776kQa<C2407ZJ> {
    final /* synthetic */ La a;
    final /* synthetic */ C2426_J b;
    final /* synthetic */ a c;
    final /* synthetic */ C3693u d;

    Na(La la, C2426_J _j, a aVar, C3693u uVar) {
        this.a = la;
        this.b = _j;
        this.c = aVar;
        this.d = uVar;
    }

    /* renamed from: a */
    public final void accept(C2407ZJ zj) {
        if (zj instanceof c) {
            this.a.b().a(((c) zj).a());
        } else if (zj instanceof b) {
            C5466YFa.b(this.c.e(), true);
            this.a.m.a(this.d.f());
        } else if (zj instanceof a) {
            this.a.b().a(this.d.d());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported webview loading state: ");
            sb.append(zj);
            new IllegalStateException(sb.toString());
        }
    }
}
