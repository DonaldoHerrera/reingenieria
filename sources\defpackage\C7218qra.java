package defpackage;

import java.util.List;

/* renamed from: qra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsViewModel.kt */
public final class C7218qra {
    private final C6532gqa a;
    private final List<e> b;
    private final f c;
    private final d d;
    private final C4891FEa e;

    public C7218qra(C6532gqa gqa, List<e> list, f fVar, d dVar, C4891FEa fEa) {
        C7471uYa.b(gqa, "metadata");
        C7471uYa.b(list, "tracks");
        C7471uYa.b(fEa, "emptyStatus");
        this.a = gqa;
        this.b = list;
        this.c = fVar;
        this.d = dVar;
        this.e = fEa;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<cqa$e>, for r5v0, types: [java.util.List] */
    public static /* synthetic */ C7218qra a(C7218qra qra, C6532gqa gqa, List<e> list, f fVar, d dVar, C4891FEa fEa, int i, Object obj) {
        if ((i & 1) != 0) {
            gqa = qra.a;
        }
        if ((i & 2) != 0) {
            list = qra.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            fVar = qra.c;
        }
        f fVar2 = fVar;
        if ((i & 8) != 0) {
            dVar = qra.d;
        }
        d dVar2 = dVar;
        if ((i & 16) != 0) {
            fEa = qra.e;
        }
        return qra.a(gqa, list2, fVar2, dVar2, fEa);
    }

    public final C6532gqa a() {
        return this.a;
    }

    public final C7218qra a(C6532gqa gqa, List<e> list, f fVar, d dVar, C4891FEa fEa) {
        C7471uYa.b(gqa, "metadata");
        C7471uYa.b(list, "tracks");
        C7471uYa.b(fEa, "emptyStatus");
        C7218qra qra = new C7218qra(gqa, list, fVar, dVar, fEa);
        return qra;
    }

    public final C4891FEa b() {
        return this.e;
    }

    public final C6532gqa c() {
        return this.a;
    }

    public final d d() {
        return this.d;
    }

    public final List<e> e() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7218qra) {
                C7218qra qra = (C7218qra) obj;
                if (C7471uYa.a((Object) this.a, (Object) qra.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) qra.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) qra.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) qra.d)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final f f() {
        return this.c;
    }

    public int hashCode() {
        C6532gqa gqa = this.a;
        int i = 0;
        int hashCode = (gqa != null ? gqa.hashCode() : 0) * 31;
        List<e> list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        f fVar = this.c;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        d dVar = this.d;
        int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C4891FEa fEa = this.e;
        if (fEa != null) {
            i = fEa.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistDetailsViewModel(metadata=");
        sb.append(this.a);
        sb.append(", tracks=");
        sb.append(this.b);
        sb.append(", upsellItem=");
        sb.append(this.c);
        sb.append(", otherPlaylistsItem=");
        sb.append(this.d);
        sb.append(", emptyStatus=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
