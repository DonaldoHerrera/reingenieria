package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: ee reason: default package and case insensitive filesystem */
/* compiled from: FrameworkSQLiteStatement */
class C1261ee extends C1231de implements Yd {
    private final SQLiteStatement b;

    C1261ee(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public void execute() {
        this.b.execute();
    }

    public int v() {
        return this.b.executeUpdateDelete();
    }

    public long x() {
        return this.b.executeInsert();
    }
}
