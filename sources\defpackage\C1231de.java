package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: de reason: default package and case insensitive filesystem */
/* compiled from: FrameworkSQLiteProgram */
class C1231de implements Wd {
    private final SQLiteProgram a;

    C1231de(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    public void a(int i, long j) {
        this.a.bindLong(i, j);
    }

    public void c(int i) {
        this.a.bindNull(i);
    }

    public void close() {
        this.a.close();
    }

    public void a(int i, double d) {
        this.a.bindDouble(i, d);
    }

    public void a(int i, String str) {
        this.a.bindString(i, str);
    }

    public void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }
}
