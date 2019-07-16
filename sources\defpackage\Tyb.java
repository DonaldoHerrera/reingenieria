package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: Tyb reason: default package */
/* compiled from: DiskLruCache */
public final class Tyb implements Closeable, Flushable {
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
    final Vzb b;
    final File c;
    private final File d;
    private final File e;
    private final File f;
    private final int g;
    private long h;
    final int i;
    private long j = 0;
    C6893mAb k;
    final LinkedHashMap<String, b> l = new LinkedHashMap<>(0, 0.75f, true);
    int m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    private long s = 0;
    private final Executor t;
    private final Runnable u = new Qyb(this);

    /* renamed from: Tyb$a */
    /* compiled from: DiskLruCache */
    public final class a {
        final b a;
        final boolean[] b;
        private boolean c;

        a(b bVar) {
            this.a = bVar;
            this.b = bVar.e ? null : new boolean[Tyb.this.i];
        }

        public GAb a(int i) {
            synchronized (Tyb.this) {
                if (this.c) {
                    throw new IllegalStateException();
                } else if (this.a.f != this) {
                    GAb a2 = C7720yAb.a();
                    return a2;
                } else {
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    try {
                        Syb syb = new Syb(this, Tyb.this.b.f(this.a.d[i]));
                        return syb;
                    } catch (FileNotFoundException unused) {
                        return C7720yAb.a();
                    }
                }
            }
        }

        public void b() throws IOException {
            synchronized (Tyb.this) {
                if (!this.c) {
                    if (this.a.f == this) {
                        Tyb.this.a(this, true);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            if (this.a.f == this) {
                int i = 0;
                while (true) {
                    Tyb tyb = Tyb.this;
                    if (i < tyb.i) {
                        try {
                            tyb.b.g(this.a.d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.a.f = null;
                        return;
                    }
                }
            }
        }

        public void a() throws IOException {
            synchronized (Tyb.this) {
                if (!this.c) {
                    if (this.a.f == this) {
                        Tyb.this.a(this, false);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: Tyb$b */
    /* compiled from: DiskLruCache */
    private final class b {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        a f;
        long g;

        b(String str) {
            this.a = str;
            int i = Tyb.this.i;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < Tyb.this.i; i2++) {
                sb.append(i2);
                this.c[i2] = new File(Tyb.this.c, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(Tyb.this.c, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public void a(String[] strArr) throws IOException {
            if (strArr.length == Tyb.this.i) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        b(strArr);
                        throw null;
                    }
                }
                return;
            }
            b(strArr);
            throw null;
        }

        /* access modifiers changed from: 0000 */
        public void a(C6893mAb mab) throws IOException {
            for (long a2 : this.b) {
                mab.writeByte(32).a(a2);
            }
        }

        /* access modifiers changed from: 0000 */
        public c a() {
            if (Thread.holdsLock(Tyb.this)) {
                HAb[] hAbArr = new HAb[Tyb.this.i];
                long[] jArr = (long[]) this.b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < Tyb.this.i) {
                    try {
                        hAbArr[i2] = Tyb.this.b.e(this.c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < Tyb.this.i && hAbArr[i] != null) {
                            Kyb.a((Closeable) hAbArr[i]);
                            i++;
                        }
                        try {
                            Tyb.this.a(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                c cVar = new c(this.a, this.g, hAbArr, jArr);
                return cVar;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: Tyb$c */
    /* compiled from: DiskLruCache */
    public final class c implements Closeable {
        private final String a;
        private final long b;
        private final HAb[] c;
        private final long[] d;

        c(String str, long j, HAb[] hAbArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.c = hAbArr;
            this.d = jArr;
        }

        public a a() throws IOException {
            return Tyb.this.a(this.a, this.b);
        }

        public void close() {
            for (HAb a2 : this.c) {
                Kyb.a((Closeable) a2);
            }
        }

        public HAb a(int i) {
            return this.c[i];
        }
    }

    Tyb(Vzb vzb, File file, int i2, int i3, long j2, Executor executor) {
        this.b = vzb;
        this.c = file;
        this.g = i2;
        this.d = new File(file, "journal");
        this.e = new File(file, "journal.tmp");
        this.f = new File(file, "journal.bkp");
        this.i = i3;
        this.h = j2;
        this.t = executor;
    }

    public static Tyb a(Vzb vzb, File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Kyb.a("OkHttp DiskLruCache", true));
            Tyb tyb = new Tyb(vzb, file, i2, i3, j2, threadPoolExecutor);
            return tyb;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.l.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            b bVar = (b) this.l.get(str2);
            if (bVar == null) {
                bVar = new b(str2);
                this.l.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.e = true;
                bVar.f = null;
                bVar.a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f = new a(bVar);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith("READ"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new IOException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    private synchronized void f() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private C6893mAb g() throws FileNotFoundException {
        return C7720yAb.a((GAb) new Ryb(this, this.b.c(this.d)));
    }

    private void h() throws IOException {
        this.b.g(this.e);
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i2 = 0;
            if (bVar.f == null) {
                while (i2 < this.i) {
                    this.j += bVar.b[i2];
                    i2++;
                }
            } else {
                bVar.f = null;
                while (i2 < this.i) {
                    this.b.g(bVar.c[i2]);
                    this.b.g(bVar.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|(1:19)(1:20)|(2:22|34)(1:35)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r10.m = r0 - r10.l.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (r1.p() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r10.k = g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r1 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        a((java.lang.Throwable) null, (java.lang.AutoCloseable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007d=Splitter:B:23:0x007d, B:16:0x005e=Splitter:B:16:0x005e} */
    private void i() throws IOException {
        Throwable th;
        String str = ", ";
        C6961nAb a2 = C7720yAb.a(this.b.e(this.d));
        try {
            String m2 = a2.m();
            String m3 = a2.m();
            String m4 = a2.m();
            String m5 = a2.m();
            String m6 = a2.m();
            if (!"libcore.io.DiskLruCache".equals(m2) || !"1".equals(m3) || !Integer.toString(this.g).equals(m4) || !Integer.toString(this.i).equals(m5) || !"".equals(m6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected journal header: [");
                sb.append(m2);
                sb.append(str);
                sb.append(m3);
                sb.append(str);
                sb.append(m5);
                sb.append(str);
                sb.append(m6);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            int i2 = 0;
            while (true) {
                d(a2.m());
                i2++;
            }
        } catch (Throwable th2) {
            if (a2 != null) {
                a(th, (AutoCloseable) a2);
            }
            throw th2;
        }
    }

    public synchronized void b() throws IOException {
        if (!this.o) {
            if (this.b.b(this.f)) {
                if (this.b.b(this.d)) {
                    this.b.g(this.f);
                } else {
                    this.b.a(this.f, this.d);
                }
            }
            if (this.b.b(this.d)) {
                try {
                    i();
                    h();
                    this.o = true;
                    return;
                } catch (IOException e2) {
                    _zb a2 = _zb.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(this.c);
                    sb.append(" is corrupt: ");
                    sb.append(e2.getMessage());
                    sb.append(", removing");
                    a2.a(5, sb.toString(), (Throwable) e2);
                    a();
                    this.p = false;
                } catch (Throwable th) {
                    this.p = false;
                    throw th;
                }
            }
            d();
            this.o = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        int i2 = this.m;
        return i2 >= 2000 && i2 >= this.l.size();
    }

    public synchronized void close() throws IOException {
        b[] bVarArr;
        if (this.o) {
            if (!this.p) {
                for (b bVar : (b[]) this.l.values().toArray(new b[this.l.size()])) {
                    if (bVar.f != null) {
                        bVar.f.a();
                    }
                }
                e();
                this.k.close();
                this.k = null;
                this.p = true;
                return;
            }
        }
        this.p = true;
    }

    /* access modifiers changed from: 0000 */
    public void e() throws IOException {
        while (this.j > this.h) {
            a((b) this.l.values().iterator().next());
        }
        this.q = false;
    }

    public synchronized void flush() throws IOException {
        if (this.o) {
            f();
            e();
            this.k.flush();
        }
    }

    public synchronized boolean isClosed() {
        return this.p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    public synchronized boolean c(String str) throws IOException {
        b();
        f();
        e(str);
        b bVar = (b) this.l.get(str);
        if (bVar == null) {
            return false;
        }
        boolean a2 = a(bVar);
        if (a2 && this.j <= this.h) {
            this.q = false;
        }
    }

    private void e(String str) {
        if (!a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    public a a(String str) throws IOException {
        return a(str, -1);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    public synchronized a a(String str, long j2) throws IOException {
        b();
        f();
        e(str);
        b bVar = (b) this.l.get(str);
        if (j2 == -1 || (bVar != null && bVar.g == j2)) {
            if (bVar != null) {
                if (bVar.f != null) {
                    return null;
                }
            }
            if (!this.q) {
                if (!this.r) {
                    this.k.f("DIRTY").writeByte(32).f(str).writeByte(10);
                    this.k.flush();
                    if (this.n) {
                        return null;
                    }
                    if (bVar == null) {
                        bVar = new b(str);
                        this.l.put(str, bVar);
                    }
                    a aVar = new a(bVar);
                    bVar.f = aVar;
                    return aVar;
                }
            }
            this.t.execute(this.u);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    public synchronized c b(String str) throws IOException {
        b();
        f();
        e(str);
        b bVar = (b) this.l.get(str);
        if (bVar != null) {
            if (bVar.e) {
                c a2 = bVar.a();
                if (a2 == null) {
                    return null;
                }
                this.m++;
                this.k.f("READ").writeByte(32).f(str).writeByte(10);
                if (c()) {
                    this.t.execute(this.u);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        if (r0 != null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        a(r1, (java.lang.AutoCloseable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        throw r2;
     */
    public synchronized void d() throws IOException {
        if (this.k != null) {
            this.k.close();
        }
        C6893mAb a2 = C7720yAb.a(this.b.f(this.e));
        a2.f("libcore.io.DiskLruCache").writeByte(10);
        a2.f("1").writeByte(10);
        a2.a((long) this.g).writeByte(10);
        a2.a((long) this.i).writeByte(10);
        a2.writeByte(10);
        for (b bVar : this.l.values()) {
            if (bVar.f != null) {
                a2.f("DIRTY").writeByte(32);
                a2.f(bVar.a);
                a2.writeByte(10);
            } else {
                a2.f("CLEAN").writeByte(32);
                a2.f(bVar.a);
                bVar.a(a2);
                a2.writeByte(10);
            }
        }
        if (a2 != null) {
            a((Throwable) null, (AutoCloseable) a2);
        }
        if (this.b.b(this.d)) {
            this.b.a(this.d, this.f);
        }
        this.b.a(this.e, this.d);
        this.b.g(this.f);
        this.k = g();
        this.n = false;
        this.r = false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    public synchronized void a(a aVar, boolean z) throws IOException {
        b bVar = aVar.a;
        if (bVar.f == aVar) {
            if (z && !bVar.e) {
                int i2 = 0;
                while (i2 < this.i) {
                    if (!aVar.b[i2]) {
                        aVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    } else if (!this.b.b(bVar.d[i2])) {
                        aVar.a();
                        return;
                    } else {
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.i; i3++) {
                File file = bVar.d[i3];
                if (!z) {
                    this.b.g(file);
                } else if (this.b.b(file)) {
                    File file2 = bVar.c[i3];
                    this.b.a(file, file2);
                    long j2 = bVar.b[i3];
                    long d2 = this.b.d(file2);
                    bVar.b[i3] = d2;
                    this.j = (this.j - j2) + d2;
                }
            }
            this.m++;
            bVar.f = null;
            if (bVar.e || z) {
                bVar.e = true;
                this.k.f("CLEAN").writeByte(32);
                this.k.f(bVar.a);
                bVar.a(this.k);
                this.k.writeByte(10);
                if (z) {
                    long j3 = this.s;
                    this.s = 1 + j3;
                    bVar.g = j3;
                }
            } else {
                this.l.remove(bVar.a);
                this.k.f("REMOVE").writeByte(32);
                this.k.f(bVar.a);
                this.k.writeByte(10);
            }
            this.k.flush();
            if (this.j > this.h || c()) {
                this.t.execute(this.u);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(b bVar) throws IOException {
        a aVar = bVar.f;
        if (aVar != null) {
            aVar.c();
        }
        for (int i2 = 0; i2 < this.i; i2++) {
            this.b.g(bVar.c[i2]);
            long j2 = this.j;
            long[] jArr = bVar.b;
            this.j = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.m++;
        this.k.f("REMOVE").writeByte(32).f(bVar.a).writeByte(10);
        this.l.remove(bVar.a);
        if (c()) {
            this.t.execute(this.u);
        }
        return true;
    }

    public void a() throws IOException {
        close();
        this.b.a(this.c);
    }
}
