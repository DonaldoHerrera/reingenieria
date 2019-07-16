package com.google.android.gms.internal.firebase-perf;

import android.os.Build.VERSION;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.internal.firebase-perf.W.a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.firebase-perf.q reason: case insensitive filesystem */
public final class C0880q {
    private static final long a = TimeUnit.SECONDS.toMicros(1);
    private static C0880q b = null;
    private ScheduledFuture c = null;
    private final ScheduledExecutorService d;
    private long e;
    private final long f;
    private final String g;
    public final ConcurrentLinkedQueue<W> h;

    private C0880q() {
        long j = -1;
        this.e = -1;
        this.h = new ConcurrentLinkedQueue<>();
        this.d = Executors.newSingleThreadScheduledExecutor();
        String num = Integer.toString(Process.myPid());
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 11);
        sb.append("/proc/");
        sb.append(num);
        sb.append("/stat");
        this.g = sb.toString();
        if (VERSION.SDK_INT >= 21) {
            j = Os.sysconf(OsConstants._SC_CLK_TCK);
        }
        this.f = j;
    }

    public static C0880q a() {
        if (b == null) {
            b = new C0880q();
        }
        return b;
    }

    private final synchronized void f() {
        try {
            this.d.schedule(new r(this), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            String str = "FirebasePerformance";
            String str2 = "Unable to collect Cpu Metric: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    private final W g() {
        Throwable th;
        Throwable th2;
        String str = "FirebasePerformance";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.g));
            try {
                long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                long parseLong3 = Long.parseLong(split[14]);
                long parseLong4 = Long.parseLong(split[16]);
                a o = W.o();
                o.a(micros);
                o.c(c(parseLong3 + parseLong4));
                o.b(c(parseLong + parseLong2));
                W w = (W) ((C0889sb) o.b());
                bufferedReader.close();
                return w;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th = r3;
                th2 = th4;
            }
            throw th2;
            if (th != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    C0860l.a(th, th5);
                }
            } else {
                bufferedReader.close();
            }
            throw th2;
        } catch (IOException e2) {
            String str2 = "Unable to read 'proc/[pid]/stat' file: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e3) {
            String str3 = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            String valueOf2 = String.valueOf(e3.getMessage());
            Log.w(str, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return null;
        }
    }

    public final void b() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
            this.e = -1;
        }
    }

    public final void c() {
        f();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void d() {
        W g2 = g();
        if (g2 != null) {
            this.h.add(g2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void e() {
        W g2 = g();
        if (g2 != null) {
            this.h.add(g2);
        }
    }

    private final long c(long j) {
        return Math.round((((double) j) / ((double) this.f)) * ((double) a));
    }

    public final void a(long j) {
        long j2 = this.f;
        if (j2 != -1 && j2 != 0 && j > 0) {
            if (this.c != null) {
                if (this.e != j) {
                    b();
                    b(j);
                }
                return;
            }
            b(j);
        }
    }

    private final synchronized void b(long j) {
        this.e = j;
        try {
            this.c = this.d.scheduleAtFixedRate(new C0887s(this), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            String str = "FirebasePerformance";
            String str2 = "Unable to start collecting Cpu Metrics: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }
}
