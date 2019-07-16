package defpackage;

/* renamed from: Eva reason: default package and case insensitive filesystem */
/* compiled from: DatabaseSearchSuggestion */
public abstract class C4882Eva extends C7159pwa {

    /* renamed from: Eva$a */
    /* compiled from: DatabaseSearchSuggestion */
    public enum a {
        Like,
        Following,
        Post,
        LikeByUsername
    }

    public static C4882Eva a(C3508cda cda, String str, C4928GKa<String> gKa, boolean z, a aVar) {
        C7571vva vva = new C7571vva(cda, str, C4928GKa.a(), false, gKa, z, aVar);
        return vva;
    }

    public abstract a g();
}
