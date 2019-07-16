package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* renamed from: _d reason: default package */
/* compiled from: FrameworkSQLiteDatabase */
class _d implements Ud {
    private static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] b = new String[0];
    private final SQLiteDatabase c;

    _d(SQLiteDatabase sQLiteDatabase) {
        this.c = sQLiteDatabase;
    }

    public List<Pair<String, String>> A() {
        return this.c.getAttachedDbs();
    }

    public void B() {
        this.c.setTransactionSuccessful();
    }

    public void C() {
        this.c.endTransaction();
    }

    public boolean E() {
        return this.c.inTransaction();
    }

    public void a(SQLiteTransactionListener sQLiteTransactionListener) {
        this.c.beginTransactionWithListener(sQLiteTransactionListener);
    }

    public void close() throws IOException {
        this.c.close();
    }

    public void g(String str) throws SQLException {
        this.c.execSQL(str);
    }

    public String getPath() {
        return this.c.getPath();
    }

    public Yd h(String str) {
        return new C1261ee(this.c.compileStatement(str));
    }

    public Cursor i(String str) {
        return a((Xd) new Td(str));
    }

    public boolean isOpen() {
        return this.c.isOpen();
    }

    public void z() {
        this.c.beginTransaction();
    }

    public Cursor a(Xd xd) {
        return this.c.rawQueryWithFactory(new Zd(this, xd), xd.a(), b, null);
    }

    public int a(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" WHERE ");
            sb2.append(str2);
            str3 = sb2.toString();
        }
        sb.append(str3);
        Yd h = h(sb.toString());
        Td.a(h, objArr);
        return h.v();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.c == sQLiteDatabase;
    }
}
