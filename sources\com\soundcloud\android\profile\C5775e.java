package com.soundcloud.android.profile;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.soundcloud.android.profile.e reason: case insensitive filesystem */
/* compiled from: ApiPlayableSource.kt */
public final class C5775e implements C5770d {
    private final Yda a;
    private final C3927zda b;

    @JsonCreator
    public C5775e() {
        this(null, null, 3, null);
    }

    @JsonCreator
    public C5775e(@JsonProperty("track") Yda yda, @JsonProperty("playlist") C3927zda zda) {
        this.a = yda;
        this.b = zda;
    }

    public C4928GKa<Sca> a() {
        Object obj;
        Yda yda = this.a;
        if (yda != null) {
            obj = new C1955BP(yda);
        } else {
            obj = this.b;
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C4928GKa<Sca> b2 = C4928GKa.b(obj);
        C7471uYa.a((Object) b2, "Optional.fromNullable(tr…requireNotNull(playlist))");
        return b2;
    }

    public final C3927zda b() {
        return this.b;
    }

    public final Yda c() {
        return this.a;
    }

    public final C3508cda d() {
        Yda yda = this.a;
        if (yda != null) {
            C3508cda w = yda.w();
            if (w != null) {
                return w;
            }
        }
        C3927zda zda = this.b;
        if (zda != null) {
            return zda.a();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5775e) {
                C5775e eVar = (C5775e) obj;
                if (C7471uYa.a((Object) this.a, (Object) eVar.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Yda yda = this.a;
        int i = 0;
        int hashCode = (yda != null ? yda.hashCode() : 0) * 31;
        C3927zda zda = this.b;
        if (zda != null) {
            i = zda.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiPlayableSource(track=");
        sb.append(this.a);
        sb.append(", playlist=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C5775e(Yda yda, C3927zda zda, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            yda = null;
        }
        if ((i & 2) != 0) {
            zda = null;
        }
        this(yda, zda);
    }
}
