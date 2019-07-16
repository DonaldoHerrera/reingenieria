package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C0650e.a;
import com.google.android.gms.cast.framework.media.C0650e.b;
import com.google.android.gms.internal.cast.C0712ja;
import java.util.List;

final class M implements C0712ja {
    private final /* synthetic */ C0650e a;

    M(C0650e eVar) {
        this.a = eVar;
    }

    private final void f() {
        if (this.a.m != null) {
            MediaStatus i = this.a.i();
            if (i != null) {
                i.a(this.a.m.b(i));
                List a2 = this.a.m.a(i);
                MediaInfo g = this.a.g();
                if (g != null) {
                    g.a(a2);
                }
            }
        }
    }

    public final void a() {
        for (b a2 : this.a.i) {
            a2.a();
        }
        for (a a3 : this.a.j) {
            a3.a();
        }
    }

    public final void b() {
        f();
        for (b b : this.a.i) {
            b.b();
        }
        for (a b2 : this.a.j) {
            b2.b();
        }
    }

    public final void c() {
        for (b c : this.a.i) {
            c.c();
        }
        for (a d : this.a.j) {
            d.d();
        }
    }

    public final void d() {
        for (b d : this.a.i) {
            d.d();
        }
        for (a c : this.a.j) {
            c.c();
        }
    }

    public final void e() {
        f();
        this.a.C();
        for (b e : this.a.i) {
            e.e();
        }
        for (a f : this.a.j) {
            f.f();
        }
    }

    public final void a(int[] iArr, int i) {
        for (a a2 : this.a.j) {
            a2.a(iArr, i);
        }
    }

    public final void c(int[] iArr) {
        for (a b : this.a.j) {
            b.b(iArr);
        }
    }

    public final void b(int[] iArr) {
        for (a a2 : this.a.j) {
            a2.a(iArr);
        }
    }

    public final void a(int[] iArr) {
        for (a c : this.a.j) {
            c.c(iArr);
        }
    }

    public final void a(MediaQueueItem[] mediaQueueItemArr) {
        for (a a2 : this.a.j) {
            a2.a(mediaQueueItemArr);
        }
    }
}
