package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest.b;
import com.facebook.GraphRequest.d;

/* compiled from: RequestProgress */
class Z {
    private final GraphRequest a;
    private final Handler b;
    private final long c = B.p();
    private long d;
    private long e;
    private long f;

    Z(Handler handler, GraphRequest graphRequest) {
        this.a = graphRequest;
        this.b = handler;
    }

    /* access modifiers changed from: 0000 */
    public void a(long j) {
        this.d += j;
        long j2 = this.d;
        if (j2 >= this.e + this.c || j2 >= this.f) {
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(long j) {
        this.f += j;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (this.d > this.e) {
            b e2 = this.a.e();
            long j = this.f;
            if (j > 0 && (e2 instanceof d)) {
                long j2 = this.d;
                d dVar = (d) e2;
                Handler handler = this.b;
                if (handler == null) {
                    dVar.onProgress(j2, j);
                } else {
                    Y y = new Y(this, dVar, j2, j);
                    handler.post(y);
                }
                this.e = this.d;
            }
        }
    }
}
