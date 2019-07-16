package defpackage;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: NNa reason: default package and case insensitive filesystem */
/* compiled from: TimingMetric */
public class C5149NNa {
    private final String a;
    private final String b;
    private final boolean c;
    private long d;
    private long e;

    public C5149NNa(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = !Log.isLoggable(str2, 2);
    }

    private void c() {
        String str = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": ");
        sb.append(this.e);
        sb.append("ms");
        Log.v(str, sb.toString());
    }

    public synchronized void a() {
        if (!this.c) {
            this.d = SystemClock.elapsedRealtime();
            this.e = 0;
        }
    }

    public synchronized void b() {
        if (!this.c) {
            if (this.e == 0) {
                this.e = SystemClock.elapsedRealtime() - this.d;
                c();
            }
        }
    }
}
