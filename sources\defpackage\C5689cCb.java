package defpackage;

import java.util.Comparator;

/* renamed from: cCb reason: default package and case insensitive filesystem */
/* compiled from: ChronoZonedDateTime */
class C5689cCb implements Comparator<C6353eCb<?>> {
    C5689cCb() {
    }

    /* renamed from: a */
    public int compare(C6353eCb<?> ecb, C6353eCb<?> ecb2) {
        int a = C6355eDb.a(ecb.toEpochSecond(), ecb2.toEpochSecond());
        return a == 0 ? C6355eDb.a(ecb.toLocalTime().M(), ecb2.toLocalTime().M()) : a;
    }
}
