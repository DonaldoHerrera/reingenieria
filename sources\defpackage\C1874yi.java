package defpackage;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* renamed from: yi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1874yi {
    static final FilenameFilter a = new C1327gi("BeginSession");
    static final FilenameFilter b = new C1635qi();
    static final FileFilter c = new C1664ri();
    static final Comparator<File> d = new C1694si();
    static final Comparator<File> e = new C1724ti();
    /* access modifiers changed from: private */
    public static final Pattern f = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> g = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final String[] h = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    private final AtomicInteger i = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Ei j;
    private final Wh k;
    private final C4839DOa l;
    private final C4931GNa m;
    private final C1328gj n;
    private final C4994IOa o;
    /* access modifiers changed from: private */
    public final Gh p;
    private final g q;
    /* access modifiers changed from: private */
    public final Yi r;
    private final c s;
    private final b t;
    private final Ti u;
    private final C1695sj v;
    /* access modifiers changed from: private */
    public final String w;
    private final Hh x;
    private final C1511mh y;
    private Li z;

    /* renamed from: yi$a */
    /* compiled from: CrashlyticsController */
    private static class a implements FilenameFilter {
        private a() {
        }

        public boolean accept(File file, String str) {
            return !C1874yi.b.accept(file, str) && C1874yi.f.matcher(str).matches();
        }

        /* synthetic */ a(C1327gi giVar) {
            this();
        }
    }

    /* renamed from: yi$b */
    /* compiled from: CrashlyticsController */
    private interface b {
        void a(Nh nh) throws Exception;
    }

    /* renamed from: yi$c */
    /* compiled from: CrashlyticsController */
    private static final class c implements b {
        private c() {
        }

        public C6503gPa a() {
            return C6299dPa.b().a();
        }

        /* synthetic */ c(C1327gi giVar) {
            this();
        }
    }

    /* renamed from: yi$d */
    /* compiled from: CrashlyticsController */
    static class d implements FilenameFilter {
        private final String a;

        public d(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: yi$e */
    /* compiled from: CrashlyticsController */
    private interface e {
        void a(FileOutputStream fileOutputStream) throws Exception;
    }

    /* renamed from: yi$f */
    /* compiled from: CrashlyticsController */
    static class f implements FilenameFilter {
        f() {
        }

        public boolean accept(File file, String str) {
            return Mh.a.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* renamed from: yi$g */
    /* compiled from: CrashlyticsController */
    private static final class g implements defpackage.Yi.a {
        private final C4994IOa a;

        public g(C4994IOa iOa) {
            this.a = iOa;
        }

        public File a() {
            File file = new File(this.a.a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: yi$h */
    /* compiled from: CrashlyticsController */
    private static final class h implements d {
        private final C5531_Ma a;
        /* access modifiers changed from: private */
        public final C1328gj b;
        private final C5567aPa c;

        public h(C5531_Ma _ma, C1328gj gjVar, C5567aPa apa) {
            this.a = _ma;
            this.b = gjVar;
            this.c = apa;
        }

        public boolean a() {
            Activity a2 = this.a.g().a();
            if (a2 == null || a2.isFinishing()) {
                return true;
            }
            Th a3 = Th.a(a2, this.c, new C1904zi(this));
            a2.runOnUiThread(new Ai(this, a3));
            C5328TMa.e().d("CrashlyticsCore", "Waiting for user opt-in.");
            a3.a();
            return a3.b();
        }
    }

    /* renamed from: yi$i */
    /* compiled from: CrashlyticsController */
    private final class i implements c {
        private i() {
        }

        public File[] a() {
            return C1874yi.this.i();
        }

        public File[] b() {
            return C1874yi.this.e().listFiles();
        }

        public File[] c() {
            return C1874yi.this.h();
        }

        /* synthetic */ i(C1874yi yiVar, C1327gi giVar) {
            this();
        }
    }

    /* renamed from: yi$j */
    /* compiled from: CrashlyticsController */
    private final class j implements b {
        private j() {
        }

        public boolean a() {
            return C1874yi.this.g();
        }

        /* synthetic */ j(C1874yi yiVar, C1327gi giVar) {
            this();
        }
    }

    /* renamed from: yi$k */
    /* compiled from: CrashlyticsController */
    private static final class k implements Runnable {
        private final Context a;
        private final C1513mj b;
        private final C1544nj c;

        public k(Context context, C1513mj mjVar, C1544nj njVar) {
            this.a = context;
            this.b = mjVar;
            this.c = njVar;
        }

        public void run() {
            if (C7391tNa.b(this.a)) {
                C5328TMa.e().d("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.c.a(this.b);
            }
        }
    }

    /* renamed from: yi$l */
    /* compiled from: CrashlyticsController */
    static class l implements FilenameFilter {
        private final String a;

        public l(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".cls");
            boolean z = false;
            if (str.equals(sb.toString())) {
                return false;
            }
            if (str.contains(this.a) && !str.endsWith(".cls_temp")) {
                z = true;
            }
            return z;
        }
    }

    C1874yi(Ei ei, Wh wh, C4839DOa dOa, C4931GNa gNa, C1328gj gjVar, C4994IOa iOa, Gh gh, C1755uj ujVar, Hh hh, C1511mh mhVar) {
        this.j = ei;
        this.k = wh;
        this.l = dOa;
        this.m = gNa;
        this.n = gjVar;
        this.o = iOa;
        this.p = gh;
        this.w = ujVar.a();
        this.x = hh;
        this.y = mhVar;
        Context e2 = ei.e();
        this.q = new g(iOa);
        this.r = new Yi(e2, this.q);
        this.s = new i(this, null);
        this.t = new j(this, null);
        this.u = new Ti(e2);
        this.v = new C0309aj(1024, new C1482lj(10));
    }

    /* access modifiers changed from: private */
    public void m() throws Exception {
        Date date = new Date();
        String kh = new Kh(this.m).toString();
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Opening a new session with ID ");
        sb.append(kh);
        e2.d("CrashlyticsCore", sb.toString());
        a(kh, date);
        d(kh);
        f(kh);
        e(kh);
        this.r.a(kh);
    }

    private boolean n() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public String o() {
        File[] q2 = q();
        if (q2.length > 0) {
            return a(q2[0]);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public String p() {
        File[] q2 = q();
        if (q2.length > 1) {
            return a(q2[1]);
        }
        return null;
    }

    private File[] q() {
        File[] j2 = j();
        Arrays.sort(j2, d);
        return j2;
    }

    private void r() {
        File e2 = e();
        if (e2.exists()) {
            File[] a2 = a(e2, (FilenameFilter) new f());
            Arrays.sort(a2, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < a2.length && hashSet.size() < 4; i2++) {
                hashSet.add(a(a2[i2]));
            }
            a(b(e2), (Set<String>) hashSet);
        }
    }

    /* access modifiers changed from: 0000 */
    public File[] h() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, a(c(), b));
        Collections.addAll(linkedList, a(f(), b));
        Collections.addAll(linkedList, a(d(), b));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: 0000 */
    public File[] i() {
        return a(c);
    }

    /* access modifiers changed from: 0000 */
    public File[] j() {
        return a(a);
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        this.k.a((Callable<T>) new Yh<T>(this));
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        this.u.b();
    }

    private void c(File file) {
        if (file.isDirectory()) {
            for (File c2 : file.listFiles()) {
                c(c2);
            }
        }
        file.delete();
    }

    private void d(String str) throws Exception {
        String c2 = this.m.c();
        Gh gh = this.p;
        String str2 = gh.e;
        String str3 = gh.f;
        String str4 = c2;
        String str5 = str2;
        String str6 = str3;
        String d2 = this.m.d();
        int id = C7667xNa.a(this.p.c).getId();
        C1296fi fiVar = new C1296fi(this, str4, str5, str6, d2, id);
        a(str, "SessionApp", (b) fiVar);
        C1388ii iiVar = new C1388ii(this, str4, str5, str6, d2, id);
        a(str, "SessionApp.json", (e) iiVar);
    }

    private void e(String str) throws Exception {
        String str2 = str;
        Context e2 = this.j.e();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a2 = C7391tNa.a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b2 = C7391tNa.b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean l2 = C7391tNa.l(e2);
        int i2 = a2;
        int i3 = availableProcessors;
        long j2 = b2;
        long j3 = blockCount;
        boolean z2 = l2;
        Map e3 = this.m.e();
        long j4 = b2;
        C1512mi miVar = r0;
        int f2 = C7391tNa.f(e2);
        C1512mi miVar2 = new C1512mi(this, i2, i3, j2, j3, z2, e3, f2);
        a(str2, "SessionDevice", (b) miVar);
        C1574oi oiVar = new C1574oi(this, i2, i3, j4, j3, z2, e3, f2);
        a(str2, "SessionDevice.json", (e) oiVar);
    }

    private void f(String str) throws Exception {
        boolean m2 = C7391tNa.m(this.j.e());
        a(str, "SessionOS", (b) new C1419ji(this, m2));
        a(str, "SessionOS.json", (e) new C1481li(this, m2));
    }

    private void g(String str) throws Exception {
        a(str, "SessionUser", (b) new C1605pi(this, b(str)));
    }

    /* access modifiers changed from: 0000 */
    public boolean b(C5635bPa bpa) {
        return ((Boolean) this.k.b(new Zh(this, bpa))).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        Li li = this.z;
        return li != null && li.a();
    }

    private File[] b(File file) {
        return b(file.listFiles());
    }

    /* access modifiers changed from: 0000 */
    public File f() {
        return new File(d(), "nonfatal-sessions");
    }

    private File[] b(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private File[] c(String str) {
        return a((FilenameFilter) new l(str));
    }

    private void b(int i2) {
        HashSet hashSet = new HashSet();
        File[] q2 = q();
        int min = Math.min(i2, q2.length);
        for (int i3 = 0; i3 < min; i3++) {
            hashSet.add(a(q2[i3]));
        }
        this.r.a((Set<String>) hashSet);
        a(a((FilenameFilter) new a(null)), (Set<String>) hashSet);
    }

    /* access modifiers changed from: 0000 */
    public File c() {
        return new File(d(), "fatal-sessions");
    }

    /* access modifiers changed from: private */
    public boolean c(C6503gPa gpa) {
        boolean z2 = false;
        if (gpa == null) {
            return false;
        }
        if (gpa.d.a && !this.n.a()) {
            z2 = true;
        }
        return z2;
    }

    private static void c(String str, String str2) {
        Rg rg = (Rg) C5328TMa.a(Rg.class);
        if (rg == null) {
            C5328TMa.e().d("CrashlyticsCore", "Answers is not available");
        } else {
            rg.a(new defpackage.C7460uNa.a(str, str2));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z2) {
        k();
        this.z = new Li(new C1754ui(this), new c(null), z2, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.z);
    }

    /* access modifiers changed from: 0000 */
    public File d() {
        return this.o.a();
    }

    private static void d(String str, String str2) {
        Rg rg = (Rg) C5328TMa.a(Rg.class);
        if (rg == null) {
            C5328TMa.e().d("CrashlyticsCore", "Answers is not available");
        } else {
            rg.a(new defpackage.C7460uNa.b(str, str2));
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(b bVar, Thread thread, Throwable th, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics is handling uncaught exception \"");
        sb.append(th);
        sb.append("\" from thread ");
        sb.append(thread.getName());
        C5328TMa.e().d("CrashlyticsCore", sb.toString());
        this.u.a();
        Date date = new Date();
        Wh wh = this.k;
        C1784vi viVar = new C1784vi(this, date, thread, th, bVar, z2);
        wh.b(viVar);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.k.a((Runnable) new _h(this));
    }

    /* access modifiers changed from: 0000 */
    public File e() {
        return new File(d(), "invalidClsFiles");
    }

    private void b(byte[] bArr, File file) throws IOException {
        if (bArr != null && bArr.length > 0) {
            a(bArr, file);
        }
    }

    /* access modifiers changed from: private */
    public void b(Date date, Thread thread, Throwable th) {
        Mh mh;
        String str = "CrashlyticsCore";
        String str2 = "Failed to close fatal exception file output stream.";
        String str3 = "Failed to flush to session begin file.";
        Nh nh = null;
        try {
            String o2 = o();
            if (o2 == null) {
                C5328TMa.e().e(str, "Tried to write a fatal exception while no session was open.", null);
                C7391tNa.a((Flushable) null, str3);
                C7391tNa.a((Closeable) null, str2);
                return;
            }
            c(o2, th.getClass().getName());
            File d2 = d();
            StringBuilder sb = new StringBuilder();
            sb.append(o2);
            sb.append("SessionCrash");
            mh = new Mh(d2, sb.toString());
            try {
                nh = Nh.a((OutputStream) mh);
                a(nh, date, thread, th, "crash", true);
            } catch (Exception e2) {
                e = e2;
            }
            C7391tNa.a((Flushable) nh, str3);
            C7391tNa.a((Closeable) mh, str2);
        } catch (Exception e3) {
            e = e3;
            mh = null;
            try {
                C5328TMa.e().e(str, "An error occurred in the fatal exception logger", e);
                C7391tNa.a((Flushable) nh, str3);
                C7391tNa.a((Closeable) mh, str2);
            } catch (Throwable th2) {
                th = th2;
                C7391tNa.a((Flushable) nh, str3);
                C7391tNa.a((Closeable) mh, str2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mh = null;
            C7391tNa.a((Flushable) nh, str3);
            C7391tNa.a((Closeable) mh, str2);
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2, C6503gPa gpa) {
        if (gpa == null) {
            C5328TMa.e().w("CrashlyticsCore", "Could not send reports. Settings are not available.");
            return;
        }
        QOa qOa = gpa.a;
        new C1544nj(this.p.a, a(qOa.d, qOa.e), this.s, this.t).a(f2, c(gpa) ? new h(this.j, this.n, gpa.c) : new a());
    }

    /* access modifiers changed from: 0000 */
    public void a(long j2, String str) {
        this.k.a((Callable<T>) new C1814wi<T>(this, j2, str));
    }

    /* access modifiers changed from: 0000 */
    public void a(Thread thread, Throwable th) {
        this.k.a((Runnable) new C1844xi(this, new Date(), thread, th));
    }

    private byte[] b(String str, String str2) {
        File d2 = d();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return C1236dj.c(new File(d2, sb.toString()));
    }

    /* access modifiers changed from: 0000 */
    public void a(Map<String, String> map) {
        this.k.a((Callable<T>) new Xh<T>(this, map));
    }

    static String a(File file) {
        return file.getName().substring(0, 35);
    }

    private C1785vj b(String str) {
        if (g()) {
            return new C1785vj(this.j.R(), this.j.S(), this.j.Q());
        }
        return new _i(d()).c(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(C5635bPa bpa) throws Exception {
        a(bpa, false);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r5v0, types: [boolean, int] */
    public void a(C5635bPa bpa, int i2) throws Exception {
        b(i2 + 8);
        File[] q2 = q();
        String str = "CrashlyticsCore";
        if (q2.length <= i2) {
            C5328TMa.e().d(str, "No open sessions to be closed.");
            return;
        }
        g(a(q2[i2]));
        if (bpa == null) {
            C5328TMa.e().d(str, "Unable to close session. Settings are not loaded.");
        } else {
            a(q2, i2, bpa.c);
        }
    }

    /* access modifiers changed from: private */
    public void b(C6503gPa gpa) {
        if (gpa == null) {
            C5328TMa.e().w("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context e2 = this.j.e();
        QOa qOa = gpa.a;
        C1544nj njVar = new C1544nj(this.p.a, a(qOa.d, qOa.e), this.s, this.t);
        for (File qjVar : h()) {
            this.k.a((Runnable) new k(e2, new C1636qj(qjVar, g), njVar));
        }
    }

    private void a(File[] fileArr, int i2, int i3) {
        String str = "CrashlyticsCore";
        C5328TMa.e().d(str, "Closing open sessions.");
        while (i2 < fileArr.length) {
            File file = fileArr[i2];
            String a2 = a(file);
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Closing session: ");
            sb.append(a2);
            e2.d(str, sb.toString());
            a(file, a2, i3);
            i2++;
        }
    }

    private void a(Mh mh) {
        if (mh != null) {
            try {
                mh.a();
            } catch (IOException e2) {
                C5328TMa.e().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(Set<File> set) {
        for (File c2 : set) {
            c(c2);
        }
    }

    private void a(String str) {
        for (File delete : c(str)) {
            delete.delete();
        }
    }

    private File[] a(FileFilter fileFilter) {
        return b(d().listFiles(fileFilter));
    }

    /* access modifiers changed from: private */
    public File[] a(FilenameFilter filenameFilter) {
        return a(d(), filenameFilter);
    }

    private File[] a(File file, FilenameFilter filenameFilter) {
        return b(file.listFiles(filenameFilter));
    }

    private void a(String str, int i2) {
        File d2 = d();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        C1845xj.a(d2, new d(sb.toString()), i2, e);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        int a2 = i2 - C1845xj.a(c(), i2, e);
        C1845xj.a(d(), b, a2 - C1845xj.a(f(), a2, e), e);
    }

    private void a(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = f.matcher(name);
            String str = "CrashlyticsCore";
            if (!matcher.matches()) {
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting unknown file: ");
                sb.append(name);
                e2.d(str, sb.toString());
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                C5701cNa e3 = C5328TMa.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Trimming session file: ");
                sb2.append(name);
                e3.d(str, sb2.toString());
                file.delete();
            }
        }
    }

    private File[] a(String str, File[] fileArr, int i2) {
        if (fileArr.length <= i2) {
            return fileArr;
        }
        C5328TMa.e().d("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i2)}));
        a(str, i2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        return a((FilenameFilter) new d(sb.toString()));
    }

    /* access modifiers changed from: 0000 */
    public void a(File[] fileArr) {
        String str;
        File[] a2;
        HashSet hashSet = new HashSet();
        int length = fileArr.length;
        int i2 = 0;
        while (true) {
            str = "CrashlyticsCore";
            if (i2 >= length) {
                break;
            }
            File file = fileArr[i2];
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Found invalid session part file: ");
            sb.append(file);
            e2.d(str, sb.toString());
            hashSet.add(a(file));
            i2++;
        }
        if (!hashSet.isEmpty()) {
            File e3 = e();
            if (!e3.exists()) {
                e3.mkdir();
            }
            for (File file2 : a((FilenameFilter) new C0308ai(this, hashSet))) {
                C5701cNa e4 = C5328TMa.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Moving session file: ");
                sb2.append(file2);
                e4.d(str, sb2.toString());
                if (!file2.renameTo(new File(e3, file2.getName()))) {
                    C5701cNa e5 = C5328TMa.e();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not move session file. Deleting ");
                    sb3.append(file2);
                    e5.d(str, sb3.toString());
                    file2.delete();
                }
            }
            r();
        }
    }

    /* access modifiers changed from: private */
    public void a(Context context, File file, String str) throws IOException {
        byte[] b2 = C1236dj.b(file);
        byte[] a2 = C1236dj.a(file);
        byte[] a3 = C1236dj.a(file, context);
        String str2 = "CrashlyticsCore";
        if (b2 == null || b2.length == 0) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("No minidump data found in directory ");
            sb.append(file);
            e2.w(str2, sb.toString());
            return;
        }
        c(str, "<native-crash: minidump>");
        byte[] b3 = b(str, "BeginSession.json");
        byte[] b4 = b(str, "SessionApp.json");
        byte[] b5 = b(str, "SessionDevice.json");
        byte[] b6 = b(str, "SessionOS.json");
        byte[] c2 = C1236dj.c(new _i(d()).b(str));
        Yi yi = new Yi(this.j.e(), this.q, str);
        byte[] c3 = yi.c();
        yi.a();
        byte[] c4 = C1236dj.c(new _i(d()).a(str));
        File file2 = new File(this.o.a(), str);
        if (!file2.mkdir()) {
            C5328TMa.e().d(str2, "Couldn't create native sessions directory");
            return;
        }
        b(b2, new File(file2, "minidump"));
        b(a2, new File(file2, "metadata"));
        b(a3, new File(file2, "binaryImages"));
        b(b3, new File(file2, "session"));
        b(b4, new File(file2, "app"));
        b(b5, new File(file2, "device"));
        b(b6, new File(file2, "os"));
        b(c2, new File(file2, "user"));
        b(c3, new File(file2, "logs"));
        b(c4, new File(file2, "keys"));
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Ii ii) {
        if (ii == null) {
            return true;
        }
        return ((Boolean) this.k.b(new C0493bi(this, ii))).booleanValue();
    }

    private void a(byte[] bArr, File file) throws IOException {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                C7391tNa.a((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                C7391tNa.a((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C7391tNa.a((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void a(Date date, Thread thread, Throwable th) {
        Mh mh;
        String str = "Failed to close non-fatal file output stream.";
        String str2 = "Failed to flush to non-fatal file.";
        String o2 = o();
        Nh nh = null;
        String str3 = "CrashlyticsCore";
        if (o2 == null) {
            C5328TMa.e().e(str3, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        d(o2, th.getClass().getName());
        try {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Crashlytics is logging non-fatal exception \"");
            sb.append(th);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            e2.d(str3, sb.toString());
            String b2 = C7391tNa.b(this.i.getAndIncrement());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(o2);
            sb2.append("SessionEvent");
            sb2.append(b2);
            mh = new Mh(d(), sb2.toString());
            try {
                Nh a2 = Nh.a((OutputStream) mh);
                try {
                    a(a2, date, thread, th, "error", false);
                    C7391tNa.a((Flushable) a2, str2);
                } catch (Exception e3) {
                    e = e3;
                    nh = a2;
                    try {
                        C5328TMa.e().e(str3, "An error occurred in the non-fatal exception logger", e);
                        C7391tNa.a((Flushable) nh, str2);
                        C7391tNa.a((Closeable) mh, str);
                        a(o2, 64);
                    } catch (Throwable th2) {
                        th = th2;
                        C7391tNa.a((Flushable) nh, str2);
                        C7391tNa.a((Closeable) mh, str);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    nh = a2;
                    C7391tNa.a((Flushable) nh, str2);
                    C7391tNa.a((Closeable) mh, str);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                C5328TMa.e().e(str3, "An error occurred in the non-fatal exception logger", e);
                C7391tNa.a((Flushable) nh, str2);
                C7391tNa.a((Closeable) mh, str);
                a(o2, 64);
            }
        } catch (Exception e5) {
            e = e5;
            mh = null;
            C5328TMa.e().e(str3, "An error occurred in the non-fatal exception logger", e);
            C7391tNa.a((Flushable) nh, str2);
            C7391tNa.a((Closeable) mh, str);
            a(o2, 64);
        } catch (Throwable th4) {
            th = th4;
            mh = null;
            C7391tNa.a((Flushable) nh, str2);
            C7391tNa.a((Closeable) mh, str);
            throw th;
        }
        C7391tNa.a((Closeable) mh, str);
        try {
            a(o2, 64);
        } catch (Exception e6) {
            C5328TMa.e().e(str3, "An error occurred when trimming non-fatal files.", e6);
        }
    }

    private void a(String str, String str2, b bVar) throws Exception {
        Mh mh;
        String str3 = "Failed to close session ";
        String str4 = "Failed to flush to session ";
        String str5 = " file.";
        Nh nh = null;
        try {
            File d2 = d();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            mh = new Mh(d2, sb.toString());
            try {
                nh = Nh.a((OutputStream) mh);
                bVar.a(nh);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str5);
                C7391tNa.a((Flushable) nh, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(str2);
                sb3.append(str5);
                C7391tNa.a((Closeable) mh, sb3.toString());
            } catch (Throwable th) {
                th = th;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(str2);
                sb4.append(str5);
                C7391tNa.a((Flushable) nh, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(str2);
                sb5.append(str5);
                C7391tNa.a((Closeable) mh, sb5.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mh = null;
            StringBuilder sb42 = new StringBuilder();
            sb42.append(str4);
            sb42.append(str2);
            sb42.append(str5);
            C7391tNa.a((Flushable) nh, sb42.toString());
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str3);
            sb52.append(str2);
            sb52.append(str5);
            C7391tNa.a((Closeable) mh, sb52.toString());
            throw th;
        }
    }

    private void a(String str, String str2, e eVar) throws Exception {
        String str3 = " file.";
        String str4 = "Failed to close ";
        FileOutputStream fileOutputStream = null;
        try {
            File d2 = d();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(d2, sb.toString()));
            try {
                eVar.a(fileOutputStream2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str3);
                C7391tNa.a((Closeable) fileOutputStream2, sb2.toString());
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(str2);
                sb3.append(str3);
                C7391tNa.a((Closeable) fileOutputStream, sb3.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            StringBuilder sb32 = new StringBuilder();
            sb32.append(str4);
            sb32.append(str2);
            sb32.append(str3);
            C7391tNa.a((Closeable) fileOutputStream, sb32.toString());
            throw th;
        }
    }

    private void a(String str, Date date) throws Exception {
        String str2 = str;
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{this.j.x()});
        long time = date.getTime() / 1000;
        C0524ci ciVar = new C0524ci(this, str2, format, time);
        a(str, "BeginSession", (b) ciVar);
        C1265ei eiVar = new C1265ei(this, str2, format, time);
        a(str, "BeginSession.json", (e) eiVar);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2, types: [boolean]
  assigns: []
  uses: [boolean, ?[int, byte, short, char]]
  mth insns count: 75
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    private void a(Nh nh, Date date, Thread thread, Throwable th, String str, boolean z2) throws Exception {
        Thread[] threadArr;
        ? r6;
        Map map;
        Map map2;
        C1725tj tjVar = new C1725tj(th, this.v);
        Context e2 = this.j.e();
        long time = date.getTime() / 1000;
        Float e3 = C7391tNa.e(e2);
        int a2 = C7391tNa.a(e2, this.u.c());
        boolean g2 = C7391tNa.g(e2);
        int i2 = e2.getResources().getConfiguration().orientation;
        long b2 = C7391tNa.b() - C7391tNa.a(e2);
        long a3 = C7391tNa.a(Environment.getDataDirectory().getPath());
        RunningAppProcessInfo a4 = C7391tNa.a(e2.getPackageName(), e2);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = tjVar.c;
        String str2 = this.p.b;
        String c2 = this.m.c();
        int i3 = 0;
        if (z2) {
            Map allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Entry entry : allStackTraces.entrySet()) {
                threadArr2[i3] = (Thread) entry.getKey();
                linkedList.add(this.v.a((StackTraceElement[]) entry.getValue()));
                i3++;
            }
            threadArr = threadArr2;
            r6 = 1;
        } else {
            threadArr = new Thread[0];
            r6 = 1;
        }
        if (!C7391tNa.a(e2, "com.crashlytics.CollectCustomKeys", (boolean) r6)) {
            map2 = new TreeMap();
        } else {
            map2 = this.j.N();
            if (map2 != null && map2.size() > r6) {
                map = new TreeMap(map2);
                C1606pj.a(nh, time, str, tjVar, thread, stackTraceElementArr, threadArr, (List<StackTraceElement[]>) linkedList, map, this.r, a4, i2, c2, str2, e3, a2, g2, b2, a3);
            }
        }
        map = map2;
        C1606pj.a(nh, time, str, tjVar, thread, stackTraceElementArr, threadArr, (List<StackTraceElement[]>) linkedList, map, this.r, a4, i2, c2, str2, e3, a2, g2, b2, a3);
    }

    private void a(File file, String str, int i2) {
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Collecting session parts for ID ");
        sb.append(str);
        String str2 = "CrashlyticsCore";
        e2.d(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("SessionCrash");
        File[] a2 = a((FilenameFilter) new d(sb2.toString()));
        boolean z2 = a2 != null && a2.length > 0;
        C5328TMa.e().d(str2, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z2)}));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("SessionEvent");
        File[] a3 = a((FilenameFilter) new d(sb3.toString()));
        boolean z3 = a3 != null && a3.length > 0;
        C5328TMa.e().d(str2, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z3)}));
        if (z2 || z3) {
            a(file, str, a(str, a3, i2), z2 ? a2[0] : null);
        } else {
            C5701cNa e3 = C5328TMa.e();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("No events present for session ID ");
            sb4.append(str);
            e3.d(str2, sb4.toString());
        }
        C5701cNa e4 = C5328TMa.e();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Removing session part files for ID ");
        sb5.append(str);
        e4.d(str2, sb5.toString());
        a(str);
    }

    private void a(File file, String str, File[] fileArr, File file2) {
        Mh mh;
        String str2 = str;
        File file3 = file2;
        String str3 = "Failed to close CLS file";
        String str4 = "CrashlyticsCore";
        String str5 = "Error flushing session file stream";
        boolean z2 = file3 != null;
        File c2 = z2 ? c() : f();
        if (!c2.exists()) {
            c2.mkdirs();
        }
        try {
            mh = new Mh(c2, str2);
            try {
                Nh a2 = Nh.a((OutputStream) mh);
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Collecting SessionStart data for session ID ");
                sb.append(str2);
                e2.d(str4, sb.toString());
                a(a2, file);
                a2.b(4, new Date().getTime() / 1000);
                a2.b(5, z2);
                a2.g(11, 1);
                a2.d(12, 3);
                a(a2, str2);
                a(a2, fileArr, str2);
                if (z2) {
                    a(a2, file3);
                }
                C7391tNa.a((Flushable) a2, str5);
                C7391tNa.a((Closeable) mh, str3);
            } catch (Exception e3) {
                e = e3;
                try {
                    C5701cNa e4 = C5328TMa.e();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to write session file for session ID: ");
                    sb2.append(str2);
                    e4.e(str4, sb2.toString(), e);
                    C7391tNa.a((Flushable) null, str5);
                    a(mh);
                } catch (Throwable th) {
                    th = th;
                    C7391tNa.a((Flushable) null, str5);
                    C7391tNa.a((Closeable) mh, str3);
                    throw th;
                }
            }
        } catch (Exception e5) {
            e = e5;
            mh = null;
            C5701cNa e42 = C5328TMa.e();
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Failed to write session file for session ID: ");
            sb22.append(str2);
            e42.e(str4, sb22.toString(), e);
            C7391tNa.a((Flushable) null, str5);
            a(mh);
        } catch (Throwable th2) {
            th = th2;
            mh = null;
            C7391tNa.a((Flushable) null, str5);
            C7391tNa.a((Closeable) mh, str3);
            throw th;
        }
    }

    private static void a(Nh nh, File[] fileArr, String str) {
        String str2 = "CrashlyticsCore";
        Arrays.sort(fileArr, C7391tNa.d);
        for (File file : fileArr) {
            try {
                C5328TMa.e().d(str2, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                a(nh, file);
            } catch (Exception e2) {
                C5328TMa.e().e(str2, "Error writting non-fatal to session.", e2);
            }
        }
    }

    private void a(Nh nh, String str) throws IOException {
        String[] strArr;
        for (String str2 : h) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(".cls");
            File[] a2 = a((FilenameFilter) new d(sb.toString()));
            String str3 = " data for session ID ";
            String str4 = "CrashlyticsCore";
            if (a2.length == 0) {
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find ");
                sb2.append(str2);
                sb2.append(str3);
                sb2.append(str);
                e2.e(str4, sb2.toString(), null);
            } else {
                C5701cNa e3 = C5328TMa.e();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Collecting ");
                sb3.append(str2);
                sb3.append(str3);
                sb3.append(str);
                e3.d(str4, sb3.toString());
                a(nh, a2[0]);
            }
        }
    }

    private static void a(Nh nh, File file) throws IOException {
        FileInputStream fileInputStream;
        String str = "Failed to close file input stream.";
        if (!file.exists()) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to include a file that doesn't exist: ");
            sb.append(file.getName());
            e2.e("CrashlyticsCore", sb.toString(), null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a((InputStream) fileInputStream, nh, (int) file.length());
                C7391tNa.a((Closeable) fileInputStream, str);
            } catch (Throwable th) {
                th = th;
                C7391tNa.a((Closeable) fileInputStream, str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C7391tNa.a((Closeable) fileInputStream, str);
            throw th;
        }
    }

    private static void a(InputStream inputStream, Nh nh, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < bArr.length) {
            int read = inputStream.read(bArr, i3, bArr.length - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        nh.a(bArr);
    }

    /* access modifiers changed from: 0000 */
    public void a(C6503gPa gpa) {
        if (gpa.d.e) {
            boolean a2 = this.x.a();
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Registered Firebase Analytics event listener for breadcrumbs: ");
            sb.append(a2);
            e2.d("CrashlyticsCore", sb.toString());
        }
    }

    private Ni a(String str, String str2) {
        String b2 = C7391tNa.b(this.j.e(), "com.crashlytics.ApiEndpoint");
        return new Ph(new Qi(this.j, b2, str, this.l), new C0525cj(this.j, b2, str2, this.l));
    }

    /* access modifiers changed from: private */
    public void a(long j2) {
        String str = "CrashlyticsCore";
        if (n()) {
            C5328TMa.e().d(str, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return;
        }
        if (this.y != null) {
            C5328TMa.e().d(str, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j2);
            this.y.a("clx", "_ae", bundle);
        } else {
            C5328TMa.e().d(str, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }
}
