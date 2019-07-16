package defpackage;

/* renamed from: Nna reason: default package */
/* compiled from: ViewPlaybackStateEmitter.kt */
public final class Nna {
    private final Jna a;
    private final boolean b;
    private final Kna c;
    private final boolean d;
    private final long e;

    public Nna(Jna jna, boolean z, Kna kna, boolean z2, long j) {
        C7471uYa.b(jna, "playerPlayState");
        C7471uYa.b(kna, "playerProgressState");
        this.a = jna;
        this.b = z;
        this.c = kna;
        this.d = z2;
        this.e = j;
    }

    public final long a() {
        return this.e;
    }

    public final Jna b() {
        return this.a;
    }

    public final Kna c() {
        return this.c;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Nna) {
                Nna nna = (Nna) obj;
                if (C7471uYa.a((Object) this.a, (Object) nna.a)) {
                    if ((this.b == nna.b) && C7471uYa.a((Object) this.c, (Object) nna.c)) {
                        if (this.d == nna.d) {
                            if (this.e == nna.e) {
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
        Jna jna = this.a;
        int i = 0;
        int hashCode = (jna != null ? jna.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Kna kna = this.c;
        if (kna != null) {
            i = kna.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z2 = this.d;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        long j = this.e;
        return i4 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ViewPlaybackState(playerPlayState=");
        sb.append(this.a);
        sb.append(", sessionActive=");
        sb.append(this.b);
        sb.append(", playerProgressState=");
        sb.append(this.c);
        sb.append(", isScrubbing=");
        sb.append(this.d);
        sb.append(", playPosition=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
