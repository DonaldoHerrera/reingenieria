package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dOa reason: default package and case insensitive filesystem */
/* compiled from: PriorityTask */
public class C6298dOa implements C5387VNa<C6434fOa>, C5702cOa, C6434fOa {
    private final List<C6434fOa> a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference<Throwable> c = new AtomicReference<>(null);

    public boolean b() {
        for (C6434fOa a2 : c()) {
            if (!a2.a()) {
                return false;
            }
        }
        return true;
    }

    public synchronized Collection<C6434fOa> c() {
        return Collections.unmodifiableCollection(this.a);
    }

    public int compareTo(Object obj) {
        return C5474YNa.a(this, obj);
    }

    public C5474YNa j() {
        return C5474YNa.NORMAL;
    }

    public synchronized void a(C6434fOa foa) {
        this.a.add(foa);
    }

    public static boolean b(Object obj) {
        try {
            C5387VNa vNa = (C5387VNa) obj;
            C6434fOa foa = (C6434fOa) obj;
            C5702cOa coa = (C5702cOa) obj;
            if (vNa == null || foa == null || coa == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public synchronized void a(boolean z) {
        this.b.set(z);
    }

    public boolean a() {
        return this.b.get();
    }

    public void a(Throwable th) {
        this.c.set(th);
    }
}
