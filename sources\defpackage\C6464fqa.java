package defpackage;

import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: fqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsFeatureModel.kt */
public final class C6464fqa {
    private final C3863rda a;
    private final List<C6185ma> b;
    private final boolean c;
    private final List<C3863rda> d;
    private final C6973nJa e;

    public C6464fqa(C3863rda rda, List<? extends C6185ma> list, boolean z, List<? extends C3863rda> list2, C6973nJa nja) {
        C7471uYa.b(rda, "playlist");
        this.a = rda;
        this.b = list;
        this.c = z;
        this.d = list2;
        this.e = nja;
    }

    public final C6973nJa a() {
        return this.e;
    }

    public final List<C3863rda> b() {
        return this.d;
    }

    public final C3863rda c() {
        return this.a;
    }

    public final List<C6185ma> d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6464fqa) {
                C6464fqa fqa = (C6464fqa) obj;
                if (C7471uYa.a((Object) this.a, (Object) fqa.a) && C7471uYa.a((Object) this.b, (Object) fqa.b)) {
                    if (!(this.c == fqa.c) || !C7471uYa.a((Object) this.d, (Object) fqa.d) || !C7471uYa.a((Object) this.e, (Object) fqa.e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3863rda rda = this.a;
        int i = 0;
        int hashCode = (rda != null ? rda.hashCode() : 0) * 31;
        List<C6185ma> list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        List<C3863rda> list2 = this.d;
        int hashCode3 = (i2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        C6973nJa nja = this.e;
        if (nja != null) {
            i = nja.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistDetailsFeatureModel(playlist=");
        sb.append(this.a);
        sb.append(", tracks=");
        sb.append(this.b);
        sb.append(", isLoggedInUserOwner=");
        sb.append(this.c);
        sb.append(", otherPlaylistsByCreator=");
        sb.append(this.d);
        sb.append(", error=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6464fqa(C3863rda rda, List list, boolean z, List list2, C6973nJa nja, int i, C7264rYa rya) {
        this(rda, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : nja);
    }
}
