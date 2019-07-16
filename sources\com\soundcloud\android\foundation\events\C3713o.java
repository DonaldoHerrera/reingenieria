package com.soundcloud.android.foundation.events;

import com.adjust.sdk.Constants;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/foundation/events/ForegroundEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "pageName", "", "referrer", "pageUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "(Ljava/lang/String;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;)V", "id", "kotlin.jvm.PlatformType", "getPageName", "()Ljava/lang/String;", "getPageUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getReferrer", "timeStamp", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getKind", "hashCode", "", "timestamp", "toString", "Companion", "events_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.events.o reason: case insensitive filesystem */
/* compiled from: ForegroundEvent.kt */
public final class C3713o extends J {
    public static final a a = new a(null);
    private final long b = J.c();
    private final String c = J.b();
    private final String d;
    private final String e;
    private final C3508cda f;

    /* renamed from: com.soundcloud.android.foundation.events.o$a */
    /* compiled from: ForegroundEvent.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C3713o a(Yca yca, String str, C3508cda cda) {
            C7471uYa.b(yca, "screen");
            C7471uYa.b(str, Constants.REFERRER);
            String a = yca.a();
            C7471uYa.a((Object) a, "screen.get()");
            return new C3713o(a, str, cda);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public static /* synthetic */ C3713o a(a aVar, Yca yca, String str, C3508cda cda, int i, Object obj) {
            if ((i & 4) != 0) {
                cda = null;
            }
            return aVar.a(yca, str, cda);
        }
    }

    public C3713o(String str, String str2, C3508cda cda) {
        C7471uYa.b(str, "pageName");
        C7471uYa.b(str2, Constants.REFERRER);
        this.d = str;
        this.e = str2;
        this.f = cda;
    }

    @NXa
    public static final C3713o a(Yca yca, String str) {
        return a.a(a, yca, str, null, 4, null);
    }

    @NXa
    public static final C3713o a(Yca yca, String str, C3508cda cda) {
        return a.a(yca, str, cda);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.f, (java.lang.Object) r3.f) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3713o) {
                C3713o oVar = (C3713o) obj;
                if (C7471uYa.a((Object) this.d, (Object) oVar.d)) {
                    if (C7471uYa.a((Object) this.e, (Object) oVar.e)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public long g() {
        return this.b;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        String str = this.d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C3508cda cda = this.f;
        if (cda != null) {
            i = cda.hashCode();
        }
        return hashCode2 + i;
    }

    public final C3508cda i() {
        return this.f;
    }

    public final String j() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ForegroundEvent(pageName=");
        sb.append(this.d);
        sb.append(", referrer=");
        sb.append(this.e);
        sb.append(", pageUrn=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
