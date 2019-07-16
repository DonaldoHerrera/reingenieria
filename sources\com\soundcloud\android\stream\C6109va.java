package com.soundcloud.android.stream;

import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3692t;
import com.soundcloud.android.foundation.ads.aa;
import java.util.Date;

@EVa(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005()*+,B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0000H&R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%\u0001\u0006-./012¨\u00063"}, d2 = {"Lcom/soundcloud/android/stream/StreamItem;", "", "kind", "Lcom/soundcloud/android/stream/StreamItem$Kind;", "id", "", "(Lcom/soundcloud/android/stream/StreamItem$Kind;Ljava/lang/Long;)V", "adData", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/foundation/ads/AdData;", "getAdData", "()Lcom/soundcloud/java/optional/Optional;", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isAd", "", "()Z", "isPromoted", "isUpsell", "getKind", "()Lcom/soundcloud/android/stream/StreamItem$Kind;", "playableItem", "Lcom/soundcloud/android/foundation/domain/playable/PlayableItem;", "getPlayableItem$base_release", "position", "", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "promotedProperties", "Lcom/soundcloud/android/foundation/domain/playable/PromotedProperties;", "getPromotedProperties", "()Lcom/soundcloud/android/foundation/domain/playable/PromotedProperties;", "identityEquals", "streamItem", "AppInstall", "Kind", "Upsell", "UpsellHeader", "Video", "Lcom/soundcloud/android/stream/TrackStreamItem;", "Lcom/soundcloud/android/stream/PlaylistStreamItem;", "Lcom/soundcloud/android/stream/StreamItem$AppInstall;", "Lcom/soundcloud/android/stream/StreamItem$Video;", "Lcom/soundcloud/android/stream/StreamItem$UpsellHeader;", "Lcom/soundcloud/android/stream/StreamItem$Upsell;", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.stream.va reason: case insensitive filesystem */
/* compiled from: StreamItem.kt */
public abstract class C6109va {
    private final Date a;
    private final b b;
    private final Long c;

    /* renamed from: com.soundcloud.android.stream.va$a */
    /* compiled from: StreamItem.kt */
    public static final class a extends C6109va {
        private final C3692t d;

        public a(C3692t tVar) {
            C7471uYa.b(tVar, "appInstallAd");
            super(b.APP_INSTALL, null, null);
            this.d = tVar;
        }

        public boolean a(C6109va vaVar) {
            C7471uYa.b(vaVar, "streamItem");
            return C7471uYa.a((Object) vaVar, (Object) this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.d, (java.lang.Object) ((com.soundcloud.android.stream.C6109va.a) r2).d) != false) goto L_0x0015;
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
            C3692t tVar = this.d;
            if (tVar != null) {
                return tVar.hashCode();
            }
            return 0;
        }

        public final C3692t j() {
            return this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AppInstall(appInstallAd=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.stream.va$b */
    /* compiled from: StreamItem.kt */
    public enum b {
        TRACK,
        PLAYLIST,
        STREAM_UPSELL,
        APP_INSTALL,
        VIDEO_AD,
        STREAM_UPSELL_HEADER
    }

    /* renamed from: com.soundcloud.android.stream.va$c */
    /* compiled from: StreamItem.kt */
    public static final class c extends C6109va {
        public static final c d = new c();

        private c() {
            super(b.STREAM_UPSELL, null, null);
        }

        public boolean a(C6109va vaVar) {
            C7471uYa.b(vaVar, "streamItem");
            return vaVar instanceof c;
        }
    }

    /* renamed from: com.soundcloud.android.stream.va$d */
    /* compiled from: StreamItem.kt */
    public static final class d extends C6109va {
        public static final d d = new d();

        private d() {
            super(b.STREAM_UPSELL_HEADER, null, null);
        }

        public boolean a(C6109va vaVar) {
            C7471uYa.b(vaVar, "streamItem");
            return vaVar instanceof d;
        }
    }

    /* renamed from: com.soundcloud.android.stream.va$e */
    /* compiled from: StreamItem.kt */
    public static final class e extends C6109va {
        private final aa d;

        public e(aa aaVar) {
            C7471uYa.b(aaVar, "video");
            super(b.VIDEO_AD, null, null);
            this.d = aaVar;
        }

        public boolean a(C6109va vaVar) {
            C7471uYa.b(vaVar, "streamItem");
            return C7471uYa.a((Object) vaVar, (Object) this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.d, (java.lang.Object) ((com.soundcloud.android.stream.C6109va.e) r2).d) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            aa aaVar = this.d;
            if (aaVar != null) {
                return aaVar.hashCode();
            }
            return 0;
        }

        public final aa j() {
            return this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Video(video=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    private C6109va(b bVar, Long l) {
        this.b = bVar;
        this.c = l;
    }

    public final C4928GKa<C3676c> a() {
        if (this instanceof a) {
            C4928GKa<C3676c> c2 = C4928GKa.c(((a) this).j());
            C7471uYa.a((Object) c2, "Optional.of(this.appInstallAd)");
            return c2;
        } else if (this instanceof e) {
            C4928GKa<C3676c> c3 = C4928GKa.c(((e) this).j());
            C7471uYa.a((Object) c3, "Optional.of(this.video)");
            return c3;
        } else {
            C4928GKa<C3676c> a2 = C4928GKa.a();
            C7471uYa.a((Object) a2, "Optional.absent()");
            return a2;
        }
    }

    public abstract boolean a(C6109va vaVar);

    public Date b() {
        return this.a;
    }

    public Long c() {
        return this.c;
    }

    public final b d() {
        return this.b;
    }

    public final C4928GKa<C3855qda> e() {
        if (this instanceof tb) {
            C4928GKa<C3855qda> c2 = C4928GKa.c(((tb) this).m());
            C7471uYa.a((Object) c2, "Optional.of(this.trackItem)");
            return c2;
        } else if (this instanceof C6102s) {
            C4928GKa<C3855qda> c3 = C4928GKa.c(((C6102s) this).k());
            C7471uYa.a((Object) c3, "Optional.of(this.playlistItem)");
            return c3;
        } else {
            C4928GKa<C3855qda> a2 = C4928GKa.a();
            C7471uYa.a((Object) a2, "Optional.absent()");
            return a2;
        }
    }

    public final C3879tda f() {
        if (this instanceof tb) {
            return ((tb) this).m().t();
        }
        if (this instanceof C6102s) {
            return ((C6102s) this).k().t();
        }
        return null;
    }

    public final boolean g() {
        return (this instanceof a) || (this instanceof e);
    }

    public final boolean h() {
        if (this instanceof tb) {
            return ((tb) this).l();
        }
        if (this instanceof C6102s) {
            return ((C6102s) this).m();
        }
        return false;
    }

    public final boolean i() {
        return this instanceof c;
    }

    public /* synthetic */ C6109va(b bVar, Long l, C7264rYa rya) {
        this(bVar, l);
    }
}
