package defpackage;

import java.util.Collection;

/* renamed from: AYa reason: default package */
/* compiled from: PackageReference.kt */
public final class AYa implements C7057oYa {
    private final Class<?> a;
    private final String b;

    public AYa(Class<?> cls, String str) {
        C7471uYa.b(cls, "jClass");
        C7471uYa.b(str, "moduleName");
        this.a = cls;
        this.b = str;
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AYa) && C7471uYa.a((Object) a(), (Object) ((AYa) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public Collection<C7403tZa<?>> j() {
        throw new OXa();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
