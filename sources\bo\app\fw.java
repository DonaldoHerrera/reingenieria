package bo.app;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

final class fw implements Closeable {
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
    /* access modifiers changed from: private */
    public static final OutputStream r = new OutputStream() {
        public void write(int i) {
        }
    };
    final ThreadPoolExecutor b;
    /* access modifiers changed from: private */
    public final File c;
    private final File d;
    private final File e;
    private final File f;
    private final int g;
    private long h;
    private int i;
    /* access modifiers changed from: private */
    public final int j;
    private long k = 0;
    private int l = 0;
    /* access modifiers changed from: private */
    public Writer m;
    private final LinkedHashMap<String, b> n = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */
    public int o;
    private long p = 0;
    private final Callable<Void> q;

    public final class a {
        /* access modifiers changed from: private */
        public final b b;
        /* access modifiers changed from: private */
        public final boolean[] c;
        /* access modifiers changed from: private */
        public boolean d;
        private boolean e;

        /* renamed from: bo.app.fw$a$a reason: collision with other inner class name */
        class C0029a extends FilterOutputStream {
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    a.this.d = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    a.this.d = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    a.this.d = true;
                }
            }

            private C0029a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.this.d = true;
                }
            }
        }

        private a(b bVar) {
            this.b = bVar;
            this.c = bVar.d ? null : new boolean[fw.this.j];
        }

        public void b() {
            fw.this.a(this, false);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
        public OutputStream a(int i) {
            C0029a aVar;
            synchronized (fw.this) {
                if (this.b.e == this) {
                    if (!this.b.d) {
                        this.c[i] = true;
                    }
                    File b2 = this.b.b(i);
                    FileOutputStream fileOutputStream = new FileOutputStream(b2);
                    fw.this.c.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b2);
                        aVar = new C0029a(fileOutputStream);
                    } catch (FileNotFoundException unused) {
                        return fw.r;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        public void a() {
            if (this.d) {
                fw.this.a(this, false);
                fw.this.c(this.b.b);
            } else {
                fw.this.a(this, true);
            }
            this.e = true;
        }
    }

    final class b {
        /* access modifiers changed from: private */
        public final String b;
        /* access modifiers changed from: private */
        public final long[] c;
        /* access modifiers changed from: private */
        public boolean d;
        /* access modifiers changed from: private */
        public a e;
        /* access modifiers changed from: private */
        public long f;

        private b(String str) {
            this.b = str;
            this.c = new long[fw.this.j];
        }

        private IOException b(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        public File b(int i) {
            File g = fw.this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append("");
            sb.append(i);
            sb.append(".tmp");
            return new File(g, sb.toString());
        }

        public String a() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.c) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        public void a(String[] strArr) {
            if (strArr.length == fw.this.j) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.c[i] = Long.parseLong(strArr[i]);
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

        public File a(int i) {
            File g = fw.this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append("");
            sb.append(i);
            return new File(g, sb.toString());
        }
    }

    public final class c implements Closeable {
        private final String b;
        private final long c;
        private File[] d;
        private final InputStream[] e;
        private final long[] f;

        public File a(int i) {
            return this.d[i];
        }

        public void close() {
            for (InputStream a2 : this.e) {
                fz.a((Closeable) a2);
            }
        }

        private c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.b = str;
            this.c = j;
            this.d = fileArr;
            this.e = inputStreamArr;
            this.f = jArr;
        }
    }

    private fw(File file, int i2, int i3, long j2, int i4) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.b = threadPoolExecutor;
        this.q = new Callable<Void>() {
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
                return null;
             */
            /* renamed from: a */
            public Void call() {
                synchronized (fw.this) {
                    if (fw.this.m == null) {
                        return null;
                    }
                    fw.this.h();
                    fw.this.i();
                    if (fw.this.f()) {
                        fw.this.e();
                        fw.this.o = 0;
                    }
                }
            }
        };
        this.c = file2;
        this.g = i2;
        this.d = new File(file2, "journal");
        this.e = new File(file2, "journal.tmp");
        this.f = new File(file2, "journal.bkp");
        this.j = i3;
        this.h = j2;
        this.i = i4;
    }

    /* access modifiers changed from: private */
    public void h() {
        while (this.k > this.h) {
            c((String) ((Entry) this.n.entrySet().iterator().next()).getKey());
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        while (this.l > this.i) {
            c((String) ((Entry) this.n.entrySet().iterator().next()).getKey());
        }
    }

    public synchronized void close() {
        if (this.m != null) {
            Iterator it = new ArrayList(this.n.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.e != null) {
                    bVar.e.b();
                }
            }
            h();
            i();
            this.m.close();
            this.m = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.o = r0 - r9.n.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x006c=Splitter:B:20:0x006c, B:16:0x005f=Splitter:B:16:0x005f} */
    private void c() {
        String str = ", ";
        fy fyVar = new fy(new FileInputStream(this.d), fz.a);
        try {
            String a2 = fyVar.a();
            String a3 = fyVar.a();
            String a4 = fyVar.a();
            String a5 = fyVar.a();
            String a6 = fyVar.a();
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.g).equals(a4) || !Integer.toString(this.j).equals(a5) || !"".equals(a6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected journal header: [");
                sb.append(a2);
                sb.append(str);
                sb.append(a3);
                sb.append(str);
                sb.append(a5);
                sb.append(str);
                sb.append(a6);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            int i2 = 0;
            while (true) {
                d(fyVar.a());
                i2++;
            }
        } finally {
            fz.a((Closeable) fyVar);
        }
    }

    private void d(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.n.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            b bVar = (b) this.n.get(str2);
            if (bVar == null) {
                bVar = new b(str2);
                this.n.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.d = true;
                bVar.e = null;
                bVar.a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.e = new a(bVar);
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

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void e() {
        if (this.m != null) {
            this.m.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), fz.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.g));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.j));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b bVar : this.n.values()) {
                if (bVar.e != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(bVar.b);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(bVar.b);
                    sb2.append(bVar.a());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            if (this.d.exists()) {
                a(this.d, this.f, true);
            }
            a(this.e, this.d, false);
            this.f.delete();
            this.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), fz.a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public boolean f() {
        int i2 = this.o;
        return i2 >= 2000 && i2 >= this.n.size();
    }

    private void g() {
        if (this.m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public a b(String str) {
        return a(str, -1);
    }

    public static fw a(File file, int i2, int i3, long j2, int i4) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i4 <= 0) {
            throw new IllegalArgumentException("maxFileCount <= 0");
        } else if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            fw fwVar = new fw(file, i2, i3, j2, i4);
            if (fwVar.d.exists()) {
                try {
                    fwVar.c();
                    fwVar.d();
                    fwVar.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fwVar.d, true), fz.a));
                    return fwVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e2.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    fwVar.a();
                }
            }
            file.mkdirs();
            fw fwVar2 = new fw(file, i2, i3, j2, i4);
            fwVar2.e();
            return fwVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        return false;
     */
    public synchronized boolean c(String str) {
        g();
        e(str);
        b bVar = (b) this.n.get(str);
        if (bVar != null) {
            if (bVar.e == null) {
                for (int i2 = 0; i2 < this.j; i2++) {
                    File a2 = bVar.a(i2);
                    if (a2.exists()) {
                        if (!a2.delete()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("failed to delete ");
                            sb.append(a2);
                            throw new IOException(sb.toString());
                        }
                    }
                    this.k -= bVar.c[i2];
                    this.l--;
                    bVar.c[i2] = 0;
                }
                this.o++;
                Writer writer = this.m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("REMOVE ");
                sb2.append(str);
                sb2.append(10);
                writer.append(sb2.toString());
                this.n.remove(str);
                if (f()) {
                    this.b.submit(this.q);
                }
            }
        }
    }

    private void d() {
        a(this.e);
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i2 = 0;
            if (bVar.e == null) {
                while (i2 < this.j) {
                    this.k += bVar.c[i2];
                    this.l++;
                    i2++;
                }
            } else {
                bVar.e = null;
                while (i2 < this.j) {
                    a(bVar.a(i2));
                    a(bVar.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void e(String str) {
        if (!a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,64}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r12.o++;
        r1 = r12.m;
        r2 = new java.lang.StringBuilder();
        r2.append("READ ");
        r2.append(r13);
        r2.append(10);
        r1.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (f() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r12.b.submit(r12.q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r3 = new bo.app.fw.c(r12, r13, bo.app.fw.b.e(r0), r8, r9, bo.app.fw.b.b(r0), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007b */
    public synchronized c a(String str) {
        g();
        e(str);
        b bVar = (b) this.n.get(str);
        if (bVar != null) {
            if (bVar.d) {
                File[] fileArr = new File[this.j];
                InputStream[] inputStreamArr = new InputStream[this.j];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= this.j) {
                        break;
                    }
                    File a2 = bVar.a(i3);
                    fileArr[i3] = a2;
                    inputStreamArr[i3] = new FileInputStream(a2);
                    i3++;
                }
                while (i2 < this.j && inputStreamArr[i2] != null) {
                    fz.a((Closeable) inputStreamArr[i2]);
                    i2++;
                    break;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return null;
     */
    private synchronized a a(String str, long j2) {
        g();
        e(str);
        b bVar = (b) this.n.get(str);
        if (j2 == -1 || (bVar != null && bVar.f == j2)) {
            if (bVar == null) {
                bVar = new b(str);
                this.n.put(str, bVar);
            } else if (bVar.e != null) {
                return null;
            }
            a aVar = new a(bVar);
            bVar.e = aVar;
            Writer writer = this.m;
            StringBuilder sb = new StringBuilder();
            sb.append("DIRTY ");
            sb.append(str);
            sb.append(10);
            writer.write(sb.toString());
            this.m.flush();
            return aVar;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        return;
     */
    public synchronized void a(a aVar, boolean z) {
        b a2 = aVar.b;
        if (a2.e == aVar) {
            if (z && !a2.d) {
                int i2 = 0;
                while (i2 < this.j) {
                    if (!aVar.c[i2]) {
                        aVar.b();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    } else if (!a2.b(i2).exists()) {
                        aVar.b();
                        return;
                    } else {
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.j; i3++) {
                File b2 = a2.b(i3);
                if (!z) {
                    a(b2);
                } else if (b2.exists()) {
                    File a3 = a2.a(i3);
                    b2.renameTo(a3);
                    long j2 = a2.c[i3];
                    long length = a3.length();
                    a2.c[i3] = length;
                    this.k = (this.k - j2) + length;
                    this.l++;
                }
            }
            this.o++;
            a2.e = null;
            if (a2.d || z) {
                a2.d = true;
                Writer writer = this.m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(a2.b);
                sb2.append(a2.a());
                sb2.append(10);
                writer.write(sb2.toString());
                if (z) {
                    long j3 = this.p;
                    this.p = 1 + j3;
                    a2.f = j3;
                }
            } else {
                this.n.remove(a2.b);
                Writer writer2 = this.m;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("REMOVE ");
                sb3.append(a2.b);
                sb3.append(10);
                writer2.write(sb3.toString());
            }
            this.m.flush();
            if (this.k > this.h || this.l > this.i || f()) {
                this.b.submit(this.q);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        close();
        fz.a(this.c);
    }
}
