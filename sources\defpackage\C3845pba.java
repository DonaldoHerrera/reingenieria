package defpackage;

import java.util.Set;

/* renamed from: pba reason: default package and case insensitive filesystem */
/* compiled from: FollowingCleanupHelper.kt */
public final class C3845pba extends Xda {
    private final String a = "Followings";
    private final Cba b;

    public C3845pba(Cba cba) {
        C7471uYa.b(cba, "followingStorage");
        this.b = cba;
    }

    public Set<C3508cda> a() {
        return this.b.g();
    }

    public String getKey() {
        return this.a;
    }
}
