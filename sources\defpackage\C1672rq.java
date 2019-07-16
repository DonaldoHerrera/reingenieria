package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: rq reason: default package and case insensitive filesystem */
/* compiled from: StatsDataSource */
public final class C1672rq implements Zp {
    private final Zp a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map<String, List<String>> d = Collections.emptyMap();

    public C1672rq(Zp zp) {
        C1852xq.a(zp);
        this.a = zp;
    }

    public void a(C1702sq sqVar) {
        this.a.a(sqVar);
    }

    public long b() {
        return this.b;
    }

    public Uri c() {
        return this.c;
    }

    public void close() throws IOException {
        this.a.close();
    }

    public Map<String, List<String>> d() {
        return this.d;
    }

    public Uri getUri() {
        return this.a.getUri();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }

    public long a(C0470aq aqVar) throws IOException {
        this.c = aqVar.a;
        this.d = Collections.emptyMap();
        long a2 = this.a.a(aqVar);
        Uri uri = getUri();
        C1852xq.a(uri);
        this.c = uri;
        this.d = a();
        return a2;
    }

    public Map<String, List<String>> a() {
        return this.a.a();
    }
}
