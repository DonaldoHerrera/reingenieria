package defpackage;

import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.v;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/discovery/SelectionItemTrackingInfo;", "", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "eventContextMetadata", "Lcom/soundcloud/android/foundation/events/EventContextMetadata;", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/events/EventContextMetadata;)V", "getEventContextMetadata", "()Lcom/soundcloud/android/foundation/events/EventContextMetadata;", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toUIEvent", "Lcom/soundcloud/android/foundation/events/UIEvent;", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: MY reason: default package and case insensitive filesystem */
/* compiled from: TrackingInfo.kt */
public class C3442MY {
    /* access modifiers changed from: private */
    public static final Yca a = Yca.DISCOVER;
    public static final a b = new a(null);
    private final C3508cda c;
    private final C3710l d;

    /* renamed from: MY$a */
    /* compiled from: TrackingInfo.kt */
    public static final class a {
        private a() {
        }

        public final Yca a() {
            return C3442MY.a;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final C3442MY a(C3418EY ey, C3503cY cYVar, int i) {
            C7471uYa.b(ey, "selectionItem");
            C7471uYa.b(cYVar, "parentCard");
            if (cYVar instanceof d) {
                return a(i, (d) cYVar);
            }
            if (cYVar instanceof b) {
                return a(ey, i, (b) cYVar);
            }
            return null;
        }

        private final C3442MY a(int i, d dVar) {
            C3508cda h = dVar.d().h();
            String a = C3442MY.b.a().a();
            String j = dVar.j();
            C3508cda e = dVar.e();
            C3508cda c = dVar.c();
            Integer valueOf = Integer.valueOf(0);
            C3710l lVar = r2;
            C3710l lVar2 = new C3710l(null, a, null, false, null, null, null, null, dVar.b(), Integer.valueOf(i), j, e, c, valueOf, 253, null);
            return new C3442MY(h, lVar);
        }

        private final C3442MY a(C3418EY ey, int i, b bVar) {
            C3508cda h = ey.h();
            v vVar = null;
            if (h == null) {
                return null;
            }
            C3418EY ey2 = (C3418EY) C1943BD.f(bVar.d(), new C3439LY(h, bVar, i)).orNull();
            Integer valueOf = ey2 != null ? Integer.valueOf(bVar.d().indexOf(ey2)) : null;
            String a = C3442MY.b.a().a();
            String h2 = bVar.h();
            C3508cda e = bVar.e();
            C3508cda c = bVar.c();
            Integer valueOf2 = Integer.valueOf(i);
            C3508cda b = bVar.b();
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                String cda = bVar.e().toString();
                C7471uYa.a((Object) cda, "selectionUrn.toString()");
                vVar = new v(cda, intValue);
            }
            C3710l lVar = r3;
            C3710l lVar2 = new C3710l(null, a, vVar, false, null, null, null, null, b, valueOf2, h2, e, c, valueOf, 249, null);
            return new C3442MY(h, lVar);
        }
    }

    public C3442MY(C3508cda cda, C3710l lVar) {
        C7471uYa.b(lVar, "eventContextMetadata");
        this.c = cda;
        this.d = lVar;
    }

    public C3710l b() {
        return this.d;
    }

    public C3508cda c() {
        return this.c;
    }

    public K d() {
        return K.a.b(c(), b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) b(), (java.lang.Object) r3.b()) != false) goto L_0x0027;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3442MY) {
                C3442MY my = (C3442MY) obj;
                if (C7471uYa.a((Object) c(), (Object) my.c())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda c2 = c();
        int i = 0;
        int hashCode = (c2 != null ? c2.hashCode() : 0) * 31;
        C3710l b2 = b();
        if (b2 != null) {
            i = b2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SelectionItemTrackingInfo(urn=");
        sb.append(c());
        sb.append(", eventContextMetadata=");
        sb.append(b());
        sb.append(")");
        return sb.toString();
    }
}
