package defpackage;

import com.soundcloud.android.foundation.ads.ba;
import com.soundcloud.android.foundation.events.J;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001a\u001b\u001cBW\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012\u0001\u0002\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/events/AdPlaybackErrorEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "monetizableTrackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "playerType", "", "protocol", "mediaType", "errorName", "host", "format", "bitrate", "", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorName", "()Ljava/lang/String;", "getFormat", "getHost", "getMediaType", "getMonetizableTrackUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getPlayerType", "getProtocol", "AudioAdFailedToBuffer", "Companion", "VideoFailedToBuffer", "Lcom/soundcloud/android/events/AdPlaybackErrorEvent$VideoFailedToBuffer;", "Lcom/soundcloud/android/events/AdPlaybackErrorEvent$AudioAdFailedToBuffer;", "base_release"}, mv = {1, 1, 15})
/* renamed from: HZ reason: default package and case insensitive filesystem */
/* compiled from: AdPlaybackErrorEvent.kt */
public abstract class C3428HZ extends J {
    public static final b a = new b(null);
    private final C3508cda b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Integer i;

    /* renamed from: HZ$a */
    /* compiled from: AdPlaybackErrorEvent.kt */
    public static final class a extends C3428HZ {
        private final C3508cda j;
        private final String k;
        private final String l;
        private final long m;
        private final String n;

        public /* synthetic */ a(C3508cda cda, String str, String str2, long j2, String str3, int i, C7264rYa rya) {
            if ((i & 8) != 0) {
                j2 = J.c();
            }
            long j3 = j2;
            if ((i & 16) != 0) {
                str3 = J.b();
                C7471uYa.a((Object) str3, "TrackingEvent.defaultId()");
            }
            this(cda, str, str2, j3, str3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) q(), (Object) aVar.q()) && C7471uYa.a((Object) m(), (Object) aVar.m()) && C7471uYa.a((Object) n(), (Object) aVar.n())) {
                        if (!(this.m == aVar.m) || !C7471uYa.a((Object) this.n, (Object) aVar.n)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public long g() {
            return this.m;
        }

        public int hashCode() {
            C3508cda q = q();
            int i = 0;
            int hashCode = (q != null ? q.hashCode() : 0) * 31;
            String m2 = m();
            int hashCode2 = (hashCode + (m2 != null ? m2.hashCode() : 0)) * 31;
            String n2 = n();
            int hashCode3 = (hashCode2 + (n2 != null ? n2.hashCode() : 0)) * 31;
            long j2 = this.m;
            int i2 = (hashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str = this.n;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        public String m() {
            return this.k;
        }

        public String n() {
            return this.l;
        }

        public C3508cda q() {
            return this.j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioAdFailedToBuffer(monetizableTrackUrn=");
            sb.append(q());
            sb.append(", playerType=");
            sb.append(m());
            sb.append(", protocol=");
            sb.append(n());
            sb.append(", timeStamp=");
            sb.append(this.m);
            sb.append(", id=");
            sb.append(this.n);
            sb.append(")");
            return sb.toString();
        }

        public a(C3508cda cda, String str, String str2, long j2, String str3) {
            C3508cda cda2 = cda;
            String str4 = str3;
            C7471uYa.b(cda, "monetizableTrackUrn");
            C7471uYa.b(str4, "id");
            super(cda, str, str2, "audio", "adFailedToBuffer", null, null, null, 224, null);
            this.j = cda2;
            this.k = str;
            this.l = str2;
            this.m = j2;
            this.n = str4;
        }
    }

    /* renamed from: HZ$b */
    /* compiled from: AdPlaybackErrorEvent.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final String a(String str) {
            return (str != null && str.hashCode() == 1331848029 && str.equals("video/mp4")) ? "mp4" : str;
        }
    }

    /* renamed from: HZ$c */
    /* compiled from: AdPlaybackErrorEvent.kt */
    public static final class c extends C3428HZ {
        private final C3508cda j;
        private final String k;
        private final String l;
        private final ba m;
        private final long n;
        private final String o;

        public /* synthetic */ c(C3508cda cda, String str, String str2, ba baVar, long j2, String str3, int i, C7264rYa rya) {
            String str4;
            long p = (i & 16) != 0 ? J.c() : j2;
            if ((i & 32) != 0) {
                String o2 = J.b();
                C7471uYa.a((Object) o2, "TrackingEvent.defaultId()");
                str4 = o2;
            } else {
                str4 = str3;
            }
            this(cda, str, str2, baVar, p, str4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) q(), (Object) cVar.q()) && C7471uYa.a((Object) m(), (Object) cVar.m()) && C7471uYa.a((Object) n(), (Object) cVar.n()) && C7471uYa.a((Object) this.m, (Object) cVar.m)) {
                        if (!(this.n == cVar.n) || !C7471uYa.a((Object) this.o, (Object) cVar.o)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public long g() {
            return this.n;
        }

        public int hashCode() {
            C3508cda q = q();
            int i = 0;
            int hashCode = (q != null ? q.hashCode() : 0) * 31;
            String m2 = m();
            int hashCode2 = (hashCode + (m2 != null ? m2.hashCode() : 0)) * 31;
            String n2 = n();
            int hashCode3 = (hashCode2 + (n2 != null ? n2.hashCode() : 0)) * 31;
            ba baVar = this.m;
            int hashCode4 = (hashCode3 + (baVar != null ? baVar.hashCode() : 0)) * 31;
            long j2 = this.n;
            int i2 = (hashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str = this.o;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        public String m() {
            return this.k;
        }

        public String n() {
            return this.l;
        }

        public C3508cda q() {
            return this.j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("VideoFailedToBuffer(monetizableTrackUrn=");
            sb.append(q());
            sb.append(", playerType=");
            sb.append(m());
            sb.append(", protocol=");
            sb.append(n());
            sb.append(", videoSource=");
            sb.append(this.m);
            sb.append(", timeStamp=");
            sb.append(this.n);
            sb.append(", id=");
            sb.append(this.o);
            sb.append(")");
            return sb.toString();
        }

        public c(C3508cda cda, String str, String str2, ba baVar, long j2, String str3) {
            C3508cda cda2 = cda;
            ba baVar2 = baVar;
            String str4 = str3;
            C7471uYa.b(cda, "monetizableTrackUrn");
            C7471uYa.b(str4, "id");
            Integer num = null;
            String f = baVar2 != null ? baVar.f() : null;
            String a = C3428HZ.a.a(baVar2 != null ? baVar.e() : null);
            if (baVar2 != null) {
                num = Integer.valueOf(baVar.a());
            }
            Integer num2 = num;
            super(cda, str, str2, "video", "adFailedToBuffer", f, a, num2, null);
            this.j = cda2;
            this.k = str;
            this.l = str2;
            this.m = baVar2;
            this.n = j2;
            this.o = str4;
        }
    }

    public /* synthetic */ C3428HZ(C3508cda cda, String str, String str2, String str3, String str4, String str5, String str6, Integer num, C7264rYa rya) {
        this(cda, str, str2, str3, str4, str5, str6, num);
    }

    public final Integer h() {
        return this.i;
    }

    public final String i() {
        return this.f;
    }

    public final String j() {
        return this.h;
    }

    public final String k() {
        return this.g;
    }

    public final String l() {
        return this.e;
    }

    public String m() {
        return this.c;
    }

    public String n() {
        return this.d;
    }

    /* synthetic */ C3428HZ(C3508cda cda, String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i2, C7264rYa rya) {
        int i3 = i2;
        this(cda, str, str2, str3, str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? null : num);
    }

    private C3428HZ(C3508cda cda, String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.b = cda;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = num;
    }
}
