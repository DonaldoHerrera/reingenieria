package com.soundcloud.android.offline;

/* compiled from: TrackingMetadata */
public class Ue {
    private final C3508cda a;
    private boolean b;
    private boolean c;

    public Ue(C3508cda cda, boolean z, boolean z2) {
        this.a = cda;
        this.b = z;
        this.c = z2;
    }

    public void a(Ue ue) {
        boolean z = false;
        this.b = this.b || ue.b;
        if (this.c || ue.c) {
            z = true;
        }
        this.c = z;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Ue.class != obj.getClass()) {
            return false;
        }
        Ue ue = (Ue) obj;
        if (!C4804CKa.a(Boolean.valueOf(this.b), Boolean.valueOf(ue.b)) || !C4804CKa.a(Boolean.valueOf(this.c), Boolean.valueOf(ue.c)) || !C4804CKa.a(this.a, ue.a)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C4804CKa.a(this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("creatorUrn", (Object) this.a).a("fromLikes", this.b).a("fromPlaylists", this.c).toString();
    }

    public C3508cda a() {
        return this.a;
    }
}
