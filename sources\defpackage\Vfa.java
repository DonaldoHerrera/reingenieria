package defpackage;

import java.util.Set;

/* renamed from: Vfa reason: default package */
/* compiled from: Result.kt */
public final class Vfa<Key, Type> extends Wfa<Key, Type> {
    private final Type a;
    private final Set<Key> b;
    private final C4538dga c;

    public Vfa(Type type, Set<? extends Key> set, C4538dga dga) {
        C7471uYa.b(set, "missingKeys");
        super(null);
        this.a = type;
        this.b = set;
        this.c = dga;
    }

    public final Type a() {
        return this.a;
    }

    public final Set<Key> b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Vfa) {
                Vfa vfa = (Vfa) obj;
                if (C7471uYa.a((Object) this.a, (Object) vfa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) vfa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Type type = this.a;
        int i = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        Set<Key> set = this.b;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        C4538dga dga = this.c;
        if (dga != null) {
            i = dga.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partial(data=");
        sb.append(this.a);
        sb.append(", missingKeys=");
        sb.append(this.b);
        sb.append(", exception=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Vfa(Object obj, Set set, C4538dga dga, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            dga = null;
        }
        this(obj, set, dga);
    }
}
