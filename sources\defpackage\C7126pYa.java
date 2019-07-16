package defpackage;

import java.util.Collection;

/* renamed from: pYa reason: default package and case insensitive filesystem */
/* compiled from: ClassReference.kt */
public final class C7126pYa implements C7472uZa<Object>, C7057oYa {
    private final Class<?> a;

    public C7126pYa(Class<?> cls) {
        C7471uYa.b(cls, "jClass");
        this.a = cls;
    }

    private final Void b() {
        throw new OXa();
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7126pYa) && C7471uYa.a((Object) MXa.b(this), (Object) MXa.b((C7472uZa) obj));
    }

    public int hashCode() {
        return MXa.b(this).hashCode();
    }

    public Collection<C7679xZa<Object>> i() {
        b();
        throw null;
    }

    public Collection<C7403tZa<?>> j() {
        b();
        throw null;
    }

    public Collection<C7472uZa<?>> k() {
        b();
        throw null;
    }

    public String l() {
        b();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
