package defpackage;

import com.soundcloud.android.playback.core.l;

/* renamed from: Ula reason: default package */
/* compiled from: FlipperConfiguration.kt */
public final class Ula {
    private final l<String> a;
    private final Long b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public Ula(l<String> lVar, Long l, boolean z, boolean z2, boolean z3) {
        C7471uYa.b(lVar, "cache");
        this.a = lVar;
        this.b = l;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final l<String> a() {
        return this.a;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c() {
        return this.c;
    }

    public final Long d() {
        return this.b;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ula) {
                Ula ula = (Ula) obj;
                if (C7471uYa.a((Object) this.a, (Object) ula.a) && C7471uYa.a((Object) this.b, (Object) ula.b)) {
                    if (this.c == ula.c) {
                        if (this.d == ula.d) {
                            if (this.e == ula.e) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        l<String> lVar = this.a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.d;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        return i4 + (z3 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FlipperConfiguration(cache=");
        sb.append(this.a);
        sb.append(", nativeBufferSize=");
        sb.append(this.b);
        sb.append(", forceEncryptedHls=");
        sb.append(this.c);
        sb.append(", shouldCrashOnHang=");
        sb.append(this.d);
        sb.append(", enableOboe=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
