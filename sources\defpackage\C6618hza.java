package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: hza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvidePropellerFactory */
public final class C6618hza implements C4961HMa<C5500ZKa> {
    private final C7054oVa<SQLiteDatabase> a;

    public C6618hza(C7054oVa<SQLiteDatabase> ova) {
        this.a = ova;
    }

    public static C6618hza a(C7054oVa<SQLiteDatabase> ova) {
        return new C6618hza(ova);
    }

    public static C5500ZKa a(SQLiteDatabase sQLiteDatabase) {
        C5500ZKa b = C7853zya.b(sQLiteDatabase);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C5500ZKa get() {
        return a((SQLiteDatabase) this.a.get());
    }
}
