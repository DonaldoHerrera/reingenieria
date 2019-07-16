package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.C0920aa;
import com.google.android.gms.internal.measurement.C0948ea;
import com.google.android.gms.internal.measurement.C1042tb;
import com.google.android.gms.internal.measurement.Gb;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.V;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.internal.measurement.zzx;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Kd implements C1135kc {
    private static volatile Kd a;
    private Hb b;
    private C1144mb c;
    private he d;
    private C1159pb e;
    private Gd f;
    private ae g;
    private final Rd h;
    private Sc i;
    private final Mb j;
    private boolean k;
    private boolean l;
    private boolean m;
    @VisibleForTesting
    private long n;
    private List<Runnable> o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private FileLock u;
    private FileChannel v;
    private List<Long> w;
    private List<Long> x;
    private long y;

    class a implements je {
        W a;
        List<Long> b;
        List<S> c;
        private long d;

        private a() {
        }

        public final void a(W w) {
            Preconditions.checkNotNull(w);
            this.a = w;
        }

        /* synthetic */ a(Kd kd, Nd nd) {
            this();
        }

        public final boolean a(long j, S s) {
            Preconditions.checkNotNull(s);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && a((S) this.c.get(0)) != a(s)) {
                return false;
            }
            long d2 = this.d + ((long) s.d());
            if (d2 >= ((long) Math.max(0, ((Integer) C1127j.t.a(null)).intValue()))) {
                return false;
            }
            this.d = d2;
            this.c.add(s);
            this.b.add(Long.valueOf(j));
            if (this.c.size() >= Math.max(1, ((Integer) C1127j.u.a(null)).intValue())) {
                return false;
            }
            return true;
        }

        private static long a(S s) {
            return ((s.r() / 1000) / 60) / 60;
        }
    }

    private Kd(Qd qd) {
        this(qd, null);
    }

    private final boolean A() {
        B();
        m();
        return this.l;
    }

    private final void B() {
        this.j.d().i();
    }

    public static Kd a(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (a == null) {
            synchronized (Kd.class) {
                if (a == null) {
                    a = new Kd(new Qd(context));
                }
            }
        }
        return a;
    }

    private final C1159pb t() {
        C1159pb pbVar = this.e;
        if (pbVar != null) {
            return pbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final Gd u() {
        b((Ld) this.f);
        return this.f;
    }

    private final long v() {
        long currentTimeMillis = this.j.c().currentTimeMillis();
        C1168rb g2 = this.j.g();
        g2.o();
        g2.i();
        long a2 = g2.j.a();
        if (a2 == 0) {
            a2 = 1 + ((long) g2.l().u().nextInt(86400000));
            g2.j.a(a2);
        }
        return ((((currentTimeMillis + a2) / 1000) / 60) / 60) / 24;
    }

    private final boolean w() {
        B();
        m();
        return i().D() || !TextUtils.isEmpty(i().y());
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c0  */
    private final void x() {
        long j2;
        long j3;
        B();
        m();
        if (A() || this.j.h().a(C1127j.sa)) {
            if (this.n > 0) {
                long abs = 3600000 - Math.abs(this.j.c().elapsedRealtime() - this.n);
                if (abs > 0) {
                    this.j.e().A().a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                    t().a();
                    u().u();
                    return;
                }
                this.n = 0;
            }
            if (!this.j.t() || !w()) {
                this.j.e().A().a("Nothing to upload or uploading impossible");
                t().a();
                u().u();
                return;
            }
            long currentTimeMillis = this.j.c().currentTimeMillis();
            long max = Math.max(0, ((Long) C1127j.L.a(null)).longValue());
            boolean z = i().E() || i().z();
            if (z) {
                String u2 = this.j.h().u();
                if (TextUtils.isEmpty(u2) || ".none.".equals(u2)) {
                    j2 = Math.max(0, ((Long) C1127j.F.a(null)).longValue());
                } else {
                    j2 = Math.max(0, ((Long) C1127j.G.a(null)).longValue());
                }
            } else {
                j2 = Math.max(0, ((Long) C1127j.E.a(null)).longValue());
            }
            long a2 = this.j.g().f.a();
            long a3 = this.j.g().g.a();
            long j4 = j2;
            long j5 = max;
            long max2 = Math.max(i().B(), i().C());
            if (max2 != 0) {
                long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                long abs3 = currentTimeMillis - Math.abs(a2 - currentTimeMillis);
                long abs4 = currentTimeMillis - Math.abs(a3 - currentTimeMillis);
                long max3 = Math.max(abs3, abs4);
                long j6 = abs2 + j5;
                if (z && max3 > 0) {
                    j6 = Math.min(abs2, max3) + j4;
                }
                long j7 = j4;
                j3 = !g().a(max3, j7) ? max3 + j7 : j6;
                if (abs4 != 0 && abs4 >= abs2) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= Math.min(20, Math.max(0, ((Integer) C1127j.N.a(null)).intValue()))) {
                            break;
                        }
                        j3 += Math.max(0, ((Long) C1127j.M.a(null)).longValue()) * (1 << i2);
                        if (j3 > abs4) {
                            break;
                        }
                        i2++;
                    }
                }
                if (j3 != 0) {
                    this.j.e().A().a("Next upload time is 0");
                    t().a();
                    u().u();
                    return;
                } else if (!k().u()) {
                    this.j.e().A().a("No network");
                    t().b();
                    u().u();
                    return;
                } else {
                    long a4 = this.j.g().h.a();
                    long max4 = Math.max(0, ((Long) C1127j.C.a(null)).longValue());
                    if (!g().a(a4, max4)) {
                        j3 = Math.max(j3, a4 + max4);
                    }
                    t().a();
                    long currentTimeMillis2 = j3 - this.j.c().currentTimeMillis();
                    if (currentTimeMillis2 <= 0) {
                        currentTimeMillis2 = Math.max(0, ((Long) C1127j.H.a(null)).longValue());
                        this.j.g().f.a(this.j.c().currentTimeMillis());
                    }
                    this.j.e().A().a("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
                    u().a(currentTimeMillis2);
                    return;
                }
            }
            j3 = 0;
            if (j3 != 0) {
            }
        }
    }

    private final void y() {
        B();
        if (this.r || this.s || this.t) {
            this.j.e().A().a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.valueOf(this.t));
            return;
        }
        this.j.e().A().a("Stopping uploading service(s)");
        List<Runnable> list = this.o;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.o.clear();
        }
    }

    @VisibleForTesting
    private final boolean z() {
        B();
        String str = "Storage concurrent access okay";
        if (this.j.h().a(C1127j.Na)) {
            FileLock fileLock = this.u;
            if (fileLock != null && fileLock.isValid()) {
                this.j.e().A().a(str);
                return true;
            }
        }
        try {
            this.v = new RandomAccessFile(new File(this.j.getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.u = this.v.tryLock();
            if (this.u != null) {
                this.j.e().A().a(str);
                return true;
            }
            this.j.e().s().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            this.j.e().s().a("Failed to acquire storage lock", e2);
        } catch (IOException e3) {
            this.j.e().s().a("Failed to access storage lock file", e3);
        } catch (OverlappingFileLockException e4) {
            this.j.e().v().a("Storage lock already acquired", e4);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.j.d().i();
        i().A();
        if (this.j.g().f.a() == 0) {
            this.j.g().f.a(this.j.c().currentTimeMillis());
        }
        x();
    }

    public final Clock c() {
        return this.j.c();
    }

    public final Gb d() {
        return this.j.d();
    }

    public final C1124ib e() {
        return this.j.e();
    }

    public final ce f() {
        return this.j.h();
    }

    public final Rd g() {
        b((Ld) this.h);
        return this.h;
    }

    public final Context getContext() {
        return this.j.getContext();
    }

    public final ae h() {
        b((Ld) this.g);
        return this.g;
    }

    public final he i() {
        b((Ld) this.d);
        return this.d;
    }

    public final Hb j() {
        b((Ld) this.b);
        return this.b;
    }

    public final C1144mb k() {
        b((Ld) this.c);
        return this.c;
    }

    public final Sc l() {
        b((Ld) this.i);
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public final void m() {
        if (!this.k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:95|96) */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r1.j.e().s().a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C1124ib.a(r5), r9);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x02c2 */
    public final void n() {
        String str;
        B();
        m();
        this.t = true;
        try {
            this.j.a();
            Boolean G = this.j.z().G();
            if (G == null) {
                this.j.e().v().a("Upload data called on the client side before use of service was decided");
            } else if (G.booleanValue()) {
                this.j.e().s().a("Upload called in the client side when service should be used");
                this.t = false;
                y();
            } else if (this.n > 0) {
                x();
                this.t = false;
                y();
            } else {
                B();
                if (this.w != null) {
                    this.j.e().A().a("Uploading requested multiple times");
                    this.t = false;
                    y();
                } else if (!k().u()) {
                    this.j.e().A().a("Network not connected, ignoring upload request");
                    x();
                    this.t = false;
                    y();
                } else {
                    long currentTimeMillis = this.j.c().currentTimeMillis();
                    a((String) null, currentTimeMillis - ce.t());
                    long a2 = this.j.g().f.a();
                    if (a2 != 0) {
                        this.j.e().z().a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - a2)));
                    }
                    String y2 = i().y();
                    if (!TextUtils.isEmpty(y2)) {
                        if (this.y == -1) {
                            this.y = i().F();
                        }
                        List a3 = i().a(y2, this.j.h().b(y2, C1127j.r), Math.max(0, this.j.h().b(y2, C1127j.s)));
                        if (!a3.isEmpty()) {
                            Iterator it = a3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                W w2 = (W) ((Pair) it.next()).first;
                                if (!TextUtils.isEmpty(w2.aa())) {
                                    str = w2.aa();
                                    break;
                                }
                            }
                            if (str != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= a3.size()) {
                                        break;
                                    }
                                    W w3 = (W) ((Pair) a3.get(i2)).first;
                                    if (!TextUtils.isEmpty(w3.aa()) && !w3.aa().equals(str)) {
                                        a3 = a3.subList(0, i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            com.google.android.gms.internal.measurement.V.a q2 = V.q();
                            int size = a3.size();
                            ArrayList arrayList = new ArrayList(a3.size());
                            boolean z = ce.v() && this.j.h().d(y2);
                            for (int i3 = 0; i3 < size; i3++) {
                                com.google.android.gms.internal.measurement.W.a aVar = (com.google.android.gms.internal.measurement.W.a) ((W) ((Pair) a3.get(i3)).first).l();
                                arrayList.add((Long) ((Pair) a3.get(i3)).second);
                                aVar.g(this.j.h().m());
                                aVar.a(currentTimeMillis);
                                this.j.a();
                                aVar.b(false);
                                if (!z) {
                                    aVar.z();
                                }
                                if (this.j.h().e(y2, C1127j.ya)) {
                                    aVar.l(g().a(((W) ((Gb) aVar.w())).g()));
                                }
                                q2.a(aVar);
                            }
                            Object a4 = this.j.e().a(2) ? g().a((V) ((Gb) q2.w())) : null;
                            g();
                            byte[] g2 = ((V) ((Gb) q2.w())).g();
                            String str2 = (String) C1127j.B.a(null);
                            URL url = new URL(str2);
                            Preconditions.checkArgument(!arrayList.isEmpty());
                            if (this.w != null) {
                                this.j.e().s().a("Set uploading progress before finishing the previous upload");
                            } else {
                                this.w = new ArrayList(arrayList);
                            }
                            this.j.g().g.a(currentTimeMillis);
                            String str3 = "?";
                            if (size > 0) {
                                str3 = q2.a(0).t();
                            }
                            this.j.e().A().a("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(g2.length), a4);
                            this.s = true;
                            C1144mb k2 = k();
                            Md md = new Md(this, y2);
                            k2.i();
                            k2.s();
                            Preconditions.checkNotNull(url);
                            Preconditions.checkNotNull(g2);
                            Preconditions.checkNotNull(md);
                            Gb d2 = k2.d();
                            C1164qb qbVar = new C1164qb(k2, y2, url, g2, null, md);
                            d2.b((Runnable) qbVar);
                        }
                    } else {
                        this.y = -1;
                        String a5 = i().a(currentTimeMillis - ce.t());
                        if (!TextUtils.isEmpty(a5)) {
                            Db b2 = i().b(a5);
                            if (b2 != null) {
                                a(b2);
                            }
                        }
                    }
                    this.t = false;
                    y();
                }
            }
        } finally {
            this.t = false;
            y();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void o() {
        B();
        m();
        if (!this.m) {
            this.m = true;
            B();
            m();
            if ((this.j.h().a(C1127j.sa) || A()) && z()) {
                int a2 = a(this.v);
                int E = this.j.y().E();
                B();
                if (a2 > E) {
                    this.j.e().s().a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a2), Integer.valueOf(E));
                } else if (a2 < E) {
                    if (a(E, this.v)) {
                        this.j.e().A().a("Storage version upgraded. Previous, current version", Integer.valueOf(a2), Integer.valueOf(E));
                    } else {
                        this.j.e().s().a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a2), Integer.valueOf(E));
                    }
                }
            }
        }
        if (!this.l && !this.j.h().a(C1127j.sa)) {
            this.j.e().y().a("This instance being marked as an uploader");
            this.l = true;
            x();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void p() {
        this.q++;
    }

    /* access modifiers changed from: 0000 */
    public final Mb q() {
        return this.j;
    }

    public final C1114gb r() {
        return this.j.E();
    }

    public final Vd s() {
        return this.j.F();
    }

    private Kd(Qd qd, Mb mb) {
        this.k = false;
        Preconditions.checkNotNull(qd);
        this.j = Mb.a(qd.a, (zzx) null);
        this.y = -1;
        Rd rd = new Rd(this);
        rd.q();
        this.h = rd;
        C1144mb mbVar = new C1144mb(this);
        mbVar.q();
        this.c = mbVar;
        Hb hb = new Hb(this);
        hb.q();
        this.b = hb;
        this.j.d().a((Runnable) new Nd(this, qd));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0188  */
    public final Db e(zzn zzn) {
        boolean z;
        B();
        m();
        Preconditions.checkNotNull(zzn);
        Preconditions.checkNotEmpty(zzn.a);
        Db b2 = i().b(zzn.a);
        String b3 = this.j.g().b(zzn.a);
        if (b2 == null) {
            b2 = new Db(this.j, zzn.a);
            b2.a(this.j.F().w());
            b2.d(b3);
        } else if (!b3.equals(b2.h())) {
            b2.d(b3);
            b2.a(this.j.F().w());
        } else {
            z = false;
            if (!TextUtils.equals(zzn.b, b2.c())) {
                b2.b(zzn.b);
                z = true;
            }
            if (!TextUtils.equals(zzn.r, b2.g())) {
                b2.c(zzn.r);
                z = true;
            }
            if (!TextUtils.isEmpty(zzn.k) && !zzn.k.equals(b2.b())) {
                b2.e(zzn.k);
                z = true;
            }
            long j2 = zzn.e;
            if (!(j2 == 0 || j2 == b2.n())) {
                b2.d(zzn.e);
                z = true;
            }
            if (!TextUtils.isEmpty(zzn.c) && !zzn.c.equals(b2.k())) {
                b2.f(zzn.c);
                z = true;
            }
            if (zzn.j != b2.l()) {
                b2.c(zzn.j);
                z = true;
            }
            String str = zzn.d;
            if (str != null && !str.equals(b2.m())) {
                b2.g(zzn.d);
                z = true;
            }
            if (zzn.f != b2.o()) {
                b2.e(zzn.f);
                z = true;
            }
            if (zzn.h != b2.d()) {
                b2.a(zzn.h);
                z = true;
            }
            if (!TextUtils.isEmpty(zzn.g) && !zzn.g.equals(b2.A())) {
                b2.h(zzn.g);
                z = true;
            }
            if (zzn.l != b2.C()) {
                b2.p(zzn.l);
                z = true;
            }
            if (zzn.o != b2.D()) {
                b2.b(zzn.o);
                z = true;
            }
            if (zzn.p != b2.E()) {
                b2.c(zzn.p);
                z = true;
            }
            if (this.j.h().e(zzn.a, C1127j.pa) && zzn.s != b2.F()) {
                b2.a(zzn.s);
                z = true;
            }
            long j3 = zzn.t;
            if (!(j3 == 0 || j3 == b2.p())) {
                b2.f(zzn.t);
                z = true;
            }
            if (z) {
                i().a(b2);
            }
            return b2;
        }
        z = true;
        if (!TextUtils.equals(zzn.b, b2.c())) {
        }
        if (!TextUtils.equals(zzn.r, b2.g())) {
        }
        b2.e(zzn.k);
        z = true;
        long j22 = zzn.e;
        b2.d(zzn.e);
        z = true;
        b2.f(zzn.c);
        z = true;
        if (zzn.j != b2.l()) {
        }
        String str2 = zzn.d;
        b2.g(zzn.d);
        z = true;
        if (zzn.f != b2.o()) {
        }
        if (zzn.h != b2.d()) {
        }
        b2.h(zzn.g);
        z = true;
        if (zzn.l != b2.C()) {
        }
        if (zzn.o != b2.D()) {
        }
        if (zzn.p != b2.E()) {
        }
        b2.a(zzn.s);
        z = true;
        long j32 = zzn.t;
        b2.f(zzn.t);
        z = true;
        if (z) {
        }
        return b2;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04a7 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0140 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0266 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0273 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0285 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    public final void c(zzn zzn) {
        String str;
        int i2;
        Db b2;
        C1107f fVar;
        String str2;
        long j2;
        long j3;
        PackageInfo packageInfo;
        String str3;
        ApplicationInfo applicationInfo;
        boolean z;
        zzn zzn2 = zzn;
        String str4 = "_sys";
        String str5 = "_pfo";
        String str6 = "_uwa";
        String str7 = "app_id=?";
        B();
        m();
        Preconditions.checkNotNull(zzn);
        Preconditions.checkNotEmpty(zzn2.a);
        if (!TextUtils.isEmpty(zzn2.b) || !TextUtils.isEmpty(zzn2.r)) {
            Db b3 = i().b(zzn2.a);
            if (b3 != null && TextUtils.isEmpty(b3.c()) && !TextUtils.isEmpty(zzn2.b)) {
                b3.h(0);
                i().a(b3);
                j().d(zzn2.a);
            }
            if (!zzn2.h) {
                e(zzn);
                return;
            }
            long j4 = zzn2.m;
            if (j4 == 0) {
                j4 = this.j.c().currentTimeMillis();
            }
            if (this.j.h().e(zzn2.a, C1127j.pa)) {
                this.j.D().v();
            }
            int i3 = zzn2.n;
            if (!(i3 == 0 || i3 == 1)) {
                this.j.e().v().a("Incorrect app type, assuming installed app. appId, appType", C1124ib.a(zzn2.a), Integer.valueOf(i3));
                i3 = 0;
            }
            i().u();
            try {
                if (this.j.h().e(zzn2.a, C1127j.pa)) {
                    Sd d2 = i().d(zzn2.a, "_npa");
                    if (d2 == null || "auto".equals(d2.b)) {
                        if (zzn2.s != null) {
                            zzjn zzjn = r11;
                            str = str4;
                            Sd sd = d2;
                            i2 = 1;
                            zzjn zzjn2 = new zzjn("_npa", j4, Long.valueOf(zzn2.s.booleanValue() ? 1 : 0), "auto");
                            if (sd == null || !sd.e.equals(zzjn.d)) {
                                a(zzjn, zzn2);
                            }
                        } else {
                            str = str4;
                            i2 = 1;
                            if (d2 != null) {
                                zzjn zzjn3 = new zzjn("_npa", j4, null, "auto");
                                b(zzjn3, zzn2);
                            }
                        }
                        b2 = i().b(zzn2.a);
                        if (b2 != null) {
                            this.j.F();
                            if (Vd.a(zzn2.b, b2.c(), zzn2.r, b2.g())) {
                                this.j.e().v().a("New GMP App Id passed in. Removing cached database data. appId", C1124ib.a(b2.f()));
                                he i4 = i();
                                String f2 = b2.f();
                                i4.s();
                                i4.i();
                                Preconditions.checkNotEmpty(f2);
                                try {
                                    SQLiteDatabase w2 = i4.w();
                                    String[] strArr = new String[i2];
                                    try {
                                        strArr[0] = f2;
                                        int delete = w2.delete("events", str7, strArr) + 0 + w2.delete("user_attributes", str7, strArr) + w2.delete("conditional_properties", str7, strArr) + w2.delete("apps", str7, strArr) + w2.delete("raw_events", str7, strArr) + w2.delete("raw_events_metadata", str7, strArr) + w2.delete("event_filters", str7, strArr) + w2.delete("property_filters", str7, strArr) + w2.delete("audience_filter_values", str7, strArr);
                                        if (delete > 0) {
                                            i4.e().A().a("Deleted application data. app, records", f2, Integer.valueOf(delete));
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        i4.e().s().a("Error deleting application data. appId, error", C1124ib.a(f2), e);
                                        b2 = null;
                                        if (b2 != null) {
                                        }
                                        e(zzn);
                                        if (i3 != 0) {
                                        }
                                        if (fVar != null) {
                                        }
                                        i().x();
                                        i().v();
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    i4.e().s().a("Error deleting application data. appId, error", C1124ib.a(f2), e);
                                    b2 = null;
                                    if (b2 != null) {
                                    }
                                    e(zzn);
                                    if (i3 != 0) {
                                    }
                                    if (fVar != null) {
                                    }
                                    i().x();
                                    i().v();
                                }
                                b2 = null;
                                if (b2 != null) {
                                    String str8 = "_pv";
                                    if (b2.l() != -2147483648L) {
                                        if (b2.l() != zzn2.j) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString(str8, b2.k());
                                            zzai zzai = new zzai("_au", new zzah(bundle), "auto", j4);
                                            a(zzai, zzn2);
                                        }
                                    } else if (b2.k() != null && !b2.k().equals(zzn2.c)) {
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString(str8, b2.k());
                                        zzai zzai2 = new zzai("_au", new zzah(bundle2), "auto", j4);
                                        a(zzai2, zzn2);
                                    }
                                    e(zzn);
                                    fVar = i3 != 0 ? i().b(zzn2.a, "_f") : i3 == i2 ? i().b(zzn2.a, "_v") : null;
                                    if (fVar != null) {
                                        long j5 = ((j4 / 3600000) + 1) * 3600000;
                                        String str9 = "_dac";
                                        String str10 = "_r";
                                        String str11 = "_c";
                                        String str12 = "_et";
                                        if (i3 == 0) {
                                            str2 = str12;
                                            String str13 = str11;
                                            zzjn zzjn4 = new zzjn("_fot", j4, Long.valueOf(j5), "auto");
                                            a(zzjn4, zzn2);
                                            if (this.j.h().l(zzn2.b)) {
                                                B();
                                                this.j.j().a(zzn2.a);
                                            }
                                            B();
                                            m();
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong(str13, 1);
                                            bundle3.putLong(str10, 1);
                                            bundle3.putLong(str6, 0);
                                            bundle3.putLong(str5, 0);
                                            String str14 = str;
                                            bundle3.putLong(str14, 0);
                                            bundle3.putLong("_sysu", 0);
                                            if (this.j.h().r(zzn2.a)) {
                                                j3 = 1;
                                                bundle3.putLong(str2, 1);
                                            } else {
                                                j3 = 1;
                                            }
                                            if (zzn2.q) {
                                                bundle3.putLong(str9, j3);
                                            }
                                            if (this.j.getContext().getPackageManager() == null) {
                                                this.j.e().s().a("PackageManager is null, first open report might be inaccurate. appId", C1124ib.a(zzn2.a));
                                            } else {
                                                packageInfo = Wrappers.packageManager(this.j.getContext()).getPackageInfo(zzn2.a, 0);
                                                if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                                    str3 = str14;
                                                } else {
                                                    if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                                        bundle3.putLong(str6, 1);
                                                        z = false;
                                                    } else {
                                                        z = true;
                                                    }
                                                    String str15 = "_fi";
                                                    str3 = str14;
                                                    zzjn zzjn5 = new zzjn(str15, j4, Long.valueOf(z ? 1 : 0), "auto");
                                                    a(zzjn5, zzn2);
                                                }
                                                try {
                                                    applicationInfo = Wrappers.packageManager(this.j.getContext()).getApplicationInfo(zzn2.a, 0);
                                                } catch (NameNotFoundException e4) {
                                                    this.j.e().s().a("Application info is null, first open report might be inaccurate. appId", C1124ib.a(zzn2.a), e4);
                                                    applicationInfo = null;
                                                }
                                                if (applicationInfo != null) {
                                                    if ((applicationInfo.flags & 1) != 0) {
                                                        bundle3.putLong(str3, 1);
                                                    }
                                                    if ((applicationInfo.flags & 128) != 0) {
                                                        bundle3.putLong("_sysu", 1);
                                                    }
                                                }
                                            }
                                            he i5 = i();
                                            String str16 = zzn2.a;
                                            Preconditions.checkNotEmpty(str16);
                                            i5.i();
                                            i5.s();
                                            long i6 = i5.i(str16, "first_open_count");
                                            if (i6 >= 0) {
                                                bundle3.putLong(str5, i6);
                                            }
                                            zzai zzai3 = new zzai("_f", new zzah(bundle3), "auto", j4);
                                            a(zzai3, zzn2);
                                        } else {
                                            str2 = str12;
                                            String str17 = str11;
                                            if (i3 == 1) {
                                                zzjn zzjn6 = new zzjn("_fvt", j4, Long.valueOf(j5), "auto");
                                                a(zzjn6, zzn2);
                                                B();
                                                m();
                                                Bundle bundle4 = new Bundle();
                                                bundle4.putLong(str17, 1);
                                                bundle4.putLong(str10, 1);
                                                if (this.j.h().r(zzn2.a)) {
                                                    j2 = 1;
                                                    bundle4.putLong(str2, 1);
                                                } else {
                                                    j2 = 1;
                                                }
                                                if (zzn2.q) {
                                                    bundle4.putLong(str9, j2);
                                                }
                                                zzai zzai4 = new zzai("_v", new zzah(bundle4), "auto", j4);
                                                a(zzai4, zzn2);
                                            }
                                        }
                                        if (!this.j.h().e(zzn2.a, C1127j.oa)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong(str2, 1);
                                            if (this.j.h().r(zzn2.a)) {
                                                bundle5.putLong("_fr", 1);
                                            }
                                            zzai zzai5 = new zzai("_e", new zzah(bundle5), "auto", j4);
                                            a(zzai5, zzn2);
                                        }
                                    } else if (zzn2.i) {
                                        zzai zzai6 = new zzai("_cd", new zzah(new Bundle()), "auto", j4);
                                        a(zzai6, zzn2);
                                    }
                                    i().x();
                                    i().v();
                                }
                                e(zzn);
                                if (i3 != 0) {
                                }
                                if (fVar != null) {
                                }
                                i().x();
                                i().v();
                            }
                        }
                        if (b2 != null) {
                        }
                        e(zzn);
                        if (i3 != 0) {
                        }
                        if (fVar != null) {
                        }
                        i().x();
                        i().v();
                    }
                }
                str = str4;
                i2 = 1;
                b2 = i().b(zzn2.a);
                if (b2 != null) {
                }
                if (b2 != null) {
                }
                e(zzn);
                if (i3 != 0) {
                }
                if (fVar != null) {
                }
            } catch (NameNotFoundException e5) {
                this.j.e().s().a("Package info is null, first open report might be inaccurate. appId", C1124ib.a(zzn2.a), e5);
                packageInfo = null;
            } catch (Throwable th) {
                i().v();
                throw th;
            }
            i().x();
            i().v();
        }
    }

    /* access modifiers changed from: 0000 */
    public final String d(zzn zzn) {
        try {
            return (String) this.j.d().a((Callable<V>) new Od<V>(this, zzn)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.j.e().s().a("Failed to get app instance id. appId", C1124ib.a(zzn.a), e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void a(Qd qd) {
        this.j.d().i();
        he heVar = new he(this);
        heVar.q();
        this.d = heVar;
        this.j.h().a((ee) this.b);
        ae aeVar = new ae(this);
        aeVar.q();
        this.g = aeVar;
        Sc sc = new Sc(this);
        sc.q();
        this.i = sc;
        Gd gd = new Gd(this);
        gd.q();
        this.f = gd;
        this.e = new C1159pb(this);
        if (this.p != this.q) {
            this.j.e().s().a("Not all upload components initialized", Integer.valueOf(this.p), Integer.valueOf(this.q));
        }
        this.k = true;
    }

    private static void b(Ld ld) {
        if (ld == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!ld.r()) {
            String valueOf = String.valueOf(ld.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(zzn zzn) {
        B();
        m();
        Preconditions.checkNotEmpty(zzn.a);
        e(zzn);
    }

    /* JADX WARNING: Removed duplicated region for block: B:247:0x0848 A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0878 A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x026f A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02a6 A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f4 A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0321  */
    private final void b(zzai zzai, zzn zzn) {
        long j2;
        long intValue;
        String str;
        C1107f fVar;
        boolean z;
        long j3;
        Sd sd;
        zzai zzai2 = zzai;
        zzn zzn2 = zzn;
        String str2 = "_s";
        Preconditions.checkNotNull(zzn);
        Preconditions.checkNotEmpty(zzn2.a);
        long nanoTime = System.nanoTime();
        B();
        m();
        String str3 = zzn2.a;
        if (g().a(zzai2, zzn2)) {
            if (!zzn2.h) {
                e(zzn2);
                return;
            }
            String str4 = "_err";
            if (j().b(str3, zzai2.a)) {
                this.j.e().v().a("Dropping blacklisted event. appId", C1124ib.a(str3), this.j.E().a(zzai2.a));
                boolean z2 = j().g(str3) || j().h(str3);
                if (!z2 && !str4.equals(zzai2.a)) {
                    this.j.F().a(str3, 11, "_ev", zzai2.a, 0);
                }
                if (z2) {
                    Db b2 = i().b(str3);
                    if (b2 != null) {
                        if (Math.abs(this.j.c().currentTimeMillis() - Math.max(b2.s(), b2.r())) > ((Long) C1127j.K.a(null)).longValue()) {
                            this.j.e().z().a("Fetching config for blacklisted app");
                            a(b2);
                        }
                    }
                }
                return;
            }
            if (this.j.e().a(2)) {
                this.j.e().A().a("Logging event", this.j.E().a(zzai2));
            }
            i().u();
            e(zzn2);
            String str5 = "ecommerce_purchase";
            if (!"_iap".equals(zzai2.a)) {
                if (!str5.equals(zzai2.a)) {
                    j2 = nanoTime;
                    boolean a2 = Vd.a(zzai2.a);
                    boolean equals = str4.equals(zzai2.a);
                    String str6 = str3;
                    ge a3 = i().a(v(), str3, true, a2, false, equals, false);
                    intValue = a3.b - ((long) ((Integer) C1127j.v.a(null)).intValue());
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            this.j.e().s().a("Data loss. Too many events logged. appId, count", C1124ib.a(str6), Long.valueOf(a3.b));
                        }
                        i().x();
                        i().v();
                        return;
                    }
                    if (a2) {
                        long intValue2 = a3.a - ((long) ((Integer) C1127j.x.a(null)).intValue());
                        if (intValue2 > 0) {
                            if (intValue2 % 1000 == 1) {
                                this.j.e().s().a("Data loss. Too many public events logged. appId, count", C1124ib.a(str6), Long.valueOf(a3.a));
                            }
                            this.j.F().a(str6, 16, "_ev", zzai2.a, 0);
                            i().x();
                            i().v();
                            return;
                        }
                    }
                    if (equals) {
                        long max = a3.d - ((long) Math.max(0, Math.min(1000000, this.j.h().b(zzn2.a, C1127j.w))));
                        if (max > 0) {
                            if (max == 1) {
                                this.j.e().s().a("Too many error events logged. appId, count", C1124ib.a(str6), Long.valueOf(a3.d));
                            }
                            i().x();
                            i().v();
                            return;
                        }
                    }
                    Bundle i2 = zzai2.b.i();
                    this.j.F().a(i2, "_o", (Object) zzai2.c);
                    String str7 = str6;
                    String str8 = "_r";
                    if (this.j.F().f(str7)) {
                        this.j.F().a(i2, "_dbg", (Object) Long.valueOf(1));
                        this.j.F().a(i2, str8, (Object) Long.valueOf(1));
                    }
                    String str9 = "_sno";
                    if (str2.equals(zzai2.a)) {
                        if (this.j.h().o(zzn2.a)) {
                            Sd d2 = i().d(zzn2.a, str9);
                            if (d2 != null && (d2.e instanceof Long)) {
                                this.j.F().a(i2, str9, d2.e);
                            }
                        }
                    }
                    if (!str2.equals(zzai2.a) || !this.j.h().e(zzn2.a, C1127j.la) || this.j.h().o(zzn2.a)) {
                        str = null;
                    } else {
                        str = null;
                        b(new zzjn(str9, 0, null), zzn2);
                    }
                    long c2 = i().c(str7);
                    if (c2 > 0) {
                        this.j.e().v().a("Data lost. Too many events stored on disk, deleted. appId", C1124ib.a(str7), Long.valueOf(c2));
                    }
                    Mb mb = this.j;
                    String str10 = zzai2.c;
                    String str11 = zzai2.a;
                    long j4 = zzai2.d;
                    String str12 = str8;
                    String str13 = str7;
                    String str14 = str;
                    C1112g gVar = new C1112g(mb, str10, str7, str11, j4, 0, i2);
                    C1107f b3 = i().b(str13, gVar.b);
                    if (b3 != null) {
                        gVar = gVar.a(this.j, b3.f);
                        fVar = b3.a(gVar.d);
                    } else if (i().g(str13) < 500 || !a2) {
                        fVar = new C1107f(str13, gVar.b, 0, 0, gVar.d, 0, null, null, null, null);
                    } else {
                        this.j.e().s().a("Too many event names used, ignoring event. appId, name, supported count", C1124ib.a(str13), this.j.E().a(gVar.b), Integer.valueOf(HttpStatus.HTTP_INTERNAL_SERVER_ERROR));
                        this.j.F().a(str13, 8, (String) null, (String) null, 0);
                        i().v();
                        return;
                    }
                    i().a(fVar);
                    B();
                    m();
                    Preconditions.checkNotNull(gVar);
                    Preconditions.checkNotNull(zzn);
                    Preconditions.checkNotEmpty(gVar.a);
                    Preconditions.checkArgument(gVar.a.equals(zzn2.a));
                    com.google.android.gms.internal.measurement.W.a va = W.va();
                    boolean z3 = true;
                    va.a(1);
                    va.a("android");
                    if (!TextUtils.isEmpty(zzn2.a)) {
                        va.f(zzn2.a);
                    }
                    if (!TextUtils.isEmpty(zzn2.d)) {
                        va.e(zzn2.d);
                    }
                    if (!TextUtils.isEmpty(zzn2.c)) {
                        va.g(zzn2.c);
                    }
                    if (zzn2.j != -2147483648L) {
                        va.g((int) zzn2.j);
                    }
                    va.f(zzn2.e);
                    if (!TextUtils.isEmpty(zzn2.b)) {
                        va.k(zzn2.b);
                    }
                    if (this.j.h().a(C1127j.za)) {
                        if (TextUtils.isEmpty(va.k()) && !TextUtils.isEmpty(zzn2.r)) {
                            va.o(zzn2.r);
                        }
                    } else if (!TextUtils.isEmpty(zzn2.r)) {
                        va.o(zzn2.r);
                    }
                    if (zzn2.f != 0) {
                        va.h(zzn2.f);
                    }
                    va.k(zzn2.t);
                    if (this.j.h().e(zzn2.a, C1127j.ta)) {
                        List u2 = g().u();
                        if (u2 != null) {
                            va.c((Iterable<? extends Integer>) u2);
                        }
                    }
                    Pair a4 = this.j.g().a(zzn2.a);
                    if (a4 == null || TextUtils.isEmpty((CharSequence) a4.first)) {
                        if (!this.j.D().a(this.j.getContext()) && zzn2.p) {
                            String string = Secure.getString(this.j.getContext().getContentResolver(), "android_id");
                            if (string == null) {
                                this.j.e().v().a("null secure ID. appId", C1124ib.a(va.l()));
                                string = "null";
                            } else if (string.isEmpty()) {
                                this.j.e().v().a("empty secure ID. appId", C1124ib.a(va.l()));
                            }
                            va.m(string);
                        }
                    } else if (zzn2.o) {
                        va.h((String) a4.first);
                        if (a4.second != null) {
                            va.a(((Boolean) a4.second).booleanValue());
                        }
                    }
                    this.j.D().o();
                    va.c(Build.MODEL);
                    this.j.D().o();
                    va.b(VERSION.RELEASE);
                    va.e((int) this.j.D().s());
                    va.d(this.j.D().t());
                    va.j(zzn2.l);
                    if (this.j.b() && ce.v()) {
                        va.l();
                        if (!TextUtils.isEmpty(str14)) {
                            va.n(str14);
                        }
                    }
                    Db b4 = i().b(zzn2.a);
                    if (b4 == null) {
                        b4 = new Db(this.j, zzn2.a);
                        b4.a(this.j.F().w());
                        b4.e(zzn2.k);
                        b4.b(zzn2.b);
                        b4.d(this.j.g().b(zzn2.a));
                        b4.g(0);
                        b4.a(0);
                        b4.b(0);
                        b4.f(zzn2.c);
                        b4.c(zzn2.j);
                        b4.g(zzn2.d);
                        b4.d(zzn2.e);
                        b4.e(zzn2.f);
                        b4.a(zzn2.h);
                        b4.p(zzn2.l);
                        b4.f(zzn2.t);
                        i().a(b4);
                    }
                    if (!TextUtils.isEmpty(b4.a())) {
                        va.i(b4.a());
                    }
                    if (!TextUtils.isEmpty(b4.b())) {
                        va.l(b4.b());
                    }
                    List a5 = i().a(zzn2.a);
                    for (int i3 = 0; i3 < a5.size(); i3++) {
                        com.google.android.gms.internal.measurement.C0920aa.a A = C0920aa.A();
                        A.a(((Sd) a5.get(i3)).c);
                        A.a(((Sd) a5.get(i3)).d);
                        g().a(A, ((Sd) a5.get(i3)).e);
                        va.a(A);
                    }
                    try {
                        long a6 = i().a((W) ((Gb) va.w()));
                        he i4 = i();
                        if (gVar.f != null) {
                            Iterator it = gVar.f.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String str15 = str12;
                                    if (str15.equals((String) it.next())) {
                                        break;
                                    }
                                    str12 = str15;
                                } else {
                                    boolean c3 = j().c(gVar.a, gVar.b);
                                    ge a7 = i().a(v(), gVar.a, false, false, false, false, false);
                                    if (c3 && a7.e < ((long) this.j.h().a(gVar.a))) {
                                    }
                                }
                            }
                            if (i4.a(gVar, a6, z3)) {
                                this.n = 0;
                            }
                            i().x();
                            if (this.j.e().a(2)) {
                                this.j.e().A().a("Event recorded", this.j.E().a(gVar));
                            }
                            i().v();
                            x();
                            this.j.e().A().a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j2) + 500000) / 1000000));
                            return;
                        }
                        z3 = false;
                        if (i4.a(gVar, a6, z3)) {
                        }
                    } catch (IOException e2) {
                        this.j.e().s().a("Data loss. Failed to insert raw event metadata. appId", C1124ib.a(va.l()), e2);
                    }
                    i().x();
                    if (this.j.e().a(2)) {
                    }
                    i().v();
                    x();
                    this.j.e().A().a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j2) + 500000) / 1000000));
                    return;
                }
            }
            String c4 = zzai2.b.c("currency");
            String str16 = "value";
            if (str5.equals(zzai2.a)) {
                double doubleValue = zzai2.b.d(str16).doubleValue() * 1000000.0d;
                if (doubleValue == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    doubleValue = ((double) zzai2.b.b(str16).longValue()) * 1000000.0d;
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    this.j.e().v().a("Data lost. Currency value is too big. appId", C1124ib.a(str3), Double.valueOf(doubleValue));
                    j2 = nanoTime;
                    z = false;
                    if (!z) {
                        i().x();
                        i().v();
                        return;
                    }
                    boolean a22 = Vd.a(zzai2.a);
                    boolean equals2 = str4.equals(zzai2.a);
                    String str62 = str3;
                    ge a32 = i().a(v(), str3, true, a22, false, equals2, false);
                    intValue = a32.b - ((long) ((Integer) C1127j.v.a(null)).intValue());
                    if (intValue > 0) {
                    }
                } else {
                    j3 = Math.round(doubleValue);
                }
            } else {
                j3 = zzai2.b.b(str16).longValue();
            }
            if (!TextUtils.isEmpty(c4)) {
                String upperCase = c4.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String str17 = "_ltv_";
                    String valueOf = String.valueOf(upperCase);
                    String concat = valueOf.length() != 0 ? str17.concat(valueOf) : new String(str17);
                    Sd d3 = i().d(str3, concat);
                    if (d3 != null) {
                        if (d3.e instanceof Long) {
                            j2 = nanoTime;
                            Sd sd2 = new Sd(str3, zzai2.c, concat, this.j.c().currentTimeMillis(), Long.valueOf(((Long) d3.e).longValue() + j3));
                            sd = sd2;
                            if (!i().a(sd)) {
                                this.j.e().s().a("Too many unique user properties are set. Ignoring user property. appId", C1124ib.a(str3), this.j.E().c(sd.c), sd.e);
                                this.j.F().a(str3, 9, (String) null, (String) null, 0);
                            }
                            z = true;
                            if (!z) {
                            }
                            boolean a222 = Vd.a(zzai2.a);
                            boolean equals22 = str4.equals(zzai2.a);
                            String str622 = str3;
                            ge a322 = i().a(v(), str3, true, a222, false, equals22, false);
                            intValue = a322.b - ((long) ((Integer) C1127j.v.a(null)).intValue());
                            if (intValue > 0) {
                            }
                        }
                    }
                    j2 = nanoTime;
                    he i5 = i();
                    int b5 = this.j.h().b(str3, C1127j.P) - 1;
                    Preconditions.checkNotEmpty(str3);
                    i5.i();
                    i5.s();
                    try {
                        i5.w().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str3, str3, String.valueOf(b5)});
                    } catch (SQLiteException e3) {
                        i5.e().s().a("Error pruning currencies. appId", C1124ib.a(str3), e3);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        i().v();
                        throw th2;
                    }
                    sd = new Sd(str3, zzai2.c, concat, this.j.c().currentTimeMillis(), Long.valueOf(j3));
                    if (!i().a(sd)) {
                    }
                    z = true;
                    if (!z) {
                    }
                    boolean a2222 = Vd.a(zzai2.a);
                    boolean equals222 = str4.equals(zzai2.a);
                    String str6222 = str3;
                    ge a3222 = i().a(v(), str3, true, a2222, false, equals222, false);
                    intValue = a3222.b - ((long) ((Integer) C1127j.v.a(null)).intValue());
                    if (intValue > 0) {
                    }
                }
            }
            j2 = nanoTime;
            z = true;
            if (!z) {
            }
            boolean a22222 = Vd.a(zzai2.a);
            boolean equals2222 = str4.equals(zzai2.a);
            String str62222 = str3;
            ge a32222 = i().a(v(), str3, true, a22222, false, equals2222, false);
            intValue = a32222.b - ((long) ((Integer) C1127j.v.a(null)).intValue());
            if (intValue > 0) {
            }
        }
    }

    public final be a() {
        return this.j.a();
    }

    /* access modifiers changed from: 0000 */
    public final void a(zzai zzai, String str) {
        zzai zzai2 = zzai;
        String str2 = str;
        Db b2 = i().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.k())) {
            this.j.e().z().a("No app data available; dropping event", str2);
            return;
        }
        Boolean b3 = b(b2);
        if (b3 == null) {
            if (!"_ui".equals(zzai2.a)) {
                this.j.e().v().a("Could not find package. appId", C1124ib.a(str));
            }
        } else if (!b3.booleanValue()) {
            this.j.e().s().a("App version does not match; dropping event. appId", C1124ib.a(str));
            return;
        }
        zzn zzn = r2;
        Db db = b2;
        zzn zzn2 = new zzn(str, b2.c(), b2.k(), b2.l(), b2.m(), b2.n(), b2.o(), (String) null, b2.d(), false, db.b(), db.C(), 0, 0, db.D(), db.E(), false, db.g(), db.F(), db.p(), db.G());
        a(zzai2, zzn);
    }

    /* access modifiers changed from: 0000 */
    public final void a(zzai zzai, zzn zzn) {
        List<zzq> list;
        List<zzq> list2;
        List<zzq> list3;
        zzai zzai2 = zzai;
        zzn zzn2 = zzn;
        Preconditions.checkNotNull(zzn);
        Preconditions.checkNotEmpty(zzn2.a);
        B();
        m();
        String str = zzn2.a;
        long j2 = zzai2.d;
        if (g().a(zzai2, zzn2)) {
            if (!zzn2.h) {
                e(zzn2);
                return;
            }
            if (this.j.h().e(str, C1127j.Da)) {
                List<String> list4 = zzn2.u;
                if (list4 != null) {
                    if (list4.contains(zzai2.a)) {
                        Bundle i2 = zzai2.b.i();
                        i2.putLong("ga_safelisted", 1);
                        zzai zzai3 = new zzai(zzai2.a, new zzah(i2), zzai2.c, zzai2.d);
                        zzai2 = zzai3;
                    } else {
                        this.j.e().z().a("Dropping non-safelisted event. appId, event name, origin", str, zzai2.a, zzai2.c);
                        return;
                    }
                }
            }
            i().u();
            try {
                he i3 = i();
                Preconditions.checkNotEmpty(str);
                i3.i();
                i3.s();
                int i4 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i4 < 0) {
                    i3.e().v().a("Invalid time querying timed out conditional properties", C1124ib.a(str), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = i3.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (zzq zzq : list) {
                    if (zzq != null) {
                        this.j.e().z().a("User property timed out", zzq.a, this.j.E().c(zzq.c.b), zzq.c.i());
                        if (zzq.g != null) {
                            b(new zzai(zzq.g, j2), zzn2);
                        }
                        i().f(str, zzq.c.b);
                    }
                }
                he i5 = i();
                Preconditions.checkNotEmpty(str);
                i5.i();
                i5.s();
                if (i4 < 0) {
                    i5.e().v().a("Invalid time querying expired conditional properties", C1124ib.a(str), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = i5.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzq zzq2 : list2) {
                    if (zzq2 != null) {
                        this.j.e().z().a("User property expired", zzq2.a, this.j.E().c(zzq2.c.b), zzq2.c.i());
                        i().c(str, zzq2.c.b);
                        if (zzq2.k != null) {
                            arrayList.add(zzq2.k);
                        }
                        i().f(str, zzq2.c.b);
                    }
                }
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    b(new zzai((zzai) obj, j2), zzn2);
                }
                he i7 = i();
                String str2 = zzai2.a;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                i7.i();
                i7.s();
                if (i4 < 0) {
                    i7.e().v().a("Invalid time querying triggered conditional properties", C1124ib.a(str), i7.k().a(str2), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = i7.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzq zzq3 : list3) {
                    if (zzq3 != null) {
                        zzjn zzjn = zzq3.c;
                        Sd sd = r4;
                        Sd sd2 = new Sd(zzq3.a, zzq3.b, zzjn.b, j2, zzjn.i());
                        if (i().a(sd)) {
                            this.j.e().z().a("User property triggered", zzq3.a, this.j.E().c(sd.c), sd.e);
                        } else {
                            this.j.e().s().a("Too many active user properties, ignoring", C1124ib.a(zzq3.a), this.j.E().c(sd.c), sd.e);
                        }
                        if (zzq3.i != null) {
                            arrayList2.add(zzq3.i);
                        }
                        zzq3.c = new zzjn(sd);
                        zzq3.e = true;
                        i().a(zzq3);
                    }
                }
                b(zzai2, zzn2);
                int size2 = arrayList2.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    b(new zzai((zzai) obj2, j2), zzn2);
                }
                i().x();
            } finally {
                i().v();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r6 = r1;
        r22 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0266, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0267, code lost:
        r5 = r3;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r5 = null;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0c4d, code lost:
        if (r26 != r14) goto L_0x0c4f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
  PHI: (r3v50 android.database.Cursor) = (r3v45 android.database.Cursor), (r3v45 android.database.Cursor), (r3v45 android.database.Cursor), (r3v53 android.database.Cursor), (r3v53 android.database.Cursor), (r3v53 android.database.Cursor), (r3v53 android.database.Cursor), (r3v0 android.database.Cursor), (r3v0 android.database.Cursor) binds: [B:45:0x00d8, B:51:0x00e5, B:52:?, B:23:0x007b, B:29:0x0088, B:31:0x008c, B:32:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0289 A[SYNTHETIC, Splitter:B:153:0x0289] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0290 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x029e A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03cf A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03da A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03db A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05e1 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x060e A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x06aa A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0752 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0768 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0782 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0aa9 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0abc A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0abf A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0ae6 A[SYNTHETIC, Splitter:B:451:0x0ae6] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0b96 A[Catch:{ all -> 0x0ee0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0b98 A[Catch:{ all -> 0x0ee0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0ba0 A[SYNTHETIC, Splitter:B:470:0x0ba0] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0bce A[SYNTHETIC, Splitter:B:481:0x0bce] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0c6b A[Catch:{ all -> 0x0ee0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0cb3 A[Catch:{ all -> 0x0ee0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:596:0x0ee4  */
    /* JADX WARNING: Removed duplicated region for block: B:604:0x0efc A[SYNTHETIC, Splitter:B:604:0x0efc] */
    private final boolean a(String str, long j2) {
        he i2;
        Cursor cursor;
        Throwable th;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        long j3;
        long j4;
        a aVar;
        com.google.android.gms.internal.measurement.W.a aVar2;
        Kd kd;
        he i3;
        SecureRandom secureRandom;
        a aVar3;
        int i4;
        com.google.android.gms.internal.measurement.W.a aVar4;
        boolean z3;
        int d2;
        long j5;
        int i5;
        boolean z4;
        long j6;
        boolean z5;
        boolean z6;
        boolean z7;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str4;
        String str5;
        ArrayList arrayList;
        int i12;
        int i13;
        boolean z8;
        String str6;
        int i14;
        char c2;
        boolean z9;
        String str7;
        Cursor cursor2;
        Object obj;
        Cursor cursor3;
        String str8;
        String str9;
        Cursor query;
        Cursor cursor4;
        String[] strArr;
        String str10;
        String[] strArr2;
        Kd kd2 = this;
        i().u();
        try {
            Cursor cursor5 = null;
            a aVar5 = new a(kd2, null);
            i2 = i();
            long j7 = kd2.y;
            Preconditions.checkNotNull(aVar5);
            i2.i();
            i2.s();
            try {
                SQLiteDatabase w2 = i2.w();
                if (TextUtils.isEmpty(null)) {
                    int i15 = (j7 > -1 ? 1 : (j7 == -1 ? 0 : -1));
                    if (i15 != 0) {
                        try {
                            strArr2 = new String[]{String.valueOf(j7), String.valueOf(j2)};
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursor2 = cursor5;
                        } catch (Throwable th2) {
                        }
                    } else {
                        strArr2 = new String[]{String.valueOf(j2)};
                    }
                    String str11 = i15 != 0 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str11.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str11);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursor5 = w2.rawQuery(sb.toString(), strArr2);
                    if (!cursor5.moveToFirst()) {
                        if (cursor5 != null) {
                            cursor5.close();
                        }
                        if (aVar5.c != null) {
                            if (!aVar5.c.isEmpty()) {
                                z = false;
                                if (!z) {
                                    com.google.android.gms.internal.measurement.W.a aVar6 = (com.google.android.gms.internal.measurement.W.a) aVar5.a.l();
                                    aVar6.o();
                                    boolean e3 = kd2.j.h().e(aVar5.a.t(), C1127j.oa);
                                    int i16 = 0;
                                    int i17 = -1;
                                    int i18 = -1;
                                    boolean z10 = false;
                                    long j8 = 0;
                                    int i19 = 0;
                                    com.google.android.gms.internal.measurement.S.a aVar7 = null;
                                    com.google.android.gms.internal.measurement.S.a aVar8 = null;
                                    while (true) {
                                        str2 = "_et";
                                        str3 = "_e";
                                        z2 = z10;
                                        j3 = j8;
                                        if (i16 >= aVar5.c.size()) {
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.S.a aVar9 = (com.google.android.gms.internal.measurement.S.a) ((S) aVar5.c.get(i16)).l();
                                        String str12 = "_err";
                                        if (j().b(aVar5.a.t(), aVar9.k())) {
                                            kd2.j.e().v().a("Dropping blacklisted raw event. appId", C1124ib.a(aVar5.a.t()), kd2.j.E().a(aVar9.k()));
                                            if (!j().g(aVar5.a.t())) {
                                                if (!j().h(aVar5.a.t())) {
                                                    z9 = false;
                                                    if (!z9 && !str12.equals(aVar9.k())) {
                                                        kd2.j.F().a(aVar5.a.t(), 11, "_ev", aVar9.k(), 0);
                                                    }
                                                    z7 = e3;
                                                    i7 = i18;
                                                    z10 = z2;
                                                    j8 = j3;
                                                    i6 = i16;
                                                }
                                            }
                                            z9 = true;
                                            kd2.j.F().a(aVar5.a.t(), 11, "_ev", aVar9.k(), 0);
                                            z7 = e3;
                                            i7 = i18;
                                            z10 = z2;
                                            j8 = j3;
                                            i6 = i16;
                                        } else {
                                            boolean c3 = j().c(aVar5.a.t(), aVar9.k());
                                            String str13 = "_c";
                                            if (!c3) {
                                                g();
                                                String k2 = aVar9.k();
                                                Preconditions.checkNotEmpty(k2);
                                                i11 = i19;
                                                int hashCode = k2.hashCode();
                                                i10 = i16;
                                                if (hashCode != 94660) {
                                                    if (hashCode != 95025) {
                                                        if (hashCode == 95027) {
                                                            if (k2.equals("_ui")) {
                                                                c2 = 1;
                                                                if (c2 != 0 || c2 == 1 || c2 == 2) {
                                                                    z7 = e3;
                                                                    str5 = str2;
                                                                    i9 = i17;
                                                                    i8 = i18;
                                                                    str4 = str3;
                                                                    if (kd2.j.h().k(aVar5.a.t()) && c3) {
                                                                        arrayList = new ArrayList(aVar9.m());
                                                                        i13 = -1;
                                                                        int i20 = -1;
                                                                        for (i12 = 0; i12 < arrayList.size(); i12++) {
                                                                            if ("value".equals(((U) arrayList.get(i12)).p())) {
                                                                                i13 = i12;
                                                                            } else if ("currency".equals(((U) arrayList.get(i12)).p())) {
                                                                                i20 = i12;
                                                                            }
                                                                        }
                                                                        if (i13 != -1) {
                                                                            if (((U) arrayList.get(i13)).s() || ((U) arrayList.get(i13)).u()) {
                                                                                if (i20 != -1) {
                                                                                    String r2 = ((U) arrayList.get(i20)).r();
                                                                                    if (r2.length() == 3) {
                                                                                        int i21 = 0;
                                                                                        while (i21 < r2.length()) {
                                                                                            int codePointAt = r2.codePointAt(i21);
                                                                                            if (Character.isLetter(codePointAt)) {
                                                                                                i21 += Character.charCount(codePointAt);
                                                                                            }
                                                                                        }
                                                                                        z8 = false;
                                                                                    }
                                                                                    z8 = true;
                                                                                    break;
                                                                                }
                                                                                z8 = true;
                                                                                if (z8) {
                                                                                    kd2.j.e().x().a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                                                    aVar9.b(i13);
                                                                                    a(aVar9, str13);
                                                                                    a(aVar9, 19, "currency");
                                                                                }
                                                                                if (!kd2.j.h().e(aVar5.a.t(), C1127j.na)) {
                                                                                    if (str4.equals(aVar9.k())) {
                                                                                        g();
                                                                                        if (Rd.a((S) ((Gb) aVar9.w()), "_fr") == null) {
                                                                                            if (aVar8 != null && Math.abs(aVar8.l() - aVar9.l()) <= 1000) {
                                                                                                com.google.android.gms.internal.measurement.S.a aVar10 = (com.google.android.gms.internal.measurement.S.a) ((com.google.android.gms.internal.measurement.Gb.a) aVar8.clone());
                                                                                                if (kd2.a(aVar9, aVar10)) {
                                                                                                    i7 = i8;
                                                                                                    aVar6.a(i7, aVar10);
                                                                                                    i17 = i9;
                                                                                                }
                                                                                            }
                                                                                            i7 = i8;
                                                                                            aVar7 = aVar9;
                                                                                            i17 = i11;
                                                                                        } else {
                                                                                            i7 = i8;
                                                                                            i17 = i9;
                                                                                        }
                                                                                    } else {
                                                                                        i7 = i8;
                                                                                        if ("_vs".equals(aVar9.k())) {
                                                                                            g();
                                                                                            if (Rd.a((S) ((Gb) aVar9.w()), str5) == null) {
                                                                                                if (aVar7 != null && Math.abs(aVar7.l() - aVar9.l()) <= 1000) {
                                                                                                    com.google.android.gms.internal.measurement.S.a aVar11 = (com.google.android.gms.internal.measurement.S.a) ((com.google.android.gms.internal.measurement.Gb.a) aVar7.clone());
                                                                                                    if (kd2.a(aVar11, aVar9)) {
                                                                                                        i17 = i9;
                                                                                                        aVar6.a(i17, aVar11);
                                                                                                    }
                                                                                                }
                                                                                                i17 = i9;
                                                                                                aVar8 = aVar9;
                                                                                                i7 = i11;
                                                                                            }
                                                                                        }
                                                                                        i17 = i9;
                                                                                    }
                                                                                    aVar7 = null;
                                                                                    aVar8 = null;
                                                                                } else {
                                                                                    i17 = i9;
                                                                                    i7 = i8;
                                                                                }
                                                                                if (!z7 && str4.equals(aVar9.k())) {
                                                                                    if (aVar9.n() != 0) {
                                                                                        kd2.j.e().v().a("Engagement event does not contain any parameters. appId", C1124ib.a(aVar5.a.t()));
                                                                                    } else {
                                                                                        g();
                                                                                        Long l2 = (Long) Rd.b((S) ((Gb) aVar9.w()), str5);
                                                                                        if (l2 == null) {
                                                                                            kd2.j.e().v().a("Engagement event does not include duration. appId", C1124ib.a(aVar5.a.t()));
                                                                                        } else {
                                                                                            j8 = j3 + l2.longValue();
                                                                                            i6 = i10;
                                                                                            aVar5.c.set(i6, (S) ((Gb) aVar9.w()));
                                                                                            i19 = i11 + 1;
                                                                                            aVar6.a(aVar9);
                                                                                            z10 = z2;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                j8 = j3;
                                                                                i6 = i10;
                                                                                aVar5.c.set(i6, (S) ((Gb) aVar9.w()));
                                                                                i19 = i11 + 1;
                                                                                aVar6.a(aVar9);
                                                                                z10 = z2;
                                                                            } else {
                                                                                kd2.j.e().x().a("Value must be specified with a numeric type.");
                                                                                aVar9.b(i13);
                                                                                a(aVar9, str13);
                                                                                a(aVar9, 18, "value");
                                                                            }
                                                                        }
                                                                        if (!kd2.j.h().e(aVar5.a.t(), C1127j.na)) {
                                                                        }
                                                                        if (aVar9.n() != 0) {
                                                                        }
                                                                        j8 = j3;
                                                                        i6 = i10;
                                                                        aVar5.c.set(i6, (S) ((Gb) aVar9.w()));
                                                                        i19 = i11 + 1;
                                                                        aVar6.a(aVar9);
                                                                        z10 = z2;
                                                                    }
                                                                    if (!kd2.j.h().e(aVar5.a.t(), C1127j.na)) {
                                                                    }
                                                                    if (aVar9.n() != 0) {
                                                                    }
                                                                    j8 = j3;
                                                                    i6 = i10;
                                                                    aVar5.c.set(i6, (S) ((Gb) aVar9.w()));
                                                                    i19 = i11 + 1;
                                                                    aVar6.a(aVar9);
                                                                    z10 = z2;
                                                                }
                                                            }
                                                        }
                                                    } else if (k2.equals("_ug")) {
                                                        c2 = 2;
                                                        if (c2 != 0 || c2 == 1 || c2 == 2) {
                                                        }
                                                    }
                                                } else if (k2.equals("_in")) {
                                                    c2 = 0;
                                                    if (c2 != 0 || c2 == 1 || c2 == 2) {
                                                    }
                                                }
                                                c2 = 65535;
                                                if (c2 != 0 || c2 == 1 || c2 == 2) {
                                                }
                                            } else {
                                                i10 = i16;
                                                i11 = i19;
                                            }
                                            z7 = e3;
                                            int i22 = 0;
                                            boolean z11 = false;
                                            boolean z12 = false;
                                            while (true) {
                                                i9 = i17;
                                                str6 = "_r";
                                                if (i22 >= aVar9.n()) {
                                                    break;
                                                }
                                                if (str13.equals(aVar9.a(i22).p())) {
                                                    com.google.android.gms.internal.measurement.U.a aVar12 = (com.google.android.gms.internal.measurement.U.a) aVar9.a(i22).l();
                                                    i14 = i18;
                                                    aVar12.a(1);
                                                    aVar9.a(i22, (U) ((Gb) aVar12.w()));
                                                    z11 = true;
                                                } else {
                                                    i14 = i18;
                                                    if (str6.equals(aVar9.a(i22).p())) {
                                                        com.google.android.gms.internal.measurement.U.a aVar13 = (com.google.android.gms.internal.measurement.U.a) aVar9.a(i22).l();
                                                        aVar13.a(1);
                                                        aVar9.a(i22, (U) ((Gb) aVar13.w()));
                                                        z12 = true;
                                                    }
                                                }
                                                i22++;
                                                i17 = i9;
                                                i18 = i14;
                                            }
                                            i8 = i18;
                                            if (z11 || !c3) {
                                                str5 = str2;
                                                str4 = str3;
                                            } else {
                                                kd2.j.e().A().a("Marking event as conversion", kd2.j.E().a(aVar9.k()));
                                                com.google.android.gms.internal.measurement.U.a y2 = U.y();
                                                y2.a(str13);
                                                str5 = str2;
                                                str4 = str3;
                                                y2.a(1);
                                                aVar9.a(y2);
                                            }
                                            if (!z12) {
                                                kd2.j.e().A().a("Marking event as real-time", kd2.j.E().a(aVar9.k()));
                                                com.google.android.gms.internal.measurement.U.a y3 = U.y();
                                                y3.a(str6);
                                                y3.a(1);
                                                aVar9.a(y3);
                                            }
                                            if (i().a(v(), aVar5.a.t(), false, false, false, false, true).e > ((long) kd2.j.h().a(aVar5.a.t()))) {
                                                a(aVar9, str6);
                                            } else {
                                                z2 = true;
                                            }
                                            if (Vd.a(aVar9.k()) && c3 && i().a(v(), aVar5.a.t(), false, false, true, false, false).c > ((long) kd2.j.h().b(aVar5.a.t(), C1127j.y))) {
                                                kd2.j.e().v().a("Too many conversions. Not logging as conversion. appId", C1124ib.a(aVar5.a.t()));
                                                boolean z13 = false;
                                                com.google.android.gms.internal.measurement.U.a aVar14 = null;
                                                int i23 = -1;
                                                for (int i24 = 0; i24 < aVar9.n(); i24++) {
                                                    U a2 = aVar9.a(i24);
                                                    if (str13.equals(a2.p())) {
                                                        aVar14 = (com.google.android.gms.internal.measurement.U.a) a2.l();
                                                        i23 = i24;
                                                    } else if (str12.equals(a2.p())) {
                                                        z13 = true;
                                                    }
                                                }
                                                if (z13 && aVar14 != null) {
                                                    aVar9.b(i23);
                                                } else if (aVar14 != null) {
                                                    com.google.android.gms.internal.measurement.U.a aVar15 = (com.google.android.gms.internal.measurement.U.a) ((com.google.android.gms.internal.measurement.Gb.a) aVar14.clone());
                                                    aVar15.a(str12);
                                                    aVar15.a(10);
                                                    aVar9.a(i23, (U) ((Gb) aVar15.w()));
                                                } else {
                                                    kd2.j.e().s().a("Did not find conversion parameter. appId", C1124ib.a(aVar5.a.t()));
                                                }
                                            }
                                            arrayList = new ArrayList(aVar9.m());
                                            i13 = -1;
                                            int i202 = -1;
                                            while (i12 < arrayList.size()) {
                                            }
                                            if (i13 != -1) {
                                            }
                                            if (!kd2.j.h().e(aVar5.a.t(), C1127j.na)) {
                                            }
                                            if (aVar9.n() != 0) {
                                            }
                                            j8 = j3;
                                            i6 = i10;
                                            aVar5.c.set(i6, (S) ((Gb) aVar9.w()));
                                            i19 = i11 + 1;
                                            aVar6.a(aVar9);
                                            z10 = z2;
                                        }
                                        i16 = i6 + 1;
                                        i18 = i7;
                                        e3 = z7;
                                    }
                                    String str14 = str2;
                                    String str15 = str3;
                                    int i25 = i19;
                                    if (e3) {
                                        int i26 = i25;
                                        j4 = j3;
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            S b2 = aVar6.b(i27);
                                            if (str15.equals(b2.q())) {
                                                g();
                                                if (Rd.a(b2, "_fr") != null) {
                                                    aVar6.c(i27);
                                                    i26--;
                                                    i27--;
                                                    i27++;
                                                }
                                            }
                                            g();
                                            U a3 = Rd.a(b2, str14);
                                            if (a3 != null) {
                                                Long valueOf = a3.s() ? Long.valueOf(a3.t()) : null;
                                                if (valueOf != null && valueOf.longValue() > 0) {
                                                    j4 += valueOf.longValue();
                                                }
                                            }
                                            i27++;
                                        }
                                    } else {
                                        j4 = j3;
                                    }
                                    kd2.a(aVar6, j4, false);
                                    if (kd2.j.h().e(aVar6.l(), C1127j.Ga)) {
                                        Iterator it = aVar6.m().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if ("_s".equals(((S) it.next()).q())) {
                                                    z6 = true;
                                                    break;
                                                }
                                            } else {
                                                z6 = false;
                                                break;
                                            }
                                        }
                                        if (z6) {
                                            i().c(aVar6.l(), "_se");
                                        }
                                        kd2.a(aVar6, j4, true);
                                    } else if (kd2.j.h().e(aVar6.l(), C1127j.Ha)) {
                                        i().c(aVar6.l(), "_se");
                                    }
                                    if (kd2.j.h().e(aVar6.l(), C1127j.pa)) {
                                        Rd g2 = g();
                                        g2.e().A().a("Checking account type status for ad personalization signals");
                                        if (g2.p().e(aVar6.l())) {
                                            Db b3 = g2.o().b(aVar6.l());
                                            if (b3 != null && b3.D() && g2.j().w()) {
                                                g2.e().z().a("Turning off ad personalization due to account type");
                                                com.google.android.gms.internal.measurement.C0920aa.a A = C0920aa.A();
                                                A.a("_npa");
                                                A.a(g2.j().u());
                                                A.b(1);
                                                C0920aa aaVar = (C0920aa) ((Gb) A.w());
                                                int i28 = 0;
                                                while (true) {
                                                    if (i28 >= aVar6.q()) {
                                                        z5 = false;
                                                        break;
                                                    } else if ("_npa".equals(aVar6.d(i28).p())) {
                                                        aVar6.a(i28, aaVar);
                                                        z5 = true;
                                                        break;
                                                    } else {
                                                        i28++;
                                                    }
                                                }
                                                if (!z5) {
                                                    aVar6.a(aaVar);
                                                }
                                            }
                                        }
                                    }
                                    aVar6.y();
                                    String l3 = aVar6.l();
                                    List p2 = aVar6.p();
                                    List m2 = aVar6.m();
                                    Preconditions.checkNotEmpty(l3);
                                    aVar6.b((Iterable<? extends P>) h().a(l3, m2, p2));
                                    if (kd2.j.h().e(aVar5.a.t())) {
                                        try {
                                            HashMap hashMap = new HashMap();
                                            ArrayList arrayList2 = new ArrayList();
                                            SecureRandom u2 = kd2.j.F().u();
                                            int i29 = 0;
                                            while (i29 < aVar6.n()) {
                                                com.google.android.gms.internal.measurement.S.a aVar16 = (com.google.android.gms.internal.measurement.S.a) aVar6.b(i29).l();
                                                String str16 = "_sr";
                                                if (aVar16.k().equals("_ep")) {
                                                    g();
                                                    String str17 = (String) Rd.b((S) ((Gb) aVar16.w()), "_en");
                                                    C1107f fVar = (C1107f) hashMap.get(str17);
                                                    if (fVar == null) {
                                                        fVar = i().b(aVar5.a.t(), str17);
                                                        hashMap.put(str17, fVar);
                                                    }
                                                    if (fVar.i == null) {
                                                        if (fVar.j.longValue() > 1) {
                                                            g();
                                                            Rd.a(aVar16, str16, (Object) fVar.j);
                                                        }
                                                        if (fVar.k != null && fVar.k.booleanValue()) {
                                                            g();
                                                            Rd.a(aVar16, "_efs", (Object) Long.valueOf(1));
                                                        }
                                                        arrayList2.add((S) ((Gb) aVar16.w()));
                                                    }
                                                    aVar6.a(i29, aVar16);
                                                } else {
                                                    long f2 = j().f(aVar5.a.t());
                                                    kd2.j.F();
                                                    long a4 = Vd.a(aVar16.l(), f2);
                                                    S s2 = (S) ((Gb) aVar16.w());
                                                    String str18 = "_dbg";
                                                    long j9 = f2;
                                                    Long valueOf2 = Long.valueOf(1);
                                                    if (!TextUtils.isEmpty(str18) && valueOf2 != null) {
                                                        Iterator it2 = s2.s().iterator();
                                                        while (true) {
                                                            if (!it2.hasNext()) {
                                                                break;
                                                            }
                                                            U u3 = (U) it2.next();
                                                            Iterator it3 = it2;
                                                            if (!str18.equals(u3.p())) {
                                                                it2 = it3;
                                                            } else if (((valueOf2 instanceof Long) && valueOf2.equals(Long.valueOf(u3.t()))) || (((valueOf2 instanceof String) && valueOf2.equals(u3.r())) || ((valueOf2 instanceof Double) && valueOf2.equals(Double.valueOf(u3.x()))))) {
                                                                z3 = true;
                                                            }
                                                        }
                                                        d2 = z3 ? j().d(aVar5.a.t(), aVar16.k()) : 1;
                                                        if (d2 > 0) {
                                                            kd2.j.e().v().a("Sample rate must be positive. event, rate", aVar16.k(), Integer.valueOf(d2));
                                                            arrayList2.add((S) ((Gb) aVar16.w()));
                                                            aVar6.a(i29, aVar16);
                                                        } else {
                                                            C1107f fVar2 = (C1107f) hashMap.get(aVar16.k());
                                                            if (fVar2 == null) {
                                                                fVar2 = i().b(aVar5.a.t(), aVar16.k());
                                                                if (fVar2 == null) {
                                                                    j5 = a4;
                                                                    kd2.j.e().v().a("Event being bundled has no eventAggregate. appId, eventName", aVar5.a.t(), aVar16.k());
                                                                    if (kd2.j.h().e(aVar5.a.t(), C1127j.Fa)) {
                                                                        fVar2 = new C1107f(aVar5.a.t(), aVar16.k(), 1, 1, 1, aVar16.l(), 0, null, null, null, null);
                                                                    } else {
                                                                        fVar2 = new C1107f(aVar5.a.t(), aVar16.k(), 1, 1, aVar16.l(), 0, null, null, null, null);
                                                                    }
                                                                    g();
                                                                    Long l4 = (Long) Rd.b((S) ((Gb) aVar16.w()), "_eid");
                                                                    Boolean valueOf3 = Boolean.valueOf(l4 == null);
                                                                    if (d2 != 1) {
                                                                        arrayList2.add((S) ((Gb) aVar16.w()));
                                                                        if (valueOf3.booleanValue() && !(fVar2.i == null && fVar2.j == null && fVar2.k == null)) {
                                                                            hashMap.put(aVar16.k(), fVar2.a(null, null, null));
                                                                        }
                                                                        aVar6.a(i29, aVar16);
                                                                    } else {
                                                                        if (u2.nextInt(d2) == 0) {
                                                                            g();
                                                                            long j10 = (long) d2;
                                                                            Rd.a(aVar16, str16, (Object) Long.valueOf(j10));
                                                                            arrayList2.add((S) ((Gb) aVar16.w()));
                                                                            if (valueOf3.booleanValue()) {
                                                                                fVar2 = fVar2.a(null, Long.valueOf(j10), null);
                                                                            }
                                                                            hashMap.put(aVar16.k(), fVar2.a(aVar16.l(), j5));
                                                                            aVar4 = aVar6;
                                                                            secureRandom = u2;
                                                                            aVar3 = aVar5;
                                                                            i4 = i29;
                                                                        } else {
                                                                            secureRandom = u2;
                                                                            long j11 = j5;
                                                                            com.google.android.gms.internal.measurement.W.a aVar17 = aVar6;
                                                                            if (!kd2.j.h().m(aVar5.a.t())) {
                                                                                aVar3 = aVar5;
                                                                                i5 = i29;
                                                                                if (Math.abs(aVar16.l() - fVar2.g) >= 86400000) {
                                                                                }
                                                                                z4 = false;
                                                                                if (!z4) {
                                                                                    g();
                                                                                    Rd.a(aVar16, "_efs", (Object) Long.valueOf(1));
                                                                                    g();
                                                                                    long j12 = (long) d2;
                                                                                    Rd.a(aVar16, str16, (Object) Long.valueOf(j12));
                                                                                    arrayList2.add((S) ((Gb) aVar16.w()));
                                                                                    if (valueOf3.booleanValue()) {
                                                                                        fVar2 = fVar2.a(null, Long.valueOf(j12), Boolean.valueOf(true));
                                                                                    }
                                                                                    hashMap.put(aVar16.k(), fVar2.a(aVar16.l(), j11));
                                                                                } else if (valueOf3.booleanValue()) {
                                                                                    hashMap.put(aVar16.k(), fVar2.a(l4, null, null));
                                                                                }
                                                                                aVar4 = aVar17;
                                                                                i4 = i5;
                                                                            } else if (fVar2.h != null) {
                                                                                j6 = fVar2.h.longValue();
                                                                                aVar3 = aVar5;
                                                                                i5 = i29;
                                                                            } else {
                                                                                kd2.j.F();
                                                                                aVar3 = aVar5;
                                                                                i5 = i29;
                                                                                j6 = Vd.a(aVar16.o(), j9);
                                                                            }
                                                                            z4 = true;
                                                                            if (!z4) {
                                                                            }
                                                                            aVar4 = aVar17;
                                                                            i4 = i5;
                                                                        }
                                                                        aVar4.a(i4, aVar16);
                                                                        u2 = secureRandom;
                                                                        i29 = i4 + 1;
                                                                        aVar5 = aVar3;
                                                                        aVar6 = aVar4;
                                                                        kd2 = this;
                                                                    }
                                                                }
                                                            }
                                                            j5 = a4;
                                                            g();
                                                            Long l42 = (Long) Rd.b((S) ((Gb) aVar16.w()), "_eid");
                                                            Boolean valueOf32 = Boolean.valueOf(l42 == null);
                                                            if (d2 != 1) {
                                                            }
                                                        }
                                                    }
                                                    z3 = false;
                                                    if (z3) {
                                                    }
                                                    if (d2 > 0) {
                                                    }
                                                }
                                                aVar4 = aVar6;
                                                secureRandom = u2;
                                                aVar3 = aVar5;
                                                i4 = i29;
                                                u2 = secureRandom;
                                                i29 = i4 + 1;
                                                aVar5 = aVar3;
                                                aVar6 = aVar4;
                                                kd2 = this;
                                            }
                                            aVar2 = aVar6;
                                            aVar = aVar5;
                                            if (arrayList2.size() < aVar2.n()) {
                                                aVar2.o();
                                                aVar2.a((Iterable<? extends S>) arrayList2);
                                            }
                                            for (Entry value : hashMap.entrySet()) {
                                                i().a((C1107f) value.getValue());
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Throwable th4 = th;
                                            i().v();
                                            throw th4;
                                        }
                                    } else {
                                        aVar2 = aVar6;
                                        aVar = aVar5;
                                    }
                                    aVar2.b(Long.MAX_VALUE);
                                    aVar2.c(Long.MIN_VALUE);
                                    for (int i30 = 0; i30 < aVar2.n(); i30++) {
                                        S b4 = aVar2.b(i30);
                                        if (b4.r() < aVar2.r()) {
                                            aVar2.b(b4.r());
                                        }
                                        if (b4.r() > aVar2.s()) {
                                            aVar2.c(b4.r());
                                        }
                                    }
                                    String t2 = aVar.a.t();
                                    Db b5 = i().b(t2);
                                    if (b5 == null) {
                                        kd = this;
                                        try {
                                            kd.j.e().s().a("Bundling raw events w/o app info. appId", C1124ib.a(aVar.a.t()));
                                        } catch (SQLiteException e4) {
                                            i3.e().s().a("Failed to remove unused event metadata. appId", C1124ib.a(t2), e4);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            Throwable th42 = th;
                                            i().v();
                                            throw th42;
                                        }
                                    } else {
                                        kd = this;
                                        if (aVar2.n() > 0) {
                                            long j13 = b5.j();
                                            if (j13 != 0) {
                                                aVar2.e(j13);
                                            } else {
                                                aVar2.u();
                                            }
                                            long i31 = b5.i();
                                            if (i31 != 0) {
                                                j13 = i31;
                                            }
                                            if (j13 != 0) {
                                                aVar2.d(j13);
                                            } else {
                                                aVar2.t();
                                            }
                                            b5.t();
                                            aVar2.f((int) b5.q());
                                            b5.a(aVar2.r());
                                            b5.b(aVar2.s());
                                            String B = b5.B();
                                            if (B != null) {
                                                aVar2.j(B);
                                            } else {
                                                aVar2.x();
                                            }
                                            i().a(b5);
                                        }
                                    }
                                    if (aVar2.n() > 0) {
                                        kd.j.a();
                                        C0948ea a5 = j().a(aVar.a.t());
                                        if (a5 != null) {
                                            if (a5.c != null) {
                                                aVar2.i(a5.c.longValue());
                                                i().a((W) ((Gb) aVar2.w()), z2);
                                            }
                                        }
                                        if (TextUtils.isEmpty(aVar.a.r())) {
                                            aVar2.i(-1);
                                        } else {
                                            kd.j.e().v().a("Did not find measurement config or missing version info. appId", C1124ib.a(aVar.a.t()));
                                        }
                                        i().a((W) ((Gb) aVar2.w()), z2);
                                    }
                                    he i32 = i();
                                    List<Long> list = aVar.b;
                                    Preconditions.checkNotNull(list);
                                    i32.i();
                                    i32.s();
                                    StringBuilder sb2 = new StringBuilder("rowid in (");
                                    for (int i33 = 0; i33 < list.size(); i33++) {
                                        if (i33 != 0) {
                                            sb2.append(",");
                                        }
                                        sb2.append(((Long) list.get(i33)).longValue());
                                    }
                                    sb2.append(")");
                                    int delete = i32.w().delete("raw_events", sb2.toString(), null);
                                    if (delete != list.size()) {
                                        i32.e().s().a("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
                                    }
                                    i3 = i();
                                    i3.w().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{t2, t2});
                                    i().x();
                                    i().v();
                                    return true;
                                }
                                Kd kd3 = kd2;
                                i().x();
                                i().v();
                                return false;
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                    } else {
                        str7 = cursor5.getString(0);
                        String string = cursor5.getString(1);
                        cursor5.close();
                        cursor3 = cursor5;
                        str9 = str7;
                        str8 = string;
                    }
                } else {
                    int i34 = (j7 > -1 ? 1 : (j7 == -1 ? 0 : -1));
                    String[] strArr3 = i34 != 0 ? new String[]{null, String.valueOf(j7)} : new String[]{null};
                    String str19 = i34 != 0 ? " and rowid <= ?" : "";
                    StringBuilder sb3 = new StringBuilder(str19.length() + 84);
                    sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb3.append(str19);
                    sb3.append(" order by rowid limit 1;");
                    cursor5 = w2.rawQuery(sb3.toString(), strArr3);
                    if (!cursor5.moveToFirst()) {
                        if (cursor5 != null) {
                            cursor5.close();
                        }
                        if (aVar5.c != null) {
                        }
                        z = true;
                        if (!z) {
                        }
                    } else {
                        String string2 = cursor5.getString(0);
                        cursor5.close();
                        cursor3 = cursor5;
                        str8 = string2;
                        str9 = null;
                    }
                }
                try {
                    SQLiteDatabase sQLiteDatabase = w2;
                    query = w2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str9, str8}, null, null, "rowid", "2");
                    try {
                        if (!query.moveToFirst()) {
                            try {
                                i2.e().s().a("Raw event metadata record is missing. appId", C1124ib.a(str9));
                                if (query != null) {
                                    query.close();
                                }
                            } catch (SQLiteException e5) {
                                e = e5;
                                str7 = str9;
                                cursor2 = query;
                                obj = e;
                                try {
                                    i2.e().s().a("Data loss. Error selecting raw event. appId", C1124ib.a(str7), obj);
                                    if (cursor2 != null) {
                                    }
                                    if (aVar5.c != null) {
                                    }
                                    z = true;
                                    if (!z) {
                                    }
                                } catch (Throwable th6) {
                                    Kd kd4 = kd2;
                                    th = th6;
                                    cursor = cursor2;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                Kd kd5 = kd2;
                                cursor = query;
                                th = th;
                                if (cursor != null) {
                                }
                                throw th;
                            }
                            if (aVar5.c != null) {
                            }
                            z = true;
                            if (!z) {
                            }
                        } else {
                            W a6 = W.a(query.getBlob(0), C1042tb.c());
                            if (query.moveToNext()) {
                                i2.e().v().a("Get multiple raw event metadata records, expected one. appId", C1124ib.a(str9));
                            }
                            query.close();
                            aVar5.a(a6);
                            if (j7 != -1) {
                                str10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr = new String[]{str9, str8, String.valueOf(j7)};
                            } else {
                                str10 = "app_id = ? and metadata_fingerprint = ?";
                                strArr = new String[]{str9, str8};
                            }
                            cursor4 = query;
                            try {
                                cursor2 = sQLiteDatabase.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str10, strArr, null, null, "rowid", null);
                                try {
                                    if (!cursor2.moveToFirst()) {
                                        i2.e().v().a("Raw event data disappeared while in transaction. appId", C1124ib.a(str9));
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (aVar5.c != null) {
                                        }
                                        z = true;
                                        if (!z) {
                                        }
                                    } else {
                                        do {
                                            long j14 = cursor2.getLong(0);
                                            byte[] blob = cursor2.getBlob(3);
                                            try {
                                                com.google.android.gms.internal.measurement.S.a A2 = S.A();
                                                A2.a(blob, C1042tb.c());
                                                com.google.android.gms.internal.measurement.S.a aVar18 = A2;
                                                aVar18.a(cursor2.getString(1));
                                                aVar18.a(cursor2.getLong(2));
                                                if (!aVar5.a(j14, (S) ((Gb) aVar18.w()))) {
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (aVar5.c != null) {
                                                    }
                                                    z = true;
                                                    if (!z) {
                                                    }
                                                }
                                            } catch (IOException e6) {
                                                i2.e().s().a("Data loss. Failed to merge raw event. appId", C1124ib.a(str9), e6);
                                            }
                                        } while (cursor2.moveToNext());
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (aVar5.c != null) {
                                        }
                                        z = true;
                                        if (!z) {
                                        }
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    str7 = str9;
                                    obj = e;
                                    i2.e().s().a("Data loss. Error selecting raw event. appId", C1124ib.a(str7), obj);
                                    if (cursor2 != null) {
                                    }
                                    if (aVar5.c != null) {
                                    }
                                    z = true;
                                    if (!z) {
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    Kd kd6 = kd2;
                                    cursor = cursor2;
                                    th = th;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e8) {
                                e = e8;
                                str7 = str9;
                                cursor2 = cursor4;
                                obj = e;
                                i2.e().s().a("Data loss. Error selecting raw event. appId", C1124ib.a(str7), obj);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (aVar5.c != null) {
                                }
                                z = true;
                                if (!z) {
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                cursor = cursor4;
                                Kd kd7 = kd2;
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        cursor4 = query;
                        str7 = str9;
                        cursor2 = cursor4;
                        obj = e;
                        i2.e().s().a("Data loss. Error selecting raw event. appId", C1124ib.a(str7), obj);
                        if (cursor2 != null) {
                        }
                        if (aVar5.c != null) {
                        }
                        z = true;
                        if (!z) {
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        cursor4 = query;
                        cursor = cursor4;
                        Kd kd72 = kd2;
                        th = th;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    str7 = str9;
                    cursor2 = cursor3;
                    obj = e;
                    i2.e().s().a("Data loss. Error selecting raw event. appId", C1124ib.a(str7), obj);
                    if (cursor2 != null) {
                    }
                    if (aVar5.c != null) {
                    }
                    z = true;
                    if (!z) {
                    }
                } catch (Throwable th11) {
                    th = th11;
                    Kd kd8 = kd2;
                    cursor = cursor3;
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                obj = e11;
                cursor2 = null;
                str7 = null;
                i2.e().s().a("Data loss. Error selecting raw event. appId", C1124ib.a(str7), obj);
                if (cursor2 != null) {
                }
                if (aVar5.c != null) {
                }
                z = true;
                if (!z) {
                }
            } catch (Throwable th12) {
                th = th12;
                Kd kd9 = kd2;
                cursor = null;
                th = th;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (IOException e12) {
            cursor4 = query;
            i2.e().s().a("Data loss. Failed to merge raw event metadata. appId", C1124ib.a(str9), e12);
            if (cursor4 != null) {
                cursor4.close();
            }
        } catch (Throwable th13) {
            th = th13;
            Kd kd10 = kd2;
        }
    }

    private final Boolean b(Db db) {
        try {
            if (db.l() != -2147483648L) {
                if (db.l() == ((long) Wrappers.packageManager(this.j.getContext()).getPackageInfo(db.f(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = Wrappers.packageManager(this.j.getContext()).getPackageInfo(db.f(), 0).versionName;
                if (db.k() != null && db.k().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(zzjn zzjn, zzn zzn) {
        B();
        m();
        if (TextUtils.isEmpty(zzn.b) && TextUtils.isEmpty(zzn.r)) {
            return;
        }
        if (!zzn.h) {
            e(zzn);
            return;
        }
        String str = "User property removed";
        String str2 = "Removing user property";
        if (this.j.h().e(zzn.a, C1127j.pa)) {
            if (!"_npa".equals(zzjn.b) || zzn.s == null) {
                this.j.e().z().a(str2, this.j.E().c(zzjn.b));
                i().u();
                try {
                    e(zzn);
                    i().c(zzn.a, zzjn.b);
                    i().x();
                    this.j.e().z().a(str, this.j.E().c(zzjn.b));
                } finally {
                    i().v();
                }
            } else {
                this.j.e().z().a("Falling back to manifest metadata value for ad personalization");
                zzjn zzjn2 = new zzjn("_npa", this.j.c().currentTimeMillis(), Long.valueOf(zzn.s.booleanValue() ? 1 : 0), "auto");
                a(zzjn2, zzn);
            }
        } else {
            this.j.e().z().a(str2, this.j.E().c(zzjn.b));
            i().u();
            try {
                e(zzn);
                i().c(zzn.a, zzjn.b);
                i().x();
                this.j.e().z().a(str, this.j.E().c(zzjn.b));
            } finally {
                i().v();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(zzq zzq) {
        zzn a2 = a(zzq.a);
        if (a2 != null) {
            b(zzq, a2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(zzq zzq, zzn zzn) {
        Preconditions.checkNotNull(zzq);
        Preconditions.checkNotEmpty(zzq.a);
        Preconditions.checkNotNull(zzq.c);
        Preconditions.checkNotEmpty(zzq.c.b);
        B();
        m();
        if (TextUtils.isEmpty(zzn.b) && TextUtils.isEmpty(zzn.r)) {
            return;
        }
        if (!zzn.h) {
            e(zzn);
            return;
        }
        i().u();
        try {
            e(zzn);
            zzq e2 = i().e(zzq.a, zzq.c.b);
            if (e2 != null) {
                this.j.e().z().a("Removing conditional user property", zzq.a, this.j.E().c(zzq.c.b));
                i().f(zzq.a, zzq.c.b);
                if (e2.e) {
                    i().c(zzq.a, zzq.c.b);
                }
                if (zzq.k != null) {
                    Bundle bundle = null;
                    if (zzq.k.b != null) {
                        bundle = zzq.k.b.i();
                    }
                    Bundle bundle2 = bundle;
                    b(this.j.F().a(zzq.a, zzq.k.a, bundle2, e2.b, zzq.k.d, true, false), zzn);
                }
            } else {
                this.j.e().v().a("Conditional user property doesn't exist", C1124ib.a(zzq.a), this.j.E().c(zzq.c.b));
            }
            i().x();
        } finally {
            i().v();
        }
    }

    @VisibleForTesting
    private final void a(com.google.android.gms.internal.measurement.W.a aVar, long j2, boolean z) {
        Sd sd;
        String str = z ? "_se" : "_lte";
        Sd d2 = i().d(aVar.l(), str);
        if (d2 == null || d2.e == null) {
            sd = new Sd(aVar.l(), "auto", str, this.j.c().currentTimeMillis(), Long.valueOf(j2));
        } else {
            sd = new Sd(aVar.l(), "auto", str, this.j.c().currentTimeMillis(), Long.valueOf(((Long) d2.e).longValue() + j2));
        }
        com.google.android.gms.internal.measurement.C0920aa.a A = C0920aa.A();
        A.a(str);
        A.a(this.j.c().currentTimeMillis());
        A.b(((Long) sd.e).longValue());
        C0920aa aaVar = (C0920aa) A.w();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= aVar.q()) {
                break;
            } else if (str.equals(aVar.d(i2).p())) {
                aVar.a(i2, aaVar);
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z2) {
            aVar.a(aaVar);
        }
        if (j2 > 0) {
            i().a(sd);
            this.j.e().z().a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", sd.e);
        }
    }

    private final boolean a(com.google.android.gms.internal.measurement.S.a aVar, com.google.android.gms.internal.measurement.S.a aVar2) {
        Object obj;
        Preconditions.checkArgument("_e".equals(aVar.k()));
        g();
        U a2 = Rd.a((S) aVar.w(), "_sc");
        String str = null;
        if (a2 == null) {
            obj = null;
        } else {
            obj = a2.r();
        }
        g();
        U a3 = Rd.a((S) aVar2.w(), "_pc");
        if (a3 != null) {
            str = a3.r();
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        g();
        String str2 = "_et";
        U a4 = Rd.a((S) aVar.w(), str2);
        if (a4.s() && a4.t() > 0) {
            long t2 = a4.t();
            g();
            U a5 = Rd.a((S) aVar2.w(), str2);
            if (a5 != null && a5.t() > 0) {
                t2 += a5.t();
            }
            g();
            Rd.a(aVar2, str2, (Object) Long.valueOf(t2));
            g();
            Rd.a(aVar, "_fr", (Object) Long.valueOf(1));
        }
        return true;
    }

    @VisibleForTesting
    private static void a(com.google.android.gms.internal.measurement.S.a aVar, String str) {
        List m2 = aVar.m();
        for (int i2 = 0; i2 < m2.size(); i2++) {
            if (str.equals(((U) m2.get(i2)).p())) {
                aVar.b(i2);
                return;
            }
        }
    }

    @VisibleForTesting
    private static void a(com.google.android.gms.internal.measurement.S.a aVar, int i2, String str) {
        List m2 = aVar.m();
        int i3 = 0;
        while (true) {
            String str2 = "_err";
            if (i3 >= m2.size()) {
                com.google.android.gms.internal.measurement.U.a y2 = U.y();
                y2.a(str2);
                y2.a(Long.valueOf((long) i2).longValue());
                U u2 = (U) y2.w();
                com.google.android.gms.internal.measurement.U.a y3 = U.y();
                y3.a("_ev");
                y3.b(str);
                U u3 = (U) y3.w();
                aVar.a(u2);
                aVar.a(u3);
                return;
            } else if (!str2.equals(((U) m2.get(i3)).p())) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final void a(int i2, Throwable th, byte[] bArr, String str) {
        he i3;
        B();
        m();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.s = false;
                y();
                throw th2;
            }
        }
        List<Long> list = this.w;
        this.w = null;
        boolean z = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.j.g().f.a(this.j.c().currentTimeMillis());
                this.j.g().g.a(0);
                x();
                this.j.e().A().a("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                i().u();
                try {
                    for (Long l2 : list) {
                        try {
                            i3 = i();
                            long longValue = l2.longValue();
                            i3.i();
                            i3.s();
                            if (i3.w().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            i3.e().s().a("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            if (this.x == null || !this.x.contains(l2)) {
                                throw e3;
                            }
                        }
                    }
                    i().x();
                    i().v();
                    this.x = null;
                    if (!k().u() || !w()) {
                        this.y = -1;
                        x();
                    } else {
                        n();
                    }
                    this.n = 0;
                } catch (Throwable th3) {
                    i().v();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.j.e().s().a("Database error while trying to delete uploaded bundles", e4);
                this.n = this.j.c().elapsedRealtime();
                this.j.e().A().a("Disable upload, time", Long.valueOf(this.n));
            }
        } else {
            this.j.e().A().a("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.j.g().g.a(this.j.c().currentTimeMillis());
            if (i2 != 503) {
                if (i2 != 429) {
                    z = false;
                }
            }
            if (z) {
                this.j.g().h.a(this.j.c().currentTimeMillis());
            }
            i().a(list);
            x();
        }
        this.s = false;
        y();
    }

    private final void a(Db db) {
        B();
        if (!TextUtils.isEmpty(db.c()) || (ce.x() && !TextUtils.isEmpty(db.g()))) {
            ce h2 = this.j.h();
            Builder builder = new Builder();
            String c2 = db.c();
            if (TextUtils.isEmpty(c2) && ce.x()) {
                c2 = db.g();
            }
            T t2 = null;
            Builder encodedAuthority = builder.scheme((String) C1127j.p.a(null)).encodedAuthority((String) C1127j.q.a(null));
            String str = "config/app/";
            String valueOf = String.valueOf(c2);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", db.a()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(h2.m()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.j.e().A().a("Fetching remote configuration", db.f());
                C0948ea a2 = j().a(db.f());
                String b2 = j().b(db.f());
                if (a2 != null && !TextUtils.isEmpty(b2)) {
                    t2 = new T();
                    t2.put("If-Modified-Since", b2);
                }
                T t3 = t2;
                this.r = true;
                C1144mb k2 = k();
                String f2 = db.f();
                Pd pd = new Pd(this);
                k2.i();
                k2.s();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(pd);
                Gb d2 = k2.d();
                C1164qb qbVar = new C1164qb(k2, f2, url, null, t3, pd);
                d2.b((Runnable) qbVar);
            } catch (MalformedURLException unused) {
                this.j.e().s().a("Failed to parse config URL. Not fetching. appId", C1124ib.a(db.f()), uri);
            }
        } else {
            a(db.f(), 204, null, null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    @VisibleForTesting
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        B();
        m();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.r = false;
                y();
                throw th2;
            }
        }
        this.j.e().A().a("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        i().u();
        Db b2 = i().b(str);
        boolean z = true;
        boolean z2 = (i2 == 200 || i2 == 204 || i2 == 304) && th == null;
        if (b2 == null) {
            this.j.e().v().a("App does not exist in onConfigFetched. appId", C1124ib.a(str));
        } else {
            if (!z2) {
                if (i2 != 404) {
                    b2.i(this.j.c().currentTimeMillis());
                    i().a(b2);
                    this.j.e().A().a("Fetching config failed. code, error", Integer.valueOf(i2), th);
                    j().c(str);
                    this.j.g().g.a(this.j.c().currentTimeMillis());
                    if (i2 != 503) {
                        if (i2 != 429) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.j.g().h.a(this.j.c().currentTimeMillis());
                    }
                    x();
                }
            }
            List list = map != null ? (List) map.get("Last-Modified") : null;
            String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
            if (i2 != 404) {
                if (i2 != 304) {
                    if (!j().a(str, bArr, str2)) {
                        i().v();
                        this.r = false;
                        y();
                        return;
                    }
                    b2.h(this.j.c().currentTimeMillis());
                    i().a(b2);
                    if (i2 != 404) {
                        this.j.e().x().a("Config not found. Using empty config. appId", str);
                    } else {
                        this.j.e().A().a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                    }
                    if (k().u() || !w()) {
                        x();
                    } else {
                        n();
                    }
                }
            }
            if (j().a(str) == null && !j().a(str, null, null)) {
                i().v();
                this.r = false;
                y();
                return;
            }
            b2.h(this.j.c().currentTimeMillis());
            i().a(b2);
            if (i2 != 404) {
            }
            if (k().u()) {
            }
            x();
        }
        i().x();
        i().v();
        this.r = false;
        y();
    }

    /* access modifiers changed from: 0000 */
    public final void a(Runnable runnable) {
        B();
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(runnable);
    }

    @VisibleForTesting
    private final int a(FileChannel fileChannel) {
        B();
        int i2 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.j.e().s().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.j.e().v().a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i2 = allocate.getInt();
            return i2;
        } catch (IOException e2) {
            this.j.e().s().a("Failed to read from channel", e2);
        }
    }

    @VisibleForTesting
    private final boolean a(int i2, FileChannel fileChannel) {
        B();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.j.e().s().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.j.e().s().a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.j.e().s().a("Failed to write to channel", e2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final void a(zzn zzn) {
        String str = "app_id=?";
        if (this.w != null) {
            this.x = new ArrayList();
            this.x.addAll(this.w);
        }
        he i2 = i();
        String str2 = zzn.a;
        Preconditions.checkNotEmpty(str2);
        i2.i();
        i2.s();
        try {
            SQLiteDatabase w2 = i2.w();
            String[] strArr = {str2};
            int delete = w2.delete("apps", str, strArr) + 0 + w2.delete("events", str, strArr) + w2.delete("user_attributes", str, strArr) + w2.delete("conditional_properties", str, strArr) + w2.delete("raw_events", str, strArr) + w2.delete("raw_events_metadata", str, strArr) + w2.delete("queue", str, strArr) + w2.delete("audience_filter_values", str, strArr) + w2.delete("main_event_params", str, strArr);
            if (delete > 0) {
                i2.e().A().a("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            i2.e().s().a("Error resetting analytics data. appId, error", C1124ib.a(str2), e2);
        }
        zzn a2 = a(this.j.getContext(), zzn.a, zzn.b, zzn.h, zzn.o, zzn.p, zzn.m, zzn.r);
        if (zzn.h) {
            c(a2);
        }
    }

    private final zzn a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j2, String str3) {
        String str4;
        String str5;
        int i2;
        String str6 = str;
        String str7 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.j.e().s().a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str6);
        } catch (IllegalArgumentException unused) {
            this.j.e().s().a("Error retrieving installer package name. appId", C1124ib.a(str));
            str4 = str7;
        }
        if (str4 == null) {
            str4 = "manual_install";
        } else if ("com.android.vending".equals(str4)) {
            str4 = "";
        }
        String str8 = str4;
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str6, 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = Wrappers.packageManager(context).getApplicationLabel(str6);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    String charSequence = applicationLabel.toString();
                }
                String str9 = packageInfo.versionName;
                i2 = packageInfo.versionCode;
                str5 = str9;
            } else {
                i2 = Integer.MIN_VALUE;
                str5 = str7;
            }
            this.j.a();
            zzn zzn = new zzn(str, str2, str5, (long) i2, str8, this.j.h().m(), this.j.F().a(context, str6), (String) null, z, false, "", 0, this.j.h().j(str6) ? j2 : 0, 0, z2, z3, false, str3, (Boolean) null, 0, null);
            return zzn;
        } catch (NameNotFoundException unused2) {
            this.j.e().s().a("Error retrieving newly installed package info. appId, appName", C1124ib.a(str), str7);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(zzjn zzjn, zzn zzn) {
        B();
        m();
        if (TextUtils.isEmpty(zzn.b) && TextUtils.isEmpty(zzn.r)) {
            return;
        }
        if (!zzn.h) {
            e(zzn);
            return;
        }
        int c2 = this.j.F().c(zzjn.b);
        if (c2 != 0) {
            this.j.F();
            String a2 = Vd.a(zzjn.b, 24, true);
            String str = zzjn.b;
            this.j.F().a(zzn.a, c2, "_ev", a2, str != null ? str.length() : 0);
            return;
        }
        int b2 = this.j.F().b(zzjn.b, zzjn.i());
        if (b2 != 0) {
            this.j.F();
            String a3 = Vd.a(zzjn.b, 24, true);
            Object i2 = zzjn.i();
            this.j.F().a(zzn.a, b2, "_ev", a3, (i2 == null || (!(i2 instanceof String) && !(i2 instanceof CharSequence))) ? 0 : String.valueOf(i2).length());
            return;
        }
        Object c3 = this.j.F().c(zzjn.b, zzjn.i());
        if (c3 != null) {
            if ("_sid".equals(zzjn.b) && this.j.h().o(zzn.a)) {
                long j2 = zzjn.c;
                String str2 = zzjn.g;
                long j3 = 0;
                Sd d2 = i().d(zzn.a, "_sno");
                if (d2 != null) {
                    Object obj = d2.e;
                    if (obj instanceof Long) {
                        j3 = ((Long) obj).longValue();
                        zzjn zzjn2 = new zzjn("_sno", j2, Long.valueOf(j3 + 1), str2);
                        a(zzjn2, zzn);
                    }
                }
                if (d2 != null) {
                    this.j.e().v().a("Retrieved last session number from database does not contain a valid (long) value", d2.e);
                }
                if (this.j.h().e(zzn.a, C1127j.ka)) {
                    C1107f b3 = i().b(zzn.a, "_s");
                    if (b3 != null) {
                        j3 = b3.c;
                        this.j.e().A().a("Backfill the session number. Last used session number", Long.valueOf(j3));
                    }
                }
                zzjn zzjn22 = new zzjn("_sno", j2, Long.valueOf(j3 + 1), str2);
                a(zzjn22, zzn);
            }
            Sd sd = new Sd(zzn.a, zzjn.g, zzjn.b, zzjn.c, c3);
            this.j.e().z().a("Setting user property", this.j.E().c(sd.c), c3);
            i().u();
            try {
                e(zzn);
                boolean a4 = i().a(sd);
                i().x();
                if (a4) {
                    this.j.e().z().a("User property set", this.j.E().c(sd.c), sd.e);
                } else {
                    this.j.e().s().a("Too many unique user properties are set. Ignoring user property", this.j.E().c(sd.c), sd.e);
                    this.j.F().a(zzn.a, 9, (String) null, (String) null, 0);
                }
            } finally {
                i().v();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Ld ld) {
        this.p++;
    }

    private final zzn a(String str) {
        String str2 = str;
        Db b2 = i().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.k())) {
            this.j.e().z().a("No app data available; dropping", str2);
            return null;
        }
        Boolean b3 = b(b2);
        if (b3 == null || b3.booleanValue()) {
            Db db = b2;
            zzn zzn = new zzn(str, b2.c(), b2.k(), b2.l(), b2.m(), b2.n(), b2.o(), (String) null, b2.d(), false, b2.b(), db.C(), 0, 0, db.D(), db.E(), false, db.g(), db.F(), db.p(), db.G());
            return zzn;
        }
        this.j.e().s().a("App version does not match; dropping. appId", C1124ib.a(str));
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(zzq zzq) {
        zzn a2 = a(zzq.a);
        if (a2 != null) {
            a(zzq, a2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(zzq zzq, zzn zzn) {
        Preconditions.checkNotNull(zzq);
        Preconditions.checkNotEmpty(zzq.a);
        Preconditions.checkNotNull(zzq.b);
        Preconditions.checkNotNull(zzq.c);
        Preconditions.checkNotEmpty(zzq.c.b);
        B();
        m();
        if (TextUtils.isEmpty(zzn.b) && TextUtils.isEmpty(zzn.r)) {
            return;
        }
        if (!zzn.h) {
            e(zzn);
            return;
        }
        zzq zzq2 = new zzq(zzq);
        boolean z = false;
        zzq2.e = false;
        i().u();
        try {
            zzq e2 = i().e(zzq2.a, zzq2.c.b);
            if (e2 != null && !e2.b.equals(zzq2.b)) {
                this.j.e().v().a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.j.E().c(zzq2.c.b), zzq2.b, e2.b);
            }
            if (e2 != null && e2.e) {
                zzq2.b = e2.b;
                zzq2.d = e2.d;
                zzq2.h = e2.h;
                zzq2.f = e2.f;
                zzq2.i = e2.i;
                zzq2.e = e2.e;
                zzjn zzjn = new zzjn(zzq2.c.b, e2.c.c, zzq2.c.i(), e2.c.g);
                zzq2.c = zzjn;
            } else if (TextUtils.isEmpty(zzq2.f)) {
                zzjn zzjn2 = new zzjn(zzq2.c.b, zzq2.d, zzq2.c.i(), zzq2.c.g);
                zzq2.c = zzjn2;
                zzq2.e = true;
                z = true;
            }
            if (zzq2.e) {
                zzjn zzjn3 = zzq2.c;
                Sd sd = new Sd(zzq2.a, zzq2.b, zzjn3.b, zzjn3.c, zzjn3.i());
                if (i().a(sd)) {
                    this.j.e().z().a("User property updated immediately", zzq2.a, this.j.E().c(sd.c), sd.e);
                } else {
                    this.j.e().s().a("(2)Too many active user properties, ignoring", C1124ib.a(zzq2.a), this.j.E().c(sd.c), sd.e);
                }
                if (z && zzq2.i != null) {
                    b(new zzai(zzq2.i, zzq2.d), zzn);
                }
            }
            if (i().a(zzq2)) {
                this.j.e().z().a("Conditional property added", zzq2.a, this.j.E().c(zzq2.c.b), zzq2.c.i());
            } else {
                this.j.e().s().a("Too many conditional properties, ignoring", C1124ib.a(zzq2.a), this.j.E().c(zzq2.c.b), zzq2.c.i());
            }
            i().x();
        } finally {
            i().v();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        x();
    }
}
