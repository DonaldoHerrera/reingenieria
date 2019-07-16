package androidx.lifecycle;

/* compiled from: ViewModelProvider */
public class u {
    private final a a;
    private final v b;

    /* compiled from: ViewModelProvider */
    public interface a {
        <T extends t> T a(Class<T> cls);
    }

    public u(v vVar, a aVar) {
        this.a = aVar;
        this.b = vVar;
    }

    public <T extends t> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends t> T a(String str, Class<T> cls) {
        T a2 = this.b.a(str);
        if (cls.isInstance(a2)) {
            return a2;
        }
        T a3 = this.a.a(cls);
        this.b.a(str, a3);
        return a3;
    }
}
