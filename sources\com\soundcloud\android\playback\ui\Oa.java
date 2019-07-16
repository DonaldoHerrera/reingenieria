package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.ads.C3688o.b;
import com.soundcloud.android.foundation.ads.C3689p;
import com.soundcloud.android.image.ca;
import com.soundcloud.android.image.ca.c;
import com.soundcloud.android.playback.ui.La.a;
import java.util.List;

/* compiled from: AudioAdPresenter.kt */
final class Oa<T> implements C6776kQa<ca> {
    final /* synthetic */ La a;
    final /* synthetic */ a b;
    final /* synthetic */ b c;
    final /* synthetic */ C3508cda d;
    final /* synthetic */ List e;

    Oa(La la, a aVar, b bVar, C3508cda cda, List list) {
        this.a = la;
        this.b = aVar;
        this.c = bVar;
        this.d = cda;
        this.e = list;
    }

    /* renamed from: a */
    public final void accept(ca caVar) {
        if (caVar instanceof ca.b) {
            this.a.a(this.b, ((ca.b) caVar).a(), C3689p.a(this.c));
            this.a.m.a(this.d);
        } else if (caVar instanceof c) {
            this.a.b().a(this.e);
        }
    }
}
