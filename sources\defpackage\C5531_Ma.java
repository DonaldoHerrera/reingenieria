package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Collection;

/* renamed from: _Ma reason: default package and case insensitive filesystem */
/* compiled from: Kit */
public abstract class C5531_Ma<Result> implements Comparable<C5531_Ma> {
    C5328TMa a;
    C5502ZMa<Result> b = new C5502ZMa<>(this);
    Context c;
    C5444XMa<Result> d;
    C4931GNa e;
    final C5445XNa f = ((C5445XNa) getClass().getAnnotation(C5445XNa.class));

    /* access modifiers changed from: 0000 */
    public final void J() {
        this.b.a(this.a.b(), null);
    }

    /* access modifiers changed from: protected */
    public boolean K() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, C5328TMa tMa, C5444XMa<Result> xMa, C4931GNa gNa) {
        this.a = tMa;
        this.c = new C5357UMa(context, v(), w());
        this.d = xMa;
        this.e = gNa;
    }

    /* access modifiers changed from: protected */
    public void a(Result result) {
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
    }

    /* access modifiers changed from: 0000 */
    public boolean b(C5531_Ma _ma) {
        if (y()) {
            for (Class isAssignableFrom : this.f.value()) {
                if (isAssignableFrom.isAssignableFrom(_ma.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract Result d();

    public Context e() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public Collection<C6434fOa> f() {
        return this.b.c();
    }

    public C5328TMa g() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public C4931GNa u() {
        return this.e;
    }

    public abstract String v();

    public String w() {
        StringBuilder sb = new StringBuilder();
        sb.append(".Fabric");
        sb.append(File.separator);
        sb.append(v());
        return sb.toString();
    }

    public abstract String x();

    /* access modifiers changed from: 0000 */
    public boolean y() {
        return this.f != null;
    }

    /* renamed from: a */
    public int compareTo(C5531_Ma _ma) {
        if (b(_ma)) {
            return 1;
        }
        if (_ma.b(this)) {
            return -1;
        }
        if (y() && !_ma.y()) {
            return 1;
        }
        if (y() || !_ma.y()) {
            return 0;
        }
        return -1;
    }
}
