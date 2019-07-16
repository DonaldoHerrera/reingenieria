package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: Afa reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabase.kt */
public class C3929Afa {
    private final C5700cMa a;

    public C3929Afa(Vd vd, HPa hPa) {
        C7471uYa.b(vd, "databaseOpenHelper");
        C7471uYa.b(hPa, "scheduler");
        C5700cMa a2 = new a().a().a(vd, hPa);
        C7471uYa.a((Object) a2, "SqlBrite.Builder().build…aseOpenHelper, scheduler)");
        this.a = a2;
    }

    public Ud a() {
        Ud b = this.a.b();
        C7471uYa.a((Object) b, "briteDatabase.writableDatabase");
        return b;
    }

    public int b(String str, Yd yd) {
        C7471uYa.b(str, "table");
        C7471uYa.b(yd, "statement");
        return this.a.b(str, yd);
    }

    public long c(String str, Yd yd) {
        C7471uYa.b(str, "table");
        C7471uYa.b(yd, "statement");
        return (long) this.a.b(str, yd);
    }

    public IPa<Long> d(String str, Yd yd) {
        C7471uYa.b(str, "table");
        C7471uYa.b(yd, "statement");
        IPa<Long> c = IPa.c((Callable<? extends T>) new C4723zfa<Object>(this, str, yd));
        C7471uYa.a((Object) c, "Single.fromCallable { up…elete(table, statement) }");
        return c;
    }

    public long a(String str, Yd yd) {
        C7471uYa.b(str, "table");
        C7471uYa.b(yd, "statement");
        return this.a.a(str, yd);
    }

    public C6979nPa b(PXa<RVa> pXa) {
        C7471uYa.b(pXa, "runnable");
        C6979nPa a2 = C6979nPa.a((Callable<?>) new C4714yfa<Object>(this, pXa));
        C7471uYa.a((Object) a2, "Completable.fromCallable…InTransaction(runnable) }");
        return a2;
    }

    public <T> List<T> c(Xd xd, C6772kMa<T> kma) {
        Throwable th;
        C7471uYa.b(xd, "sqlDelightQuery");
        C7471uYa.b(kma, "itemMapper");
        ArrayList arrayList = new ArrayList();
        Cursor a2 = this.a.a(xd);
        while (a2.moveToNext()) {
            try {
                arrayList.add(kma.a(a2));
            } catch (Throwable th2) {
                BXa.a(a2, th);
                throw th2;
            }
        }
        RVa rVa = RVa.a;
        BXa.a(a2, null);
        return arrayList;
    }

    public <T> T d(Xd xd, C6772kMa<T> kma) {
        C7471uYa.b(xd, "sqlDelightQuery");
        C7471uYa.b(kma, "itemMapper");
        List c = c(xd, kma);
        if (c.size() == 1) {
            return c.get(0);
        }
        return null;
    }

    public int a(String str) {
        C7471uYa.b(str, "table");
        return this.a.a(str, null, new String[0]);
    }

    public <T> C7531vPa<T> b(Xd xd, C6772kMa<T> kma) {
        C7471uYa.b(xd, "sqlDelightQuery");
        C7471uYa.b(kma, "selectionItemMapper");
        C7531vPa<T> f = a(xd, kma).a((C7256rQa<? super T>) C4678ufa.a).f(C4687vfa.a);
        C7471uYa.a((Object) f, "executeAsyncQuery(sqlDel…}.map { list -> list[0] }");
        return f;
    }

    public void a(Runnable runnable) {
        C7471uYa.b(runnable, "runnable");
        a((PXa<RVa>) new C4705xfa<RVa>(runnable));
    }

    public void a(PXa<RVa> pXa) {
        C7471uYa.b(pXa, "runnable");
        c c = this.a.c();
        C7471uYa.a((Object) c, "briteDatabase.newTransaction()");
        try {
            pXa.d();
            c.D();
        } finally {
            c.end();
        }
    }

    public void a(String str, List<? extends Yd> list) {
        C7471uYa.b(str, "table");
        C7471uYa.b(list, "statements");
        for (Yd a2 : list) {
            this.a.a(str, a2);
        }
    }

    public void a(Xd xd) {
        C7471uYa.b(xd, "query");
        c(xd, (C6772kMa<T>) C4660sfa.a);
    }

    public <T> APa<List<T>> a(C6772kMa<T> kma, String str, Xd xd) {
        C7471uYa.b(kma, "mapper");
        C7471uYa.b(str, "tableName");
        C7471uYa.b(xd, "query");
        C6364eMa a2 = this.a.a(str, xd);
        C7471uYa.a((Object) a2, "briteDatabase.createQuery(tableName, query)");
        APa<List<T>> o = a2.o(new C4696wfa(kma));
        C7471uYa.a((Object) o, "queryObservable.mapToList { mapper.map(it) }");
        return o;
    }

    public <T> IPa<List<T>> a(Xd xd, C6772kMa<T> kma) {
        C7471uYa.b(xd, "sqlDelightQuery");
        C7471uYa.b(kma, "selectionItemMapper");
        IPa<List<T>> c = IPa.c((Callable<? extends T>) new C4669tfa<Object>(this, xd, kma));
        C7471uYa.a((Object) c, "Single.fromCallable { ex…y, selectionItemMapper) }");
        return c;
    }
}
