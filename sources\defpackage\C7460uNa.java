package defpackage;

/* renamed from: uNa reason: default package and case insensitive filesystem */
/* compiled from: Crash */
public abstract class C7460uNa {
    private final String a;
    private final String b;

    /* renamed from: uNa$a */
    /* compiled from: Crash */
    public static class a extends C7460uNa {
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    /* renamed from: uNa$b */
    /* compiled from: Crash */
    public static class b extends C7460uNa {
        public b(String str, String str2) {
            super(str, str2);
        }
    }

    public C7460uNa(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
