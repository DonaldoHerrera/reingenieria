package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.common.internal.ImagesContract;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/android/foundation/ads/AudioAdSource;", "", "type", "", "url", "requiresAuth", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getRequiresAuth", "()Z", "getType", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "isHls", "isMp3", "toString", "ApiModel", "Companion", "ads_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.ads.v reason: case insensitive filesystem */
/* compiled from: AudioAdSource.kt */
public final class C3694v {
    public static final b a = new b(null);
    private final String b;
    private final String c;
    private final boolean d;

    /* renamed from: com.soundcloud.android.foundation.ads.v$a */
    /* compiled from: AudioAdSource.kt */
    public static final class a {
        private final String a;
        private final String b;
        private final boolean c;

        @JsonCreator
        public a(@JsonProperty("type") String str, @JsonProperty("url") String str2, @JsonProperty("requires_auth") boolean z) {
            C7471uYa.b(str, C1325gg.TYPE);
            C7471uYa.b(str2, ImagesContract.URL);
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a) && C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                        if (this.c == aVar.c) {
                            return true;
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
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiModel(type=");
            sb.append(this.a);
            sb.append(", url=");
            sb.append(this.b);
            sb.append(", requiresAuth=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.foundation.ads.v$b */
    /* compiled from: AudioAdSource.kt */
    public static final class b {
        private b() {
        }

        @NXa
        public final C3694v a(a aVar) {
            C7471uYa.b(aVar, "apiModel");
            return new C3694v(aVar.b(), aVar.c(), aVar.a());
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public C3694v(String str, String str2, boolean z) {
        C7471uYa.b(str, C1325gg.TYPE);
        C7471uYa.b(str2, ImagesContract.URL);
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return C7471uYa.a((Object) this.b, (Object) "application/x-mpegurl");
    }

    public final boolean d() {
        return C7471uYa.a((Object) this.b, (Object) "audio/mpeg");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3694v) {
                C3694v vVar = (C3694v) obj;
                if (C7471uYa.a((Object) this.b, (Object) vVar.b) && C7471uYa.a((Object) this.c, (Object) vVar.c)) {
                    if (this.d == vVar.d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAdSource(type=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", requiresAuth=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
