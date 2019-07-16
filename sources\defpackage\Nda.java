package defpackage;

import java.util.List;

/* renamed from: Nda reason: default package */
/* compiled from: ResponseMappings.kt */
public final class Nda {
    public static final <T> C7531vPa<T> a(APa<Pda<T>> aPa) {
        C7471uYa.b(aPa, "$this$asMaybe");
        C7531vPa<T> c = aPa.g().c((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) Mda.a);
        C7471uYa.a((Object) c, "firstOrError().flatMapMa…        }\n        }\n    }");
        return c;
    }

    public static final <T> List<T> a(Ida<T> ida) {
        C7471uYa.b(ida, "$this$getItemsOrThrow");
        if (ida instanceof c) {
            return ((c) ida).a();
        }
        if (ida instanceof b) {
            return ((b) ida).b();
        }
        if (ida instanceof a) {
            throw ((a) ida).a();
        }
        throw new FVa();
    }
}
