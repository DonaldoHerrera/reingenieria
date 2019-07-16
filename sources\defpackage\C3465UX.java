package defpackage;

/* renamed from: UX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_FullDiscoveryCard */
final class C3465UX extends b {
    private final f c;
    private final c d;

    C3465UX(f fVar, c cVar) {
        this.c = fVar;
        this.d = cVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        f fVar = this.c;
        if (fVar != null ? fVar.equals(bVar.a()) : bVar.a() == null) {
            c cVar = this.d;
            if (cVar != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        f fVar = this.c;
        int i = 0;
        int hashCode = ((fVar == null ? 0 : fVar.hashCode()) ^ 1000003) * 1000003;
        c cVar = this.d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FullDiscoveryCard{single_content_selection_card=");
        sb.append(this.c);
        sb.append(", multiple_content_selection_card=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public f a() {
        return this.c;
    }

    public c b() {
        return this.d;
    }
}
