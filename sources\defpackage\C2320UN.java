package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: UN reason: default package and case insensitive filesystem */
/* compiled from: MobilePlaySession.kt */
public final class C2320UN {
    private final String a;
    private final long b;
    private final String c;
    private final List<C3179oO> d;

    @JsonCreator
    public C2320UN(String str, long j, String str2, List<C3179oO> list) {
        C7471uYa.b(str, "trackUrn");
        C7471uYa.b(str2, "id");
        C7471uYa.b(list, "audioEvents");
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<oO>, for r8v0, types: [java.util.List] */
    public static /* synthetic */ C2320UN a(C2320UN un, String str, long j, String str2, List<C3179oO> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = un.a;
        }
        if ((i & 2) != 0) {
            j = un.b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = un.c;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            list = un.d;
        }
        return un.a(str, j2, str3, list);
    }

    public final C2320UN a(String str, long j, String str2, List<C3179oO> list) {
        C7471uYa.b(str, "trackUrn");
        C7471uYa.b(str2, "id");
        C7471uYa.b(list, "audioEvents");
        C2320UN un = new C2320UN(str, j, str2, list);
        return un;
    }

    @JsonProperty("audio_events")
    public final List<C3179oO> a() {
        return this.d;
    }

    @JsonProperty("id")
    public final String b() {
        return this.c;
    }

    @JsonProperty("play_session_duration_ms")
    public final long c() {
        return this.b;
    }

    @JsonProperty("track_urn")
    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2320UN) {
                C2320UN un = (C2320UN) obj;
                if (C7471uYa.a((Object) this.a, (Object) un.a)) {
                    if (!(this.b == un.b) || !C7471uYa.a((Object) this.c, (Object) un.c) || !C7471uYa.a((Object) this.d, (Object) un.d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.b;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.c;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C3179oO> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MobilePlaySession(trackUrn=");
        sb.append(this.a);
        sb.append(", playSessionDurationMs=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", audioEvents=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
