package defpackage;

/* renamed from: Dvb reason: default package */
/* compiled from: Jsr305State.kt */
public enum Dvb {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final a e = null;
    private final String f;

    /* renamed from: Dvb$a */
    /* compiled from: Jsr305State.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        e = new a(null);
    }

    private Dvb(String str) {
        this.f = str;
    }

    public final String a() {
        return this.f;
    }

    public final boolean b() {
        return this == IGNORE;
    }

    public final boolean c() {
        return this == WARN;
    }
}
