package defpackage;

/* renamed from: Xub reason: default package */
/* compiled from: modifierChecks.kt */
public abstract class Xub implements Qub {
    private final String a;

    /* renamed from: Xub$a */
    /* compiled from: modifierChecks.kt */
    public static final class a extends Xub {
        public static final a b = new a();

        private a() {
            super("must be a member function", null);
        }

        public boolean b(C5582adb adb) {
            C7471uYa.b(adb, "functionDescriptor");
            return adb.k() != null;
        }
    }

    /* renamed from: Xub$b */
    /* compiled from: modifierChecks.kt */
    public static final class b extends Xub {
        public static final b b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        public boolean b(C5582adb adb) {
            C7471uYa.b(adb, "functionDescriptor");
            return (adb.k() == null && adb.l() == null) ? false : true;
        }
    }

    private Xub(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public /* synthetic */ Xub(String str, C7264rYa rya) {
        this(str);
    }

    public String a(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        return defpackage.Qub.a.a(this, adb);
    }
}
