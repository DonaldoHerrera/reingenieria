package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase */
public abstract class t {
    @Deprecated
    protected volatile Ud a;
    private Executor b;
    private Executor c;
    private Vd d;
    private final h e = d();
    private boolean f;
    boolean g;
    @Deprecated
    protected List<b> h;
    private final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> j = new ThreadLocal<>();
    private final Map<String, Object> k = new ConcurrentHashMap();

    /* compiled from: RoomDatabase */
    public static class a<T extends t> {
        private final Class<T> a;
        private final String b;
        private final Context c;
        private ArrayList<b> d;
        private Executor e;
        private Executor f;
        private defpackage.Vd.c g;
        private boolean h;
        private c i = c.AUTOMATIC;
        private boolean j;
        private boolean k = true;
        private boolean l;
        private final d m = new d();
        private Set<Integer> n;
        private Set<Integer> o;

        a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a<T> a(Kd... kdArr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (Kd kd : kdArr) {
                this.o.add(Integer.valueOf(kd.a));
                this.o.add(Integer.valueOf(kd.b));
            }
            this.m.a(kdArr);
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T b() {
            if (this.c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.a != null) {
                if (this.e == null && this.f == null) {
                    Executor b2 = E.b();
                    this.f = b2;
                    this.e = b2;
                } else {
                    Executor executor = this.e;
                    if (executor != null && this.f == null) {
                        this.f = executor;
                    } else if (this.e == null) {
                        Executor executor2 = this.f;
                        if (executor2 != null) {
                            this.e = executor2;
                        }
                    }
                }
                Set<Integer> set = this.o;
                if (!(set == null || this.n == null)) {
                    for (Integer num : set) {
                        if (this.n.contains(num)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                            sb.append(num);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                if (this.g == null) {
                    this.g = new C0520ce();
                }
                Context context = this.c;
                C0432a aVar = new C0432a(context, this.b, this.g, this.m, this.d, this.h, this.i.a(context), this.e, this.f, this.j, this.k, this.l, this.n);
                T t = (t) s.a(this.a, "_Impl");
                t.b(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public a<T> c() {
            this.k = false;
            this.l = true;
            return this;
        }

        public a<T> a() {
            this.h = true;
            return this;
        }

        public a<T> a(Executor executor) {
            this.e = executor;
            return this;
        }

        public a<T> a(b bVar) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(bVar);
            return this;
        }
    }

    /* compiled from: RoomDatabase */
    public static abstract class b {
        public void a(Ud ud) {
        }

        public void b(Ud ud) {
        }
    }

    /* compiled from: RoomDatabase */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* access modifiers changed from: 0000 */
        @SuppressLint({"NewApi"})
        public c a(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            if (VERSION.SDK_INT >= 16) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && !androidx.core.app.d.a(activityManager)) {
                    return WRITE_AHEAD_LOGGING;
                }
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase */
    public static class d {
        private C0516ca<C0516ca<Kd>> a = new C0516ca<>();

        public void a(Kd... kdArr) {
            for (Kd a2 : kdArr) {
                a(a2);
            }
        }

        private void a(Kd kd) {
            int i = kd.a;
            int i2 = kd.b;
            C0516ca caVar = (C0516ca) this.a.b(i);
            if (caVar == null) {
                caVar = new C0516ca();
                this.a.c(i, caVar);
            }
            Kd kd2 = (Kd) caVar.b(i2);
            if (kd2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(kd2);
                sb.append(" with ");
                sb.append(kd);
                Log.w("ROOM", sb.toString());
            }
            caVar.a(i2, kd);
        }

        public List<Kd> a(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return a(new ArrayList(), i2 > i, i, i2);
        }

        private List<Kd> a(List<Kd> list, boolean z, int i, int i2) {
            boolean z2;
            int i3;
            int i4;
            int i5 = z ? -1 : 1;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                C0516ca caVar = (C0516ca) this.a.b(i);
                if (caVar != null) {
                    int j = caVar.j();
                    z2 = false;
                    if (z) {
                        i4 = j - 1;
                        i3 = -1;
                    } else {
                        i3 = j;
                        i4 = 0;
                    }
                    while (true) {
                        if (i4 == i3) {
                            break;
                        }
                        int d = caVar.d(i4);
                        if (!z ? !(d < i2 || d >= i) : !(d > i2 || d <= i)) {
                            list.add(caVar.f(i4));
                            i = d;
                            z2 = true;
                            continue;
                            break;
                        }
                        i4 += i5;
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* access modifiers changed from: protected */
    public abstract Vd a(C0432a aVar);

    public void a() {
        if (!this.f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b(C0432a aVar) {
        this.d = a(aVar);
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            if (aVar.g == c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.d.a(z);
        }
        this.h = aVar.e;
        this.b = aVar.h;
        this.c = new E(aVar.i);
        this.f = aVar.f;
        this.g = z;
        if (aVar.j) {
            this.e.a(aVar.b, aVar.c);
        }
    }

    @Deprecated
    public void c() {
        a();
        Ud b2 = this.d.b();
        this.e.b(b2);
        b2.z();
    }

    /* access modifiers changed from: protected */
    public abstract h d();

    @Deprecated
    public void e() {
        this.d.b().C();
        if (!k()) {
            this.e.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public Lock f() {
        return this.i.readLock();
    }

    public h g() {
        return this.e;
    }

    public Vd h() {
        return this.d;
    }

    public Executor i() {
        return this.b;
    }

    public Executor j() {
        return this.c;
    }

    public boolean k() {
        return this.d.b().E();
    }

    public boolean l() {
        Ud ud = this.a;
        return ud != null && ud.isOpen();
    }

    @Deprecated
    public void m() {
        this.d.b().B();
    }

    public Cursor a(Xd xd) {
        a();
        b();
        return this.d.b().a(xd);
    }

    public Yd a(String str) {
        a();
        b();
        return this.d.b().h(str);
    }

    /* access modifiers changed from: protected */
    public void a(Ud ud) {
        this.e.a(ud);
    }

    public void b() {
        if (!k() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }
}
