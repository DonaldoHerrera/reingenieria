package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.foundation.playqueue.r;
import java.util.List;

/* renamed from: com.soundcloud.android.playback.playqueue.qa reason: case insensitive filesystem */
/* compiled from: PlayQueueDataProvider */
public class C4392qa {
    private final Ma a;
    private final Xa b;
    private final r c;

    C4392qa(Ma ma, Xa xa, r rVar) {
        this.a = ma;
        this.b = xa;
        this.c = rVar;
    }

    private IPa<List<Va>> b() {
        return IPa.a((MPa<? extends T1>) this.a.b(), (MPa<? extends T2>) this.a.a(), (C6504gQa<? super T1, ? super T2, ? extends R>) this.b);
    }

    private APa<Za> c() {
        return this.c.b().a((C7256rQa<? super T>) C4361b.a).h(C4381l.a);
    }

    private APa<Za> d() {
        return this.c.b().a((C7256rQa<? super T>) K.a).h(C4383m.a);
    }

    private APa<Za> e() {
        return this.c.a().h(C4377j.a);
    }

    /* access modifiers changed from: 0000 */
    public APa<Za> a() {
        return APa.a((EPa<? extends T>) e(), (EPa<? extends T>) d(), (EPa<? extends T>) c()).e(Za.b()).g(new C4379k(this));
    }

    public /* synthetic */ MPa a(Za za) throws Exception {
        IPa b2 = b();
        za.getClass();
        return b2.e(new C4365d(za));
    }
}
