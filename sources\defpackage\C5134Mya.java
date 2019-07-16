package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: Mya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideDebugPropellerRxWrapperFactory */
public final class C5134Mya implements C4961HMa<C4898FLa> {
    private final C7054oVa<SQLiteDatabase> a;

    public static C4898FLa a(SQLiteDatabase sQLiteDatabase) {
        C4898FLa a2 = C7853zya.a(sQLiteDatabase);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C4898FLa get() {
        return a((SQLiteDatabase) this.a.get());
    }
}
