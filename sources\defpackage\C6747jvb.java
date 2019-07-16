package defpackage;

/* renamed from: jvb reason: default package and case insensitive filesystem */
/* compiled from: modifierChecks.kt */
public abstract class C6747jvb implements Qub {
    private final String a;

    /* renamed from: jvb$a */
    /* compiled from: modifierChecks.kt */
    public static final class a extends C6747jvb {
        private final int b;

        public a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? "s" : "");
            super(sb.toString(), null);
            this.b = i;
        }

        public boolean b(C5582adb adb) {
            C7471uYa.b(adb, "functionDescriptor");
            return adb.f().size() >= this.b;
        }
    }

    /* renamed from: jvb$b */
    /* compiled from: modifierChecks.kt */
    public static final class b extends C6747jvb {
        private final int b;

        public b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have exactly ");
            sb.append(i);
            sb.append(" value parameters");
            super(sb.toString(), null);
            this.b = i;
        }

        public boolean b(C5582adb adb) {
            C7471uYa.b(adb, "functionDescriptor");
            return adb.f().size() == this.b;
        }
    }

    /* renamed from: jvb$c */
    /* compiled from: modifierChecks.kt */
    public static final class c extends C6747jvb {
        public static final c b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        public boolean b(C5582adb adb) {
            C7471uYa.b(adb, "functionDescriptor");
            return adb.f().isEmpty();
        }
    }

    /* renamed from: jvb$d */
    /* compiled from: modifierChecks.kt */
    public static final class d extends C6747jvb {
        public static final d b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        public boolean b(C5582adb adb) {
            C7471uYa.b(adb, "functionDescriptor");
            return adb.f().size() == 1;
        }
    }

    private C6747jvb(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public /* synthetic */ C6747jvb(String str, C7264rYa rya) {
        this(str);
    }

    public String a(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        return defpackage.Qub.a.a(this, adb);
    }
}
