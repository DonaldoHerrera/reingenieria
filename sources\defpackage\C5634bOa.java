package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: bOa reason: default package and case insensitive filesystem */
/* compiled from: PriorityFutureTask */
public class C5634bOa<V> extends FutureTask<V> implements C5387VNa<C6434fOa>, C5702cOa, C6434fOa, C5358UNa {
    final Object a;

    public C5634bOa(Callable<V> callable) {
        super(callable);
        this.a = b(callable);
    }

    public boolean b() {
        return ((C5387VNa) ((C5702cOa) d())).b();
    }

    public Collection<C6434fOa> c() {
        return ((C5387VNa) ((C5702cOa) d())).c();
    }

    public int compareTo(Object obj) {
        return ((C5702cOa) d()).compareTo(obj);
    }

    public <T extends C5387VNa<C6434fOa> & C5702cOa & C6434fOa> T d() {
        return (C5387VNa) this.a;
    }

    public C5474YNa j() {
        return ((C5702cOa) d()).j();
    }

    public void a(C6434fOa foa) {
        ((C5387VNa) ((C5702cOa) d())).a(foa);
    }

    /* access modifiers changed from: protected */
    public <T extends C5387VNa<C6434fOa> & C5702cOa & C6434fOa> T b(Object obj) {
        if (C6298dOa.b(obj)) {
            return (C5387VNa) obj;
        }
        return new C6298dOa();
    }

    public C5634bOa(Runnable runnable, V v) {
        super(runnable, v);
        this.a = b(runnable);
    }

    public void a(boolean z) {
        ((C6434fOa) ((C5702cOa) d())).a(z);
    }

    public boolean a() {
        return ((C6434fOa) ((C5702cOa) d())).a();
    }

    public void a(Throwable th) {
        ((C6434fOa) ((C5702cOa) d())).a(th);
    }
}
