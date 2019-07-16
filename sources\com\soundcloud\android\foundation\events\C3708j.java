package com.soundcloud.android.foundation.events;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/soundcloud/android/foundation/events/EntityMetadata;", "", "creatorName", "", "creatorUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "playableTitle", "playableUrn", "(Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;)V", "getCreatorName", "()Ljava/lang/String;", "getCreatorUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getPlayableTitle", "playableType", "Lcom/soundcloud/android/foundation/events/EntityMetadata$Type;", "getPlayableType", "()Lcom/soundcloud/android/foundation/events/EntityMetadata$Type;", "getPlayableUrn", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Type", "events_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.events.j reason: case insensitive filesystem */
/* compiled from: EntityMetadata.kt */
public final class C3708j {
    public static final a a = new a(null);
    private final String b;
    private final C3508cda c;
    private final String d;
    private final C3508cda e;

    /* renamed from: com.soundcloud.android.foundation.events.j$a */
    /* compiled from: EntityMetadata.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C3708j a(C3784hea hea) {
            C7471uYa.b(hea, "user");
            C3708j jVar = new C3708j(hea.c, hea.a, null, null, 12, null);
            return jVar;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final C3708j a(C3509cea cea) {
            C7471uYa.b(cea, "track");
            return new C3708j(cea.f(), cea.g(), cea.w(), cea.y());
        }

        @NXa
        public final C3708j a(C3927zda zda) {
            C7471uYa.b(zda, "playlist");
            return new C3708j(zda.s().m(), zda.s().l(), zda.getTitle(), zda.a());
        }

        @NXa
        public final C3708j a() {
            C3708j jVar = new C3708j(null, null, null, null, 15, null);
            return jVar;
        }
    }

    /* renamed from: com.soundcloud.android.foundation.events.j$b */
    /* compiled from: EntityMetadata.kt */
    public enum b {
        TRACK("track"),
        PLAYLIST("playlist"),
        STATION("station"),
        USER("user"),
        OTHER("other");
        
        private final String g;

        private b(String str) {
            this.g = str;
        }

        public final String a() {
            return this.g;
        }
    }

    public C3708j() {
        this(null, null, null, null, 15, null);
    }

    public C3708j(String str, C3508cda cda, String str2, C3508cda cda2) {
        C7471uYa.b(str, "creatorName");
        C7471uYa.b(cda, "creatorUrn");
        C7471uYa.b(str2, "playableTitle");
        C7471uYa.b(cda2, "playableUrn");
        this.b = str;
        this.c = cda;
        this.d = str2;
        this.e = cda2;
    }

    @NXa
    public static final C3708j a() {
        return a.a();
    }

    @NXa
    public static final C3708j a(C3509cea cea) {
        return a.a(cea);
    }

    @NXa
    public static final C3708j a(C3784hea hea) {
        return a.a(hea);
    }

    @NXa
    public static final C3708j a(C3927zda zda) {
        return a.a(zda);
    }

    public final String b() {
        return this.b;
    }

    public final C3508cda c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final b e() {
        if (this.e.x()) {
            return b.TRACK;
        }
        if (this.e.u()) {
            return b.PLAYLIST;
        }
        if (this.e.v()) {
            return b.STATION;
        }
        if (this.e.J()) {
            return b.USER;
        }
        return b.OTHER;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3708j) {
                C3708j jVar = (C3708j) obj;
                if (C7471uYa.a((Object) this.b, (Object) jVar.b)) {
                    if (C7471uYa.a((Object) this.c, (Object) jVar.c)) {
                        if (C7471uYa.a((Object) this.d, (Object) jVar.d)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C3508cda f() {
        return this.e;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C3508cda cda = this.c;
        int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C3508cda cda2 = this.e;
        if (cda2 != null) {
            i = cda2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityMetadata(creatorName=");
        sb.append(this.b);
        sb.append(", creatorUrn=");
        sb.append(this.c);
        sb.append(", playableTitle=");
        sb.append(this.d);
        sb.append(", playableUrn=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3708j(String str, C3508cda cda, String str2, C3508cda cda2, int i, C7264rYa rya) {
        String str3 = "";
        if ((i & 1) != 0) {
            str = str3;
        }
        String str4 = "Urn.NOT_SET";
        if ((i & 2) != 0) {
            cda = C3508cda.a;
            C7471uYa.a((Object) cda, str4);
        }
        if ((i & 4) != 0) {
            str2 = str3;
        }
        if ((i & 8) != 0) {
            cda2 = C3508cda.a;
            C7471uYa.a((Object) cda2, str4);
        }
        this(str, cda, str2, cda2);
    }
}
