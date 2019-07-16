package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.C3710l;

/* compiled from: SearchUserItem.kt */
public final class Sa {
    private final C3508cda a;
    private final boolean b;
    private final C3710l c;

    public Sa(C3508cda cda, boolean z, C3710l lVar) {
        C7471uYa.b(cda, "user");
        C7471uYa.b(lVar, "eventContextMetadata");
        this.a = cda;
        this.b = z;
        this.c = lVar;
    }

    public final C3710l a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final C3508cda c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Sa) {
                Sa sa = (Sa) obj;
                if (C7471uYa.a((Object) this.a, (Object) sa.a)) {
                    if (!(this.b == sa.b) || !C7471uYa.a((Object) this.c, (Object) sa.c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C3710l lVar = this.c;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchUserItemToggleFollowParams(user=");
        sb.append(this.a);
        sb.append(", shouldFollow=");
        sb.append(this.b);
        sb.append(", eventContextMetadata=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
