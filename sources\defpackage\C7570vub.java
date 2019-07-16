package defpackage;

import java.util.ArrayDeque;
import java.util.Set;

/* renamed from: vub reason: default package and case insensitive filesystem */
/* compiled from: TypeCheckerContext.kt */
public class C7570vub {
    /* access modifiers changed from: private */
    public int a;
    private boolean b;
    /* access modifiers changed from: private */
    public ArrayDeque<Etb> c;
    /* access modifiers changed from: private */
    public Set<Etb> d;
    private final boolean e;
    private final boolean f;

    /* renamed from: vub$a */
    /* compiled from: TypeCheckerContext.kt */
    public enum a {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* renamed from: vub$b */
    /* compiled from: TypeCheckerContext.kt */
    public enum b {
        TAKE_FIRST_FOR_SUBTYPING,
        FORCE_NOT_SUBTYPE,
        CHECK_ANY_OF_THEM,
        INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
    }

    /* renamed from: vub$c */
    /* compiled from: TypeCheckerContext.kt */
    public static abstract class c {

        /* renamed from: vub$c$a */
        /* compiled from: TypeCheckerContext.kt */
        public static final class a extends c {
            public static final a a = new a();

            private a() {
                super(null);
            }

            public Etb a(C7706xtb xtb) {
                C7471uYa.b(xtb, C1325gg.TYPE);
                return C7430ttb.c(xtb);
            }
        }

        /* renamed from: vub$c$b */
        /* compiled from: TypeCheckerContext.kt */
        public static final class b extends c {
            private final _tb a;

            public b(_tb _tb) {
                C7471uYa.b(_tb, "substitutor");
                super(null);
                this.a = _tb;
            }

            public Etb a(C7706xtb xtb) {
                C7471uYa.b(xtb, C1325gg.TYPE);
                C7706xtb a2 = this.a.a((C7706xtb) C7430ttb.c(xtb), C6473fub.INVARIANT);
                C7471uYa.a((Object) a2, "substitutor.safeSubstitu…le(), Variance.INVARIANT)");
                return Xtb.a(a2);
            }
        }

        /* renamed from: vub$c$c reason: collision with other inner class name */
        /* compiled from: TypeCheckerContext.kt */
        public static final class C0185c extends c {
            public static final C0185c a = new C0185c();

            private C0185c() {
                super(null);
            }

            public Void a(C7706xtb xtb) {
                C7471uYa.b(xtb, C1325gg.TYPE);
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: vub$c$d */
        /* compiled from: TypeCheckerContext.kt */
        public static final class d extends c {
            public static final d a = new d();

            private d() {
                super(null);
            }

            public Etb a(C7706xtb xtb) {
                C7471uYa.b(xtb, C1325gg.TYPE);
                return C7430ttb.d(xtb);
            }
        }

        private c() {
        }

        public abstract Etb a(C7706xtb xtb);

        public /* synthetic */ c(C7264rYa rya) {
            this();
        }
    }

    public C7570vub(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }

    public Boolean a(C6405eub eub, C6405eub eub2) {
        C7471uYa.b(eub, "subType");
        C7471uYa.b(eub2, "superType");
        return null;
    }

    public /* synthetic */ C7570vub(boolean z, boolean z2, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        this(z, z2);
    }

    /* access modifiers changed from: private */
    public final void c() {
        ArrayDeque<Etb> arrayDeque = this.c;
        if (arrayDeque != null) {
            arrayDeque.clear();
            Set<Etb> set = this.d;
            if (set != null) {
                set.clear();
                this.b = false;
                return;
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.a();
        throw null;
    }

    /* access modifiers changed from: private */
    public final void d() {
        boolean z = !this.b;
        if (!TVa.a || z) {
            this.b = true;
            if (this.c == null) {
                this.c = new ArrayDeque<>(4);
            }
            if (this.d == null) {
                this.d = Gvb.b.a();
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public b b() {
        return b.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN;
    }

    public final boolean a() {
        return this.e;
    }

    public boolean a(Ptb ptb, Ptb ptb2) {
        C7471uYa.b(ptb, "a");
        C7471uYa.b(ptb2, "b");
        return C7471uYa.a((Object) ptb, (Object) ptb2);
    }

    public a a(Etb etb, C6949mub mub) {
        C7471uYa.b(etb, "subType");
        C7471uYa.b(mub, "superType");
        return a.CHECK_SUBTYPE_AND_LOWER;
    }

    public final boolean a(C6405eub eub) {
        C7471uYa.b(eub, "$this$isAllowedTypeVariable");
        if (this.f) {
            eub.za();
        }
        return false;
    }
}
