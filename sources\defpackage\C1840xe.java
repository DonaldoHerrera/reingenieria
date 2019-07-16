package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xe reason: default package and case insensitive filesystem */
/* compiled from: ConstraintController */
public abstract class C1840xe<T> implements C1660re<T> {
    private final List<String> a = new ArrayList();
    private T b;
    private Ie<T> c;
    private a d;

    /* renamed from: xe$a */
    /* compiled from: ConstraintController */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    C1840xe(Ie<T> ie) {
        this.c = ie;
    }

    private void b() {
        if (!this.a.isEmpty() && this.d != null) {
            T t = this.b;
            if (t == null || b(t)) {
                this.d.b(this.a);
            } else {
                this.d.a(this.a);
            }
        }
    }

    public void a(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a(_e _eVar);

    /* access modifiers changed from: 0000 */
    public abstract boolean b(T t);

    public void a(List<_e> list) {
        this.a.clear();
        for (_e _eVar : list) {
            if (a(_eVar)) {
                this.a.add(_eVar.c);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            this.c.a((C1660re<T>) this);
        }
        b();
    }

    public void a() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.b(this);
        }
    }

    public boolean a(String str) {
        T t = this.b;
        return t != null && b(t) && this.a.contains(str);
    }

    public void a(T t) {
        this.b = t;
        b();
    }
}
