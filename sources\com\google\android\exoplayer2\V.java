package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.K.b;
import com.google.android.exoplayer2.K.c;
import com.google.android.exoplayer2.K.d;
import com.google.android.exoplayer2.K.e;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.f;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.trackselection.m;
import com.google.android.exoplayer2.trackselection.o;
import com.google.android.exoplayer2.video.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: SimpleExoPlayer */
public class V extends C0613m implements C0622t, com.google.android.exoplayer2.K.a, e, d, c {
    private C1485lm A;
    private float B;
    private r C;
    /* access modifiers changed from: private */
    public List<Uo> D;
    private boolean E;
    /* access modifiers changed from: private */
    public Sq F;
    /* access modifiers changed from: private */
    public boolean G;
    protected final O[] b;
    private final C0625w c;
    private final Handler d;
    private final a e;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<q> f;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<C1609pm> g;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<C1241dp> h;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<f> i;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<com.google.android.exoplayer2.video.r> j;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<C1668rm> k;
    private final Up l;
    private final Zl m;
    private final C1578om n;
    /* access modifiers changed from: private */
    public Format o;
    /* access modifiers changed from: private */
    public Format p;
    /* access modifiers changed from: private */
    public Surface q;
    private boolean r;
    private int s;
    private SurfaceHolder t;
    private TextureView u;
    private int v;
    private int w;
    /* access modifiers changed from: private */
    public Pm x;
    /* access modifiers changed from: private */
    public Pm y;
    /* access modifiers changed from: private */
    public int z;

    /* compiled from: SimpleExoPlayer */
    private final class a implements com.google.android.exoplayer2.video.r, C1668rm, C1241dp, f, Callback, SurfaceTextureListener, b, b {
        private a() {
        }

        public /* synthetic */ void a() {
            L.a(this);
        }

        public /* synthetic */ void a(J j) {
            L.a((b) this, j);
        }

        public /* synthetic */ void a(X x, Object obj, int i) {
            L.a(this, x, obj, i);
        }

        public /* synthetic */ void a(C0618s sVar) {
            L.a((b) this, sVar);
        }

        public /* synthetic */ void a(TrackGroupArray trackGroupArray, m mVar) {
            L.a((b) this, trackGroupArray, mVar);
        }

        public void a(String str, long j, long j2) {
            Iterator it = V.this.j.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.video.r) it.next()).a(str, j, j2);
            }
        }

        public /* synthetic */ void a(boolean z, int i) {
            L.a((b) this, z, i);
        }

        public /* synthetic */ void b(int i) {
            L.a((b) this, i);
        }

        public void b(Pm pm) {
            Iterator it = V.this.j.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.video.r) it.next()).b(pm);
            }
            V.this.o = null;
            V.this.x = null;
        }

        public void c(Pm pm) {
            Iterator it = V.this.k.iterator();
            while (it.hasNext()) {
                ((C1668rm) it.next()).c(pm);
            }
            V.this.p = null;
            V.this.y = null;
            V.this.z = 0;
        }

        public void d(Pm pm) {
            V.this.x = pm;
            Iterator it = V.this.j.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.video.r) it.next()).d(pm);
            }
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            V.this.a(new Surface(surfaceTexture), true);
            V.this.a(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            V.this.a((Surface) null, true);
            V.this.a(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            V.this.a(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            V.this.a(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            V.this.a(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            V.this.a((Surface) null, false);
            V.this.a(0, 0);
        }

        public void a(Format format) {
            V.this.o = format;
            Iterator it = V.this.j.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.video.r) it.next()).a(format);
            }
        }

        public void b(String str, long j, long j2) {
            Iterator it = V.this.k.iterator();
            while (it.hasNext()) {
                ((C1668rm) it.next()).b(str, j, j2);
            }
        }

        public void a(int i, long j) {
            Iterator it = V.this.j.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.video.r) it.next()).a(i, j);
            }
        }

        public void c(int i) {
            V v = V.this;
            v.a(v.m(), i);
        }

        public void b(Format format) {
            V.this.p = format;
            Iterator it = V.this.k.iterator();
            while (it.hasNext()) {
                ((C1668rm) it.next()).b(format);
            }
        }

        public void a(int i, int i2, int i3, float f) {
            Iterator it = V.this.f.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (!V.this.j.contains(qVar)) {
                    qVar.a(i, i2, i3, f);
                }
            }
            Iterator it2 = V.this.j.iterator();
            while (it2.hasNext()) {
                ((com.google.android.exoplayer2.video.r) it2.next()).a(i, i2, i3, f);
            }
        }

        public void a(Surface surface) {
            if (V.this.q == surface) {
                Iterator it = V.this.f.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).c();
                }
            }
            Iterator it2 = V.this.j.iterator();
            while (it2.hasNext()) {
                ((com.google.android.exoplayer2.video.r) it2.next()).a(surface);
            }
        }

        public void a(Pm pm) {
            V.this.y = pm;
            Iterator it = V.this.k.iterator();
            while (it.hasNext()) {
                ((C1668rm) it.next()).a(pm);
            }
        }

        public void a(int i) {
            if (V.this.z != i) {
                V.this.z = i;
                Iterator it = V.this.g.iterator();
                while (it.hasNext()) {
                    C1609pm pmVar = (C1609pm) it.next();
                    if (!V.this.k.contains(pmVar)) {
                        pmVar.a(i);
                    }
                }
                Iterator it2 = V.this.k.iterator();
                while (it2.hasNext()) {
                    ((C1668rm) it2.next()).a(i);
                }
            }
        }

        public void a(int i, long j, long j2) {
            Iterator it = V.this.k.iterator();
            while (it.hasNext()) {
                ((C1668rm) it.next()).a(i, j, j2);
            }
        }

        public void a(List<Uo> list) {
            V.this.D = list;
            Iterator it = V.this.h.iterator();
            while (it.hasNext()) {
                ((C1241dp) it.next()).a(list);
            }
        }

        public void a(Metadata metadata) {
            Iterator it = V.this.i.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(metadata);
            }
        }

        public void a(float f) {
            V.this.s();
        }

        public void a(boolean z) {
            if (V.this.F == null) {
                return;
            }
            if (z && !V.this.G) {
                V.this.F.a(0);
                V.this.G = true;
            } else if (!z && V.this.G) {
                V.this.F.b(0);
                V.this.G = false;
            }
        }
    }

    protected V(Context context, S s2, o oVar, D d2, n<com.google.android.exoplayer2.drm.r> nVar, Up up, defpackage.Zl.a aVar, Looper looper) {
        this(context, s2, oVar, d2, nVar, up, aVar, C1882yq.a, looper);
    }

    private void r() {
        TextureView textureView = this.u;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.e) {
                Iq.d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.u.setSurfaceTextureListener(null);
            }
            this.u = null;
        }
        SurfaceHolder surfaceHolder = this.t;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.e);
            this.t = null;
        }
    }

    /* access modifiers changed from: private */
    public void s() {
        O[] oArr;
        float a2 = this.B * this.n.a();
        for (O o2 : this.b) {
            if (o2.e() == 1) {
                M a3 = this.c.a((M.b) o2);
                a3.a(2);
                a3.a((Object) Float.valueOf(a2));
                a3.k();
            }
        }
    }

    private void t() {
        if (Looper.myLooper() != k()) {
            Iq.b("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/troubleshooting.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", this.E ? null : new IllegalStateException());
            this.E = true;
        }
    }

    public long getCurrentPosition() {
        t();
        return this.c.getCurrentPosition();
    }

    public long l() {
        t();
        return this.c.l();
    }

    public boolean m() {
        t();
        return this.c.m();
    }

    public C0618s n() {
        t();
        return this.c.n();
    }

    public int o() {
        t();
        return this.c.o();
    }

    public float p() {
        return this.B;
    }

    public void q() {
        t();
        this.n.b();
        this.c.q();
        r();
        Surface surface = this.q;
        if (surface != null) {
            if (this.r) {
                surface.release();
            }
            this.q = null;
        }
        r rVar = this.C;
        if (rVar != null) {
            rVar.a((s) this.m);
            this.C = null;
        }
        if (this.G) {
            Sq sq = this.F;
            C1852xq.a(sq);
            sq.b(0);
            this.G = false;
        }
        this.l.a(this.m);
        this.D = Collections.emptyList();
    }

    protected V(Context context, S s2, o oVar, D d2, n<com.google.android.exoplayer2.drm.r> nVar, Up up, defpackage.Zl.a aVar, C1882yq yqVar, Looper looper) {
        n<com.google.android.exoplayer2.drm.r> nVar2 = nVar;
        Up up2 = up;
        this.l = up2;
        this.e = new a();
        this.f = new CopyOnWriteArraySet<>();
        this.g = new CopyOnWriteArraySet<>();
        this.h = new CopyOnWriteArraySet<>();
        this.i = new CopyOnWriteArraySet<>();
        this.j = new CopyOnWriteArraySet<>();
        this.k = new CopyOnWriteArraySet<>();
        this.d = new Handler(looper);
        Handler handler = this.d;
        a aVar2 = this.e;
        this.b = s2.a(handler, aVar2, aVar2, aVar2, aVar2, nVar);
        this.B = 1.0f;
        this.z = 0;
        this.A = C1485lm.a;
        this.s = 1;
        this.D = Collections.emptyList();
        C0625w wVar = new C0625w(this.b, oVar, d2, up, yqVar, looper);
        this.c = wVar;
        this.m = aVar.a(this.c, yqVar);
        a((b) this.m);
        a((b) this.e);
        this.j.add(this.m);
        this.f.add(this.m);
        this.k.add(this.m);
        this.g.add(this.m);
        a((f) this.m);
        up2.a(this.d, this.m);
        if (nVar2 instanceof j) {
            ((j) nVar2).a(this.d, (h) this.m);
        }
        Context context2 = context;
        this.n = new C1578om(context, this.e);
    }

    public int c() {
        t();
        return this.c.c();
    }

    public X d() {
        t();
        return this.c.d();
    }

    public int e() {
        t();
        return this.c.e();
    }

    public long f() {
        t();
        return this.c.f();
    }

    public void j() {
        t();
        a((Surface) null);
    }

    public Looper k() {
        return this.c.j();
    }

    public void b(b bVar) {
        t();
        this.c.c(bVar);
    }

    public void b(boolean z2) {
        t();
        a(z2, this.n.a(z2, o()));
    }

    public int b() {
        t();
        return this.c.b();
    }

    public void a(Surface surface) {
        t();
        r();
        int i2 = 0;
        a(surface, false);
        if (surface != null) {
            i2 = -1;
        }
        a(i2, i2);
    }

    public void a(float f2) {
        t();
        float a2 = C0471ar.a(f2, 0.0f, 1.0f);
        if (this.B != a2) {
            this.B = a2;
            s();
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((C1609pm) it.next()).a(a2);
            }
        }
    }

    public void a(f fVar) {
        this.i.add(fVar);
    }

    public void a(b bVar) {
        t();
        this.c.a(bVar);
    }

    public void a(r rVar) {
        a(rVar, true, true);
    }

    public void a(r rVar, boolean z2, boolean z3) {
        t();
        r rVar2 = this.C;
        if (rVar2 != null) {
            rVar2.a((s) this.m);
            this.m.h();
        }
        this.C = rVar;
        rVar.a(this.d, (s) this.m);
        a(m(), this.n.a(m()));
        this.c.a(rVar, z2, z3);
    }

    public void a(int i2, long j2) {
        t();
        this.m.g();
        this.c.a(i2, j2);
    }

    public void a(boolean z2) {
        t();
        this.c.a(z2);
        r rVar = this.C;
        if (rVar != null) {
            rVar.a((s) this.m);
            this.m.h();
            if (z2) {
                this.C = null;
            }
        }
        this.n.b();
        this.D = Collections.emptyList();
    }

    public long a() {
        t();
        return this.c.a();
    }

    /* access modifiers changed from: private */
    public void a(Surface surface, boolean z2) {
        O[] oArr;
        ArrayList<M> arrayList = new ArrayList<>();
        for (O o2 : this.b) {
            if (o2.e() == 2) {
                M a2 = this.c.a((M.b) o2);
                a2.a(1);
                a2.a((Object) surface);
                a2.k();
                arrayList.add(a2);
            }
        }
        Surface surface2 = this.q;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (M a3 : arrayList) {
                    a3.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.r) {
                this.q.release();
            }
        }
        this.q = surface;
        this.r = z2;
    }

    /* access modifiers changed from: private */
    public void a(int i2, int i3) {
        if (i2 != this.v || i3 != this.w) {
            this.v = i2;
            this.w = i3;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((q) it.next()).a(i2, i3);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z2, int i2) {
        C0625w wVar = this.c;
        boolean z3 = false;
        boolean z4 = z2 && i2 != -1;
        if (i2 != 1) {
            z3 = true;
        }
        wVar.a(z4, z3);
    }
}
