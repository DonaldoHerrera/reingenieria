package defpackage;

import android.view.Surface;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.K;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.f;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.trackselection.m;
import com.google.android.exoplayer2.video.q;
import com.google.android.exoplayer2.video.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: Zl reason: default package */
/* compiled from: AnalyticsCollector */
public class Zl implements com.google.android.exoplayer2.K.b, f, C1668rm, r, s, defpackage.Up.a, h, q, C1609pm {
    private final CopyOnWriteArraySet<_l> a;
    private final C1882yq b;
    private final com.google.android.exoplayer2.X.b c;
    private final c d;
    private K e;

    /* renamed from: Zl$a */
    /* compiled from: AnalyticsCollector */
    public static class a {
        public Zl a(K k, C1882yq yqVar) {
            return new Zl(k, yqVar);
        }
    }

    /* renamed from: Zl$b */
    /* compiled from: AnalyticsCollector */
    private static final class b {
        public final com.google.android.exoplayer2.source.r.a a;
        public final X b;
        public final int c;

        public b(com.google.android.exoplayer2.source.r.a aVar, X x, int i) {
            this.a = aVar;
            this.b = x;
            this.c = i;
        }
    }

    /* renamed from: Zl$c */
    /* compiled from: AnalyticsCollector */
    private static final class c {
        /* access modifiers changed from: private */
        public final ArrayList<b> a = new ArrayList<>();
        private final HashMap<com.google.android.exoplayer2.source.r.a, b> b = new HashMap<>();
        private final com.google.android.exoplayer2.X.a c = new com.google.android.exoplayer2.X.a();
        private b d;
        private b e;
        private X f = X.a;
        private boolean g;

        private void h() {
            if (!this.a.isEmpty()) {
                this.d = (b) this.a.get(0);
            }
        }

        public b b() {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<b> arrayList = this.a;
            return (b) arrayList.get(arrayList.size() - 1);
        }

        public b c() {
            if (this.a.isEmpty() || this.f.c() || this.g) {
                return null;
            }
            return (b) this.a.get(0);
        }

        public b d() {
            return this.e;
        }

        public boolean e() {
            return this.g;
        }

        public void f() {
            this.g = false;
            h();
        }

        public void g() {
            this.g = true;
        }

        public b a() {
            return this.d;
        }

        public b a(com.google.android.exoplayer2.source.r.a aVar) {
            return (b) this.b.get(aVar);
        }

        public b b(int i) {
            b bVar = null;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                b bVar2 = (b) this.a.get(i2);
                int a2 = this.f.a(bVar2.a.a);
                if (a2 != -1 && this.f.a(a2, this.c).c == i) {
                    if (bVar != null) {
                        return null;
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        public void c(com.google.android.exoplayer2.source.r.a aVar) {
            this.e = (b) this.b.get(aVar);
        }

        public void a(int i) {
            h();
        }

        public void a(X x) {
            for (int i = 0; i < this.a.size(); i++) {
                b a2 = a((b) this.a.get(i), x);
                this.a.set(i, a2);
                this.b.put(a2.a, a2);
            }
            b bVar = this.e;
            if (bVar != null) {
                this.e = a(bVar, x);
            }
            this.f = x;
            h();
        }

        public boolean b(com.google.android.exoplayer2.source.r.a aVar) {
            b bVar = (b) this.b.remove(aVar);
            if (bVar == null) {
                return false;
            }
            this.a.remove(bVar);
            b bVar2 = this.e;
            if (bVar2 != null && aVar.equals(bVar2.a)) {
                this.e = this.a.isEmpty() ? null : (b) this.a.get(0);
            }
            return true;
        }

        public void a(int i, com.google.android.exoplayer2.source.r.a aVar) {
            b bVar = new b(aVar, this.f.a(aVar.a) != -1 ? this.f : X.a, i);
            this.a.add(bVar);
            this.b.put(aVar, bVar);
            if (this.a.size() == 1 && !this.f.c()) {
                h();
            }
        }

        private b a(b bVar, X x) {
            int a2 = x.a(bVar.a.a);
            if (a2 == -1) {
                return bVar;
            }
            return new b(bVar.a, x, x.a(a2, this.c).c);
        }
    }

    protected Zl(K k, C1882yq yqVar) {
        if (k != null) {
            this.e = k;
        }
        C1852xq.a(yqVar);
        this.b = yqVar;
        this.a = new CopyOnWriteArraySet<>();
        this.d = new c();
        this.c = new com.google.android.exoplayer2.X.b();
    }

    private defpackage._l.a i() {
        return a(this.d.a());
    }

    private defpackage._l.a j() {
        return a(this.d.b());
    }

    private defpackage._l.a k() {
        return a(this.d.c());
    }

    private defpackage._l.a l() {
        return a(this.d.d());
    }

    public final void a(Metadata metadata) {
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(k, metadata);
        }
    }

    public final void b(String str, long j, long j2) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, 1, str, j2);
        }
    }

    public final void c() {
    }

    public final void c(Pm pm) {
        defpackage._l.a i = i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).b(i, 1, pm);
        }
    }

    public final void d(Pm pm) {
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(k, 2, pm);
        }
    }

    public final void e() {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).h(l);
        }
    }

    public final void f() {
        defpackage._l.a i = i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).g(i);
        }
    }

    public final void g() {
        if (!this.d.e()) {
            defpackage._l.a k = k();
            this.d.g();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((_l) it.next()).d(k);
            }
        }
    }

    public final void h() {
        for (b bVar : new ArrayList(this.d.a)) {
            c(bVar.c, bVar.a);
        }
    }

    public final void a(Pm pm) {
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(k, 1, pm);
        }
    }

    public final void b(Format format) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, 1, format);
        }
    }

    public final void c(int i, com.google.android.exoplayer2.source.r.a aVar) {
        defpackage._l.a d2 = d(i, aVar);
        if (this.d.b(aVar)) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((_l) it.next()).b(d2);
            }
        }
    }

    public final void d() {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).e(l);
        }
    }

    private defpackage._l.a d(int i, com.google.android.exoplayer2.source.r.a aVar) {
        defpackage._l.a aVar2;
        C1852xq.a(this.e);
        if (aVar != null) {
            b a2 = this.d.a(aVar);
            if (a2 != null) {
                aVar2 = a(a2);
            } else {
                aVar2 = a(X.a, i, aVar);
            }
            return aVar2;
        }
        X d2 = this.e.d();
        if (!(i < d2.b())) {
            d2 = X.a;
        }
        return a(d2, i, (com.google.android.exoplayer2.source.r.a) null);
    }

    public final void a(int i, long j, long j2) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).b(l, i, j, j2);
        }
    }

    public final void b(Pm pm) {
        defpackage._l.a i = i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).b(i, 2, pm);
        }
    }

    public final void c(int i, com.google.android.exoplayer2.source.r.a aVar, com.google.android.exoplayer2.source.s.b bVar, com.google.android.exoplayer2.source.s.c cVar) {
        defpackage._l.a d2 = d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).b(d2, bVar, cVar);
        }
    }

    public final void a(int i) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).b(l, i);
        }
    }

    public final void b(int i, com.google.android.exoplayer2.source.r.a aVar, com.google.android.exoplayer2.source.s.b bVar, com.google.android.exoplayer2.source.s.c cVar) {
        defpackage._l.a d2 = d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(d2, bVar, cVar);
        }
    }

    public void a(float f) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, f);
        }
    }

    public final void b(int i, com.google.android.exoplayer2.source.r.a aVar) {
        this.d.c(aVar);
        defpackage._l.a d2 = d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).i(d2);
        }
    }

    public final void a(String str, long j, long j2) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, 2, str, j2);
        }
    }

    public final void b(int i) {
        this.d.a(i);
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).c(k, i);
        }
    }

    public final void a(Format format) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, 2, format);
        }
    }

    public final void b(int i, long j, long j2) {
        defpackage._l.a j3 = j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(j3, i, j, j2);
        }
    }

    public final void a(int i, long j) {
        defpackage._l.a i2 = i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(i2, i, j);
        }
    }

    public final void b() {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l);
        }
    }

    public final void a(Surface surface) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, surface);
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, i, i2, i3, f);
        }
    }

    public void a(int i, int i2) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, i, i2);
        }
    }

    public final void a(int i, com.google.android.exoplayer2.source.r.a aVar) {
        this.d.a(i, aVar);
        defpackage._l.a d2 = d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).c(d2);
        }
    }

    public final void a(int i, com.google.android.exoplayer2.source.r.a aVar, com.google.android.exoplayer2.source.s.b bVar, com.google.android.exoplayer2.source.s.c cVar) {
        defpackage._l.a d2 = d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).c(d2, bVar, cVar);
        }
    }

    public final void a(int i, com.google.android.exoplayer2.source.r.a aVar, com.google.android.exoplayer2.source.s.b bVar, com.google.android.exoplayer2.source.s.c cVar, IOException iOException, boolean z) {
        defpackage._l.a d2 = d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(d2, bVar, cVar, iOException, z);
        }
    }

    public final void a(int i, com.google.android.exoplayer2.source.r.a aVar, com.google.android.exoplayer2.source.s.c cVar) {
        defpackage._l.a d2 = d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(d2, cVar);
        }
    }

    public final void a(X x, Object obj, int i) {
        this.d.a(x);
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(k, i);
        }
    }

    public final void a(TrackGroupArray trackGroupArray, m mVar) {
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(k, trackGroupArray, mVar);
        }
    }

    public final void a(boolean z) {
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(k, z);
        }
    }

    public final void a(boolean z, int i) {
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(k, z, i);
        }
    }

    public final void a(C0618s sVar) {
        defpackage._l.a aVar;
        if (sVar.a == 0) {
            aVar = j();
        } else {
            aVar = k();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(aVar, sVar);
        }
    }

    public final void a(J j) {
        defpackage._l.a k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(k, j);
        }
    }

    public final void a() {
        if (this.d.e()) {
            this.d.f();
            defpackage._l.a k = k();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((_l) it.next()).f(k);
            }
        }
    }

    public final void a(Exception exc) {
        defpackage._l.a l = l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((_l) it.next()).a(l, exc);
        }
    }

    /* access modifiers changed from: protected */
    public defpackage._l.a a(X x, int i, com.google.android.exoplayer2.source.r.a aVar) {
        if (x.c()) {
            aVar = null;
        }
        com.google.android.exoplayer2.source.r.a aVar2 = aVar;
        long elapsedRealtime = this.b.elapsedRealtime();
        boolean z = true;
        boolean z2 = x == this.e.d() && i == this.e.b();
        long j = 0;
        if (aVar2 != null && aVar2.a()) {
            if (!(z2 && this.e.c() == aVar2.b && this.e.e() == aVar2.c)) {
                z = false;
            }
            if (z) {
                j = this.e.getCurrentPosition();
            }
        } else if (z2) {
            j = this.e.f();
        } else if (!x.c()) {
            j = x.a(i, this.c).a();
        }
        defpackage._l.a aVar3 = new defpackage._l.a(elapsedRealtime, x, i, aVar2, j, this.e.getCurrentPosition(), this.e.a());
        return aVar3;
    }

    private defpackage._l.a a(b bVar) {
        C1852xq.a(this.e);
        if (bVar == null) {
            int b2 = this.e.b();
            b b3 = this.d.b(b2);
            if (b3 == null) {
                X d2 = this.e.d();
                if (!(b2 < d2.b())) {
                    d2 = X.a;
                }
                return a(d2, b2, (com.google.android.exoplayer2.source.r.a) null);
            }
            bVar = b3;
        }
        return a(bVar.b, bVar.c, bVar.a);
    }
}
