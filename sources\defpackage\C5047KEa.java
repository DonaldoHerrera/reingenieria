package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: KEa reason: default package and case insensitive filesystem */
/* compiled from: PresenterManager.kt */
public class C5047KEa {
    private final Map<Long, C6968nEa> a = new LinkedHashMap();
    private long b = System.currentTimeMillis();

    public long a(C6968nEa nea) {
        C7471uYa.b(nea, "presenter");
        this.a.put(Long.valueOf(this.b), nea);
        long j = this.b;
        this.b = 1 + j;
        return j;
    }

    public void b(long j) {
        this.a.remove(Long.valueOf(j));
    }

    public <T extends C6968nEa> T a(long j) {
        return (C6968nEa) this.a.get(Long.valueOf(j));
    }
}
