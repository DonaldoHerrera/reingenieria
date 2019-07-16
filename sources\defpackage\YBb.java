package defpackage;

import java.util.Comparator;

/* renamed from: YBb reason: default package */
/* compiled from: ChronoLocalDateTime */
class YBb implements Comparator<ZBb<?>> {
    YBb() {
    }

    /* renamed from: a */
    public int compare(ZBb<?> zBb, ZBb<?> zBb2) {
        int a = C6355eDb.a(zBb.toLocalDate().toEpochDay(), zBb2.toLocalDate().toEpochDay());
        return a == 0 ? C6355eDb.a(zBb.toLocalTime().M(), zBb2.toLocalTime().M()) : a;
    }
}
