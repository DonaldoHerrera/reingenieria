package com.soundcloud.android.sync;

import android.os.ResultReceiver;
import java.util.List;

/* renamed from: com.soundcloud.android.sync.v reason: case insensitive filesystem */
/* compiled from: MultiJobRequestFactory */
class C6138v {
    private final C7054oVa<C5327TLa> a;

    C6138v(C7054oVa<C5327TLa> ova) {
        a(ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public C6137u a(List<W> list, ResultReceiver resultReceiver, boolean z) {
        a(list, 1);
        List list2 = list;
        a(resultReceiver, 2);
        ResultReceiver resultReceiver2 = resultReceiver;
        Object obj = this.a.get();
        a(obj, 4);
        return new C6137u(list2, resultReceiver2, z, (C5327TLa) obj);
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
