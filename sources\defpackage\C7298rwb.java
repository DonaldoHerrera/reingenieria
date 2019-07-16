package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: rwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaPackage.kt */
public final class C7298rwb extends C6817kwb implements Xib {
    private final C7349snb a;

    public C7298rwb(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        this.a = snb;
    }

    public Collection<Xib> F() {
        return C6918mWa.a();
    }

    public Void a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return null;
    }

    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7298rwb) && C7471uYa.a((Object) q(), (Object) ((C7298rwb) obj).q());
    }

    public int hashCode() {
        return q().hashCode();
    }

    public C7349snb q() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7298rwb.class.getName());
        sb.append(": ");
        sb.append(q());
        return sb.toString();
    }

    public Collection<Kib> a(_Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(_xa, "nameFilter");
        return C6918mWa.a();
    }

    public List<Eib> getAnnotations() {
        return C6918mWa.a();
    }
}
