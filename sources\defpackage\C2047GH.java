package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
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

/* renamed from: GH reason: default package and case insensitive filesystem */
/* compiled from: DiskLruCache */
public final class C2047GH implements Closeable {
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
    /* access modifiers changed from: private */
    public static final OutputStream b = new C2027FH();
    /* access modifiers changed from: private */
    public final File c;
    private final File d;
    private final File e;
    private final File f;
    private final int g;
    private long h;
    /* access modifiers changed from: private */
    public final int i;
    private long j = 0;
    /* access modifiers changed from: private */
    public Writer k;
    private final LinkedHashMap<String, b> l = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */
    public int m;
    private long n = 0;
    final ThreadPoolExecutor o;
    private final Callable<Void> p;

    /* renamed from: GH$a */
    /* compiled from: DiskLruCache */
    public final class a {
        /* access modifiers changed from: private */
        public final b a;
        /* access modifiers changed from: private */
        public final boolean[] b;
        /* access modifiers changed from: private */
        public boolean c;
        private boolean d;

        /* renamed from: GH$a$a reason: collision with other inner class name */
        /* compiled from: DiskLruCache */
        private class C0051a extends FilterOutputStream {
            /* synthetic */ C0051a(a aVar, OutputStream outputStream, C2007EH eh) {
                this(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    a.this.c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    a.this.c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    a.this.c = true;
                }
            }

            private C0051a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.this.c = true;
                }
            }
        }

        /* synthetic */ a(C2047GH gh, b bVar, C2007EH eh) {
            this(bVar);
        }

        private a(b bVar) {
            this.a = bVar;
            this.b = bVar.c ? null : new boolean[C2047GH.this.i];
        }

        public void b() throws IOException {
            if (this.c) {
                C2047GH.this.a(this, false);
                C2047GH.this.c(this.a.a);
            } else {
                C2047GH.this.a(this, true);
            }
            this.d = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
        public OutputStream a(int i) throws IOException {
            C0051a aVar;
            synchronized (C2047GH.this) {
                if (this.a.d == this) {
                    if (!this.a.c) {
                        this.b[i] = true;
                    }
                    File b2 = this.a.b(i);
                    FileOutputStream fileOutputStream = new FileOutputStream(b2);
                    C2047GH.this.c.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b2);
                        aVar = new C0051a(this, fileOutputStream, null);
                    } catch (FileNotFoundException unused) {
                        return C2047GH.b;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        public void a(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i), C2105JH.b);
                try {
                    outputStreamWriter2.write(str);
                    C2105JH.a((Closeable) outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    C2105JH.a((Closeable) outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C2105JH.a((Closeable) outputStreamWriter);
                throw th;
            }
        }

        public void a() throws IOException {
            C2047GH.this.a(this, false);
        }
    }

    /* renamed from: GH$b */
    /* compiled from: DiskLruCache */
    private final class b {
        /* access modifiers changed from: private */
        public final String a;
        /* access modifiers changed from: private */
        public final long[] b;
        /* access modifiers changed from: private */
        public boolean c;
        /* access modifiers changed from: private */
        public a d;
        /* access modifiers changed from: private */
        public long e;

        /* synthetic */ b(C2047GH gh, String str, C2007EH eh) {
            this(str);
        }

        private b(String str) {
            this.a = str;
            this.b = new long[C2047GH.this.i];
        }

        /* access modifiers changed from: private */
        public void b(String[] strArr) throws IOException {
            if (strArr.length == C2047GH.this.i) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        a(strArr);
                        throw null;
                    }
                }
                return;
            }
            a(strArr);
            throw null;
        }

        public String a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public File b(int i) {
            File d2 = C2047GH.this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".");
            sb.append(i);
            sb.append(".tmp");
            return new File(d2, sb.toString());
        }

        private IOException a(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        public File a(int i) {
            File d2 = C2047GH.this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".");
            sb.append(i);
            return new File(d2, sb.toString());
        }
    }

    /* renamed from: GH$c */
    /* compiled from: DiskLruCache */
    public final class c implements Closeable {
        private final String a;
        private final long b;
        private final InputStream[] c;
        private final long[] d;

        /* synthetic */ c(C2047GH gh, String str, long j, InputStream[] inputStreamArr, long[] jArr, C2007EH eh) {
            this(str, j, inputStreamArr, jArr);
        }

        public InputStream a(int i) {
            return this.c[i];
        }

        public void close() {
            for (InputStream a2 : this.c) {
                C2105JH.a((Closeable) a2);
            }
        }

        public String getString(int i) throws IOException {
            return C2047GH.b(a(i));
        }

        private c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.c = inputStreamArr;
            this.d = jArr;
        }
    }

    private C2047GH(File file, int i2, int i3, long j2) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.o = threadPoolExecutor;
        this.p = new C2007EH(this);
        this.c = file2;
        this.g = i2;
        this.d = new File(file2, "journal");
        this.e = new File(file2, "journal.tmp");
        this.f = new File(file2, "journal.bkp");
        this.i = i3;
        this.h = j2;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void g() throws IOException {
        if (this.k != null) {
            this.k.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), C2105JH.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.g));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.i));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b bVar : this.l.values()) {
                if (bVar.d != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(bVar.a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(bVar.a);
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
            this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), C2105JH.a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void h() throws IOException {
        while (this.j > this.h) {
            c((String) ((Entry) this.l.entrySet().iterator().next()).getKey());
        }
    }

    public synchronized void close() throws IOException {
        if (this.k != null) {
            Iterator it = new ArrayList(this.l.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.d != null) {
                    bVar.d.a();
                }
            }
            h();
            this.k.close();
            this.k = null;
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
                bVar = new b(this, str2, null);
                this.l.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.c = true;
                bVar.d = null;
                bVar.b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.d = new a(this, bVar, null);
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

    private void e() throws IOException {
        a(this.e);
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i2 = 0;
            if (bVar.d == null) {
                while (i2 < this.i) {
                    this.j += bVar.b[i2];
                    i2++;
                }
            } else {
                bVar.d = null;
                while (i2 < this.i) {
                    a(bVar.a(i2));
                    a(bVar.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.m = r0 - r9.l.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x006c=Splitter:B:20:0x006c, B:16:0x005f=Splitter:B:16:0x005f} */
    private void f() throws IOException {
        String str = ", ";
        C2086IH ih = new C2086IH(new FileInputStream(this.d), C2105JH.a);
        try {
            String a2 = ih.a();
            String a3 = ih.a();
            String a4 = ih.a();
            String a5 = ih.a();
            String a6 = ih.a();
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.g).equals(a4) || !Integer.toString(this.i).equals(a5) || !"".equals(a6)) {
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
                d(ih.a());
                i2++;
            }
        } finally {
            C2105JH.a((Closeable) ih);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.m++;
        r1 = r11.k;
        r2 = new java.lang.StringBuilder();
        r2.append("READ ");
        r2.append(r12);
        r2.append(10);
        r1.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (d() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r11.o.submit(r11.p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        r3 = new defpackage.C2047GH.c(r11, r12, defpackage.C2047GH.b.c(r0), r8, defpackage.C2047GH.b.a(r0), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
    public synchronized c b(String str) throws IOException {
        c();
        e(str);
        b bVar = (b) this.l.get(str);
        if (bVar != null) {
            if (bVar.c) {
                InputStream[] inputStreamArr = new InputStream[this.i];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= this.i) {
                        break;
                    }
                    inputStreamArr[i3] = new FileInputStream(bVar.a(i3));
                    i3++;
                }
                while (i2 < this.i && inputStreamArr[i2] != null) {
                    C2105JH.a((Closeable) inputStreamArr[i2]);
                    i2++;
                    break;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        return false;
     */
    public synchronized boolean c(String str) throws IOException {
        c();
        e(str);
        b bVar = (b) this.l.get(str);
        if (bVar != null) {
            if (bVar.d == null) {
                for (int i2 = 0; i2 < this.i; i2++) {
                    File a2 = bVar.a(i2);
                    if (a2.exists()) {
                        if (!a2.delete()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("failed to delete ");
                            sb.append(a2);
                            throw new IOException(sb.toString());
                        }
                    }
                    this.j -= bVar.b[i2];
                    bVar.b[i2] = 0;
                }
                this.m++;
                Writer writer = this.k;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("REMOVE ");
                sb2.append(str);
                sb2.append(10);
                writer.append(sb2.toString());
                this.l.remove(str);
                if (d()) {
                    this.o.submit(this.p);
                }
            }
        }
    }

    public static C2047GH a(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
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
            C2047GH gh = new C2047GH(file, i2, i3, j2);
            if (gh.d.exists()) {
                try {
                    gh.f();
                    gh.e();
                    gh.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(gh.d, true), C2105JH.a));
                    return gh;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e2.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    gh.b();
                }
            }
            file.mkdirs();
            C2047GH gh2 = new C2047GH(file, i2, i3, j2);
            gh2.g();
            return gh2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
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

    private void c() {
        if (this.k == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public void b() throws IOException {
        close();
        C2105JH.a(this.c);
    }

    /* access modifiers changed from: private */
    public boolean d() {
        int i2 = this.m;
        return i2 >= 2000 && i2 >= this.l.size();
    }

    /* access modifiers changed from: private */
    public static String b(InputStream inputStream) throws IOException {
        return C2105JH.a((Reader) new InputStreamReader(inputStream, C2105JH.b));
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public a a(String str) throws IOException {
        return a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return null;
     */
    private synchronized a a(String str, long j2) throws IOException {
        c();
        e(str);
        b bVar = (b) this.l.get(str);
        if (j2 == -1 || (bVar != null && bVar.e == j2)) {
            if (bVar == null) {
                bVar = new b(this, str, null);
                this.l.put(str, bVar);
            } else if (bVar.d != null) {
                return null;
            }
            a aVar = new a(this, bVar, null);
            bVar.d = aVar;
            Writer writer = this.k;
            StringBuilder sb = new StringBuilder();
            sb.append("DIRTY ");
            sb.append(str);
            sb.append(10);
            writer.write(sb.toString());
            this.k.flush();
            return aVar;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        return;
     */
    public synchronized void a(a aVar, boolean z) throws IOException {
        b a2 = aVar.a;
        if (a2.d == aVar) {
            if (z && !a2.c) {
                int i2 = 0;
                while (i2 < this.i) {
                    if (!aVar.b[i2]) {
                        aVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    } else if (!a2.b(i2).exists()) {
                        aVar.a();
                        return;
                    } else {
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.i; i3++) {
                File b2 = a2.b(i3);
                if (!z) {
                    a(b2);
                } else if (b2.exists()) {
                    File a3 = a2.a(i3);
                    b2.renameTo(a3);
                    long j2 = a2.b[i3];
                    long length = a3.length();
                    a2.b[i3] = length;
                    this.j = (this.j - j2) + length;
                }
            }
            this.m++;
            a2.d = null;
            if (a2.c || z) {
                a2.c = true;
                Writer writer = this.k;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(a2.a);
                sb2.append(a2.a());
                sb2.append(10);
                writer.write(sb2.toString());
                if (z) {
                    long j3 = this.n;
                    this.n = 1 + j3;
                    a2.e = j3;
                }
            } else {
                this.l.remove(a2.a);
                Writer writer2 = this.k;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("REMOVE ");
                sb3.append(a2.a);
                sb3.append(10);
                writer2.write(sb3.toString());
            }
            this.k.flush();
            if (this.j > this.h || d()) {
                this.o.submit(this.p);
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
