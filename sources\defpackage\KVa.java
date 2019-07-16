package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"}, mv = {1, 1, 15})
/* renamed from: KVa reason: default package */
/* compiled from: LazyJVM.kt */
final class KVa<T> implements C7744yVa<T>, Serializable {
    private static final AtomicReferenceFieldUpdater<KVa<?>, Object> a = AtomicReferenceFieldUpdater.newUpdater(KVa.class, Object.class, "d");
    public static final a b = new a(null);
    private volatile PXa<? extends T> c;
    private volatile Object d;
    private final Object e;

    /* renamed from: KVa$a */
    /* compiled from: LazyJVM.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public KVa(PXa<? extends T> pXa) {
        C7471uYa.b(pXa, "initializer");
        this.c = pXa;
        PVa pVa = PVa.a;
        this.d = pVa;
        this.e = pVa;
    }

    private final Object writeReplace() {
        return new C7606wVa(getValue());
    }

    public boolean a() {
        return this.d != PVa.a;
    }

    public T getValue() {
        T t = this.d;
        if (t != PVa.a) {
            return t;
        }
        PXa<? extends T> pXa = this.c;
        if (pXa != null) {
            T d2 = pXa.d();
            if (a.compareAndSet(this, PVa.a, d2)) {
                this.c = null;
                return d2;
            }
        }
        return this.d;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
