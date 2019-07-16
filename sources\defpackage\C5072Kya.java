package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.soundcloud.android.properties.j;

/* renamed from: Kya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideDatabaseFactory */
public final class C5072Kya implements C4961HMa<SQLiteDatabase> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3469VY> b;
    private final C7054oVa<j> c;

    public C5072Kya(C7054oVa<Context> ova, C7054oVa<C3469VY> ova2, C7054oVa<j> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5072Kya a(C7054oVa<Context> ova, C7054oVa<C3469VY> ova2, C7054oVa<j> ova3) {
        return new C5072Kya(ova, ova2, ova3);
    }

    public static SQLiteDatabase a(Context context, C3469VY vy, j jVar) {
        SQLiteDatabase a2 = C7853zya.a(context, vy, jVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public SQLiteDatabase get() {
        return a((Context) this.a.get(), (C3469VY) this.b.get(), (j) this.c.get());
    }
}
