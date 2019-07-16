package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: rAb reason: default package and case insensitive filesystem */
/* compiled from: ForwardingTimeout */
public class C7237rAb extends JAb {
    private JAb e;

    public C7237rAb(JAb jAb) {
        if (jAb != null) {
            this.e = jAb;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final C7237rAb a(JAb jAb) {
        if (jAb != null) {
            this.e = jAb;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public JAb b() {
        return this.e.b();
    }

    public long c() {
        return this.e.c();
    }

    public boolean d() {
        return this.e.d();
    }

    public void e() throws IOException {
        this.e.e();
    }

    public final JAb g() {
        return this.e;
    }

    public JAb a(long j, TimeUnit timeUnit) {
        return this.e.a(j, timeUnit);
    }

    public JAb a(long j) {
        return this.e.a(j);
    }

    public JAb a() {
        return this.e.a();
    }
}
