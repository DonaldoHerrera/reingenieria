package defpackage;

import android.database.Cursor;

/* renamed from: wfa reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabase.kt */
final class C4696wfa<T, R> implements C7118pQa<Cursor, T> {
    final /* synthetic */ C6772kMa a;

    C4696wfa(C6772kMa kma) {
        this.a = kma;
    }

    /* renamed from: a */
    public final T apply(Cursor cursor) {
        C7471uYa.b(cursor, "it");
        return this.a.a(cursor);
    }
}
