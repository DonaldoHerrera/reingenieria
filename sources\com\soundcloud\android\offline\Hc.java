package com.soundcloud.android.offline;

import java.util.Collection;
import java.util.Collections;

/* compiled from: OfflineContentChangedEvent */
public final class Hc {
    public final C3823mda a;
    public final Collection<C3508cda> b;
    public final boolean c;

    Hc(C3823mda mda, Collection<C3508cda> collection, boolean z) {
        this.a = mda;
        this.b = collection;
        this.c = z;
    }

    public static Hc a(Collection<C3508cda> collection) {
        return new Hc(C3823mda.NOT_OFFLINE, collection, false);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Hc.class != obj.getClass()) {
            return false;
        }
        Hc hc = (Hc) obj;
        if (!C4804CKa.a(Boolean.valueOf(this.c), Boolean.valueOf(hc.c)) || !C4804CKa.a(this.a, hc.a) || !C4804CKa.a(this.b, hc.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C4804CKa.a(this.a, this.b, Boolean.valueOf(this.c));
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("state", (Object) this.a).a("entities", (Object) this.b).a("isLikedTrackCollection", this.c).toString();
    }

    public static Hc a(boolean z) {
        return new Hc(C3823mda.NOT_OFFLINE, Collections.emptyList(), z);
    }
}
