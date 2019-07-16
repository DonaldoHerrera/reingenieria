package defpackage;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lcom/soundcloud/android/foundation/domain/ScreenData;", "", "screen", "Lcom/soundcloud/android/foundation/domain/Screen;", "pageUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "queryUrn", "source", "", "pageVariant", "(Lcom/soundcloud/android/foundation/domain/Screen;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Ljava/lang/String;)V", "getPageUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getPageVariant", "()Ljava/lang/String;", "getQueryUrn", "getScreen", "()Lcom/soundcloud/android/foundation/domain/Screen;", "getSource", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "domain"}, mv = {1, 1, 15})
/* renamed from: Zca reason: default package */
/* compiled from: ScreenTracker.kt */
public final class Zca {
    public static final a a = new a(null);
    private final Yca b;
    private final C3508cda c;
    private final C3508cda d;
    private final String e;
    private final String f;

    /* renamed from: Zca$a */
    /* compiled from: ScreenTracker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Zca(Yca yca) {
        this(yca, null, null, null, null, 30, null);
    }

    public Zca(Yca yca, C3508cda cda) {
        this(yca, cda, null, null, null, 28, null);
    }

    public Zca(Yca yca, C3508cda cda, C3508cda cda2) {
        this(yca, cda, cda2, null, null, 24, null);
    }

    public Zca(Yca yca, C3508cda cda, C3508cda cda2, String str, String str2) {
        C7471uYa.b(yca, "screen");
        this.b = yca;
        this.c = cda;
        this.d = cda2;
        this.e = str;
        this.f = str2;
    }

    public final C3508cda a() {
        return this.c;
    }

    public final String b() {
        return this.f;
    }

    public final C3508cda c() {
        return this.d;
    }

    public final Yca d() {
        return this.b;
    }

    public final String e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.f, (java.lang.Object) r3.f) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Zca) {
                Zca zca = (Zca) obj;
                if (C7471uYa.a((Object) this.b, (Object) zca.b)) {
                    if (C7471uYa.a((Object) this.c, (Object) zca.c)) {
                        if (C7471uYa.a((Object) this.d, (Object) zca.d)) {
                            if (C7471uYa.a((Object) this.e, (Object) zca.e)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Yca yca = this.b;
        int i = 0;
        int hashCode = (yca != null ? yca.hashCode() : 0) * 31;
        C3508cda cda = this.c;
        int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
        C3508cda cda2 = this.d;
        int hashCode3 = (hashCode2 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScreenData(screen=");
        sb.append(this.b);
        sb.append(", pageUrn=");
        sb.append(this.c);
        sb.append(", queryUrn=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", pageVariant=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Zca(Yca yca, C3508cda cda, C3508cda cda2, String str, String str2, int i, C7264rYa rya) {
        this(yca, (i & 2) != 0 ? null : cda, (i & 4) != 0 ? null : cda2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
