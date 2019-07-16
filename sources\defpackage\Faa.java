package defpackage;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import java.util.List;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00192\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;)V", "isMarketablePlay", "", "()Z", "isNotPlayStart", "isPlay", "isPromotedPlay", "isStop", "monetizationModel", "", "getMonetizationModel", "()Ljava/lang/String;", "getPlaybackSessionEventArgs", "()Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "ts", "", "uuid", "kotlin.jvm.PlatformType", "id", "timestamp", "Checkpoint", "Companion", "Play", "Stop", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Stop;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Checkpoint;", "base_release"}, mv = {1, 1, 15})
/* renamed from: Faa reason: default package */
/* compiled from: PlaybackSessionEvent.kt */
public abstract class Faa extends J {
    public static final b a = new b(null);
    private final long b;
    private final String c;
    private final Gaa d;

    @EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent$Checkpoint;", "Lcom/soundcloud/android/events/PlaybackSessionEvent;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;)V", "getPlaybackSessionEventArgs", "()Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "component1", "copy", "equals", "", "other", "", "getKind", "", "hashCode", "", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
    /* renamed from: Faa$a */
    /* compiled from: PlaybackSessionEvent.kt */
    public static final class a extends Faa {
        public static final C0066a e = new C0066a(null);
        private final Gaa f;

        /* renamed from: Faa$a$a reason: collision with other inner class name */
        /* compiled from: PlaybackSessionEvent.kt */
        public static final class C0066a {
            private C0066a() {
            }

            public /* synthetic */ C0066a(C7264rYa rya) {
                this();
            }
        }

        public a(Gaa gaa) {
            C7471uYa.b(gaa, "playbackSessionEventArgs");
            super(gaa, null);
            this.f = gaa;
        }

        public String d() {
            return "checkpoint";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) k(), (java.lang.Object) ((defpackage.Faa.a) r2).k()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Gaa k = k();
            if (k != null) {
                return k.hashCode();
            }
            return 0;
        }

        public Gaa k() {
            return this.f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Checkpoint(playbackSessionEventArgs=");
            sb.append(k());
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: Faa$b */
    /* compiled from: PlaybackSessionEvent.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    @EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent$Play;", "Lcom/soundcloud/android/events/PlaybackSessionEvent;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;)V", "Promoted", "Resume", "Start", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Start;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Resume;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Promoted;", "base_release"}, mv = {1, 1, 15})
    /* renamed from: Faa$c */
    /* compiled from: PlaybackSessionEvent.kt */
    public static abstract class c extends Faa {

        @EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Promoted;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "adUrn", "", "monetizationType", "promoterUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "shouldReportAdStart", "", "promotedPlayUrls", "", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;Ljava/lang/String;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;ZLjava/util/List;)V", "getAdUrn", "()Ljava/lang/String;", "getMonetizationType", "getPromotedPlayUrls", "()Ljava/util/List;", "getPromoterUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getShouldReportAdStart", "()Z", "Resume", "Start", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Promoted$Start;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Promoted$Resume;", "base_release"}, mv = {1, 1, 15})
        /* renamed from: Faa$c$a */
        /* compiled from: PlaybackSessionEvent.kt */
        public static abstract class a extends c {
            private final String e;
            private final String f;
            private final C3508cda g;
            private final boolean h;
            private final List<String> i;

            @EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Promoted$Resume;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Promoted;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "promotedSourceInfo", "Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;)V", "getPlaybackSessionEventArgs", "()Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "getPromotedSourceInfo", "()Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;", "component1", "component2", "copy", "equals", "", "other", "", "getKind", "", "hashCode", "", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
            /* renamed from: Faa$c$a$a reason: collision with other inner class name */
            /* compiled from: PlaybackSessionEvent.kt */
            public static final class C0067a extends a {
                public static final C0068a j = new C0068a(null);
                private final Gaa k;
                private final PromotedSourceInfo l;

                /* renamed from: Faa$c$a$a$a reason: collision with other inner class name */
                /* compiled from: PlaybackSessionEvent.kt */
                public static final class C0068a {
                    private C0068a() {
                    }

                    public /* synthetic */ C0068a(C7264rYa rya) {
                        this();
                    }
                }

                public C0067a(Gaa gaa, PromotedSourceInfo promotedSourceInfo) {
                    C7471uYa.b(gaa, "playbackSessionEventArgs");
                    C7471uYa.b(promotedSourceInfo, "promotedSourceInfo");
                    Gaa gaa2 = gaa;
                    super(gaa2, promotedSourceInfo.a(), "promoted", promotedSourceInfo.c(), !promotedSourceInfo.e(), promotedSourceInfo.d(), null);
                    this.k = gaa;
                    this.l = promotedSourceInfo;
                }

                public String d() {
                    return "play";
                }

                /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
                    if (defpackage.C7471uYa.a((java.lang.Object) r2.l, (java.lang.Object) r3.l) != false) goto L_0x0023;
                 */
                public boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof C0067a) {
                            C0067a aVar = (C0067a) obj;
                            if (C7471uYa.a((Object) k(), (Object) aVar.k())) {
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    Gaa k2 = k();
                    int i = 0;
                    int hashCode = (k2 != null ? k2.hashCode() : 0) * 31;
                    PromotedSourceInfo promotedSourceInfo = this.l;
                    if (promotedSourceInfo != null) {
                        i = promotedSourceInfo.hashCode();
                    }
                    return hashCode + i;
                }

                public Gaa k() {
                    return this.k;
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Resume(playbackSessionEventArgs=");
                    sb.append(k());
                    sb.append(", promotedSourceInfo=");
                    sb.append(this.l);
                    sb.append(")");
                    return sb.toString();
                }
            }

            @EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Promoted$Start;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Promoted;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "promotedSourceInfo", "Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;)V", "getPlaybackSessionEventArgs", "()Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "getPromotedSourceInfo", "()Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;", "component1", "component2", "copy", "equals", "", "other", "", "getKind", "", "hashCode", "", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
            /* renamed from: Faa$c$a$b */
            /* compiled from: PlaybackSessionEvent.kt */
            public static final class b extends a {
                public static final C0069a j = new C0069a(null);
                private final Gaa k;
                private final PromotedSourceInfo l;

                /* renamed from: Faa$c$a$b$a reason: collision with other inner class name */
                /* compiled from: PlaybackSessionEvent.kt */
                public static final class C0069a {
                    private C0069a() {
                    }

                    public /* synthetic */ C0069a(C7264rYa rya) {
                        this();
                    }
                }

                public b(Gaa gaa, PromotedSourceInfo promotedSourceInfo) {
                    C7471uYa.b(gaa, "playbackSessionEventArgs");
                    C7471uYa.b(promotedSourceInfo, "promotedSourceInfo");
                    Gaa gaa2 = gaa;
                    super(gaa2, promotedSourceInfo.a(), "promoted", promotedSourceInfo.c(), !promotedSourceInfo.e(), promotedSourceInfo.d(), null);
                    this.k = gaa;
                    this.l = promotedSourceInfo;
                }

                public String d() {
                    return "play_start";
                }

                /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
                    if (defpackage.C7471uYa.a((java.lang.Object) r2.l, (java.lang.Object) r3.l) != false) goto L_0x0023;
                 */
                public boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof b) {
                            b bVar = (b) obj;
                            if (C7471uYa.a((Object) k(), (Object) bVar.k())) {
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    Gaa k2 = k();
                    int i = 0;
                    int hashCode = (k2 != null ? k2.hashCode() : 0) * 31;
                    PromotedSourceInfo promotedSourceInfo = this.l;
                    if (promotedSourceInfo != null) {
                        i = promotedSourceInfo.hashCode();
                    }
                    return hashCode + i;
                }

                public Gaa k() {
                    return this.k;
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Start(playbackSessionEventArgs=");
                    sb.append(k());
                    sb.append(", promotedSourceInfo=");
                    sb.append(this.l);
                    sb.append(")");
                    return sb.toString();
                }
            }

            public /* synthetic */ a(Gaa gaa, String str, String str2, C3508cda cda, boolean z, List list, C7264rYa rya) {
                this(gaa, str, str2, cda, z, list);
            }

            public final String q() {
                return this.e;
            }

            public final String r() {
                return this.f;
            }

            public final List<String> s() {
                return this.i;
            }

            public final C3508cda t() {
                return this.g;
            }

            public final boolean u() {
                return this.h;
            }

            private a(Gaa gaa, String str, String str2, C3508cda cda, boolean z, List<String> list) {
                super(gaa, null);
                this.e = str;
                this.f = str2;
                this.g = cda;
                this.h = z;
                this.i = list;
            }
        }

        @EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Resume;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;)V", "getPlaybackSessionEventArgs", "()Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "component1", "copy", "equals", "", "other", "", "getKind", "", "hashCode", "", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
        /* renamed from: Faa$c$b */
        /* compiled from: PlaybackSessionEvent.kt */
        public static final class b extends c {
            public static final a e = new a(null);
            private final Gaa f;

            /* renamed from: Faa$c$b$a */
            /* compiled from: PlaybackSessionEvent.kt */
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(C7264rYa rya) {
                    this();
                }
            }

            public b(Gaa gaa) {
                C7471uYa.b(gaa, "playbackSessionEventArgs");
                super(gaa, null);
                this.f = gaa;
            }

            public String d() {
                return "play";
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) k(), (java.lang.Object) ((defpackage.Faa.c.b) r2).k()) != false) goto L_0x0019;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Gaa k = k();
                if (k != null) {
                    return k.hashCode();
                }
                return 0;
            }

            public Gaa k() {
                return this.f;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Resume(playbackSessionEventArgs=");
                sb.append(k());
                sb.append(")");
                return sb.toString();
            }
        }

        @EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent$Play$Start;", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;)V", "getPlaybackSessionEventArgs", "()Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "component1", "copy", "equals", "", "other", "", "getKind", "", "hashCode", "", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
        /* renamed from: Faa$c$c reason: collision with other inner class name */
        /* compiled from: PlaybackSessionEvent.kt */
        public static final class C0070c extends c {
            public static final a e = new a(null);
            private final Gaa f;

            /* renamed from: Faa$c$c$a */
            /* compiled from: PlaybackSessionEvent.kt */
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(C7264rYa rya) {
                    this();
                }
            }

            public C0070c(Gaa gaa) {
                C7471uYa.b(gaa, "playbackSessionEventArgs");
                super(gaa, null);
                this.f = gaa;
            }

            public String d() {
                return "play_start";
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) k(), (java.lang.Object) ((defpackage.Faa.c.C0070c) r2).k()) != false) goto L_0x0019;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0070c) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Gaa k = k();
                if (k != null) {
                    return k.hashCode();
                }
                return 0;
            }

            public Gaa k() {
                return this.f;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Start(playbackSessionEventArgs=");
                sb.append(k());
                sb.append(")");
                return sb.toString();
            }
        }

        public /* synthetic */ c(Gaa gaa, C7264rYa rya) {
            this(gaa);
        }

        private c(Gaa gaa) {
            super(gaa, null);
        }
    }

    @EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/events/PlaybackSessionEvent$Stop;", "Lcom/soundcloud/android/events/PlaybackSessionEvent;", "playbackSessionEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "lastPlayEvent", "stopReason", "", "(Lcom/soundcloud/android/events/PlaybackSessionEventArgs;Lcom/soundcloud/android/events/PlaybackSessionEvent;Ljava/lang/String;)V", "getLastPlayEvent", "()Lcom/soundcloud/android/events/PlaybackSessionEvent;", "listenTime", "", "getListenTime", "()J", "getPlaybackSessionEventArgs", "()Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "getStopReason", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getKind", "hashCode", "", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
    /* renamed from: Faa$d */
    /* compiled from: PlaybackSessionEvent.kt */
    public static final class d extends Faa {
        public static final a e = new a(null);
        private final long f;
        private final Gaa g;
        private final Faa h;
        private final String i;

        /* renamed from: Faa$d$a */
        /* compiled from: PlaybackSessionEvent.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C7264rYa rya) {
                this();
            }
        }

        public d(Gaa gaa, Faa faa, String str) {
            C7471uYa.b(gaa, "playbackSessionEventArgs");
            C7471uYa.b(str, "stopReason");
            super(gaa, null);
            this.g = gaa;
            this.h = faa;
            this.i = str;
            long e2 = e();
            Faa faa2 = this.h;
            if (faa2 != null) {
                this.f = e2 - faa2.e();
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public String d() {
            return "pause";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.i, (java.lang.Object) r3.i) != false) goto L_0x002d;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) k(), (Object) dVar.k())) {
                        if (C7471uYa.a((Object) this.h, (Object) dVar.h)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Gaa k = k();
            int i2 = 0;
            int hashCode = (k != null ? k.hashCode() : 0) * 31;
            Faa faa = this.h;
            int hashCode2 = (hashCode + (faa != null ? faa.hashCode() : 0)) * 31;
            String str = this.i;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode2 + i2;
        }

        public Gaa k() {
            return this.g;
        }

        public final String q() {
            return this.i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Stop(playbackSessionEventArgs=");
            sb.append(k());
            sb.append(", lastPlayEvent=");
            sb.append(this.h);
            sb.append(", stopReason=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ Faa(Gaa gaa, C7264rYa rya) {
        this(gaa);
    }

    public long g() {
        return this.b;
    }

    public final String j() {
        String R = k().j().R();
        C7471uYa.a((Object) R, "playbackSessionEventArgs…kData.monetizationModel()");
        return R;
    }

    public Gaa k() {
        return this.d;
    }

    public final boolean l() {
        return n() && k().l();
    }

    public final boolean m() {
        return !(this instanceof C0070c) && !(this instanceof b);
    }

    public final boolean n() {
        return this instanceof c;
    }

    public final boolean o() {
        return this instanceof a;
    }

    public final boolean p() {
        return this instanceof d;
    }

    private Faa(Gaa gaa) {
        this.d = gaa;
        this.b = J.c();
        this.c = J.b();
    }
}
