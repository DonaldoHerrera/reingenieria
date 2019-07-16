package defpackage;

import java.util.Comparator;

/* renamed from: zBb reason: default package and case insensitive filesystem */
/* compiled from: OffsetDateTime */
class C7791zBb implements Comparator<BBb> {
    C7791zBb() {
    }

    /* renamed from: a */
    public int compare(BBb bBb, BBb bBb2) {
        int a = C6355eDb.a(bBb.toEpochSecond(), bBb2.toEpochSecond());
        return a == 0 ? C6355eDb.a((long) bBb.J(), (long) bBb2.J()) : a;
    }
}
