package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ea {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(ea.class);
    private static final int b = Runtime.getRuntime().availableProcessors();
    private static final int c;
    private static final int d;
    /* access modifiers changed from: private */
    public final dl e;
    private final dc f;
    /* access modifiers changed from: private */
    public final aa g = new aa(this.l);
    /* access modifiers changed from: private */
    public final l h;
    private final bb i;
    private final df j;
    private final z k;
    private final ThreadPoolExecutor l;
    private final a m;
    /* access modifiers changed from: private */
    public final o n;
    private final bd o;
    private final bj p;
    private final fp q;
    private final dj r;
    private final ay s;
    private final ax t;

    static {
        int i2 = b;
        c = i2 * 2;
        d = i2 * 4;
    }

    public ea(Context context, j jVar, Bf bf, ab abVar, aw awVar, bk bkVar, boolean z, boolean z2) {
        da daVar;
        Context context2 = context;
        Bf bf2 = bf;
        String a2 = jVar.a();
        String bwVar = bf.d().toString();
        as asVar = new as();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(c, d, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(64), asVar);
        this.l = threadPoolExecutor;
        this.r = new dj(context2, bwVar, this.g);
        if (a2.equals("")) {
            this.e = new dl(context2, bkVar, this.r);
            this.f = new dc(context2);
            daVar = da.a(context2, null, bwVar);
        } else {
            dl dlVar = new dl(context, a2, bwVar, bkVar, this.r);
            this.e = dlVar;
            this.f = new dc(context2, a2, bwVar);
            daVar = da.a(context2, a2, bwVar);
        }
        da daVar2 = daVar;
        be beVar = new be(context, bf, a2, awVar, this.f, this.r, this.g);
        this.m = new a();
        p pVar = new p(this.e, beVar, bf2);
        au auVar = new au(asVar);
        asVar.a(new at(this.g));
        de deVar = new de(new dk(context2, a2, bwVar), this.g);
        dd ddVar = new dd(new db(new di(daVar2), auVar), this.g);
        AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
        be beVar2 = beVar;
        bd bdVar = r1;
        bd bdVar2 = new bd(deVar, this.g, context, alarmManager, bf.v(), this.r);
        this.o = bdVar;
        this.t = new ax(ddVar);
        this.j = new df(context2, a2);
        cx cxVar = new cx(this.m, b.a(), this.g, abVar, this.l, this.j, this.r);
        o oVar = new o(context, this.g, new m(), alarmManager, new n(context2), a2);
        this.n = oVar;
        this.n.a(this.g);
        this.n.a(z2);
        l lVar = r1;
        l lVar2 = new l(bf, this.g, cxVar, pVar, asVar, z);
        this.h = lVar;
        bc bcVar = new bc(context2, this.g, this.r);
        bd bdVar3 = this.o;
        l lVar3 = this.h;
        cx cxVar2 = cxVar;
        l lVar4 = lVar3;
        String str = bwVar;
        String str2 = a2;
        Bf bf3 = bf2;
        bb bbVar = new bb(bdVar3, lVar4, this.g, beVar2, bf, this.r, this.t, cxVar2, str2, z, z2, bcVar);
        this.i = bbVar;
        Context context3 = context;
        String str3 = str;
        Bf bf4 = bf3;
        cx cxVar3 = cxVar2;
        fp fpVar = new fp(context3, this.i, this.l, abVar, bf, str2, str3);
        this.q = fpVar;
        ay ayVar = new ay(context3, str3, this.i, bf, this.r);
        this.s = ayVar;
        if (!z) {
            cxVar3.a((bg) this.i);
        }
        this.j.a(this.i);
        this.p = new ba(context2, this.i, bf4, this.r);
        cg cgVar = new cg(context2, str3, this.i);
        z zVar = new z(context, this.p, this.h, this.i, this.e, this.f, this.r, this.q, cgVar, this.t, this.s);
        this.k = zVar;
    }

    public l e() {
        return this.h;
    }

    public aa f() {
        return this.g;
    }

    public dl g() {
        return this.e;
    }

    public ThreadPoolExecutor h() {
        return this.l;
    }

    public df i() {
        return this.j;
    }

    public bj j() {
        return this.p;
    }

    public ax k() {
        return this.t;
    }

    public fp l() {
        return this.q;
    }

    public ay m() {
        return this.s;
    }

    public void n() {
        this.l.execute(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(3:6|7|8)|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002e */
            public void run() {
                try {
                    synchronized (ea.this.e) {
                        if (ea.this.e.c()) {
                            Hg.c(ea.a, "User cache was locked, waiting.");
                            ea.this.e.wait();
                            Hg.a(ea.a, "User cache notified.");
                        }
                    }
                    ea.this.h.a(ea.this.g);
                } catch (Exception e) {
                    Hg.d(ea.a, "Exception while shutting down dispatch manager. Continuing.", e);
                }
                try {
                    ea.this.n.b();
                } catch (Exception e2) {
                    Hg.d(ea.a, "Exception while un-registering data refresh broadcast receivers. Continuing.", e2);
                }
            }
        });
    }

    public dj a() {
        return this.r;
    }

    public o b() {
        return this.n;
    }

    public z c() {
        return this.k;
    }

    public bb d() {
        return this.i;
    }
}
