package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ol reason: default package and case insensitive filesystem */
/* compiled from: Spring */
public class C1577ol {
    private static int a;
    private C1608pl b;
    private boolean c;
    private final String d;
    private final a e = new a();
    private final a f = new a();
    private final a g = new a();
    private double h;
    private double i;
    private boolean j = true;
    private double k = 0.005d;
    private double l = 0.005d;
    private CopyOnWriteArraySet<C1667rl> m = new CopyOnWriteArraySet<>();
    private double n = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    private final C1453kl o;

    /* renamed from: ol$a */
    /* compiled from: Spring */
    private static class a {
        double a;
        double b;

        private a() {
        }
    }

    C1577ol(C1453kl klVar) {
        if (klVar != null) {
            this.o = klVar;
            StringBuilder sb = new StringBuilder();
            sb.append("spring:");
            int i2 = a;
            a = i2 + 1;
            sb.append(i2);
            this.d = sb.toString();
            a(C1608pl.a);
            return;
        }
        throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
    }

    public void a() {
        this.m.clear();
        this.o.a(this);
    }

    public C1577ol b(double d2) {
        a(d2, true);
        return this;
    }

    public C1577ol c(double d2) {
        if (this.i == d2 && e()) {
            return this;
        }
        this.h = b();
        this.i = d2;
        this.o.a(d());
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((C1667rl) it.next()).b(this);
        }
        return this;
    }

    public String d() {
        return this.d;
    }

    public boolean e() {
        return Math.abs(this.e.b) <= this.k && (a(this.e) <= this.l || this.b.c == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public boolean f() {
        return this.b.c > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && ((this.h < this.i && b() > this.i) || (this.h > this.i && b() < this.i));
    }

    public C1577ol g() {
        this.m.clear();
        return this;
    }

    public C1577ol h() {
        a aVar = this.e;
        double d2 = aVar.a;
        this.i = d2;
        this.g.a = d2;
        aVar.b = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        return this;
    }

    public boolean i() {
        return !e() || !j();
    }

    public boolean j() {
        return this.j;
    }

    private void e(double d2) {
        a aVar = this.e;
        double d3 = aVar.a * d2;
        a aVar2 = this.f;
        double d4 = 1.0d - d2;
        aVar.a = d3 + (aVar2.a * d4);
        aVar.b = (aVar.b * d2) + (aVar2.b * d4);
    }

    public double b() {
        return this.e.a;
    }

    public C1577ol d(double d2) {
        a aVar = this.e;
        if (d2 == aVar.b) {
            return this;
        }
        aVar.b = d2;
        this.o.a(d());
        return this;
    }

    public C1577ol a(C1608pl plVar) {
        if (plVar != null) {
            this.b = plVar;
            return this;
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    public C1577ol a(double d2, boolean z) {
        this.h = d2;
        this.e.a = d2;
        this.o.a(d());
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((C1667rl) it.next()).a(this);
        }
        if (z) {
            h();
        }
        return this;
    }

    public double c() {
        return this.i;
    }

    private double a(a aVar) {
        return Math.abs(this.i - aVar.a);
    }

    /* access modifiers changed from: 0000 */
    public void a(double d2) {
        double d3;
        boolean z;
        boolean e2 = e();
        if (!e2 || !this.j) {
            double d4 = 0.064d;
            if (d2 <= 0.064d) {
                d4 = d2;
            }
            this.n += d4;
            C1608pl plVar = this.b;
            double d5 = plVar.c;
            double d6 = plVar.b;
            a aVar = this.e;
            double d7 = aVar.a;
            double d8 = aVar.b;
            a aVar2 = this.g;
            double d9 = aVar2.a;
            double d10 = aVar2.b;
            boolean z2 = e2;
            while (true) {
                d3 = this.n;
                if (d3 < 0.001d) {
                    break;
                }
                this.n = d3 - 0.001d;
                if (this.n < 0.001d) {
                    a aVar3 = this.f;
                    aVar3.a = d7;
                    aVar3.b = d8;
                }
                double d11 = this.i;
                double d12 = ((d11 - d9) * d5) - (d6 * d8);
                double d13 = d8 + (d12 * 0.001d * 0.5d);
                double d14 = ((d11 - (((d8 * 0.001d) * 0.5d) + d7)) * d5) - (d6 * d13);
                double d15 = d8 + (d14 * 0.001d * 0.5d);
                double d16 = ((d11 - (d7 + ((d13 * 0.001d) * 0.5d))) * d5) - (d6 * d15);
                double d17 = d7 + (d15 * 0.001d);
                double d18 = d8 + (d16 * 0.001d);
                d7 += (d8 + ((d13 + d15) * 2.0d) + d18) * 0.16666666666666666d * 0.001d;
                d8 += (d12 + ((d14 + d16) * 2.0d) + (((d11 - d17) * d5) - (d6 * d18))) * 0.16666666666666666d * 0.001d;
                d9 = d17;
                d10 = d18;
            }
            a aVar4 = this.g;
            aVar4.a = d9;
            aVar4.b = d10;
            a aVar5 = this.e;
            aVar5.a = d7;
            aVar5.b = d8;
            if (d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                e(d3 / 0.001d);
            }
            boolean z3 = true;
            if (e() || (this.c && f())) {
                if (d5 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    double d19 = this.i;
                    this.h = d19;
                    this.e.a = d19;
                } else {
                    this.i = this.e.a;
                    this.h = this.i;
                }
                d(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                z2 = true;
            }
            if (this.j) {
                this.j = false;
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                this.j = true;
            } else {
                z3 = false;
            }
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                C1667rl rlVar = (C1667rl) it.next();
                if (z) {
                    rlVar.c(this);
                }
                rlVar.a(this);
                if (z3) {
                    rlVar.d(this);
                }
            }
        }
    }

    public C1577ol a(C1667rl rlVar) {
        if (rlVar != null) {
            this.m.add(rlVar);
            return this;
        }
        throw new IllegalArgumentException("newListener is required");
    }
}
