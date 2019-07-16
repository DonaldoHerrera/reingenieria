package defpackage;

/* renamed from: LLa reason: default package and case insensitive filesystem */
/* compiled from: Column */
public class C5085LLa {
    private final String a;
    private final Class<?> b;
    private final String c;
    private final String d;

    protected C5085LLa(C5116MLa mLa, String str, Class cls) {
        this.a = str;
        StringBuilder sb = new StringBuilder();
        sb.append(mLa.name());
        sb.append(".");
        sb.append(str);
        this.c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mLa.name());
        sb2.append("_");
        sb2.append(str);
        this.d = sb2.toString();
        if (a(cls)) {
            this.b = cls;
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unsupported column type ");
        sb3.append(cls);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static C5085LLa a(C5116MLa mLa, String str, Class<?> cls) {
        return new C5085LLa(mLa, str, cls);
    }

    public String b() {
        return this.d;
    }

    public Class<?> c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public String toString() {
        return this.c;
    }

    private boolean a(Class cls) {
        return cls == Long.class || cls == String.class || cls == Boolean.class || cls == Double.class;
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(" AS ");
        sb.append(str);
        return sb.toString();
    }

    public String a() {
        return a(this.d);
    }
}
