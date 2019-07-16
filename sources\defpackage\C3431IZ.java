package defpackage;

import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3692t;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.playback.C4431ub;
import java.util.Date;
import java.util.List;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\tR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/soundcloud/android/events/AdPlaybackEvent;", "", "eventTime", "Ljava/util/Date;", "(Ljava/util/Date;)V", "getEventTime", "()Ljava/util/Date;", "isAdsRemoved", "", "()Z", "isForAdProgressEvent", "isForAppInstall", "isForStateTransition", "isForVideoAd", "isImageLoaded", "isOnScreen", "isTogglePlayback", "isToggleVolume", "AdPlayStateTransition", "AdProgressEvent", "AdRemovedEvent", "InlayAdEvent", "NoVideoOnScreen", "Lcom/soundcloud/android/events/AdPlaybackEvent$InlayAdEvent;", "Lcom/soundcloud/android/events/AdPlaybackEvent$NoVideoOnScreen;", "Lcom/soundcloud/android/events/AdPlaybackEvent$AdPlayStateTransition;", "Lcom/soundcloud/android/events/AdPlaybackEvent$AdProgressEvent;", "Lcom/soundcloud/android/events/AdPlaybackEvent$AdRemovedEvent;", "base_release"}, mv = {1, 1, 15})
/* renamed from: IZ reason: default package and case insensitive filesystem */
/* compiled from: AdPlaybackEvent.kt */
public abstract class C3431IZ {
    private final Date a;

    /* renamed from: IZ$a */
    /* compiled from: AdPlaybackEvent.kt */
    public static final class a extends C3431IZ {
        private final Date b;
        private final aa c;
        private final C4431ub d;
        private final boolean e;

        public a(Date date, aa aaVar, C4431ub ubVar, boolean z) {
            C7471uYa.b(date, "eventTime");
            C7471uYa.b(aaVar, "videoAd");
            C7471uYa.b(ubVar, "playState");
            super(date, null);
            this.b = date;
            this.c = aaVar;
            this.d = ubVar;
            this.e = z;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) i(), (Object) aVar.i()) && C7471uYa.a((Object) this.c, (Object) aVar.c) && C7471uYa.a((Object) this.d, (Object) aVar.d)) {
                        if (this.e == aVar.e) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Date i = i();
            int i2 = 0;
            int hashCode = (i != null ? i.hashCode() : 0) * 31;
            aa aaVar = this.c;
            int hashCode2 = (hashCode + (aaVar != null ? aaVar.hashCode() : 0)) * 31;
            C4431ub ubVar = this.d;
            if (ubVar != null) {
                i2 = ubVar.hashCode();
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            return i3 + (z ? 1 : 0);
        }

        public Date i() {
            return this.b;
        }

        public final C4431ub j() {
            return this.d;
        }

        public final aa k() {
            return this.c;
        }

        public final boolean l() {
            return this.e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AdPlayStateTransition(eventTime=");
            sb.append(i());
            sb.append(", videoAd=");
            sb.append(this.c);
            sb.append(", playState=");
            sb.append(this.d);
            sb.append(", isMuted=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: IZ$b */
    /* compiled from: AdPlaybackEvent.kt */
    public static final class b extends C3431IZ {
        private final Date b;
        private final long c;
        private final long d;

        public b(Date date, long j, long j2) {
            C7471uYa.b(date, "eventTime");
            super(date, null);
            this.b = date;
            this.c = j;
            this.d = j2;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) j(), (Object) bVar.j())) {
                        if (this.c == bVar.c) {
                            if (this.d == bVar.d) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Date j = j();
            int hashCode = (j != null ? j.hashCode() : 0) * 31;
            long j2 = this.c;
            int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.d;
            return i + ((int) (j3 ^ (j3 >>> 32)));
        }

        public final long i() {
            return this.d;
        }

        public Date j() {
            return this.b;
        }

        public final long k() {
            return this.c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AdProgressEvent(eventTime=");
            sb.append(j());
            sb.append(", positionMs=");
            sb.append(this.c);
            sb.append(", durationMs=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    @EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/events/AdPlaybackEvent$AdRemovedEvent;", "Lcom/soundcloud/android/events/AdPlaybackEvent;", "monetizableTrackUrns", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "reason", "Lcom/soundcloud/android/events/AdPlaybackEvent$AdRemovedEvent$Reason;", "(Ljava/util/List;Lcom/soundcloud/android/events/AdPlaybackEvent$AdRemovedEvent$Reason;)V", "getMonetizableTrackUrns", "()Ljava/util/List;", "getReason", "()Lcom/soundcloud/android/events/AdPlaybackEvent$AdRemovedEvent$Reason;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Reason", "base_release"}, mv = {1, 1, 15})
    /* renamed from: IZ$c */
    /* compiled from: AdPlaybackEvent.kt */
    public static final class c extends C3431IZ {
        private final List<C3508cda> b;
        private final a c;

        /* renamed from: IZ$c$a */
        /* compiled from: AdPlaybackEvent.kt */
        public enum a {
            OTHER("other"),
            CLEARED_BY_PLAYER("cleared_by_player"),
            INCOMPATIBLE_DEVICE_STATE("incompatible_device_state");
            
            private final String e;

            private a(String str) {
                this.e = str;
            }

            public String toString() {
                return this.e;
            }
        }

        public c(List<C3508cda> list, a aVar) {
            C7471uYa.b(list, "monetizableTrackUrns");
            C7471uYa.b(aVar, "reason");
            super(new Date(), null);
            this.b = list;
            this.c = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.b, (Object) cVar.b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<C3508cda> list = this.b;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            a aVar = this.c;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AdRemovedEvent(monetizableTrackUrns=");
            sb.append(this.b);
            sb.append(", reason=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ c(List list, a aVar, int i, C7264rYa rya) {
            if ((i & 2) != 0) {
                aVar = a.OTHER;
            }
            this(list, aVar);
        }
    }

    @EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/events/AdPlaybackEvent$InlayAdEvent;", "Lcom/soundcloud/android/events/AdPlaybackEvent;", "eventTime", "Ljava/util/Date;", "position", "", "ad", "Lcom/soundcloud/android/foundation/ads/AdData;", "(Ljava/util/Date;ILcom/soundcloud/android/foundation/ads/AdData;)V", "getAd", "()Lcom/soundcloud/android/foundation/ads/AdData;", "getEventTime", "()Ljava/util/Date;", "getPosition", "()I", "ImageLoadedInlayAdEvent", "OnScreenInlayAdEvent", "TogglePlaybackInlayAdEvent", "ToggleVolumeInlayAdEvent", "Lcom/soundcloud/android/events/AdPlaybackEvent$InlayAdEvent$OnScreenInlayAdEvent;", "Lcom/soundcloud/android/events/AdPlaybackEvent$InlayAdEvent$ImageLoadedInlayAdEvent;", "Lcom/soundcloud/android/events/AdPlaybackEvent$InlayAdEvent$ToggleVolumeInlayAdEvent;", "Lcom/soundcloud/android/events/AdPlaybackEvent$InlayAdEvent$TogglePlaybackInlayAdEvent;", "base_release"}, mv = {1, 1, 15})
    /* renamed from: IZ$d */
    /* compiled from: AdPlaybackEvent.kt */
    public static abstract class d extends C3431IZ {
        private final Date b;
        private final int c;
        private final C3676c d;

        /* renamed from: IZ$d$a */
        /* compiled from: AdPlaybackEvent.kt */
        public static final class a extends d {
            private final Date e;
            private final int f;
            private final C3676c g;

            public a(Date date, int i, C3676c cVar) {
                C7471uYa.b(date, "eventTime");
                C7471uYa.b(cVar, "ad");
                super(date, i, cVar, null);
                this.e = date;
                this.f = i;
                this.g = cVar;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (C7471uYa.a((Object) j(), (Object) aVar.j())) {
                            if (!(k() == aVar.k()) || !C7471uYa.a((Object) i(), (Object) aVar.i())) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Date j = j();
                int i = 0;
                int hashCode = (((j != null ? j.hashCode() : 0) * 31) + k()) * 31;
                C3676c i2 = i();
                if (i2 != null) {
                    i = i2.hashCode();
                }
                return hashCode + i;
            }

            public C3676c i() {
                return this.g;
            }

            public Date j() {
                return this.e;
            }

            public int k() {
                return this.f;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ImageLoadedInlayAdEvent(eventTime=");
                sb.append(j());
                sb.append(", position=");
                sb.append(k());
                sb.append(", ad=");
                sb.append(i());
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: IZ$d$b */
        /* compiled from: AdPlaybackEvent.kt */
        public static final class b extends d {
            private final Date e;
            private final int f;
            private final C3676c g;

            public b(Date date, int i, C3676c cVar) {
                C7471uYa.b(date, "eventTime");
                C7471uYa.b(cVar, "ad");
                super(date, i, cVar, null);
                this.e = date;
                this.f = i;
                this.g = cVar;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (C7471uYa.a((Object) j(), (Object) bVar.j())) {
                            if (!(k() == bVar.k()) || !C7471uYa.a((Object) i(), (Object) bVar.i())) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Date j = j();
                int i = 0;
                int hashCode = (((j != null ? j.hashCode() : 0) * 31) + k()) * 31;
                C3676c i2 = i();
                if (i2 != null) {
                    i = i2.hashCode();
                }
                return hashCode + i;
            }

            public C3676c i() {
                return this.g;
            }

            public Date j() {
                return this.e;
            }

            public int k() {
                return this.f;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("OnScreenInlayAdEvent(eventTime=");
                sb.append(j());
                sb.append(", position=");
                sb.append(k());
                sb.append(", ad=");
                sb.append(i());
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: IZ$d$c */
        /* compiled from: AdPlaybackEvent.kt */
        public static final class c extends d {
            private final Date e;
            private final int f;
            private final C3676c g;

            public c(Date date, int i, C3676c cVar) {
                C7471uYa.b(date, "eventTime");
                C7471uYa.b(cVar, "ad");
                super(date, i, cVar, null);
                this.e = date;
                this.f = i;
                this.g = cVar;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if (C7471uYa.a((Object) j(), (Object) cVar.j())) {
                            if (!(k() == cVar.k()) || !C7471uYa.a((Object) i(), (Object) cVar.i())) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Date j = j();
                int i = 0;
                int hashCode = (((j != null ? j.hashCode() : 0) * 31) + k()) * 31;
                C3676c i2 = i();
                if (i2 != null) {
                    i = i2.hashCode();
                }
                return hashCode + i;
            }

            public C3676c i() {
                return this.g;
            }

            public Date j() {
                return this.e;
            }

            public int k() {
                return this.f;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("TogglePlaybackInlayAdEvent(eventTime=");
                sb.append(j());
                sb.append(", position=");
                sb.append(k());
                sb.append(", ad=");
                sb.append(i());
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: IZ$d$d reason: collision with other inner class name */
        /* compiled from: AdPlaybackEvent.kt */
        public static final class C0071d extends d {
            private final Date e;
            private final int f;
            private final C3676c g;

            public C0071d(Date date, int i, C3676c cVar) {
                C7471uYa.b(date, "eventTime");
                C7471uYa.b(cVar, "ad");
                super(date, i, cVar, null);
                this.e = date;
                this.f = i;
                this.g = cVar;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0071d) {
                        C0071d dVar = (C0071d) obj;
                        if (C7471uYa.a((Object) j(), (Object) dVar.j())) {
                            if (!(k() == dVar.k()) || !C7471uYa.a((Object) i(), (Object) dVar.i())) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Date j = j();
                int i = 0;
                int hashCode = (((j != null ? j.hashCode() : 0) * 31) + k()) * 31;
                C3676c i2 = i();
                if (i2 != null) {
                    i = i2.hashCode();
                }
                return hashCode + i;
            }

            public C3676c i() {
                return this.g;
            }

            public Date j() {
                return this.e;
            }

            public int k() {
                return this.f;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ToggleVolumeInlayAdEvent(eventTime=");
                sb.append(j());
                sb.append(", position=");
                sb.append(k());
                sb.append(", ad=");
                sb.append(i());
                sb.append(")");
                return sb.toString();
            }
        }

        public /* synthetic */ d(Date date, int i, C3676c cVar, C7264rYa rya) {
            this(date, i, cVar);
        }

        public C3676c i() {
            return this.d;
        }

        public Date j() {
            return this.b;
        }

        public int k() {
            return this.c;
        }

        private d(Date date, int i, C3676c cVar) {
            super(date, null);
            this.b = date;
            this.c = i;
            this.d = cVar;
        }
    }

    /* renamed from: IZ$e */
    /* compiled from: AdPlaybackEvent.kt */
    public static final class e extends C3431IZ {
        private final Date b;
        private final boolean c;

        public e(Date date, boolean z) {
            C7471uYa.b(date, "eventTime");
            super(date, null);
            this.b = date;
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    if (C7471uYa.a((Object) i(), (Object) eVar.i())) {
                        if (this.c == eVar.c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Date i = i();
            int hashCode = (i != null ? i.hashCode() : 0) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public Date i() {
            return this.b;
        }

        public final boolean j() {
            return this.c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NoVideoOnScreen(eventTime=");
            sb.append(i());
            sb.append(", shouldMute=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    private C3431IZ(Date date) {
        this.a = date;
    }

    public final boolean a() {
        return this instanceof b;
    }

    public final boolean b() {
        return (this instanceof d) && (((d) this).i() instanceof C3692t);
    }

    public final boolean c() {
        return this instanceof a;
    }

    public final boolean d() {
        return ((this instanceof d) && (((d) this).i() instanceof aa)) || (this instanceof e);
    }

    public final boolean e() {
        return this instanceof a;
    }

    public final boolean f() {
        return this instanceof b;
    }

    public final boolean g() {
        return this instanceof c;
    }

    public final boolean h() {
        return this instanceof C0071d;
    }

    public /* synthetic */ C3431IZ(Date date, C7264rYa rya) {
        this(date);
    }
}
