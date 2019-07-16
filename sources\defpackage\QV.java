package defpackage;

import java.util.List;

/* renamed from: QV reason: default package */
/* compiled from: RepositoryExtensions.kt */
public final class QV {
    public static final <T> APa<Ida<T>> a(APa<Ida<T>> aPa, MV mv) {
        C7471uYa.b(aPa, "$this$combineWithFetchResult");
        C7471uYa.b(mv, "fetchResult");
        APa<Ida<T>> h = C4757Aua.a(aPa).h(new NV(mv));
        C7471uYa.a((Object) h, "indexed().map { (index, …eResponse\n        }\n    }");
        return h;
    }

    public static final <T> APa<Pda<T>> a(APa<Pda<T>> aPa, C3508cda cda, MV mv) {
        C7471uYa.b(aPa, "$this$combineWithFetchResult");
        C7471uYa.b(cda, "requestedUrn");
        C7471uYa.b(mv, "fetchResult");
        APa<Pda<T>> h = C4757Aua.a(aPa).h(new OV(mv, cda));
        C7471uYa.a((Object) h, "indexed().map { (index, …eResponse\n        }\n    }");
        return h;
    }

    public static final <T> APa<List<T>> a(APa<Ida<T>> aPa) {
        C7471uYa.b(aPa, "$this$unwrapResponse");
        APa<List<T>> h = aPa.h(PV.a);
        C7471uYa.a((Object) h, "map {\n        when (it) …xception)\n        }\n    }");
        return h;
    }
}
