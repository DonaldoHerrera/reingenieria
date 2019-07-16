package defpackage;

/* renamed from: CP reason: default package and case insensitive filesystem */
/* compiled from: ApiTrackLike */
public class C1975CP implements Sca {
    private final Yda a;

    public Yda a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1975CP)) {
            return false;
        }
        return this.a.equals(((C1975CP) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
