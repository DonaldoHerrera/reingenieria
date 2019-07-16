package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: Gza reason: default package and case insensitive filesystem */
/* compiled from: ApiActivityItem.kt */
public final class C4948Gza {
    private final C5104Lza a;
    private final C5135Mza b;
    private final C5073Kza c;
    private final C5010Iza d;
    private final C5042Jza e;
    private final C5165Nza f;

    @JsonCreator
    public C4948Gza() {
        this(null, null, null, null, null, null, 63, null);
    }

    @JsonCreator
    public C4948Gza(@JsonProperty("track_like") C5104Lza lza, @JsonProperty("track_repost") C5135Mza mza, @JsonProperty("track_comment") C5073Kza kza, @JsonProperty("playlist_like") C5010Iza iza, @JsonProperty("playlist_repost") C5042Jza jza, @JsonProperty("user_follow") C5165Nza nza) {
        this.a = lza;
        this.b = mza;
        this.c = kza;
        this.d = iza;
        this.e = jza;
        this.f = nza;
    }

    public final C4979Hza a() {
        C5104Lza lza = this.a;
        return lza != null ? lza : this.d;
    }

    public final C3927zda b() {
        C5010Iza iza = this.d;
        if (iza != null) {
            C3927zda a2 = iza.a();
            if (a2 != null) {
                return a2;
            }
        }
        C5042Jza jza = this.e;
        if (jza != null) {
            return jza.a();
        }
        return null;
    }

    public final C4979Hza c() {
        C5135Mza mza = this.b;
        return mza != null ? mza : this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0 != null) goto L_0x0016;
     */
    public final Yda d() {
        Yda yda;
        C5104Lza lza = this.a;
        if (lza != null) {
            yda = lza.a();
        }
        C5135Mza mza = this.b;
        yda = mza != null ? mza.a() : null;
        if (yda != null) {
            return yda;
        }
        C5073Kza kza = this.c;
        if (kza != null) {
            return kza.f();
        }
        return null;
    }

    public final C5073Kza e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.f, (java.lang.Object) r3.f) != false) goto L_0x0047;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4948Gza) {
                C4948Gza gza = (C4948Gza) obj;
                if (C7471uYa.a((Object) this.a, (Object) gza.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) gza.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) gza.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) gza.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) gza.e)) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0 != null) goto L_0x0016;
     */
    public final C3776gea f() {
        C3776gea gea;
        C5104Lza lza = this.a;
        if (lza != null) {
            gea = lza.d();
        }
        C5135Mza mza = this.b;
        gea = mza != null ? mza.d() : null;
        if (gea == null) {
            C5073Kza kza = this.c;
            gea = kza != null ? kza.d() : null;
        }
        if (gea == null) {
            C5010Iza iza = this.d;
            gea = iza != null ? iza.d() : null;
        }
        if (gea == null) {
            C5042Jza jza = this.e;
            gea = jza != null ? jza.d() : null;
        }
        if (gea != null) {
            return gea;
        }
        C5165Nza nza = this.f;
        if (nza != null) {
            return nza.d();
        }
        return null;
    }

    public final C5165Nza g() {
        return this.f;
    }

    public int hashCode() {
        C5104Lza lza = this.a;
        int i = 0;
        int hashCode = (lza != null ? lza.hashCode() : 0) * 31;
        C5135Mza mza = this.b;
        int hashCode2 = (hashCode + (mza != null ? mza.hashCode() : 0)) * 31;
        C5073Kza kza = this.c;
        int hashCode3 = (hashCode2 + (kza != null ? kza.hashCode() : 0)) * 31;
        C5010Iza iza = this.d;
        int hashCode4 = (hashCode3 + (iza != null ? iza.hashCode() : 0)) * 31;
        C5042Jza jza = this.e;
        int hashCode5 = (hashCode4 + (jza != null ? jza.hashCode() : 0)) * 31;
        C5165Nza nza = this.f;
        if (nza != null) {
            i = nza.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiActivityItem(trackLike=");
        sb.append(this.a);
        sb.append(", trackRepost=");
        sb.append(this.b);
        sb.append(", trackComment=");
        sb.append(this.c);
        sb.append(", playlistLike=");
        sb.append(this.d);
        sb.append(", playlistRepost=");
        sb.append(this.e);
        sb.append(", userFollow=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C4948Gza(C5104Lza lza, C5135Mza mza, C5073Kza kza, C5010Iza iza, C5042Jza jza, C5165Nza nza, int i, C7264rYa rya) {
        C5104Lza lza2 = (i & 1) != 0 ? null : lza;
        this(lza2, (i & 2) != 0 ? null : mza, (i & 4) != 0 ? null : kza, (i & 8) != 0 ? null : iza, (i & 16) != 0 ? null : jza, (i & 32) != 0 ? null : nza);
    }
}
