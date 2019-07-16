package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: be reason: default package and case insensitive filesystem */
/* compiled from: FrameworkSQLiteOpenHelper */
class C0489be implements Vd {
    private final a a;

    /* renamed from: be$a */
    /* compiled from: FrameworkSQLiteOpenHelper */
    static class a extends SQLiteOpenHelper {
        final _d[] a;
        final defpackage.Vd.a b;
        private boolean c;

        a(Context context, String str, _d[] _dVarArr, defpackage.Vd.a aVar) {
            super(context, str, null, aVar.a, new C0304ae(aVar, _dVarArr));
            this.b = aVar;
            this.a = _dVarArr;
        }

        /* access modifiers changed from: 0000 */
        public synchronized Ud a() {
            this.c = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.c) {
                close();
                return a();
            }
            return a(readableDatabase);
        }

        /* access modifiers changed from: 0000 */
        public synchronized Ud b() {
            this.c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.c) {
                close();
                return b();
            }
            return a(writableDatabase);
        }

        public synchronized void close() {
            super.close();
            this.a[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.b.a((Ud) a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.b.c(a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.a(a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.c) {
                this.b.d(a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.b(a(sQLiteDatabase), i, i2);
        }

        /* access modifiers changed from: 0000 */
        public _d a(SQLiteDatabase sQLiteDatabase) {
            return a(this.a, sQLiteDatabase);
        }

        static _d a(_d[] _dVarArr, SQLiteDatabase sQLiteDatabase) {
            _d _dVar = _dVarArr[0];
            if (_dVar == null || !_dVar.a(sQLiteDatabase)) {
                _dVarArr[0] = new _d(sQLiteDatabase);
            }
            return _dVarArr[0];
        }
    }

    C0489be(Context context, String str, defpackage.Vd.a aVar) {
        this.a = a(context, str, aVar);
    }

    private a a(Context context, String str, defpackage.Vd.a aVar) {
        return new a(context, str, new _d[1], aVar);
    }

    public Ud b() {
        return this.a.b();
    }

    public void close() {
        this.a.close();
    }

    public void a(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }

    public Ud a() {
        return this.a.a();
    }
}
