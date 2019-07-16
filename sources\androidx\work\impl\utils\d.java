package androidx.work.impl.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.c;
import androidx.work.g;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.e;
import androidx.work.impl.f;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.m;
import androidx.work.m.a.C0028a;
import androidx.work.q.a;
import androidx.work.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EnqueueRunnable */
public class d implements Runnable {
    private static final String a = i.a("EnqueueRunnable");
    private final f b;
    private final b c = new b();

    public d(f fVar) {
        this.b = fVar;
    }

    public boolean a() {
        WorkDatabase g = this.b.g().g();
        g.c();
        try {
            boolean b2 = b(this.b);
            g.m();
            return b2;
        } finally {
            g.e();
        }
    }

    public m b() {
        return this.c;
    }

    public void c() {
        androidx.work.impl.m g = this.b.g();
        e.a(g.c(), g.g(), g.f());
    }

    public void run() {
        try {
            if (!this.b.h()) {
                if (a()) {
                    f.a(this.b.g().b(), RescheduleReceiver.class, true);
                    c();
                }
                this.c.a(m.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.b}));
        } catch (Throwable th) {
            this.c.a(new C0028a(th));
        }
    }

    private static boolean b(f fVar) {
        List<f> e = fVar.e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (f fVar2 : e) {
                if (!fVar2.i()) {
                    z2 |= b(fVar2);
                } else {
                    i.a().e(a, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", fVar2.c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return a(fVar) | z;
    }

    private static boolean a(f fVar) {
        boolean a2 = a(fVar.g(), fVar.f(), (String[]) f.a(fVar).toArray(new String[0]), fVar.d(), fVar.b());
        fVar.j();
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a8 A[LOOP:6: B:109:0x01a2->B:111:0x01a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011f  */
    private static boolean a(androidx.work.impl.m mVar, List<? extends s> list, String[] strArr, String str, g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        int i;
        androidx.work.impl.m mVar2 = mVar;
        String[] strArr2 = strArr;
        String str2 = str;
        g gVar2 = gVar;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase g = mVar.g();
        boolean z5 = strArr2 != null && strArr2.length > 0;
        if (z5) {
            z3 = true;
            z2 = false;
            z = false;
            for (String str3 : strArr2) {
                _e c2 = g.t().c(str3);
                if (c2 == null) {
                    i.a().b(a, String.format("Prerequisite %s doesn't exist; not enqueuing", new Object[]{str3}), new Throwable[0]);
                    return false;
                }
                a aVar = c2.d;
                z3 &= aVar == a.SUCCEEDED;
                if (aVar == a.FAILED) {
                    z2 = true;
                } else if (aVar == a.CANCELLED) {
                    z = true;
                }
            }
        } else {
            z3 = true;
            z2 = false;
            z = false;
        }
        boolean z6 = !TextUtils.isEmpty(str);
        if (z6 && !z5) {
            List<a> f = g.t().f(str2);
            if (!f.isEmpty()) {
                if (gVar2 == g.APPEND) {
                    Ne n = g.n();
                    ArrayList arrayList = new ArrayList();
                    for (a aVar2 : f) {
                        if (!n.c(aVar2.a)) {
                            boolean z7 = (aVar2.b == a.SUCCEEDED) & z3;
                            a aVar3 = aVar2.b;
                            if (aVar3 == a.FAILED) {
                                z2 = true;
                            } else if (aVar3 == a.CANCELLED) {
                                z = true;
                            }
                            arrayList.add(aVar2.a);
                            z3 = z7;
                        }
                    }
                    strArr2 = (String[]) arrayList.toArray(strArr2);
                    z5 = strArr2.length > 0;
                } else {
                    if (gVar2 == g.KEEP) {
                        for (a aVar4 : f) {
                            a aVar5 = aVar4.b;
                            if (aVar5 != a.ENQUEUED) {
                                if (aVar5 == a.RUNNING) {
                                }
                            }
                            return false;
                        }
                    }
                    c.a(str2, mVar2, false).run();
                    C0305af t = g.t();
                    for (a aVar6 : f) {
                        t.delete(aVar6.a);
                    }
                    z4 = true;
                    for (s sVar : list) {
                        _e c3 = sVar.c();
                        if (!z5 || z3) {
                            if (!c3.d()) {
                                c3.p = currentTimeMillis;
                            } else {
                                j = currentTimeMillis;
                                c3.p = 0;
                                i = VERSION.SDK_INT;
                                if (i < 23 && i <= 25) {
                                    a(c3);
                                } else if (VERSION.SDK_INT <= 22 && a(mVar2, "androidx.work.impl.background.gcm.GcmScheduler")) {
                                    a(c3);
                                }
                                if (c3.d == a.ENQUEUED) {
                                    z4 = true;
                                }
                                g.t().a(c3);
                                if (z5) {
                                    for (String me : strArr2) {
                                        g.n().a(new Me(sVar.a(), me));
                                    }
                                }
                                for (String lfVar : sVar.b()) {
                                    g.u().a(new C1478lf(lfVar, sVar.a()));
                                }
                                if (!z6) {
                                    g.s().a(new Ve(str2, sVar.a()));
                                }
                                currentTimeMillis = j;
                            }
                        } else if (z2) {
                            c3.d = a.FAILED;
                        } else if (z) {
                            c3.d = a.CANCELLED;
                        } else {
                            c3.d = a.BLOCKED;
                        }
                        j = currentTimeMillis;
                        i = VERSION.SDK_INT;
                        if (i < 23) {
                        }
                        a(c3);
                        if (c3.d == a.ENQUEUED) {
                        }
                        g.t().a(c3);
                        if (z5) {
                        }
                        while (r3.hasNext()) {
                        }
                        if (!z6) {
                        }
                        currentTimeMillis = j;
                    }
                    return z4;
                }
            }
        }
        z4 = false;
        for (s sVar2 : list) {
        }
        return z4;
    }

    private static void a(_e _eVar) {
        c cVar = _eVar.l;
        if (cVar.f() || cVar.i()) {
            String str = _eVar.e;
            androidx.work.e.a aVar = new androidx.work.e.a();
            aVar.a(_eVar.g);
            aVar.a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            _eVar.e = ConstraintTrackingWorker.class.getName();
            _eVar.g = aVar.a();
        }
    }

    private static boolean a(androidx.work.impl.m mVar, String str) {
        try {
            Class cls = Class.forName(str);
            for (androidx.work.impl.d dVar : mVar.f()) {
                if (cls.isAssignableFrom(dVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }
}
