package com.soundcloud.android.sync;

import com.soundcloud.android.accounts.C2526g;

/* renamed from: com.soundcloud.android.sync.p reason: case insensitive filesystem */
/* compiled from: BackgroundSyncerFactory */
class C6133p {
    private final C7054oVa<C2526g> a;
    private final C7054oVa<la> b;
    private final C7054oVa<oa> c;
    private final C7054oVa<C4806CMa<K>> d;

    C6133p(C7054oVa<C2526g> ova, C7054oVa<la> ova2, C7054oVa<oa> ova3, C7054oVa<C4806CMa<K>> ova4) {
        a(ova, 1);
        this.a = ova;
        a(ova2, 2);
        this.b = ova2;
        a(ova3, 3);
        this.c = ova3;
        a(ova4, 4);
        this.d = ova4;
    }

    /* access modifiers changed from: 0000 */
    public C6132o a(BackgroundSyncResultReceiver backgroundSyncResultReceiver) {
        Object obj = this.a.get();
        a(obj, 1);
        C2526g gVar = (C2526g) obj;
        Object obj2 = this.b.get();
        a(obj2, 2);
        la laVar = (la) obj2;
        Object obj3 = this.c.get();
        a(obj3, 3);
        oa oaVar = (oa) obj3;
        Object obj4 = this.d.get();
        a(obj4, 4);
        C4806CMa cMa = (C4806CMa) obj4;
        a(backgroundSyncResultReceiver, 5);
        C6132o oVar = new C6132o(gVar, laVar, oaVar, cMa, backgroundSyncResultReceiver);
        return oVar;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
