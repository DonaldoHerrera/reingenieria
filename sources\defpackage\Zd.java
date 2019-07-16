package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;

/* renamed from: Zd reason: default package */
/* compiled from: FrameworkSQLiteDatabase */
class Zd implements CursorFactory {
    final /* synthetic */ Xd a;
    final /* synthetic */ _d b;

    Zd(_d _dVar, Xd xd) {
        this.b = _dVar;
        this.a = xd;
    }

    public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.a.a(new C1231de(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
