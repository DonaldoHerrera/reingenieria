package defpackage;

import java.util.List;

/* renamed from: PV reason: default package */
/* compiled from: RepositoryExtensions.kt */
final class PV<T, R> implements C7118pQa<T, R> {
    public static final PV a = new PV();

    PV() {
    }

    /* renamed from: a */
    public final List<T> apply(Ida<T> ida) {
        C7471uYa.b(ida, "it");
        if (ida instanceof c) {
            return ((c) ida).a();
        }
        if (ida instanceof b) {
            b bVar = (b) ida;
            Kda a2 = bVar.a();
            if (a2 == null) {
                return bVar.b();
            }
            throw a2;
        } else if (ida instanceof a) {
            throw new IllegalStateException("Unexpected ListResponse of type Failure", ((a) ida).a());
        } else {
            throw new FVa();
        }
    }
}
