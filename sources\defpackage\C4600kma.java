package defpackage;

import com.soundcloud.flippernative.api.ErrorReason;
import com.soundcloud.flippernative.api.PlayerState;

/* renamed from: kma reason: default package and case insensitive filesystem */
/* compiled from: FlipperEvent.kt */
public final class C4600kma {
    private final String a;
    private final PlayerState b;
    private final ErrorReason c;
    private final boolean d;
    private final long e;
    private final long f;
    private final String g;

    public C4600kma(String str, PlayerState playerState, ErrorReason errorReason, boolean z, long j, long j2, String str2) {
        C7471uYa.b(str, "uri");
        C7471uYa.b(playerState, "state");
        C7471uYa.b(errorReason, "stateReason");
        this.a = str;
        this.b = playerState;
        this.c = errorReason;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = str2;
    }

    public final boolean a() {
        return this.d;
    }

    public final long b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public final long d() {
        return this.e;
    }

    public final PlayerState e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4600kma) {
                C4600kma kma = (C4600kma) obj;
                if (C7471uYa.a((Object) this.a, (Object) kma.a) && C7471uYa.a((Object) this.b, (Object) kma.b) && C7471uYa.a((Object) this.c, (Object) kma.c)) {
                    if (this.d == kma.d) {
                        if (this.e == kma.e) {
                            if (!(this.f == kma.f) || !C7471uYa.a((Object) this.g, (Object) kma.g)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final ErrorReason f() {
        return this.c;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        PlayerState playerState = this.b;
        int hashCode2 = (hashCode + (playerState != null ? playerState.hashCode() : 0)) * 31;
        ErrorReason errorReason = this.c;
        int hashCode3 = (hashCode2 + (errorReason != null ? errorReason.hashCode() : 0)) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        long j = this.e;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StateChange(uri=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", stateReason=");
        sb.append(this.c);
        sb.append(", bufferingFlag=");
        sb.append(this.d);
        sb.append(", position=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", errorCategory=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
