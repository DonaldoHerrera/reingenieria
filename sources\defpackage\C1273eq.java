package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: eq reason: default package and case insensitive filesystem */
/* compiled from: DefaultDataSource */
public final class C1273eq implements Zp {
    private final Context a;
    private final List<C1702sq> b = new ArrayList();
    private final Zp c;
    private Zp d;
    private Zp e;
    private Zp f;
    private Zp g;
    private Zp h;
    private Zp i;
    private Zp j;

    public C1273eq(Context context, Zp zp) {
        this.a = context.getApplicationContext();
        C1852xq.a(zp);
        this.c = zp;
    }

    private Zp b() {
        if (this.e == null) {
            this.e = new Tp(this.a);
            a(this.e);
        }
        return this.e;
    }

    private Zp c() {
        if (this.f == null) {
            this.f = new Wp(this.a);
            a(this.f);
        }
        return this.f;
    }

    private Zp d() {
        if (this.h == null) {
            this.h = new Xp();
            a(this.h);
        }
        return this.h;
    }

    private Zp e() {
        if (this.d == null) {
            this.d = new C1427jq();
            a(this.d);
        }
        return this.d;
    }

    private Zp f() {
        if (this.i == null) {
            this.i = new C1643qq(this.a);
            a(this.i);
        }
        return this.i;
    }

    private Zp g() {
        if (this.g == null) {
            try {
                this.g = (Zp) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                a(this.g);
            } catch (ClassNotFoundException unused) {
                Iq.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    public void a(C1702sq sqVar) {
        this.c.a(sqVar);
        this.b.add(sqVar);
        a(this.d, sqVar);
        a(this.e, sqVar);
        a(this.f, sqVar);
        a(this.g, sqVar);
        a(this.h, sqVar);
        a(this.i, sqVar);
    }

    public void close() throws IOException {
        Zp zp = this.j;
        if (zp != null) {
            try {
                zp.close();
            } finally {
                this.j = null;
            }
        }
    }

    public Uri getUri() {
        Zp zp = this.j;
        if (zp == null) {
            return null;
        }
        return zp.getUri();
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        Zp zp = this.j;
        C1852xq.a(zp);
        return zp.read(bArr, i2, i3);
    }

    public long a(C0470aq aqVar) throws IOException {
        C1852xq.b(this.j == null);
        String scheme = aqVar.a.getScheme();
        if (C0471ar.b(aqVar.a)) {
            String path = aqVar.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.j = e();
            } else {
                this.j = b();
            }
        } else if ("asset".equals(scheme)) {
            this.j = b();
        } else if ("content".equals(scheme)) {
            this.j = c();
        } else if ("rtmp".equals(scheme)) {
            this.j = g();
        } else if ("data".equals(scheme)) {
            this.j = d();
        } else if ("rawresource".equals(scheme)) {
            this.j = f();
        } else {
            this.j = this.c;
        }
        return this.j.a(aqVar);
    }

    public Map<String, List<String>> a() {
        Zp zp = this.j;
        return zp == null ? Collections.emptyMap() : zp.a();
    }

    private void a(Zp zp) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            zp.a((C1702sq) this.b.get(i2));
        }
    }

    private void a(Zp zp, C1702sq sqVar) {
        if (zp != null) {
            zp.a(sqVar);
        }
    }
}
