package defpackage;

/* renamed from: vP reason: default package and case insensitive filesystem */
/* compiled from: ApiPlaylistLike */
public class C3318vP implements Sca, Ada {
    private final C3927zda a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3318vP)) {
            return false;
        }
        return this.a.equals(((C3318vP) obj).a);
    }

    public C3927zda f() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
