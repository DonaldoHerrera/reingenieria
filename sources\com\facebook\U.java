package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProgressNoopOutputStream */
class U extends OutputStream implements X {
    private final Map<GraphRequest, Z> a = new HashMap();
    private final Handler b;
    private GraphRequest c;
    private Z d;
    private int e;

    U(Handler handler) {
        this.b = handler;
    }

    public void a(GraphRequest graphRequest) {
        this.c = graphRequest;
        this.d = graphRequest != null ? (Z) this.a.get(graphRequest) : null;
    }

    /* access modifiers changed from: 0000 */
    public Map<GraphRequest, Z> b() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public void h(long j) {
        if (this.d == null) {
            this.d = new Z(this.b, this.c);
            this.a.put(this.c, this.d);
        }
        this.d.b(j);
        this.e = (int) (((long) this.e) + j);
    }

    public void write(byte[] bArr) {
        h((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        h((long) i2);
    }

    public void write(int i) {
        h(1);
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return this.e;
    }
}
