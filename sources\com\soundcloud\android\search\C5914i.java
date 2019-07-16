package com.soundcloud.android.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.soundcloud.android.search.i reason: case insensitive filesystem */
/* compiled from: ApiUniversalSearchItem.kt */
public final class C5914i {
    private final C3776gea a;
    private final C3927zda b;
    private final Yda c;

    @JsonCreator
    public C5914i() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C5914i(@JsonProperty("user") C3776gea gea, @JsonProperty("playlist") C3927zda zda, @JsonProperty("track") Yda yda) {
        this.a = gea;
        this.b = zda;
        this.c = yda;
    }

    public final C3927zda a() {
        return this.b;
    }

    public final Yda b() {
        return this.c;
    }

    public final C3776gea c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5914i) {
                C5914i iVar = (C5914i) obj;
                if (C7471uYa.a((Object) this.a, (Object) iVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) iVar.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3776gea gea = this.a;
        int i = 0;
        int hashCode = (gea != null ? gea.hashCode() : 0) * 31;
        C3927zda zda = this.b;
        int hashCode2 = (hashCode + (zda != null ? zda.hashCode() : 0)) * 31;
        Yda yda = this.c;
        if (yda != null) {
            i = yda.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiUniversalSearchItem(apiUser=");
        sb.append(this.a);
        sb.append(", apiPlaylist=");
        sb.append(this.b);
        sb.append(", apiTrack=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C5914i(C3776gea gea, C3927zda zda, Yda yda, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            gea = null;
        }
        if ((i & 2) != 0) {
            zda = null;
        }
        if ((i & 4) != 0) {
            yda = null;
        }
        this(gea, zda, yda);
    }
}
