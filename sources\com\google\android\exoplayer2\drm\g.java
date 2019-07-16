package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.C0615o;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.drm.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
/* compiled from: DefaultDrmSession */
class g<T extends p> implements m<T> {
    public final List<SchemeData> a;
    private final q<T> b;
    private final c<T> c;
    private final int d;
    private final HashMap<String, String> e;
    private final Eq<h> f;
    /* access modifiers changed from: private */
    public final int g;
    final t h;
    final UUID i;
    final b j;
    private int k;
    private int l;
    private HandlerThread m;
    private a n;
    private T o;
    private com.google.android.exoplayer2.drm.m.a p;
    private byte[] q;
    private byte[] r;
    private com.google.android.exoplayer2.drm.q.a s;
    private com.google.android.exoplayer2.drm.q.b t;

    @SuppressLint({"HandlerLeak"})
    /* compiled from: DefaultDrmSession */
    private class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, Object obj, boolean z) {
            obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
        }

        public void handleMessage(Message message) {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    e = g.this.h.a(g.this.i, (com.google.android.exoplayer2.drm.q.b) obj);
                } else if (i == 1) {
                    e = g.this.h.a(g.this.i, (com.google.android.exoplayer2.drm.q.a) obj);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                e = e;
                if (a(message)) {
                    return;
                }
            }
            g.this.j.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        }

        private boolean a(Message message) {
            if (!(message.arg1 == 1)) {
                return false;
            }
            int i = message.arg2 + 1;
            if (i > g.this.g) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i;
            sendMessageDelayed(obtain, a(i));
            return true;
        }

        private long a(int i) {
            return (long) Math.min((i - 1) * 1000, 5000);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* compiled from: DefaultDrmSession */
    private class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                g.this.b(obj, obj2);
            } else if (i == 1) {
                g.this.a(obj, obj2);
            }
        }
    }

    /* compiled from: DefaultDrmSession */
    public interface c<T extends p> {
        void a();

        void a(g<T> gVar);

        void a(Exception exc);
    }

    public g(UUID uuid, q<T> qVar, c<T> cVar, List<SchemeData> list, int i2, byte[] bArr, HashMap<String, String> hashMap, t tVar, Looper looper, Eq<h> eq, int i3) {
        if (i2 == 1 || i2 == 3) {
            C1852xq.a(bArr);
        }
        this.i = uuid;
        this.c = cVar;
        this.b = qVar;
        this.d = i2;
        if (bArr != null) {
            this.r = bArr;
            this.a = null;
        } else {
            C1852xq.a(list);
            this.a = Collections.unmodifiableList(list);
        }
        this.e = hashMap;
        this.h = tVar;
        this.g = i3;
        this.f = eq;
        this.k = 2;
        this.j = new b<>(looper);
        this.m = new HandlerThread("DrmRequestHandler");
        this.m.start();
        this.n = new a<>(this.m.getLooper());
    }

    private long h() {
        if (!C0615o.d.equals(this.i)) {
            return Long.MAX_VALUE;
        }
        Pair a2 = u.a(this);
        C1852xq.a(a2);
        Pair pair = a2;
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean i() {
        int i2 = this.k;
        return i2 == 3 || i2 == 4;
    }

    private void j() {
        if (this.d == 0 && this.k == 4) {
            C0471ar.a(this.q);
            a(false);
        }
    }

    private boolean k() {
        try {
            this.b.a(this.q, this.r);
            return true;
        } catch (Exception e2) {
            Iq.a("DefaultDrmSession", "Error trying to restore Widevine keys.", e2);
            b(e2);
            return false;
        }
    }

    public Map<String, String> c() {
        byte[] bArr = this.q;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    public void d() {
        int i2 = this.l + 1;
        this.l = i2;
        if (i2 == 1 && this.k != 1 && b(true)) {
            a(true);
        }
    }

    public void e() {
        if (b(false)) {
            a(true);
        }
    }

    public void f() {
        this.t = this.b.a();
        this.n.a(0, this.t, true);
    }

    public boolean g() {
        int i2 = this.l - 1;
        this.l = i2;
        if (i2 != 0) {
            return false;
        }
        this.k = 0;
        this.j.removeCallbacksAndMessages(null);
        this.n.removeCallbacksAndMessages(null);
        this.n = null;
        this.m.quit();
        this.m = null;
        this.o = null;
        this.p = null;
        this.s = null;
        this.t = null;
        byte[] bArr = this.q;
        if (bArr != null) {
            this.b.d(bArr);
            this.q = null;
            this.f.a((defpackage.Eq.a<T>) a.a);
        }
        return true;
    }

    public final int getState() {
        return this.k;
    }

    private void c(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.c.a(this);
        } else {
            b(exc);
        }
    }

    public final T b() {
        return this.o;
    }

    private boolean b(boolean z) {
        if (i()) {
            return true;
        }
        try {
            this.q = this.b.b();
            this.f.a((defpackage.Eq.a<T>) d.a);
            this.o = this.b.b(this.q);
            this.k = 3;
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                this.c.a(this);
            } else {
                b((Exception) e2);
            }
            return false;
        } catch (Exception e3) {
            b(e3);
            return false;
        }
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.q, bArr);
    }

    public void a(int i2) {
        if (i2 == 2) {
            j();
        }
    }

    public void a(Exception exc) {
        b(exc);
    }

    public final com.google.android.exoplayer2.drm.m.a a() {
        if (this.k == 1) {
            return this.p;
        }
        return null;
    }

    private void a(boolean z) {
        int i2 = this.d;
        if (i2 == 0 || i2 == 1) {
            if (this.r == null) {
                a(this.q, 1, z);
            } else if (this.k == 4 || k()) {
                long h2 = h();
                if (this.d == 0 && h2 <= 60) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                    sb.append(h2);
                    Iq.a("DefaultDrmSession", sb.toString());
                    a(this.q, 2, z);
                } else if (h2 <= 0) {
                    b((Exception) new s());
                } else {
                    this.k = 4;
                    this.f.a((defpackage.Eq.a<T>) e.a);
                }
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                C1852xq.a(this.r);
                if (k()) {
                    a(this.r, 3, z);
                }
            }
        } else if (this.r == null) {
            a(this.q, 2, z);
        } else if (k()) {
            a(this.q, 2, z);
        }
    }

    /* access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        if (obj == this.t && (this.k == 2 || i())) {
            this.t = null;
            if (obj2 instanceof Exception) {
                this.c.a((Exception) obj2);
                return;
            }
            try {
                this.b.c((byte[]) obj2);
                this.c.a();
            } catch (Exception e2) {
                this.c.a(e2);
            }
        }
    }

    private void b(Exception exc) {
        this.p = new com.google.android.exoplayer2.drm.m.a(exc);
        this.f.a((defpackage.Eq.a<T>) new b<T>(exc));
        if (this.k != 4) {
            this.k = 1;
        }
    }

    private void a(byte[] bArr, int i2, boolean z) {
        try {
            this.s = this.b.a(bArr, this.a, i2, this.e);
            this.n.a(1, this.s, z);
        } catch (Exception e2) {
            c(e2);
        }
    }

    /* access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.s && i()) {
            this.s = null;
            if (obj2 instanceof Exception) {
                c((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.d == 3) {
                    q<T> qVar = this.b;
                    byte[] bArr2 = this.r;
                    C0471ar.a(bArr2);
                    qVar.b(bArr2, bArr);
                    this.f.a((defpackage.Eq.a<T>) e.a);
                } else {
                    byte[] b2 = this.b.b(this.q, bArr);
                    if (!((this.d != 2 && (this.d != 0 || this.r == null)) || b2 == null || b2.length == 0)) {
                        this.r = b2;
                    }
                    this.k = 4;
                    this.f.a((defpackage.Eq.a<T>) f.a);
                }
            } catch (Exception e2) {
                c(e2);
            }
        }
    }
}
