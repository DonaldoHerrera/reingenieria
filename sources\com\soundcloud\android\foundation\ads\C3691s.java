package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/foundation/ads/ApiErrorAd;", "", "()V", "Audio", "Video", "Lcom/soundcloud/android/foundation/ads/ApiErrorAd$Audio;", "Lcom/soundcloud/android/foundation/ads/ApiErrorAd$Video;", "ads_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.ads.s reason: case insensitive filesystem */
/* compiled from: ErrorAd.kt */
public abstract class C3691s {

    /* renamed from: com.soundcloud.android.foundation.ads.s$a */
    /* compiled from: ErrorAd.kt */
    public static final class a extends C3691s implements T {
        private final C3508cda a;
        private final List<Y> b;
        private final Long c;
        private final double d;
        private final boolean e;
        private final Integer f;

        @JsonCreator
        public a(@JsonProperty("urn") C3508cda cda, @JsonProperty("error_trackers") List<Y> list, @JsonProperty("frequency_cap_duration") Long l, @JsonProperty("score") double d2, @JsonProperty("isEmpty") boolean z, @JsonProperty("expiry_in_minutes") Integer num) {
            C7471uYa.b(cda, "urn");
            C7471uYa.b(list, "errorTrackers");
            super(null);
            this.a = cda;
            this.b = list;
            this.c = l;
            this.d = d2;
            this.e = z;
            this.f = num;
        }

        @JsonProperty("frequency_cap_duration")
        public Long a() {
            return this.c;
        }

        @JsonProperty("expiry_in_minutes")
        public final Integer b() {
            return this.f;
        }

        @JsonProperty("urn")
        public final C3508cda c() {
            return this.a;
        }

        @JsonProperty("error_trackers")
        public List<Y> d() {
            return this.b;
        }

        @JsonProperty("isEmpty")
        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a) && C7471uYa.a((Object) d(), (Object) aVar.d()) && C7471uYa.a((Object) a(), (Object) aVar.a()) && Double.compare(j(), aVar.j()) == 0) {
                        if (!(this.e == aVar.e) || !C7471uYa.a((Object) this.f, (Object) aVar.f)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda cda = this.a;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            List d2 = d();
            int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
            Long a2 = a();
            int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
            long doubleToLongBits = Double.doubleToLongBits(j());
            int i2 = (hashCode3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            Integer num = this.f;
            if (num != null) {
                i = num.hashCode();
            }
            return i3 + i;
        }

        @JsonProperty("score")
        public double j() {
            return this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Audio(urn=");
            sb.append(this.a);
            sb.append(", errorTrackers=");
            sb.append(d());
            sb.append(", adTimerDuration=");
            sb.append(a());
            sb.append(", priority=");
            sb.append(j());
            sb.append(", isEmpty=");
            sb.append(this.e);
            sb.append(", expiryInMins=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.foundation.ads.s$b */
    /* compiled from: ErrorAd.kt */
    public static final class b extends C3691s implements T {
        private final C3508cda a;
        private final List<Y> b;
        private final Long c;
        private final double d;
        private final boolean e;
        private final Integer f;

        @JsonCreator
        public b(@JsonProperty("urn") C3508cda cda, @JsonProperty("error_trackers") List<Y> list, @JsonProperty("frequency_cap_duration") Long l, @JsonProperty("score") double d2, @JsonProperty("isEmpty") boolean z, @JsonProperty("expiry_in_minutes") Integer num) {
            C7471uYa.b(cda, "urn");
            C7471uYa.b(list, "errorTrackers");
            super(null);
            this.a = cda;
            this.b = list;
            this.c = l;
            this.d = d2;
            this.e = z;
            this.f = num;
        }

        @JsonProperty("frequency_cap_duration")
        public Long a() {
            return this.c;
        }

        @JsonProperty("expiry_in_minutes")
        public final Integer b() {
            return this.f;
        }

        @JsonProperty("urn")
        public final C3508cda c() {
            return this.a;
        }

        @JsonProperty("error_trackers")
        public List<Y> d() {
            return this.b;
        }

        @JsonProperty("isEmpty")
        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a) && C7471uYa.a((Object) d(), (Object) bVar.d()) && C7471uYa.a((Object) a(), (Object) bVar.a()) && Double.compare(j(), bVar.j()) == 0) {
                        if (!(this.e == bVar.e) || !C7471uYa.a((Object) this.f, (Object) bVar.f)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda cda = this.a;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            List d2 = d();
            int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
            Long a2 = a();
            int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
            long doubleToLongBits = Double.doubleToLongBits(j());
            int i2 = (hashCode3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            Integer num = this.f;
            if (num != null) {
                i = num.hashCode();
            }
            return i3 + i;
        }

        @JsonProperty("score")
        public double j() {
            return this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Video(urn=");
            sb.append(this.a);
            sb.append(", errorTrackers=");
            sb.append(d());
            sb.append(", adTimerDuration=");
            sb.append(a());
            sb.append(", priority=");
            sb.append(j());
            sb.append(", isEmpty=");
            sb.append(this.e);
            sb.append(", expiryInMins=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    private C3691s() {
    }

    public /* synthetic */ C3691s(C7264rYa rya) {
        this();
    }
}
