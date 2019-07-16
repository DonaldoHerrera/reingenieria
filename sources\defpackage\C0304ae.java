package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: ae reason: default package and case insensitive filesystem */
/* compiled from: FrameworkSQLiteOpenHelper */
class C0304ae implements DatabaseErrorHandler {
    final /* synthetic */ a a;
    final /* synthetic */ _d[] b;

    C0304ae(a aVar, _d[] _dVarArr) {
        this.a = aVar;
        this.b = _dVarArr;
    }

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        this.a.b(a.a(this.b, sQLiteDatabase));
    }
}
