package com.soundcloud.android.foundation.ads;

import java.util.List;

@EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001a\u001bB9\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/foundation/ads/ErrorAd;", "Lcom/soundcloud/android/foundation/ads/AdData;", "Lcom/soundcloud/android/foundation/ads/AdTimerDuration;", "errorTrackers", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "adTimerDuration", "", "priority", "", "isEmpty", "", "expiryInMins", "", "(Ljava/util/List;Ljava/lang/Long;DZLjava/lang/Integer;)V", "getAdTimerDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getErrorTrackers", "()Ljava/util/List;", "getExpiryInMins", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getPriority", "()D", "Audio", "Video", "Lcom/soundcloud/android/foundation/ads/ErrorAd$Video;", "Lcom/soundcloud/android/foundation/ads/ErrorAd$Audio;", "ads_release"}, mv = {1, 1, 15})
/* compiled from: ErrorAd.kt */
public abstract class G extends C3676c implements C3677d {
    private final List<Y> d;
    private final Long e;
    private final double f;
    private final boolean g;
    private final Integer h;

    /* compiled from: ErrorAd.kt */
    public static final class a extends G implements T {
        private final List<Y> i;
        private final Long j;
        private final double k;
        private final C3508cda l;
        private final com.soundcloud.android.foundation.ads.C3676c.a m;
        private final C3508cda n;
        private final boolean o;
        private final Integer p;

        public a(List<Y> list, Long l2, double d, C3508cda cda, com.soundcloud.android.foundation.ads.C3676c.a aVar, C3508cda cda2, boolean z, Integer num) {
            List<Y> list2 = list;
            C3508cda cda3 = cda;
            com.soundcloud.android.foundation.ads.C3676c.a aVar2 = aVar;
            C3508cda cda4 = cda2;
            C7471uYa.b(list, "errorTrackers");
            C7471uYa.b(cda3, "adUrn");
            C7471uYa.b(aVar2, "monetizationType");
            C7471uYa.b(cda4, "monetizableTrackUrn");
            super(list, l2, d, z, num, null);
            this.i = list2;
            this.j = l2;
            this.k = d;
            this.l = cda3;
            this.m = aVar2;
            this.n = cda4;
            this.o = z;
            this.p = num;
        }

        public Long a() {
            return this.j;
        }

        public List<Y> d() {
            return this.i;
        }

        public Integer e() {
            return this.p;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) d(), (Object) aVar.d()) && C7471uYa.a((Object) a(), (Object) aVar.a()) && Double.compare(j(), aVar.j()) == 0 && C7471uYa.a((Object) f(), (Object) aVar.f()) && C7471uYa.a((Object) k(), (Object) aVar.k()) && C7471uYa.a((Object) i(), (Object) aVar.i())) {
                        if (!(m() == aVar.m()) || !C7471uYa.a((Object) e(), (Object) aVar.e())) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public C3508cda f() {
            return this.l;
        }

        public int hashCode() {
            List d = d();
            int i2 = 0;
            int hashCode = (d != null ? d.hashCode() : 0) * 31;
            Long a = a();
            int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
            long doubleToLongBits = Double.doubleToLongBits(j());
            int i3 = (hashCode2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            C3508cda f = f();
            int hashCode3 = (i3 + (f != null ? f.hashCode() : 0)) * 31;
            com.soundcloud.android.foundation.ads.C3676c.a k2 = k();
            int hashCode4 = (hashCode3 + (k2 != null ? k2.hashCode() : 0)) * 31;
            C3508cda i4 = i();
            int hashCode5 = (hashCode4 + (i4 != null ? i4.hashCode() : 0)) * 31;
            boolean m2 = m();
            if (m2) {
                m2 = true;
            }
            int i5 = (hashCode5 + (m2 ? 1 : 0)) * 31;
            Integer e = e();
            if (e != null) {
                i2 = e.hashCode();
            }
            return i5 + i2;
        }

        public C3508cda i() {
            return this.n;
        }

        public double j() {
            return this.k;
        }

        public com.soundcloud.android.foundation.ads.C3676c.a k() {
            return this.m;
        }

        public boolean m() {
            return this.o;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Audio(errorTrackers=");
            sb.append(d());
            sb.append(", adTimerDuration=");
            sb.append(a());
            sb.append(", priority=");
            sb.append(j());
            sb.append(", adUrn=");
            sb.append(f());
            sb.append(", monetizationType=");
            sb.append(k());
            sb.append(", monetizableTrackUrn=");
            sb.append(i());
            sb.append(", isEmpty=");
            sb.append(m());
            sb.append(", expiryInMins=");
            sb.append(e());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: ErrorAd.kt */
    public static final class b extends G implements T {
        private final List<Y> i;
        private final Long j;
        private final double k;
        private final C3508cda l;
        private final com.soundcloud.android.foundation.ads.C3676c.a m;
        private final C3508cda n;
        private final boolean o;
        private final Integer p;

        public b(List<Y> list, Long l2, double d, C3508cda cda, com.soundcloud.android.foundation.ads.C3676c.a aVar, C3508cda cda2, boolean z, Integer num) {
            List<Y> list2 = list;
            C3508cda cda3 = cda;
            com.soundcloud.android.foundation.ads.C3676c.a aVar2 = aVar;
            C3508cda cda4 = cda2;
            C7471uYa.b(list, "errorTrackers");
            C7471uYa.b(cda3, "adUrn");
            C7471uYa.b(aVar2, "monetizationType");
            C7471uYa.b(cda4, "monetizableTrackUrn");
            super(list, l2, d, z, num, null);
            this.i = list2;
            this.j = l2;
            this.k = d;
            this.l = cda3;
            this.m = aVar2;
            this.n = cda4;
            this.o = z;
            this.p = num;
        }

        public Long a() {
            return this.j;
        }

        public List<Y> d() {
            return this.i;
        }

        public Integer e() {
            return this.p;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) d(), (Object) bVar.d()) && C7471uYa.a((Object) a(), (Object) bVar.a()) && Double.compare(j(), bVar.j()) == 0 && C7471uYa.a((Object) f(), (Object) bVar.f()) && C7471uYa.a((Object) k(), (Object) bVar.k()) && C7471uYa.a((Object) i(), (Object) bVar.i())) {
                        if (!(m() == bVar.m()) || !C7471uYa.a((Object) e(), (Object) bVar.e())) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public C3508cda f() {
            return this.l;
        }

        public int hashCode() {
            List d = d();
            int i2 = 0;
            int hashCode = (d != null ? d.hashCode() : 0) * 31;
            Long a = a();
            int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
            long doubleToLongBits = Double.doubleToLongBits(j());
            int i3 = (hashCode2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            C3508cda f = f();
            int hashCode3 = (i3 + (f != null ? f.hashCode() : 0)) * 31;
            com.soundcloud.android.foundation.ads.C3676c.a k2 = k();
            int hashCode4 = (hashCode3 + (k2 != null ? k2.hashCode() : 0)) * 31;
            C3508cda i4 = i();
            int hashCode5 = (hashCode4 + (i4 != null ? i4.hashCode() : 0)) * 31;
            boolean m2 = m();
            if (m2) {
                m2 = true;
            }
            int i5 = (hashCode5 + (m2 ? 1 : 0)) * 31;
            Integer e = e();
            if (e != null) {
                i2 = e.hashCode();
            }
            return i5 + i2;
        }

        public C3508cda i() {
            return this.n;
        }

        public double j() {
            return this.k;
        }

        public com.soundcloud.android.foundation.ads.C3676c.a k() {
            return this.m;
        }

        public boolean m() {
            return this.o;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Video(errorTrackers=");
            sb.append(d());
            sb.append(", adTimerDuration=");
            sb.append(a());
            sb.append(", priority=");
            sb.append(j());
            sb.append(", adUrn=");
            sb.append(f());
            sb.append(", monetizationType=");
            sb.append(k());
            sb.append(", monetizableTrackUrn=");
            sb.append(i());
            sb.append(", isEmpty=");
            sb.append(m());
            sb.append(", expiryInMins=");
            sb.append(e());
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ G(List list, Long l, double d2, boolean z, Integer num, C7264rYa rya) {
        this(list, l, d2, z, num);
    }

    public Long a() {
        return this.e;
    }

    public List<Y> d() {
        return this.d;
    }

    public boolean m() {
        return this.g;
    }

    private G(List<Y> list, Long l, double d2, boolean z, Integer num) {
        this.d = list;
        this.e = l;
        this.f = d2;
        this.g = z;
        this.h = num;
    }
}
