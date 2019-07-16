package androidx.mediarouter.media;

import android.os.Bundle;

/* compiled from: MediaRouteDiscoveryRequest */
public final class b {
    private final Bundle a;
    private g b;

    public b(g gVar, boolean z) {
        if (gVar != null) {
            this.a = new Bundle();
            this.b = gVar;
            this.a.putBundle("selector", gVar.a());
            this.a.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    private void e() {
        if (this.b == null) {
            this.b = g.a(this.a.getBundle("selector"));
            if (this.b == null) {
                this.b = g.a;
            }
        }
    }

    public Bundle a() {
        return this.a;
    }

    public g b() {
        e();
        return this.b;
    }

    public boolean c() {
        return this.a.getBoolean("activeScan");
    }

    public boolean d() {
        e();
        return this.b.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!b().equals(bVar.b()) || c() != bVar.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return b().hashCode() ^ c() ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoveryRequest{ selector=");
        sb.append(b());
        sb.append(", activeScan=");
        sb.append(c());
        sb.append(", isValid=");
        sb.append(d());
        sb.append(" }");
        return sb.toString();
    }

    public static b a(Bundle bundle) {
        if (bundle != null) {
            return new b(bundle);
        }
        return null;
    }

    private b(Bundle bundle) {
        this.a = bundle;
    }
}
