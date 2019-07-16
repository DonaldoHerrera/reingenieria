package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.C0650e.C0042e;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar.a;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.q reason: case insensitive filesystem */
public final class C0725q extends C1644qr implements C0042e {
    private final CastSeekBar b;
    private final long c;
    private final C1703sr d;

    public C0725q(CastSeekBar castSeekBar, long j, C1703sr srVar) {
        this.b = castSeekBar;
        this.c = j;
        this.d = srVar;
        e();
    }

    private final void e() {
        int i;
        f();
        ArrayList arrayList = null;
        if (a() != null) {
            MediaInfo g = a().g();
            if (a().m() && !a().p() && g != null) {
                CastSeekBar castSeekBar = this.b;
                List<AdBreakInfo> F = g.F();
                if (F != null) {
                    arrayList = new ArrayList();
                    for (AdBreakInfo adBreakInfo : F) {
                        if (adBreakInfo != null) {
                            long H = adBreakInfo.H();
                            if (H == -1000) {
                                i = this.d.a();
                            } else {
                                i = Math.min(this.d.b(H), this.d.a());
                            }
                            if (i >= 0) {
                                arrayList.add(new a(i));
                            }
                        }
                    }
                }
                castSeekBar.a((List<a>) arrayList);
                return;
            }
        }
        this.b.a(null);
    }

    private final void f() {
        int i;
        int i2;
        C0650e a = a();
        boolean z = true;
        if (a == null || !a.m() || a.s()) {
            this.b.setEnabled(false);
        } else {
            this.b.setEnabled(true);
        }
        b bVar = new b();
        bVar.a = g();
        bVar.b = this.d.a();
        bVar.c = this.d.b(0);
        C0650e a2 = a();
        if (a2 == null || !a2.m() || !a2.A()) {
            i = g();
        } else {
            i = this.d.f();
        }
        bVar.d = i;
        C0650e a3 = a();
        if (a3 == null || !a3.m() || !a3.A()) {
            i2 = g();
        } else {
            i2 = this.d.g();
        }
        bVar.e = i2;
        C0650e a4 = a();
        if (a4 == null || !a4.m() || !a4.A()) {
            z = false;
        }
        bVar.f = z;
        this.b.a(bVar);
    }

    private final int g() {
        C0650e a = a();
        if (a != null) {
            boolean o = a.o();
        }
        return this.d.c();
    }

    public final void a(C0636d dVar) {
        super.a(dVar);
        if (a() != null) {
            a().a((C0042e) this, this.c);
        }
        e();
    }

    public final void b() {
        e();
    }

    public final void d() {
        if (a() != null) {
            a().a((C0042e) this);
        }
        super.d();
        e();
    }

    public final void a(long j, long j2) {
        f();
    }
}
