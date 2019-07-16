package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: Stats */
class P {
    final HandlerThread a = new HandlerThread("Picasso-Stats", 10);
    final C6246k b;
    final Handler c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    /* compiled from: Stats */
    private static class a extends Handler {
        private final P a;

        a(Looper looper, P p) {
            super(looper);
            this.a = p;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.a.d();
            } else if (i == 1) {
                this.a.e();
            } else if (i == 2) {
                this.a.b((long) message.arg1);
            } else if (i == 3) {
                this.a.c((long) message.arg1);
            } else if (i != 4) {
                E.a.post(new O(this, message));
            } else {
                this.a.a((Long) message.obj);
            }
        }
    }

    P(C6246k kVar) {
        this.b = kVar;
        this.a.start();
        W.a(this.a.getLooper());
        this.c = new a(this.a.getLooper(), this);
    }

    /* access modifiers changed from: 0000 */
    public void a(Bitmap bitmap) {
        a(bitmap, 2);
    }

    /* access modifiers changed from: 0000 */
    public void b(Bitmap bitmap) {
        a(bitmap, 3);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.d++;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.e++;
    }

    /* access modifiers changed from: 0000 */
    public void a(long j2) {
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j2)));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: 0000 */
    public void c(long j2) {
        this.n++;
        this.h += j2;
        this.k = a(this.m, this.h);
    }

    /* access modifiers changed from: 0000 */
    public void a(Long l2) {
        this.l++;
        this.f += l2.longValue();
        this.i = a(this.l, this.f);
    }

    /* access modifiers changed from: 0000 */
    public void b(long j2) {
        this.m++;
        this.g += j2;
        this.j = a(this.m, this.g);
    }

    /* access modifiers changed from: 0000 */
    public Q a() {
        Q q = new Q(this.b.a(), this.b.size(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, System.currentTimeMillis());
        return q;
    }

    private void a(Bitmap bitmap, int i2) {
        int a2 = W.a(bitmap);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(i2, a2, 0));
    }

    private static long a(int i2, long j2) {
        return j2 / ((long) i2);
    }
}
