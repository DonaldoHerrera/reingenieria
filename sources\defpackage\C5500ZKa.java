package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;

/* renamed from: ZKa reason: default package and case insensitive filesystem */
/* compiled from: PropellerDatabase */
public class C5500ZKa {
    /* access modifiers changed from: private */
    public final C5355UKa a;
    private final SQLiteDatabase b;
    private boolean c;

    /* renamed from: ZKa$a */
    /* compiled from: PropellerDatabase */
    public static abstract class a {
        /* access modifiers changed from: private */
        public final C6431fLa a = new C6431fLa();

        public abstract void b(C5500ZKa zKa);

        public C6431fLa a(C5500ZKa zKa) {
            b(zKa);
            return this.a;
        }

        public boolean a() {
            return this.a.b();
        }

        /* access modifiers changed from: 0000 */
        public void a(Exception exc) {
            this.a.a(new b(exc));
        }

        /* access modifiers changed from: protected */
        public <StepT extends C6499gLa> StepT a(StepT stept) {
            C5529_Ka a2 = stept.a();
            if (a2 == null) {
                return stept;
            }
            throw a2;
        }
    }

    /* renamed from: ZKa$b */
    /* compiled from: PropellerDatabase */
    static class b extends C5529_Ka {
        public b(Throwable th) {
            super("Transaction failed (terminated by exception)", th);
        }
    }

    public C5500ZKa(SQLiteDatabase sQLiteDatabase) {
        this(sQLiteDatabase, new C5384VKa());
    }

    private static void b(C6975nLa nla) {
        String str = "Propeller";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, nla.toString());
        }
    }

    private void c() {
        if (this.c && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Database access on main thread detected");
        }
    }

    private C5266RKa d(String str) {
        try {
            C5266RKa rKa = new C5266RKa(this.b.delete(str, "1", null));
            this.b.delete("SQLITE_SEQUENCE", "name = ?", new String[]{str});
            return rKa;
        } catch (SQLException e) {
            return C5266RKa.a(str, e);
        }
    }

    private static void e(String str) {
        String str2 = "Propeller";
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, str);
        }
    }

    public C5500ZKa(SQLiteDatabase sQLiteDatabase, C5355UKa uKa) {
        this.b = sQLiteDatabase;
        this.a = uKa;
    }

    private C5413WKa b(String str, ContentValues contentValues, int i) {
        a("INSERT INTO", str, contentValues.toString());
        try {
            return a(this.b.insertWithOnConflict(str, null, contentValues, i), str, contentValues, i);
        } catch (SQLException e) {
            return a(str, contentValues, i, e);
        }
    }

    /* access modifiers changed from: private */
    public C5266RKa c(C5116MLa mLa, ContentValues contentValues) {
        C5266RKa rKa;
        C6907mLa a2 = C6907mLa.a();
        Iterator it = mLa.a().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (contentValues.containsKey(str)) {
                a2.d(str, contentValues.get(str));
            }
        }
        if (a2.C() == null) {
            rKa = new C5266RKa(0);
        } else {
            rKa = a(mLa, contentValues, (C7113pLa) a2);
        }
        if (rKa.c() != 0) {
            return rKa;
        }
        C5413WKa a3 = a(mLa, contentValues);
        if (a3.b()) {
            return new C5266RKa(1);
        }
        rKa.a(a3.a());
        return rKa;
    }

    private static void a(String str, String str2, String str3) {
        String str4 = "Propeller";
        if (Log.isLoggable(str4, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" [");
            sb.append(str3);
            sb.append("]");
            Log.d(str4, sb.toString());
        }
    }

    public void a() {
        this.c = true;
    }

    public C5631bLa a(C6975nLa nla) {
        c();
        b(nla);
        long nanoTime = System.nanoTime();
        this.a.a(nla);
        C5326TKa tKa = new C5326TKa(this.b.rawQuery(nla.build(), nla.C()), nla.a() != null);
        this.a.a(nla, System.nanoTime() - nanoTime);
        return new C5631bLa(tKa);
    }

    public C5266RKa b(C5116MLa mLa, ContentValues contentValues) {
        a("UPSERT INTO", mLa.name(), contentValues.toString());
        long nanoTime = System.nanoTime();
        this.a.a(mLa, contentValues);
        C5266RKa c2 = c(mLa, contentValues);
        this.a.a(mLa, contentValues, c2, System.nanoTime() - nanoTime);
        return c2;
    }

    private C5266RKa b(String str, ContentValues contentValues, C7113pLa pla) {
        try {
            return new C5266RKa(this.b.update(str, contentValues, pla.D(), pla.C()));
        } catch (SQLException e) {
            return C5266RKa.a(str, e, contentValues);
        }
    }

    private C5266RKa b(String str, C7113pLa pla) {
        try {
            return new C5266RKa(this.b.delete(str, pla.D(), pla.C()));
        } catch (SQLException e) {
            return C5266RKa.a(str, e);
        }
    }

    private C5266RKa c(String str) {
        try {
            return new C5266RKa(this.b.delete(str, "1", null));
        } catch (SQLException e) {
            return C5266RKa.a(str, e);
        }
    }

    public C5631bLa a(String str, Object... objArr) {
        c();
        e(str);
        long nanoTime = System.nanoTime();
        this.a.c(str);
        C5326TKa tKa = new C5326TKa(this.b.rawQuery(str, C7044oLa.a(objArr)), false);
        this.a.c(str, System.nanoTime() - nanoTime);
        return new C5631bLa(tKa);
    }

    public C5266RKa b(String str) {
        c();
        a("TRUNCATE", str, (String) null);
        long nanoTime = System.nanoTime();
        this.a.a(str);
        C5266RKa d = d(str);
        this.a.a(str, System.nanoTime() - nanoTime);
        return d;
    }

    public C5413WKa a(C5116MLa mLa, ContentValues contentValues) {
        return a(mLa, contentValues, 5);
    }

    public boolean b() {
        try {
            return this.b.yieldIfContendedSafely();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public C5413WKa a(String str, ContentValues contentValues) {
        return a(str, contentValues, 5);
    }

    public C5413WKa a(C5116MLa mLa, ContentValues contentValues, int i) {
        return a(mLa.name(), contentValues, i);
    }

    public C5413WKa a(String str, ContentValues contentValues, int i) {
        c();
        long nanoTime = System.nanoTime();
        this.a.a(str, contentValues, i);
        C5413WKa b2 = b(str, contentValues, i);
        this.a.a(str, contentValues, i, b2, System.nanoTime() - nanoTime);
        return b2;
    }

    private C5413WKa a(String str, ContentValues contentValues, int i, SQLException sQLException) {
        return C5413WKa.a(str, i, sQLException, contentValues.toString());
    }

    private C5413WKa a(long j, String str, ContentValues contentValues, int i) {
        if (j == -1) {
            return C5413WKa.a(str, i, null, contentValues.toString());
        }
        return new C5413WKa(j);
    }

    /* access modifiers changed from: private */
    public C5413WKa a(long j, String str, C5054KLa kLa, int i) {
        if (j == -1) {
            return C5413WKa.a(str, i, null, kLa.toString());
        }
        return new C5413WKa(j);
    }

    public C6431fLa a(C5116MLa mLa, C5054KLa kLa) {
        return a(mLa.name(), kLa);
    }

    public C6431fLa a(String str, C5054KLa kLa) {
        return a(str, kLa, 5);
    }

    public C6431fLa a(C5116MLa mLa, C5054KLa kLa, int i) {
        return a(mLa.name(), kLa, i);
    }

    public C6431fLa a(String str, C5054KLa kLa, int i) {
        c();
        a("BULK INSERT INTO", str, kLa.toString());
        long nanoTime = System.nanoTime();
        this.a.b(str, kLa);
        C5442XKa xKa = new C5442XKa(this, new C5236QKa(this.b, str, kLa, i), str, kLa, i);
        C6431fLa a2 = a((a) xKa);
        this.a.a(str, kLa, a2, System.nanoTime() - nanoTime);
        return a2;
    }

    public C6431fLa a(C5116MLa mLa, Iterable<ContentValues> iterable) {
        c();
        long nanoTime = System.nanoTime();
        this.a.a(mLa, iterable);
        C6431fLa a2 = a((a) new C5471YKa(this, iterable, mLa));
        this.a.a(mLa, iterable, a2, System.nanoTime() - nanoTime);
        return a2;
    }

    public C5266RKa a(C5116MLa mLa, ContentValues contentValues, C7113pLa pla) {
        return a(mLa.name(), contentValues, pla);
    }

    public C5266RKa a(String str, ContentValues contentValues, C7113pLa pla) {
        c();
        a("UPDATE", str, contentValues.toString());
        long nanoTime = System.nanoTime();
        this.a.a(str, contentValues, pla);
        C5266RKa b2 = b(str, contentValues, pla);
        this.a.a(str, contentValues, pla, System.nanoTime() - nanoTime);
        return b2;
    }

    public C5266RKa a(C5116MLa mLa) {
        return a(mLa.name());
    }

    public C5266RKa a(String str) {
        c();
        a("DELETE FROM", str, (String) null);
        long nanoTime = System.nanoTime();
        this.a.b(str);
        C5266RKa c2 = c(str);
        this.a.b(str, System.nanoTime() - nanoTime);
        return c2;
    }

    public C5266RKa a(C5116MLa mLa, C7113pLa pla) {
        return a(mLa.name(), pla);
    }

    public C5266RKa a(String str, C7113pLa pla) {
        c();
        a("DELETE FROM", str, (String) null);
        long nanoTime = System.nanoTime();
        this.a.a(str, pla);
        C5266RKa b2 = b(str, pla);
        this.a.a(str, pla, System.nanoTime() - nanoTime);
        return b2;
    }

    public C6431fLa a(a aVar) {
        c();
        try {
            this.b.beginTransaction();
            aVar.a(this);
            if (aVar.a()) {
                this.b.setTransactionSuccessful();
            }
        } catch (Exception e) {
            e.printStackTrace();
            aVar.a(e);
        } catch (Throwable th) {
            this.b.endTransaction();
            throw th;
        }
        this.b.endTransaction();
        return aVar.a;
    }
}
