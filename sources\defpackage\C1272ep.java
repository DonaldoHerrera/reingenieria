package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.B;
import com.google.android.exoplayer2.C0614n;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: ep reason: default package and case insensitive filesystem */
/* compiled from: TextRenderer */
public final class C1272ep extends C0614n implements Callback {
    private final Handler j;
    private final C1241dp k;
    private final C0469ap l;
    private final B m;
    private boolean n;
    private boolean o;
    private int p;
    private Format q;
    private Yo r;
    private C0500bp s;
    private C1211cp t;
    private C1211cp u;
    private int v;

    public C1272ep(C1241dp dpVar, Looper looper) {
        this(dpVar, looper, C0469ap.a);
    }

    private void A() {
        z();
        this.r.release();
        this.r = null;
        this.p = 0;
    }

    private void B() {
        A();
        this.r = this.l.b(this.q);
    }

    private void b(List<Uo> list) {
        Handler handler = this.j;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            a(list);
        }
    }

    private void x() {
        b(Collections.emptyList());
    }

    private long y() {
        int i = this.v;
        if (i == -1 || i >= this.t.a()) {
            return Long.MAX_VALUE;
        }
        return this.t.a(this.v);
    }

    private void z() {
        this.s = null;
        this.v = -1;
        C1211cp cpVar = this.t;
        if (cpVar != null) {
            cpVar.f();
            this.t = null;
        }
        C1211cp cpVar2 = this.u;
        if (cpVar2 != null) {
            cpVar2.f();
            this.u = null;
        }
    }

    public int a(Format format) {
        if (!this.l.a(format)) {
            return Lq.e(format.i) ? 1 : 0;
        }
        return C0614n.a(null, format.l) ? 4 : 2;
    }

    public boolean b() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            a((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void t() {
        this.q = null;
        x();
        A();
    }

    public C1272ep(C1241dp dpVar, Looper looper, C0469ap apVar) {
        Handler handler;
        super(3);
        C1852xq.a(dpVar);
        this.k = dpVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = C0471ar.a(looper, (Callback) this);
        }
        this.j = handler;
        this.l = apVar;
        this.m = new B();
    }

    /* access modifiers changed from: protected */
    public void a(Format[] formatArr, long j2) throws C0618s {
        this.q = formatArr[0];
        if (this.r != null) {
            this.p = 1;
        } else {
            this.r = this.l.b(this.q);
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z) {
        x();
        this.n = false;
        this.o = false;
        if (this.p != 0) {
            B();
            return;
        }
        z();
        this.r.flush();
    }

    public void a(long j2, long j3) throws C0618s {
        boolean z;
        if (!this.o) {
            if (this.u == null) {
                this.r.a(j2);
                try {
                    this.u = (C1211cp) this.r.a();
                } catch (Zo e) {
                    throw C0618s.a(e, q());
                }
            }
            if (getState() == 2) {
                if (this.t != null) {
                    long y = y();
                    z = false;
                    while (y <= j2) {
                        this.v++;
                        y = y();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C1211cp cpVar = this.u;
                if (cpVar != null) {
                    if (cpVar.d()) {
                        if (!z && y() == Long.MAX_VALUE) {
                            if (this.p == 2) {
                                B();
                            } else {
                                z();
                                this.o = true;
                            }
                        }
                    } else if (this.u.b <= j2) {
                        C1211cp cpVar2 = this.t;
                        if (cpVar2 != null) {
                            cpVar2.f();
                        }
                        this.t = this.u;
                        this.u = null;
                        this.v = this.t.a(j2);
                        z = true;
                    }
                }
                if (z) {
                    b(this.t.b(j2));
                }
                if (this.p != 2) {
                    while (!this.n) {
                        try {
                            if (this.s == null) {
                                this.s = (C0500bp) this.r.b();
                                if (this.s == null) {
                                    return;
                                }
                            }
                            if (this.p == 1) {
                                this.s.e(4);
                                this.r.a(this.s);
                                this.s = null;
                                this.p = 2;
                                return;
                            }
                            int a = a(this.m, (Qm) this.s, false);
                            if (a == -4) {
                                if (this.s.d()) {
                                    this.n = true;
                                } else {
                                    this.s.f = this.m.a.m;
                                    this.s.f();
                                }
                                this.r.a(this.s);
                                this.s = null;
                            } else if (a == -3) {
                                break;
                            }
                        } catch (Zo e2) {
                            throw C0618s.a(e2, q());
                        }
                    }
                }
            }
        }
    }

    public boolean a() {
        return this.o;
    }

    private void a(List<Uo> list) {
        this.k.a(list);
    }
}
