package defpackage;

import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.Stream;

/* renamed from: Hla reason: default package */
/* compiled from: PlayerStateChangeEvent.kt */
public final class Hla {
    private final String a;
    private final PlaybackItem b;
    private final Kla c;
    private final Jla d;
    private final Stream e;
    private final long f;
    private final long g;
    private final String h;

    public Hla(String str, PlaybackItem playbackItem, Kla kla, Jla jla, Stream stream, long j, long j2, String str2) {
        C7471uYa.b(str, "playerType");
        C7471uYa.b(playbackItem, "playbackItem");
        C7471uYa.b(kla, "playbackState");
        C7471uYa.b(jla, "playStateReason");
        C7471uYa.b(stream, "stream");
        this.a = str;
        this.b = playbackItem;
        this.c = kla;
        this.d = jla;
        this.e = stream;
        this.f = j;
        this.g = j2;
        this.h = str2;
    }

    public static /* synthetic */ Hla a(Hla hla, String str, PlaybackItem playbackItem, Kla kla, Jla jla, Stream stream, long j, long j2, String str2, int i, Object obj) {
        Hla hla2 = hla;
        int i2 = i;
        return hla.a((i2 & 1) != 0 ? hla2.a : str, (i2 & 2) != 0 ? hla2.b : playbackItem, (i2 & 4) != 0 ? hla2.c : kla, (i2 & 8) != 0 ? hla2.d : jla, (i2 & 16) != 0 ? hla2.e : stream, (i2 & 32) != 0 ? hla2.f : j, (i2 & 64) != 0 ? hla2.g : j2, (i2 & 128) != 0 ? hla2.h : str2);
    }

    public final long a() {
        return this.g;
    }

    public final Hla a(String str, PlaybackItem playbackItem, Kla kla, Jla jla, Stream stream, long j, long j2, String str2) {
        String str3 = str;
        C7471uYa.b(str, "playerType");
        PlaybackItem playbackItem2 = playbackItem;
        C7471uYa.b(playbackItem, "playbackItem");
        Kla kla2 = kla;
        C7471uYa.b(kla, "playbackState");
        Jla jla2 = jla;
        C7471uYa.b(jla2, "playStateReason");
        Stream stream2 = stream;
        C7471uYa.b(stream2, "stream");
        Hla hla = new Hla(str3, playbackItem2, kla2, jla2, stream2, j, j2, str2);
        return hla;
    }

    public final String b() {
        return this.h;
    }

    public final Jla c() {
        return this.d;
    }

    public final PlaybackItem d() {
        return this.b;
    }

    public final Kla e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hla) {
                Hla hla = (Hla) obj;
                if (C7471uYa.a((Object) this.a, (Object) hla.a) && C7471uYa.a((Object) this.b, (Object) hla.b) && C7471uYa.a((Object) this.c, (Object) hla.c) && C7471uYa.a((Object) this.d, (Object) hla.d) && C7471uYa.a((Object) this.e, (Object) hla.e)) {
                    if (this.f == hla.f) {
                        if (!(this.g == hla.g) || !C7471uYa.a((Object) this.h, (Object) hla.h)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.a;
    }

    public final long g() {
        return this.f;
    }

    public final Stream h() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        PlaybackItem playbackItem = this.b;
        int hashCode2 = (hashCode + (playbackItem != null ? playbackItem.hashCode() : 0)) * 31;
        Kla kla = this.c;
        int hashCode3 = (hashCode2 + (kla != null ? kla.hashCode() : 0)) * 31;
        Jla jla = this.d;
        int hashCode4 = (hashCode3 + (jla != null ? jla.hashCode() : 0)) * 31;
        Stream stream = this.e;
        int hashCode5 = (hashCode4 + (stream != null ? stream.hashCode() : 0)) * 31;
        long j = this.f;
        int i2 = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final boolean i() {
        return this.d == Jla.PLAYBACK_COMPLETE;
    }

    public final boolean j() {
        Jla jla = this.d;
        return jla == Jla.ERROR_RECOVERABLE || jla == Jla.ERROR_FATAL;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayerStateChangeEvent(playerType=");
        sb.append(this.a);
        sb.append(", playbackItem=");
        sb.append(this.b);
        sb.append(", playbackState=");
        sb.append(this.c);
        sb.append(", playStateReason=");
        sb.append(this.d);
        sb.append(", stream=");
        sb.append(this.e);
        sb.append(", progress=");
        sb.append(this.f);
        sb.append(", duration=");
        sb.append(this.g);
        sb.append(", errorCode=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Hla(String str, PlaybackItem playbackItem, Kla kla, Jla jla, Stream stream, long j, long j2, String str2, int i, C7264rYa rya) {
        this(str, playbackItem, kla, jla, stream, j, j2, (i & 128) != 0 ? null : str2);
    }
}
