package defpackage;

import java.util.Map;

/* renamed from: tDb reason: default package and case insensitive filesystem */
/* compiled from: TemporalField */
public interface C7381tDb {
    <R extends C6967nDb> R a(R r, long j);

    C7036oDb a(Map<C7381tDb, Long> map, C7036oDb odb, XCb xCb);

    boolean a(C7036oDb odb);

    FDb b(C7036oDb odb);

    long c(C7036oDb odb);

    boolean isDateBased();

    boolean isTimeBased();

    FDb range();
}
