package defpackage;

import java.util.Map;

/* renamed from: Yxa reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_StorageCleanupEvent */
abstract class C5487Yxa extends C7784yya {
    private final String a;
    private final long b;
    private final int c;
    private final int d;
    private final int e;
    private final Map<String, Integer> f;
    private final Map<String, Integer> g;
    private final Map<String, Integer> h;

    C5487Yxa(String str, long j, int i, int i2, int i3, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        if (str != null) {
            this.a = str;
            this.b = j;
            this.c = i;
            this.d = i2;
            this.e = i3;
            if (map != null) {
                this.f = map;
                if (map2 != null) {
                    this.g = map2;
                    if (map3 != null) {
                        this.h = map3;
                        return;
                    }
                    throw new NullPointerException("Null playlistsToKeep");
                }
                throw new NullPointerException("Null tracksToKeep");
            }
            throw new NullPointerException("Null usersToKeep");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7784yya)) {
            return false;
        }
        C7784yya yya = (C7784yya) obj;
        if (!this.a.equals(yya.f()) || this.b != yya.g() || this.c != yya.l() || this.d != yya.j() || this.e != yya.h() || !this.f.equals(yya.m()) || !this.g.equals(yya.k()) || !this.h.equals(yya.i())) {
            z = false;
        }
        return z;
    }

    @C3783hda
    public String f() {
        return this.a;
    }

    @C3783hda
    public long g() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public int h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public Map<String, Integer> i() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public int j() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public Map<String, Integer> k() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public int l() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public Map<String, Integer> m() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StorageCleanupEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", usersRemoved=");
        sb.append(this.c);
        sb.append(", tracksRemoved=");
        sb.append(this.d);
        sb.append(", playlistsRemoved=");
        sb.append(this.e);
        sb.append(", usersToKeep=");
        sb.append(this.f);
        sb.append(", tracksToKeep=");
        sb.append(this.g);
        sb.append(", playlistsToKeep=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
