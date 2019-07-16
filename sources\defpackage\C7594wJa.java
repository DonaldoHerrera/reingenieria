package defpackage;

/* renamed from: wJa reason: default package and case insensitive filesystem */
/* compiled from: LegacyUniflow.kt */
public final class C7594wJa {
    public static final C6973nJa a(Exception exc) {
        C7471uYa.b(exc, "$this$legacyError");
        return new C6973nJa(exc);
    }

    public static /* synthetic */ APa a(APa aPa, _Xa _xa, int i, Object obj) {
        if ((i & 1) != 0) {
            _xa = C7387tJa.a;
        }
        return a(aPa, _xa);
    }

    public static final <T> APa<d<C6973nJa, T>> a(APa<T> aPa, _Xa<? super T, ? extends PXa<? extends APa<d<C6973nJa, T>>>> _xa) {
        C7471uYa.b(aPa, "$this$toLegacyPageResult");
        C7471uYa.b(_xa, "nextPageFunc");
        APa<d<C6973nJa, T>> i = aPa.h(new C7456uJa(_xa)).i(C7525vJa.a);
        C7471uYa.a((Object) i, "map { AsyncLoader.PageRe…)\n            }\n        }");
        return i;
    }
}
