package defpackage;

/* renamed from: Ufa reason: default package */
/* compiled from: ModelWithMetadata.kt */
public final class Ufa<Model> {
    private final Model a;
    private final long b;

    private Ufa(Model model, long j) {
        this.a = model;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final Model b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ufa) {
                Ufa ufa = (Ufa) obj;
                if (C7471uYa.a((Object) this.a, (Object) ufa.a)) {
                    if (this.b == ufa.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Model model = this.a;
        int hashCode = (model != null ? model.hashCode() : 0) * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ModelWithMetadata(model=");
        sb.append(this.a);
        sb.append(", metadata=");
        sb.append(Tfa.c(this.b));
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Ufa(Object obj, long j, C7264rYa rya) {
        this(obj, j);
    }
}
