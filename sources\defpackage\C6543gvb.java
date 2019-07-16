package defpackage;

/* renamed from: gvb reason: default package and case insensitive filesystem */
/* compiled from: modifierChecks.kt */
public abstract class C6543gvb implements Qub {
    private final String a;
    private final String b;
    private final _Xa<C5301Sbb, C7706xtb> c;

    /* renamed from: gvb$a */
    /* compiled from: modifierChecks.kt */
    public static final class a extends C6543gvb {
        public static final a d = new a();

        private a() {
            super("Boolean", C6475fvb.a, null);
        }
    }

    /* renamed from: gvb$b */
    /* compiled from: modifierChecks.kt */
    public static final class b extends C6543gvb {
        public static final b d = new b();

        private b() {
            super("Int", C6611hvb.a, null);
        }
    }

    /* renamed from: gvb$c */
    /* compiled from: modifierChecks.kt */
    public static final class c extends C6543gvb {
        public static final c d = new c();

        private c() {
            super("Unit", C6679ivb.a, null);
        }
    }

    private C6543gvb(String str, _Xa<? super C5301Sbb, ? extends C7706xtb> _xa) {
        this.b = str;
        this.c = _xa;
        StringBuilder sb = new StringBuilder();
        sb.append("must return ");
        sb.append(this.b);
        this.a = sb.toString();
    }

    public String a(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        return defpackage.Qub.a.a(this, adb);
    }

    public boolean b(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        return C7471uYa.a((Object) adb.a(), (Object) (C7706xtb) this.c.invoke(C7148pqb.b((C5272Rcb) adb)));
    }

    public String a() {
        return this.a;
    }

    public /* synthetic */ C6543gvb(String str, _Xa _xa, C7264rYa rya) {
        this(str, _xa);
    }
}
