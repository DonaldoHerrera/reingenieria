package defpackage;

import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import java.util.Collection;
import java.util.List;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 &2\u00020\u0001:\u0005%&'()BS\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020 H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \"*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000\u0001\u0003*+,¨\u0006-"}, d2 = {"Lcom/soundcloud/android/events/AdPlaybackSessionEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "monetizableTrackUrn", "monetizationType", "Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "trackingUrls", "", "", "pageName", "shouldReportStartWithPlay", "", "eventName", "clickName", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getClickName", "()Ljava/lang/String;", "getEventName", "isPlayStart", "()Z", "isQuartileOrProgressEvent", "getMonetizableTrackUrn", "getMonetizationType", "()Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "getPageName", "getShouldReportStartWithPlay", "getTrackingUrls", "()Ljava/util/List;", "ts", "", "uuid", "kotlin.jvm.PlatformType", "id", "timestamp", "Checkpoint", "Companion", "ImpressionName", "Play", "Quartile", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Quartile;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Checkpoint;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Play;", "base_release"}, mv = {1, 1, 15})
/* renamed from: JZ reason: default package and case insensitive filesystem */
/* compiled from: AdPlaybackSessionEvent.kt */
public abstract class C3434JZ extends J {
    public static final b a = new b(null);
    private final long b;
    private final String c;
    private final C3508cda d;
    private final C3508cda e;
    private final com.soundcloud.android.foundation.ads.C3676c.a f;
    private final List<String> g;
    private final String h;
    private final boolean i;
    private final String j;
    private final String k;

    /* renamed from: JZ$a */
    /* compiled from: AdPlaybackSessionEvent.kt */
    public static final class a extends C3434JZ {
        private final U l;
        private final I m;
        private final List<String> n;

        public a(U u, I i, List<String> list) {
            C7471uYa.b(u, "adData");
            C7471uYa.b(i, "trackSourceInfo");
            C7471uYa.b(list, "trackingUrls");
            super(u.f(), u.i(), u.k(), list, i.b(), !u.a(com.soundcloud.android.foundation.ads.U.a.START), "click", "ad::checkpoint", null);
            this.l = u;
            this.m = i;
            this.n = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) p(), (java.lang.Object) r3.p()) != false) goto L_0x002d;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.l, (Object) aVar.l)) {
                        if (C7471uYa.a((Object) this.m, (Object) aVar.m)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            U u = this.l;
            int i = 0;
            int hashCode = (u != null ? u.hashCode() : 0) * 31;
            I i2 = this.m;
            int hashCode2 = (hashCode + (i2 != null ? i2.hashCode() : 0)) * 31;
            List p = p();
            if (p != null) {
                i = p.hashCode();
            }
            return hashCode2 + i;
        }

        public List<String> p() {
            return this.n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Checkpoint(adData=");
            sb.append(this.l);
            sb.append(", trackSourceInfo=");
            sb.append(this.m);
            sb.append(", trackingUrls=");
            sb.append(p());
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: JZ$b */
    /* compiled from: AdPlaybackSessionEvent.kt */
    public static final class b {
        private b() {
        }

        @NXa
        public final List<String> a(U u, Yaa yaa) {
            List list;
            C7471uYa.b(u, "$this$parseStartUrls");
            C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
            if (u.k() != com.soundcloud.android.foundation.ads.C3676c.a.SPONSORED_SESSION) {
                list = C7676xWa.c((Collection) u.q(), (Iterable) u.x());
            } else {
                list = u.x();
            }
            return Yaa.a(yaa, list, (C0090b) null, 2, (Object) null);
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: JZ$c */
    /* compiled from: AdPlaybackSessionEvent.kt */
    public enum c {
        VIDEO_AD("video_ad_impression"),
        AUDIO_AD("audio_ad_impression");
        
        private final String d;

        private c(String str) {
            this.d = str;
        }

        public final String a() {
            return this.d;
        }
    }

    @EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B=\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Play;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent;", "adData", "Lcom/soundcloud/android/foundation/ads/PlayableAdData;", "originScreen", "", "trackingUrls", "", "eventName", "clickName", "(Lcom/soundcloud/android/foundation/ads/PlayableAdData;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAdData", "()Lcom/soundcloud/android/foundation/ads/PlayableAdData;", "Finish", "Pause", "Resume", "Start", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Play$Start;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Play$Pause;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Play$Resume;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Play$Finish;", "base_release"}, mv = {1, 1, 15})
    /* renamed from: JZ$d */
    /* compiled from: AdPlaybackSessionEvent.kt */
    public static abstract class d extends C3434JZ {
        private final U l;

        /* renamed from: JZ$d$a */
        /* compiled from: AdPlaybackSessionEvent.kt */
        public static final class a extends d {
            private final U m;
            private final C3443MZ n;
            private final List<String> o;

            public a(U u, C3443MZ mz, List<String> list) {
                C7471uYa.b(u, "adData");
                C7471uYa.b(mz, "eventArgs");
                C7471uYa.b(list, "trackingUrls");
                super(u, mz.e().b(), list, "click", "ad::finish", null);
                this.m = u;
                this.n = mz;
                this.o = list;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) p(), (java.lang.Object) r3.p()) != false) goto L_0x0031;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (C7471uYa.a((Object) s(), (Object) aVar.s())) {
                            if (C7471uYa.a((Object) this.n, (Object) aVar.n)) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                U s = s();
                int i = 0;
                int hashCode = (s != null ? s.hashCode() : 0) * 31;
                C3443MZ mz = this.n;
                int hashCode2 = (hashCode + (mz != null ? mz.hashCode() : 0)) * 31;
                List p = p();
                if (p != null) {
                    i = p.hashCode();
                }
                return hashCode2 + i;
            }

            public List<String> p() {
                return this.o;
            }

            public U s() {
                return this.m;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Finish(adData=");
                sb.append(s());
                sb.append(", eventArgs=");
                sb.append(this.n);
                sb.append(", trackingUrls=");
                sb.append(p());
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: JZ$d$b */
        /* compiled from: AdPlaybackSessionEvent.kt */
        public static final class b extends d {
            private final U m;
            private final C3443MZ n;
            private final List<String> o;

            public b(U u, C3443MZ mz, List<String> list) {
                C7471uYa.b(u, "adData");
                C7471uYa.b(mz, "eventArgs");
                C7471uYa.b(list, "trackingUrls");
                super(u, mz.e().b(), list, null, null, 24, null);
                this.m = u;
                this.n = mz;
                this.o = list;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) p(), (java.lang.Object) r3.p()) != false) goto L_0x0031;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (C7471uYa.a((Object) s(), (Object) bVar.s())) {
                            if (C7471uYa.a((Object) this.n, (Object) bVar.n)) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                U s = s();
                int i = 0;
                int hashCode = (s != null ? s.hashCode() : 0) * 31;
                C3443MZ mz = this.n;
                int hashCode2 = (hashCode + (mz != null ? mz.hashCode() : 0)) * 31;
                List p = p();
                if (p != null) {
                    i = p.hashCode();
                }
                return hashCode2 + i;
            }

            public List<String> p() {
                return this.o;
            }

            public U s() {
                return this.m;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Pause(adData=");
                sb.append(s());
                sb.append(", eventArgs=");
                sb.append(this.n);
                sb.append(", trackingUrls=");
                sb.append(p());
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: JZ$d$c */
        /* compiled from: AdPlaybackSessionEvent.kt */
        public static final class c extends d {
            private final U m;
            private final C3443MZ n;
            private final List<String> o;

            public c(U u, C3443MZ mz, List<String> list) {
                C7471uYa.b(u, "adData");
                C7471uYa.b(mz, "eventArgs");
                C7471uYa.b(list, "trackingUrls");
                super(u, mz.e().b(), list, null, null, 24, null);
                this.m = u;
                this.n = mz;
                this.o = list;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) p(), (java.lang.Object) r3.p()) != false) goto L_0x0031;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if (C7471uYa.a((Object) s(), (Object) cVar.s())) {
                            if (C7471uYa.a((Object) this.n, (Object) cVar.n)) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                U s = s();
                int i = 0;
                int hashCode = (s != null ? s.hashCode() : 0) * 31;
                C3443MZ mz = this.n;
                int hashCode2 = (hashCode + (mz != null ? mz.hashCode() : 0)) * 31;
                List p = p();
                if (p != null) {
                    i = p.hashCode();
                }
                return hashCode2 + i;
            }

            public List<String> p() {
                return this.o;
            }

            public U s() {
                return this.m;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Resume(adData=");
                sb.append(s());
                sb.append(", eventArgs=");
                sb.append(this.n);
                sb.append(", trackingUrls=");
                sb.append(p());
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: JZ$d$d reason: collision with other inner class name */
        /* compiled from: AdPlaybackSessionEvent.kt */
        public static final class C0073d extends d {
            private final U m;
            private final C3443MZ n;
            private final List<String> o;

            public C0073d(U u, C3443MZ mz, List<String> list) {
                C7471uYa.b(u, "adData");
                C7471uYa.b(mz, "eventArgs");
                C7471uYa.b(list, "trackingUrls");
                super(u, mz.e().b(), list, "impression", null, 16, null);
                this.m = u;
                this.n = mz;
                this.o = list;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) p(), (java.lang.Object) r3.p()) != false) goto L_0x0031;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0073d) {
                        C0073d dVar = (C0073d) obj;
                        if (C7471uYa.a((Object) s(), (Object) dVar.s())) {
                            if (C7471uYa.a((Object) this.n, (Object) dVar.n)) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                U s = s();
                int i = 0;
                int hashCode = (s != null ? s.hashCode() : 0) * 31;
                C3443MZ mz = this.n;
                int hashCode2 = (hashCode + (mz != null ? mz.hashCode() : 0)) * 31;
                List p = p();
                if (p != null) {
                    i = p.hashCode();
                }
                return hashCode2 + i;
            }

            public List<String> p() {
                return this.o;
            }

            public U s() {
                return this.m;
            }

            public final c t() {
                return s() instanceof aa ? c.VIDEO_AD : c.AUDIO_AD;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Start(adData=");
                sb.append(s());
                sb.append(", eventArgs=");
                sb.append(this.n);
                sb.append(", trackingUrls=");
                sb.append(p());
                sb.append(")");
                return sb.toString();
            }
        }

        public /* synthetic */ d(U u, String str, List list, String str2, String str3, C7264rYa rya) {
            this(u, str, list, str2, str3);
        }

        /* synthetic */ d(U u, String str, List list, String str2, String str3, int i, C7264rYa rya) {
            this(u, str, list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
        }

        private d(U u, String str, List<String> list, String str2, String str3) {
            super(u.f(), u.i(), u.k(), list, str, !u.a(com.soundcloud.android.foundation.ads.U.a.START), str2, str3, null);
            this.l = u;
        }
    }

    @EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Quartile;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent;", "adData", "Lcom/soundcloud/android/foundation/ads/PlayableAdData;", "trackSourceInfo", "Lcom/soundcloud/android/foundation/events/TrackSourceInfo;", "trackingUrls", "", "", "clickName", "(Lcom/soundcloud/android/foundation/ads/PlayableAdData;Lcom/soundcloud/android/foundation/events/TrackSourceInfo;Ljava/util/List;Ljava/lang/String;)V", "getAdData", "()Lcom/soundcloud/android/foundation/ads/PlayableAdData;", "getTrackSourceInfo", "()Lcom/soundcloud/android/foundation/events/TrackSourceInfo;", "First", "Second", "Third", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Quartile$First;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Quartile$Second;", "Lcom/soundcloud/android/events/AdPlaybackSessionEvent$Quartile$Third;", "base_release"}, mv = {1, 1, 15})
    /* renamed from: JZ$e */
    /* compiled from: AdPlaybackSessionEvent.kt */
    public static abstract class e extends C3434JZ {
        private final U l;
        private final I m;

        /* renamed from: JZ$e$a */
        /* compiled from: AdPlaybackSessionEvent.kt */
        public static final class a extends e {
            private final U n;
            private final I o;
            private final List<String> p;

            public a(U u, I i, List<String> list) {
                C7471uYa.b(u, "adData");
                C7471uYa.b(i, "trackSourceInfo");
                C7471uYa.b(list, "trackingUrls");
                super(u, i, list, "ad::first_quartile", null);
                this.n = u;
                this.o = i;
                this.p = list;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) p(), (java.lang.Object) r3.p()) != false) goto L_0x0035;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (C7471uYa.a((Object) s(), (Object) aVar.s())) {
                            if (C7471uYa.a((Object) t(), (Object) aVar.t())) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                U s = s();
                int i = 0;
                int hashCode = (s != null ? s.hashCode() : 0) * 31;
                I t = t();
                int hashCode2 = (hashCode + (t != null ? t.hashCode() : 0)) * 31;
                List p2 = p();
                if (p2 != null) {
                    i = p2.hashCode();
                }
                return hashCode2 + i;
            }

            public List<String> p() {
                return this.p;
            }

            public U s() {
                return this.n;
            }

            public I t() {
                return this.o;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("First(adData=");
                sb.append(s());
                sb.append(", trackSourceInfo=");
                sb.append(t());
                sb.append(", trackingUrls=");
                sb.append(p());
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: JZ$e$b */
        /* compiled from: AdPlaybackSessionEvent.kt */
        public static final class b extends e {
            private final U n;
            private final I o;
            private final List<String> p;

            public b(U u, I i, List<String> list) {
                C7471uYa.b(u, "adData");
                C7471uYa.b(i, "trackSourceInfo");
                C7471uYa.b(list, "trackingUrls");
                super(u, i, list, "ad::second_quartile", null);
                this.n = u;
                this.o = i;
                this.p = list;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) p(), (java.lang.Object) r3.p()) != false) goto L_0x0035;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (C7471uYa.a((Object) s(), (Object) bVar.s())) {
                            if (C7471uYa.a((Object) t(), (Object) bVar.t())) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                U s = s();
                int i = 0;
                int hashCode = (s != null ? s.hashCode() : 0) * 31;
                I t = t();
                int hashCode2 = (hashCode + (t != null ? t.hashCode() : 0)) * 31;
                List p2 = p();
                if (p2 != null) {
                    i = p2.hashCode();
                }
                return hashCode2 + i;
            }

            public List<String> p() {
                return this.p;
            }

            public U s() {
                return this.n;
            }

            public I t() {
                return this.o;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Second(adData=");
                sb.append(s());
                sb.append(", trackSourceInfo=");
                sb.append(t());
                sb.append(", trackingUrls=");
                sb.append(p());
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: JZ$e$c */
        /* compiled from: AdPlaybackSessionEvent.kt */
        public static final class c extends e {
            private final U n;
            private final I o;
            private final List<String> p;

            public c(U u, I i, List<String> list) {
                C7471uYa.b(u, "adData");
                C7471uYa.b(i, "trackSourceInfo");
                C7471uYa.b(list, "trackingUrls");
                super(u, i, list, "ad::third_quartile", null);
                this.n = u;
                this.o = i;
                this.p = list;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) p(), (java.lang.Object) r3.p()) != false) goto L_0x0035;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if (C7471uYa.a((Object) s(), (Object) cVar.s())) {
                            if (C7471uYa.a((Object) t(), (Object) cVar.t())) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                U s = s();
                int i = 0;
                int hashCode = (s != null ? s.hashCode() : 0) * 31;
                I t = t();
                int hashCode2 = (hashCode + (t != null ? t.hashCode() : 0)) * 31;
                List p2 = p();
                if (p2 != null) {
                    i = p2.hashCode();
                }
                return hashCode2 + i;
            }

            public List<String> p() {
                return this.p;
            }

            public U s() {
                return this.n;
            }

            public I t() {
                return this.o;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Third(adData=");
                sb.append(s());
                sb.append(", trackSourceInfo=");
                sb.append(t());
                sb.append(", trackingUrls=");
                sb.append(p());
                sb.append(")");
                return sb.toString();
            }
        }

        public /* synthetic */ e(U u, I i, List list, String str, C7264rYa rya) {
            this(u, i, list, str);
        }

        private e(U u, I i, List<String> list, String str) {
            super(u.f(), u.i(), u.k(), list, i.b(), !u.a(com.soundcloud.android.foundation.ads.U.a.START), "click", str, null);
            this.l = u;
            this.m = i;
        }
    }

    public /* synthetic */ C3434JZ(C3508cda cda, C3508cda cda2, com.soundcloud.android.foundation.ads.C3676c.a aVar, List list, String str, boolean z, String str2, String str3, C7264rYa rya) {
        this(cda, cda2, aVar, list, str, z, str2, str3);
    }

    @NXa
    public static final List<String> a(U u, Yaa yaa) {
        return a.a(u, yaa);
    }

    public long g() {
        return this.b;
    }

    public final C3508cda j() {
        return this.d;
    }

    public final String k() {
        return this.k;
    }

    public final String l() {
        return this.j;
    }

    public final C3508cda m() {
        return this.e;
    }

    public final com.soundcloud.android.foundation.ads.C3676c.a n() {
        return this.f;
    }

    public final String o() {
        return this.h;
    }

    public List<String> p() {
        return this.g;
    }

    public final boolean q() {
        return this instanceof C0073d;
    }

    public final boolean r() {
        return (this instanceof e) || (this instanceof a) || (this instanceof C0073d) || (this instanceof a);
    }

    private C3434JZ(C3508cda cda, C3508cda cda2, com.soundcloud.android.foundation.ads.C3676c.a aVar, List<String> list, String str, boolean z, String str2, String str3) {
        this.d = cda;
        this.e = cda2;
        this.f = aVar;
        this.g = list;
        this.h = str;
        this.i = z;
        this.j = str2;
        this.k = str3;
        this.b = J.c();
        this.c = J.b();
    }
}
