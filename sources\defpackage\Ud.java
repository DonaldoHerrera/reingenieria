package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: Ud reason: default package */
/* compiled from: SupportSQLiteDatabase */
public interface Ud extends Closeable {
    List<Pair<String, String>> A();

    void B();

    void C();

    boolean E();

    int a(String str, String str2, Object[] objArr);

    Cursor a(Xd xd);

    void a(SQLiteTransactionListener sQLiteTransactionListener);

    void g(String str) throws SQLException;

    String getPath();

    Yd h(String str);

    Cursor i(String str);

    boolean isOpen();

    void z();
}
