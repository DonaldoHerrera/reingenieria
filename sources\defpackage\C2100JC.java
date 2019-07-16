package defpackage;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: JC reason: default package and case insensitive filesystem */
/* compiled from: LongAddables */
final class C2100JC {
    private static final Supplier<C2042GC> a;

    /* renamed from: JC$a */
    /* compiled from: LongAddables */
    private static final class a extends AtomicLong implements C2042GC {
        private a() {
        }

        public void a() {
            getAndIncrement();
        }

        public void add(long j) {
            getAndAdd(j);
        }

        /* synthetic */ a(C2062HC hc) {
            this();
        }
    }

    static {
        Supplier<C2042GC> supplier;
        try {
            new C2119KC();
            supplier = new C2062HC<>();
        } catch (Throwable unused) {
            supplier = new C2081IC<>();
        }
        a = supplier;
    }

    public static C2042GC a() {
        return (C2042GC) a.get();
    }
}
