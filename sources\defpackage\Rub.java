package defpackage;

/* renamed from: Rub reason: default package */
/* compiled from: modifierChecks.kt */
public abstract class Rub {
    private final boolean a;

    /* renamed from: Rub$a */
    /* compiled from: modifierChecks.kt */
    public static final class a extends Rub {
        public static final a b = new a();

        private a() {
            super(false, null);
        }
    }

    /* renamed from: Rub$b */
    /* compiled from: modifierChecks.kt */
    public static final class b extends Rub {
        private final String b;

        public b(String str) {
            C7471uYa.b(str, "error");
            super(false, null);
            this.b = str;
        }
    }

    /* renamed from: Rub$c */
    /* compiled from: modifierChecks.kt */
    public static final class c extends Rub {
        public static final c b = new c();

        private c() {
            super(true, null);
        }
    }

    private Rub(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public /* synthetic */ Rub(boolean z, C7264rYa rya) {
        this(z);
    }
}
