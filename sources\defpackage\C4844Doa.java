package defpackage;

/* renamed from: Doa reason: default package and case insensitive filesystem */
/* compiled from: AddToPlaylistPresenter.kt */
public final class C4844Doa {
    private final long a;
    private final long b;

    public C4844Doa(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4844Doa) {
                C4844Doa doa = (C4844Doa) obj;
                if (this.a == doa.a) {
                    if (this.b == doa.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AddToPlaylistClickData(playlistId=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
