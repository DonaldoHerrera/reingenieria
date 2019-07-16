package defpackage;

import com.soundcloud.android.foundation.ads.C3681h;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.q;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00172\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/events/AdRequestEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "uuid", "", "inForeground", "", "playerVisible", "monetizableTrackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "adsEndpoint", "playQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "(Ljava/lang/String;ZZLcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;)V", "getAdsEndpoint", "()Ljava/lang/String;", "getInForeground", "()Z", "getMonetizableTrackUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getPlayQueueItem", "()Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "getPlayerVisible", "getUuid", "Companion", "Failure", "Sent", "Success", "Lcom/soundcloud/android/events/AdRequestEvent$Sent;", "Lcom/soundcloud/android/events/AdRequestEvent$Success;", "Lcom/soundcloud/android/events/AdRequestEvent$Failure;", "base_release"}, mv = {1, 1, 15})
/* renamed from: KZ reason: default package and case insensitive filesystem */
/* compiled from: AdRequestEvent.kt */
public abstract class C3437KZ extends J {
    public static final a a = new a(null);
    private final String b;
    private final boolean c;
    private final boolean d;
    private final C3508cda e;
    private final String f;
    private final q g;

    /* renamed from: KZ$a */
    /* compiled from: AdRequestEvent.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: KZ$b */
    /* compiled from: AdRequestEvent.kt */
    public static final class b extends C3437KZ {
        private final String h;
        private final boolean i;
        private final boolean j;
        private final C3508cda k;
        private final String l;
        private final q m;
        private final long n;

        public /* synthetic */ b(String str, boolean z, boolean z2, C3508cda cda, String str2, q qVar, long j2, int i2, C7264rYa rya) {
            this(str, z, z2, cda, str2, qVar, (i2 & 64) != 0 ? J.c() : j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) n(), (Object) bVar.n())) {
                        if (i() == bVar.i()) {
                            if ((k() == bVar.k()) && C7471uYa.a((Object) j(), (Object) bVar.j()) && C7471uYa.a((Object) h(), (Object) bVar.h()) && C7471uYa.a((Object) m(), (Object) bVar.m())) {
                                if (this.n == bVar.n) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public String f() {
            return n();
        }

        public long g() {
            return this.n;
        }

        public String h() {
            return this.l;
        }

        public int hashCode() {
            String n2 = n();
            int i2 = 0;
            int hashCode = (n2 != null ? n2.hashCode() : 0) * 31;
            boolean i3 = i();
            if (i3) {
                i3 = true;
            }
            int i4 = (hashCode + (i3 ? 1 : 0)) * 31;
            boolean k2 = k();
            if (k2) {
                k2 = true;
            }
            int i5 = (i4 + (k2 ? 1 : 0)) * 31;
            C3508cda j2 = j();
            int hashCode2 = (i5 + (j2 != null ? j2.hashCode() : 0)) * 31;
            String h2 = h();
            int hashCode3 = (hashCode2 + (h2 != null ? h2.hashCode() : 0)) * 31;
            q m2 = m();
            if (m2 != null) {
                i2 = m2.hashCode();
            }
            int i6 = (hashCode3 + i2) * 31;
            long j3 = this.n;
            return i6 + ((int) (j3 ^ (j3 >>> 32)));
        }

        public boolean i() {
            return this.i;
        }

        public C3508cda j() {
            return this.k;
        }

        public boolean k() {
            return this.j;
        }

        public q m() {
            return this.m;
        }

        public String n() {
            return this.h;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(uuid=");
            sb.append(n());
            sb.append(", inForeground=");
            sb.append(i());
            sb.append(", playerVisible=");
            sb.append(k());
            sb.append(", monetizableTrackUrn=");
            sb.append(j());
            sb.append(", adsEndpoint=");
            sb.append(h());
            sb.append(", playQueueItem=");
            sb.append(m());
            sb.append(", defaultTimeStamp=");
            sb.append(this.n);
            sb.append(")");
            return sb.toString();
        }

        public b(String str, boolean z, boolean z2, C3508cda cda, String str2, q qVar, long j2) {
            String str3 = str;
            String str4 = str2;
            C7471uYa.b(str, "uuid");
            C7471uYa.b(str4, "adsEndpoint");
            super(str, z, z2, cda, str2, qVar, null);
            this.h = str3;
            this.i = z;
            this.j = z2;
            this.k = cda;
            this.l = str4;
            this.m = qVar;
            this.n = j2;
        }
    }

    /* renamed from: KZ$c */
    /* compiled from: AdRequestEvent.kt */
    public static final class c extends C3437KZ {
        private final String h;
        private final boolean i;
        private final boolean j;
        private final C3508cda k;
        private final String l;
        private final q m;
        private final long n;

        public /* synthetic */ c(String str, boolean z, boolean z2, C3508cda cda, String str2, q qVar, long j2, int i2, C7264rYa rya) {
            this(str, z, z2, cda, str2, qVar, (i2 & 64) != 0 ? J.c() : j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) n(), (Object) cVar.n())) {
                        if (i() == cVar.i()) {
                            if ((k() == cVar.k()) && C7471uYa.a((Object) j(), (Object) cVar.j()) && C7471uYa.a((Object) h(), (Object) cVar.h()) && C7471uYa.a((Object) m(), (Object) cVar.m())) {
                                if (this.n == cVar.n) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public String f() {
            return n();
        }

        public long g() {
            return this.n;
        }

        public String h() {
            return this.l;
        }

        public int hashCode() {
            String n2 = n();
            int i2 = 0;
            int hashCode = (n2 != null ? n2.hashCode() : 0) * 31;
            boolean i3 = i();
            if (i3) {
                i3 = true;
            }
            int i4 = (hashCode + (i3 ? 1 : 0)) * 31;
            boolean k2 = k();
            if (k2) {
                k2 = true;
            }
            int i5 = (i4 + (k2 ? 1 : 0)) * 31;
            C3508cda j2 = j();
            int hashCode2 = (i5 + (j2 != null ? j2.hashCode() : 0)) * 31;
            String h2 = h();
            int hashCode3 = (hashCode2 + (h2 != null ? h2.hashCode() : 0)) * 31;
            q m2 = m();
            if (m2 != null) {
                i2 = m2.hashCode();
            }
            int i6 = (hashCode3 + i2) * 31;
            long j3 = this.n;
            return i6 + ((int) (j3 ^ (j3 >>> 32)));
        }

        public boolean i() {
            return this.i;
        }

        public C3508cda j() {
            return this.k;
        }

        public boolean k() {
            return this.j;
        }

        public q m() {
            return this.m;
        }

        public String n() {
            return this.h;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Sent(uuid=");
            sb.append(n());
            sb.append(", inForeground=");
            sb.append(i());
            sb.append(", playerVisible=");
            sb.append(k());
            sb.append(", monetizableTrackUrn=");
            sb.append(j());
            sb.append(", adsEndpoint=");
            sb.append(h());
            sb.append(", playQueueItem=");
            sb.append(m());
            sb.append(", defaultTimeStamp=");
            sb.append(this.n);
            sb.append(")");
            return sb.toString();
        }

        public c(String str, boolean z, boolean z2, C3508cda cda, String str2, q qVar, long j2) {
            String str3 = str;
            String str4 = str2;
            C7471uYa.b(str, "uuid");
            C7471uYa.b(str4, "adsEndpoint");
            super(str, z, z2, cda, str2, qVar, null);
            this.h = str3;
            this.i = z;
            this.j = z2;
            this.k = cda;
            this.l = str4;
            this.m = qVar;
            this.n = j2;
        }
    }

    /* renamed from: KZ$d */
    /* compiled from: AdRequestEvent.kt */
    public static final class d extends C3437KZ {
        private final C3681h h;
        private final String i;
        private final boolean j;
        private final boolean k;
        private final C3508cda l;
        private final String m;
        private final q n;
        private final long o;

        public /* synthetic */ d(C3681h hVar, String str, boolean z, boolean z2, C3508cda cda, String str2, q qVar, long j2, int i2, C7264rYa rya) {
            this(hVar, str, z, z2, cda, str2, qVar, (i2 & 128) != 0 ? J.c() : j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) this.h, (Object) dVar.h) && C7471uYa.a((Object) o(), (Object) dVar.o())) {
                        if (i() == dVar.i()) {
                            if ((k() == dVar.k()) && C7471uYa.a((Object) j(), (Object) dVar.j()) && C7471uYa.a((Object) h(), (Object) dVar.h()) && C7471uYa.a((Object) n(), (Object) dVar.n())) {
                                if (this.o == dVar.o) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public String f() {
            return o();
        }

        public long g() {
            return this.o;
        }

        public String h() {
            return this.m;
        }

        public int hashCode() {
            C3681h hVar = this.h;
            int i2 = 0;
            int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
            String o2 = o();
            int hashCode2 = (hashCode + (o2 != null ? o2.hashCode() : 0)) * 31;
            boolean i3 = i();
            if (i3) {
                i3 = true;
            }
            int i4 = (hashCode2 + (i3 ? 1 : 0)) * 31;
            boolean k2 = k();
            if (k2) {
                k2 = true;
            }
            int i5 = (i4 + (k2 ? 1 : 0)) * 31;
            C3508cda j2 = j();
            int hashCode3 = (i5 + (j2 != null ? j2.hashCode() : 0)) * 31;
            String h2 = h();
            int hashCode4 = (hashCode3 + (h2 != null ? h2.hashCode() : 0)) * 31;
            q n2 = n();
            if (n2 != null) {
                i2 = n2.hashCode();
            }
            int i6 = (hashCode4 + i2) * 31;
            long j3 = this.o;
            return i6 + ((int) (j3 ^ (j3 >>> 32)));
        }

        public boolean i() {
            return this.j;
        }

        public C3508cda j() {
            return this.l;
        }

        public boolean k() {
            return this.k;
        }

        public final C3681h m() {
            return this.h;
        }

        public q n() {
            return this.n;
        }

        public String o() {
            return this.i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success(adsReceived=");
            sb.append(this.h);
            sb.append(", uuid=");
            sb.append(o());
            sb.append(", inForeground=");
            sb.append(i());
            sb.append(", playerVisible=");
            sb.append(k());
            sb.append(", monetizableTrackUrn=");
            sb.append(j());
            sb.append(", adsEndpoint=");
            sb.append(h());
            sb.append(", playQueueItem=");
            sb.append(n());
            sb.append(", defaultTimeStamp=");
            sb.append(this.o);
            sb.append(")");
            return sb.toString();
        }

        public d(C3681h hVar, String str, boolean z, boolean z2, C3508cda cda, String str2, q qVar, long j2) {
            C3681h hVar2 = hVar;
            String str3 = str;
            String str4 = str2;
            C7471uYa.b(hVar, "adsReceived");
            C7471uYa.b(str, "uuid");
            C7471uYa.b(str4, "adsEndpoint");
            super(str, z, z2, cda, str2, qVar, null);
            this.h = hVar2;
            this.i = str3;
            this.j = z;
            this.k = z2;
            this.l = cda;
            this.m = str4;
            this.n = qVar;
            this.o = j2;
        }
    }

    public /* synthetic */ C3437KZ(String str, boolean z, boolean z2, C3508cda cda, String str2, q qVar, C7264rYa rya) {
        this(str, z, z2, cda, str2, qVar);
    }

    public String h() {
        return this.f;
    }

    public boolean i() {
        return this.c;
    }

    public C3508cda j() {
        return this.e;
    }

    public boolean k() {
        return this.d;
    }

    private C3437KZ(String str, boolean z, boolean z2, C3508cda cda, String str2, q qVar) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = cda;
        this.f = str2;
        this.g = qVar;
    }
}
