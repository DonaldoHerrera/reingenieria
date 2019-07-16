package defpackage;

import com.soundcloud.android.foundation.events.J;

@EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u0000 $2\u00020\u0001:\u0001$B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/soundcloud/android/events/FakeAdImpressionEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "monetizableTrackUrn", "impressionName", "", "monetizationType", "Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "originScreen", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Ljava/lang/String;)V", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getImpressionName", "()Ljava/lang/String;", "getMonetizableTrackUrn", "getMonetizationType", "()Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "getOriginScreen", "ts", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "id", "timestamp", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: vaa reason: default package and case insensitive filesystem */
/* compiled from: ErrorAdEvent.kt */
public final class C3892vaa extends J {
    public static final a a = new a(null);
    private final long b = J.c();
    private final C3508cda c;
    private final C3508cda d;
    private final String e;
    private final com.soundcloud.android.foundation.ads.C3676c.a f;
    private final String g;

    /* renamed from: vaa$a */
    /* compiled from: ErrorAdEvent.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3892vaa(C3508cda cda, C3508cda cda2, String str, com.soundcloud.android.foundation.ads.C3676c.a aVar, String str2) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(cda2, "monetizableTrackUrn");
        C7471uYa.b(str, "impressionName");
        C7471uYa.b(aVar, "monetizationType");
        this.c = cda;
        this.d = cda2;
        this.e = str;
        this.f = aVar;
        this.g = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.g, (java.lang.Object) r3.g) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3892vaa) {
                C3892vaa vaa = (C3892vaa) obj;
                if (C7471uYa.a((Object) this.c, (Object) vaa.c)) {
                    if (C7471uYa.a((Object) this.d, (Object) vaa.d)) {
                        if (C7471uYa.a((Object) this.e, (Object) vaa.e)) {
                            if (C7471uYa.a((Object) this.f, (Object) vaa.f)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public long g() {
        return this.b;
    }

    public int hashCode() {
        C3508cda cda = this.c;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        C3508cda cda2 = this.d;
        int hashCode2 = (hashCode + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        com.soundcloud.android.foundation.ads.C3676c.a aVar = this.f;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final C3508cda i() {
        return this.c;
    }

    public final String j() {
        return this.e;
    }

    public final C3508cda k() {
        return this.d;
    }

    public final com.soundcloud.android.foundation.ads.C3676c.a l() {
        return this.f;
    }

    public final String m() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FakeAdImpressionEvent(adUrn=");
        sb.append(this.c);
        sb.append(", monetizableTrackUrn=");
        sb.append(this.d);
        sb.append(", impressionName=");
        sb.append(this.e);
        sb.append(", monetizationType=");
        sb.append(this.f);
        sb.append(", originScreen=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
