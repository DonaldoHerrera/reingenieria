package com.soundcloud.android.foundation.events;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\t\u0010 \u001a\u00020!HÖ\u0001J\b\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\rH\u0016J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006&"}, d2 = {"Lcom/soundcloud/android/foundation/events/ScreenEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "screen", "", "queryUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "pageUrn", "source", "pageVariant", "(Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Ljava/lang/String;)V", "defaultId", "kotlin.jvm.PlatformType", "defaultTimestamp", "", "getPageUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getPageVariant", "()Ljava/lang/String;", "getQueryUrn", "getScreen", "getSource", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "getKind", "hashCode", "", "id", "timestamp", "toString", "Companion", "events_release"}, mv = {1, 1, 15})
/* compiled from: ScreenEvent.kt */
public final class E extends J {
    public static final a a = new a(null);
    private final long b;
    private final String c;
    private final String d;
    private final C3508cda e;
    private final C3508cda f;
    private final String g;
    private final String h;

    /* compiled from: ScreenEvent.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public /* synthetic */ E(String str, C3508cda cda, C3508cda cda2, String str2, String str3, int i, C7264rYa rya) {
        this(str, (i & 2) != 0 ? null : cda, (i & 4) != 0 ? null : cda2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.h, (java.lang.Object) r3.h) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E) {
                E e2 = (E) obj;
                if (C7471uYa.a((Object) this.d, (Object) e2.d)) {
                    if (C7471uYa.a((Object) this.e, (Object) e2.e)) {
                        if (C7471uYa.a((Object) this.f, (Object) e2.f)) {
                            if (C7471uYa.a((Object) this.g, (Object) e2.g)) {
                            }
                        }
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

    public final C3508cda h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C3508cda cda = this.e;
        int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
        C3508cda cda2 = this.f;
        int hashCode3 = (hashCode2 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String i() {
        return this.h;
    }

    public final C3508cda j() {
        return this.e;
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScreenEvent(screen=");
        sb.append(this.d);
        sb.append(", queryUrn=");
        sb.append(this.e);
        sb.append(", pageUrn=");
        sb.append(this.f);
        sb.append(", source=");
        sb.append(this.g);
        sb.append(", pageVariant=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public E(String str, C3508cda cda, C3508cda cda2, String str2, String str3) {
        C7471uYa.b(str, "screen");
        this.d = str;
        this.e = cda;
        this.f = cda2;
        this.g = str2;
        this.h = str3;
        this.b = J.c();
        this.c = J.b();
    }
}
