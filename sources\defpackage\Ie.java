package defpackage;

import android.content.Context;
import androidx.work.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: Ie reason: default package */
/* compiled from: ConstraintTracker */
public abstract class Ie<T> {
    private static final String a = i.a("ConstraintTracker");
    protected final C1811wf b;
    protected final Context c;
    private final Object d = new Object();
    private final Set<C1660re<T>> e = new LinkedHashSet();
    T f;

    Ie(Context context, C1811wf wfVar) {
        this.c = context.getApplicationContext();
        this.b = wfVar;
    }

    public abstract T a();

    public void a(C1660re<T> reVar) {
        synchronized (this.d) {
            if (this.e.add(reVar)) {
                if (this.e.size() == 1) {
                    this.f = a();
                    i.a().a(a, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f}), new Throwable[0]);
                    b();
                }
                reVar.a(this.f);
            }
        }
    }

    public abstract void b();

    public void b(C1660re<T> reVar) {
        synchronized (this.d) {
            if (this.e.remove(reVar) && this.e.isEmpty()) {
                c();
            }
        }
    }

    public abstract void c();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    public void a(T t) {
        synchronized (this.d) {
            if (this.f != t) {
                if (this.f == null || !this.f.equals(t)) {
                    this.f = t;
                    this.b.a().execute(new He(this, new ArrayList(this.e)));
                }
            }
        }
    }
}
