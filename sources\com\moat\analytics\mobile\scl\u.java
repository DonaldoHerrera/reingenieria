package com.moat.analytics.mobile.scl;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class u {
    private static u a;
    /* access modifiers changed from: private */
    public static final Queue<c> b = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */
    public Handler c;
    /* access modifiers changed from: private */
    public volatile d d = d.OFF;
    /* access modifiers changed from: private */
    public volatile boolean e = false;
    /* access modifiers changed from: private */
    public volatile boolean f = false;
    /* access modifiers changed from: private */
    public volatile int g = 200;
    /* access modifiers changed from: private */
    public final AtomicBoolean h = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public volatile long i = 0;
    /* access modifiers changed from: private */
    public final AtomicInteger j = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final AtomicBoolean k = new AtomicBoolean(false);
    private long l = 1800000;
    /* access modifiers changed from: private */
    public long m = 60000;

    private class a implements Runnable {
        private final Handler b;
        private final String c;
        /* access modifiers changed from: private */
        public final e d;

        private a(String str, Handler handler, e eVar) {
            this.d = eVar;
            this.b = handler;
            StringBuilder sb = new StringBuilder();
            sb.append("https://z.moatads.com/");
            sb.append(str);
            sb.append("/android/");
            sb.append("836cf3246c33629b8774ad205b387a651e021955".substring(0, 7));
            sb.append("/status.json");
            this.c = sb.toString();
        }

        private void a() {
            String b2 = b();
            final k kVar = new k(b2);
            u.this.e = kVar.a();
            u.this.f = kVar.b();
            u.this.g = kVar.c();
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    try {
                        a.this.d.a(kVar);
                    } catch (Exception e) {
                        l.a(e);
                    }
                }
            });
            u.this.i = System.currentTimeMillis();
            u.this.k.compareAndSet(true, false);
            if (b2 != null) {
                u.this.j.set(0);
            } else if (u.this.j.incrementAndGet() < 10) {
                u uVar = u.this;
                uVar.a(uVar.m);
            }
        }

        private String b() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append("?ts=");
            sb.append(System.currentTimeMillis());
            sb.append("&v=");
            sb.append("2.1.0");
            try {
                return (String) o.a(sb.toString()).b();
            } catch (Exception unused) {
                return null;
            }
        }

        public void run() {
            try {
                a();
            } catch (Exception e) {
                l.a(e);
            }
            this.b.removeCallbacks(this);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }
    }

    interface b {
        void b();

        void c();
    }

    private class c {
        final Long a;
        final b b;

        c(Long l, b bVar) {
            this.a = l;
            this.b = bVar;
        }
    }

    enum d {
        OFF,
        ON
    }

    interface e {
        void a(k kVar);
    }

    u() {
        try {
            this.c = new Handler(Looper.getMainLooper());
        } catch (Exception e2) {
            l.a(e2);
        }
    }

    /* access modifiers changed from: private */
    public void a(final long j2) {
        if (this.k.compareAndSet(false, true)) {
            if (this.e) {
                Log.d("MoatOnOff", "Performing status check.");
            }
            new Thread() {
                public void run() {
                    Looper.prepare();
                    Handler handler = new Handler();
                    a aVar = new a("SCL", handler, new e() {
                        public void a(k kVar) {
                            synchronized (u.b) {
                                if (u.this.d != kVar.d()) {
                                    u.this.d = kVar.d();
                                    if (u.this.d == d.ON && u.this.e) {
                                        Log.d("MoatOnOff", "Moat enabled - Version 2.1.0");
                                    }
                                    for (c cVar : u.b) {
                                        if (u.this.d == d.ON) {
                                            cVar.b.b();
                                        } else {
                                            cVar.b.c();
                                        }
                                    }
                                }
                                while (!u.b.isEmpty()) {
                                    u.b.remove();
                                }
                            }
                        }
                    });
                    handler.postDelayed(aVar, j2);
                    Looper.loop();
                }
            }.start();
        }
    }

    static synchronized u d() {
        u uVar;
        synchronized (u.class) {
            if (a == null) {
                try {
                    a = new u();
                } catch (Exception e2) {
                    l.a(e2);
                    a = new e();
                }
            }
            uVar = a;
        }
        return uVar;
    }

    /* access modifiers changed from: private */
    public void h() {
        synchronized (b) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                if (currentTimeMillis - ((c) it.next()).a.longValue() >= 60000) {
                    it.remove();
                }
            }
            if (b.size() >= 15) {
                for (int i2 = 0; i2 < 5; i2++) {
                    b.remove();
                }
            }
        }
    }

    private void i() {
        if (this.h.compareAndSet(false, true)) {
            this.c.postDelayed(new Runnable() {
                public void run() {
                    try {
                        if (u.b.size() > 0) {
                            u.this.h();
                            u.this.c.postDelayed(this, 60000);
                            return;
                        }
                        u.this.h.compareAndSet(true, false);
                        u.this.c.removeCallbacks(this);
                    } catch (Exception e) {
                        l.a(e);
                    }
                }
            }, 60000);
        }
    }

    public d a() {
        return this.d;
    }

    public void a(b bVar) {
        if (this.d == d.ON) {
            bVar.b();
            return;
        }
        h();
        b.add(new c(Long.valueOf(System.currentTimeMillis()), bVar));
        i();
    }

    public boolean b() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.f;
    }

    public void f() {
        if (System.currentTimeMillis() - this.i > this.l) {
            a(0);
        }
    }
}
