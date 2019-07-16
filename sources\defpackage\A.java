package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: A reason: default package */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class A {
    final ArrayList<Ec> a = new ArrayList<>();
    private long b = -1;
    private Interpolator c;
    Fc d;
    private boolean e;
    private final Gc f = new C1892z(this);

    public A a(Ec ec) {
        if (!this.e) {
            this.a.add(ec);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.e = false;
    }

    public void c() {
        if (!this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Ec ec = (Ec) it.next();
                long j = this.b;
                if (j >= 0) {
                    ec.a(j);
                }
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    ec.a(interpolator);
                }
                if (this.d != null) {
                    ec.a((Fc) this.f);
                }
                ec.c();
            }
            this.e = true;
        }
    }

    public A a(Ec ec, Ec ec2) {
        this.a.add(ec);
        ec2.b(ec.b());
        this.a.add(ec2);
        return this;
    }

    public void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Ec) it.next()).a();
            }
            this.e = false;
        }
    }

    public A a(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public A a(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public A a(Fc fc) {
        if (!this.e) {
            this.d = fc;
        }
        return this;
    }
}
