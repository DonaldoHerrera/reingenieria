package defpackage;

/* renamed from: Ina reason: default package */
/* compiled from: ViewPlaybackStateEmitter.kt */
public final class Ina {
    private final Jna a;
    private final boolean b;
    private final long c;
    private final long d;
    private final long e;

    public Ina(Jna jna, boolean z, long j, long j2, long j3) {
        C7471uYa.b(jna, "playerPlayState");
        this.a = jna;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final long a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final Jna c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ina) {
                Ina ina = (Ina) obj;
                if (C7471uYa.a((Object) this.a, (Object) ina.a)) {
                    if (this.b == ina.b) {
                        if (this.c == ina.c) {
                            if (this.d == ina.d) {
                                if (this.e == ina.e) {
                                    return true;
                                }
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
        Jna jna = this.a;
        int hashCode = (jna != null ? jna.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        long j = this.c;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackStateInput(playerPlayState=");
        sb.append(this.a);
        sb.append(", sessionActive=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", createdAt=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
