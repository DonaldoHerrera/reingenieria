package com.soundcloud.android.sync;

import com.soundcloud.android.sync.ia.a;

/* renamed from: com.soundcloud.android.sync.k reason: case insensitive filesystem */
/* compiled from: AutoValue_SyncResult */
final class C6128k extends ia {
    private final a a;
    private final C4928GKa<Throwable> b;

    C6128k(a aVar, C4928GKa<Throwable> gKa) {
        if (aVar != null) {
            this.a = aVar;
            if (gKa != null) {
                this.b = gKa;
                return;
            }
            throw new NullPointerException("Null throwable");
        }
        throw new NullPointerException("Null kind");
    }

    public a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        if (!this.a.equals(iaVar.b()) || !this.b.equals(iaVar.f())) {
            z = false;
        }
        return z;
    }

    public C4928GKa<Throwable> f() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SyncResult{kind=");
        sb.append(this.a);
        sb.append(", throwable=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
