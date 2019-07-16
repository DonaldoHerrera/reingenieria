package com.soundcloud.android.sync;

import android.os.ResultReceiver;

/* compiled from: SingleJobRequestFactory */
public class A {
    private final C7054oVa<C5327TLa> a;

    public A(C7054oVa<C5327TLa> ova) {
        a(ova, 1);
        this.a = ova;
    }

    public C6142z a(r rVar, String str, boolean z, ResultReceiver resultReceiver) {
        a(rVar, 1);
        r rVar2 = rVar;
        a(str, 2);
        String str2 = str;
        a(resultReceiver, 4);
        ResultReceiver resultReceiver2 = resultReceiver;
        Object obj = this.a.get();
        a(obj, 5);
        C6142z zVar = new C6142z(rVar2, str2, z, resultReceiver2, (C5327TLa) obj);
        return zVar;
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
