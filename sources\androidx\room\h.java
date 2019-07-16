package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker */
public class h {
    private static final String[] a = {"UPDATE", "DELETE", "INSERT"};
    final T<String, Integer> b;
    final String[] c;
    private Map<String, Set<String>> d;
    final t e;
    AtomicBoolean f = new AtomicBoolean(false);
    private volatile boolean g = false;
    volatile Yd h;
    private a i;
    private final f j;
    @SuppressLint({"RestrictedApi"})
    final J<b, c> k = new J<>();
    private p l;
    Runnable m = new g(this);

    /* compiled from: InvalidationTracker */
    static class a {
        final long[] a;
        final boolean[] b;
        final int[] c;
        boolean d;
        boolean e;

        a(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
            Arrays.fill(this.a, 0);
            Arrays.fill(this.b, false);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.a[i];
                    this.a[i] = 1 + j;
                    if (j == 0) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.a[i];
                    this.a[i] = j - 1;
                    if (j == 1) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public int[] a() {
            synchronized (this) {
                if (this.d) {
                    if (!this.e) {
                        int length = this.a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.a[i] > 0;
                                if (z != this.b[i]) {
                                    int[] iArr = this.c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.c[i] = 0;
                                }
                                this.b[i] = z;
                                i++;
                            } else {
                                this.e = true;
                                this.d = false;
                                int[] iArr2 = this.c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            synchronized (this) {
                this.e = false;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    public static abstract class b {
        final String[] a;

        public b(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void a(Set<String> set);

        /* access modifiers changed from: 0000 */
        public boolean a() {
            return false;
        }
    }

    /* compiled from: InvalidationTracker */
    static class c {
        final int[] a;
        private final String[] b;
        final b c;
        private final Set<String> d;

        c(b bVar, int[] iArr, String[] strArr) {
            this.c = bVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                V v = new V();
                v.add(this.b[0]);
                this.d = Collections.unmodifiableSet(v);
                return;
            }
            this.d = null;
        }

        /* access modifiers changed from: 0000 */
        public void a(Set<Integer> set) {
            int length = this.a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.a[i]))) {
                    if (length == 1) {
                        set2 = this.d;
                    } else {
                        if (set2 == null) {
                            set2 = new V(length);
                        }
                        set2.add(this.b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.c.a(set2);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(String[] strArr) {
            Set set = 0;
            if (this.b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.b[0])) {
                        set = this.d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                V v = new V();
                for (String str : strArr) {
                    String[] strArr2 = this.b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            v.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (v.size() > 0) {
                    set = v;
                }
            }
            if (set != 0) {
                this.c.a(set);
            }
        }
    }

    public h(t tVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.e = tVar;
        this.i = new a(strArr.length);
        this.b = new T<>();
        this.d = map2;
        this.j = new f(this.e);
        int length = strArr.length;
        this.c = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.US);
            this.b.put(lowerCase, Integer.valueOf(i2));
            String str = (String) map.get(strArr[i2]);
            if (str != null) {
                this.c[i2] = str.toLowerCase(Locale.US);
            } else {
                this.c[i2] = lowerCase;
            }
        }
        for (Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.b.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                T<String, Integer> t = this.b;
                t.put(lowerCase3, t.get(lowerCase2));
            }
        }
    }

    private void b(Ud ud, int i2) {
        String[] strArr;
        String str = this.c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            a(sb, str, str2);
            ud.g(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Ud ud) {
        synchronized (this) {
            if (this.g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            ud.g("PRAGMA temp_store = MEMORY;");
            ud.g("PRAGMA recursive_triggers='ON';");
            ud.g("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            b(ud);
            this.h = ud.h("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.g = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.e.l()) {
            b(this.e.h().b());
        }
    }

    private String[] b(String[] strArr) {
        V v = new V();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.d.containsKey(lowerCase)) {
                v.addAll((Collection) this.d.get(lowerCase));
            } else {
                v.add(str);
            }
        }
        return (String[]) v.toArray(new String[v.size()]);
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, String str) {
        this.l = new p(context, str, this, this.e.i());
    }

    private static void a(StringBuilder sb, String str, String str2) {
        String str3 = "`";
        sb.append(str3);
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(str3);
    }

    @SuppressLint({"RestrictedApi"})
    public void b(b bVar) {
        c cVar;
        synchronized (this.k) {
            cVar = (c) this.k.remove(bVar);
        }
        if (cVar != null && this.i.b(cVar.a)) {
            c();
        }
    }

    private void a(Ud ud, int i2) {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i2);
        sb.append(", 0)");
        ud.g(sb.toString());
        String str = this.c[i2];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : a) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            a(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            String str3 = "invalidated";
            sb2.append(str3);
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i2);
            sb2.append(" AND ");
            sb2.append(str3);
            sb2.append(" = 0");
            sb2.append("; END");
            ud.g(sb2.toString());
        }
    }

    public void b() {
        if (this.f.compareAndSet(false, true)) {
            this.e.i().execute(this.m);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(Ud ud) {
        if (!ud.E()) {
            while (true) {
                try {
                    Lock f2 = this.e.f();
                    f2.lock();
                    try {
                        int[] a2 = this.i.a();
                        if (a2 == null) {
                            f2.unlock();
                            return;
                        }
                        int length = a2.length;
                        ud.z();
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                a(ud, i2);
                            } else if (i3 == 2) {
                                b(ud, i2);
                            }
                        }
                        ud.B();
                        ud.C();
                        this.i.b();
                        f2.unlock();
                    } catch (Throwable th) {
                        f2.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    return;
                }
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(b bVar) {
        c cVar;
        String[] b2 = b(bVar.a);
        int[] iArr = new int[b2.length];
        int length = b2.length;
        int i2 = 0;
        while (i2 < length) {
            Integer num = (Integer) this.b.get(b2[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
                i2++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("There is no table with name ");
                sb.append(b2[i2]);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        c cVar2 = new c(bVar, iArr, b2);
        synchronized (this.k) {
            cVar = (c) this.k.b(bVar, cVar2);
        }
        if (cVar == null && this.i.a(iArr)) {
            c();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        if (!this.e.l()) {
            return false;
        }
        if (!this.g) {
            this.e.h().b();
        }
        if (this.g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public void a(String... strArr) {
        synchronized (this.k) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (!((b) entry.getKey()).a()) {
                    ((c) entry.getValue()).a(strArr);
                }
            }
        }
    }
}
