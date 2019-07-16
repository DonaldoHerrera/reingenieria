package defpackage;

/* renamed from: _X reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_SystemPlaylistsTracks */
final class C3483_X extends h {
    private final C3508cda c;
    private final C3508cda d;
    private final long e;

    C3483_X(C3508cda cda, C3508cda cda2, long j) {
        if (cda != null) {
            this.c = cda;
            if (cda2 != null) {
                this.d = cda2;
                this.e = j;
                return;
            }
            throw new NullPointerException("Null track_urn");
        }
        throw new NullPointerException("Null system_playlist_urn");
    }

    public C3508cda a() {
        return this.c;
    }

    public C3508cda b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.c.equals(hVar.a()) || !this.d.equals(hVar.b()) || this.e != hVar.position()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j = this.e;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public long position() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylistsTracks{system_playlist_urn=");
        sb.append(this.c);
        sb.append(", track_urn=");
        sb.append(this.d);
        sb.append(", position=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
