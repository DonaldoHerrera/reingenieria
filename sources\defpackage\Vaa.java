package defpackage;

import com.soundcloud.android.foundation.events.J;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\t\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/soundcloud/android/events/UnconfirmedEmailImpressionEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "id", "", "ts", "", "pageUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "(Ljava/lang/String;JLcom/soundcloud/android/foundation/domain/Urn;)V", "eventName", "getEventName", "()Ljava/lang/String;", "getId", "impressionName", "getImpressionName", "pageName", "getPageName", "getPageUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getTs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "timestamp", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: Vaa reason: default package */
/* compiled from: UnconfirmedEmailImpressionEvent.kt */
public class Vaa extends J {
    public static final a a = new a(null);
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final C3508cda g;

    /* renamed from: Vaa$a */
    /* compiled from: UnconfirmedEmailImpressionEvent.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Vaa a(C3508cda cda) {
            C7471uYa.b(cda, "trackUrn");
            Vaa vaa = new Vaa(null, 0, cda, 3, null);
            return vaa;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public /* synthetic */ Vaa(String str, long j, C3508cda cda, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            str = J.b();
            C7471uYa.a((Object) str, "defaultId()");
        }
        if ((i & 2) != 0) {
            j = J.c();
        }
        this(str, j, cda);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Vaa) {
                Vaa vaa = (Vaa) obj;
                if (C7471uYa.a((Object) k(), (Object) vaa.k())) {
                    if (!(o() == vaa.o()) || !C7471uYa.a((Object) n(), (Object) vaa.n())) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public long g() {
        return o();
    }

    public int hashCode() {
        String k = k();
        int i = 0;
        int hashCode = (k != null ? k.hashCode() : 0) * 31;
        long o = o();
        int i2 = (hashCode + ((int) (o ^ (o >>> 32)))) * 31;
        C3508cda n = n();
        if (n != null) {
            i = n.hashCode();
        }
        return i2 + i;
    }

    public String j() {
        return this.b;
    }

    public String k() {
        return this.e;
    }

    public String l() {
        return this.d;
    }

    public String m() {
        return this.c;
    }

    public C3508cda n() {
        return this.g;
    }

    public long o() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnconfirmedEmailImpressionEvent(id=");
        sb.append(k());
        sb.append(", ts=");
        sb.append(o());
        sb.append(", pageUrn=");
        sb.append(n());
        sb.append(")");
        return sb.toString();
    }

    public Vaa(String str, long j, C3508cda cda) {
        C7471uYa.b(str, "id");
        C7471uYa.b(cda, "pageUrn");
        this.e = str;
        this.f = j;
        this.g = cda;
        this.b = "impression";
        String a2 = Yca.PLAYER_COMMENTS.a();
        C7471uYa.a((Object) a2, "Screen.PLAYER_COMMENTS.get()");
        this.c = a2;
        this.d = "validate_email::comment";
    }
}
