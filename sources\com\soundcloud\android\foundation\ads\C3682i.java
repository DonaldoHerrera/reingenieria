package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.soundcloud.android.foundation.ads.i reason: case insensitive filesystem */
/* compiled from: ApiAdProgressTracking.kt */
public final class C3682i {
    private final long a;
    private final List<Y> b;

    @JsonCreator
    public C3682i(@JsonProperty("offset_in_ms") long j, @JsonProperty("urls") List<Y> list) {
        C7471uYa.b(list, "urls");
        this.a = j;
        this.b = list;
    }

    @JsonProperty("offset_in_ms")
    public final long a() {
        return this.a;
    }

    @JsonProperty("urls")
    public final List<Y> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3682i) {
                C3682i iVar = (C3682i) obj;
                if (!(this.a == iVar.a) || !C7471uYa.a((Object) this.b, (Object) iVar.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        List<Y> list = this.b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiAdProgressTracking(offset=");
        sb.append(this.a);
        sb.append(", urls=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
