package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: cMa reason: default package and case insensitive filesystem */
/* compiled from: BriteDatabase */
public final class C5700cMa implements Closeable {
    private final Vd a;
    private final defpackage.C6636iMa.b b;
    private final FPa<defpackage.C6636iMa.c, defpackage.C6636iMa.c> c;
    final ThreadLocal<b> d = new ThreadLocal<>();
    private final C6985nVa<Set<String>> e = C6781kVa.s();
    private final c f = new C5564aMa(this);
    private final C6776kQa<Object> g = new C5632bMa(this);
    private final HPa h;
    volatile boolean i;

    /* renamed from: cMa$a */
    /* compiled from: BriteDatabase */
    final class a extends defpackage.C6636iMa.c implements C7118pQa<Set<String>, defpackage.C6636iMa.c>, C7256rQa<Set<String>> {
        private final Iterable<String> a;
        private final Xd b;

        a(Iterable<String> iterable, Xd xd) {
            this.a = iterable;
            this.b = xd;
        }

        public Cursor a() {
            if (C5700cMa.this.d.get() == null) {
                Cursor a2 = C5700cMa.this.a().a(this.b);
                if (C5700cMa.this.i) {
                    C5700cMa.this.a("QUERY\n  tables: %s\n  sql: %s", this.a, C5700cMa.a(this.b.a()));
                }
                return a2;
            }
            throw new IllegalStateException("Cannot execute observable query in a transaction.");
        }

        public defpackage.C6636iMa.c a(Set<String> set) {
            return this;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
            a((Set) obj);
            return this;
        }

        /* renamed from: b */
        public boolean test(Set<String> set) {
            for (String contains : this.a) {
                if (set.contains(contains)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return this.b.a();
        }
    }

    /* renamed from: cMa$b */
    /* compiled from: BriteDatabase */
    static final class b extends LinkedHashSet<String> implements SQLiteTransactionListener {
        final b a;
        boolean b;

        b(b bVar) {
            this.a = bVar;
        }

        public void onBegin() {
        }

        public void onCommit() {
            this.b = true;
        }

        public void onRollback() {
        }

        public String toString() {
            String format = String.format("%08x", new Object[]{Integer.valueOf(System.identityHashCode(this))});
            if (this.a == null) {
                return format;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(" [");
            sb.append(this.a.toString());
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: cMa$c */
    /* compiled from: BriteDatabase */
    public interface c extends Closeable {
        void D();

        void end();
    }

    C5700cMa(Vd vd, defpackage.C6636iMa.b bVar, HPa hPa, FPa<defpackage.C6636iMa.c, defpackage.C6636iMa.c> fPa) {
        this.a = vd;
        this.b = bVar;
        this.h = hPa;
        this.c = fPa;
    }

    public Ud a() {
        return this.a.a();
    }

    public Ud b() {
        return this.a.b();
    }

    public c c() {
        b bVar = new b((b) this.d.get());
        this.d.set(bVar);
        if (this.i) {
            a("TXN BEGIN %s", bVar);
        }
        b().a((SQLiteTransactionListener) bVar);
        return this.f;
    }

    public void close() {
        this.a.close();
    }

    /* access modifiers changed from: 0000 */
    public void a(Set<String> set) {
        b bVar = (b) this.d.get();
        if (bVar != null) {
            bVar.addAll(set);
            return;
        }
        if (this.i) {
            a("TRIGGER %s", set);
        }
        this.e.a(set);
    }

    public int b(String str, Yd yd) {
        return b(Collections.singleton(str), yd);
    }

    public int b(Set<String> set, Yd yd) {
        if (this.i) {
            a("EXECUTE\n %s", yd);
        }
        int v = yd.v();
        if (v > 0) {
            a(set);
        }
        return v;
    }

    public C6364eMa a(String str, Xd xd) {
        return a(new a(Collections.singletonList(str), xd));
    }

    private C6364eMa a(a aVar) {
        if (this.d.get() == null) {
            return (C6364eMa) this.e.a((C7256rQa<? super T>) aVar).h(aVar).e(aVar).a(this.h).a(this.c).e(this.g).n(C6364eMa.a);
        }
        throw new IllegalStateException("Cannot create observable query in transaction. Use query() for a query inside a transaction.");
    }

    public Cursor a(Xd xd) {
        Cursor a2 = a().a(xd);
        if (this.i) {
            a("QUERY\n  sql: %s", a(xd.a()));
        }
        return a2;
    }

    public int a(String str, String str2, String... strArr) {
        Ud b2 = b();
        if (this.i) {
            a("DELETE\n  table: %s\n  whereClause: %s\n  whereArgs: %s", str, str2, Arrays.toString(strArr));
        }
        int a2 = b2.a(str, str2, strArr);
        if (this.i) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(a2);
            objArr[1] = a2 != 1 ? "rows" : "row";
            a("DELETE affected %s %s", objArr);
        }
        if (a2 > 0) {
            a(Collections.singleton(str));
        }
        return a2;
    }

    public long a(String str, Yd yd) {
        return a(Collections.singleton(str), yd);
    }

    public long a(Set<String> set, Yd yd) {
        if (this.i) {
            a("EXECUTE\n %s", yd);
        }
        long x = yd.x();
        if (x != -1) {
            a(set);
        }
        return x;
    }

    static String a(String str) {
        return str.replace("\n", "\n       ");
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.b.a(str);
    }
}
