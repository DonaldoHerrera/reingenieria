package com.soundcloud.android.profile;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/profile/UserDetailAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/profile/UserDetailItem;", "userFollowsRenderer", "Lcom/soundcloud/android/profile/UserFollowRenderer;", "userBioRenderer", "Lcom/soundcloud/android/profile/UserBioRenderer;", "userLinksRenderer", "Lcom/soundcloud/android/profile/UserLinksRenderer;", "userLoadingRenderer", "Lcom/soundcloud/android/profile/UserLoadingRenderer;", "(Lcom/soundcloud/android/profile/UserFollowRenderer;Lcom/soundcloud/android/profile/UserBioRenderer;Lcom/soundcloud/android/profile/UserLinksRenderer;Lcom/soundcloud/android/profile/UserLoadingRenderer;)V", "getBasicItemViewType", "", "position", "Factory", "Kind", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.profile.gb reason: case insensitive filesystem */
/* compiled from: UserDetailAdapter.kt */
public final class C5787gb extends C5407WEa<C5797ib> {

    /* renamed from: com.soundcloud.android.profile.gb$a */
    /* compiled from: UserDetailAdapter.kt */
    public static final class a {
        private final com.soundcloud.android.profile.Nb.a a;
        private final com.soundcloud.android.profile.C5856ub.a b;
        private final C5777eb c;
        private final C5793hc d;

        public a(com.soundcloud.android.profile.Nb.a aVar, com.soundcloud.android.profile.C5856ub.a aVar2, C5777eb ebVar, C5793hc hcVar) {
            C7471uYa.b(aVar, "userLinksRendererFactory");
            C7471uYa.b(aVar2, "userFollowsRendererFactory");
            C7471uYa.b(ebVar, "userBioRenderer");
            C7471uYa.b(hcVar, "userLoadingRenderer");
            this.a = aVar;
            this.b = aVar2;
            this.c = ebVar;
            this.d = hcVar;
        }

        public final C5787gb a(C6781kVa<Gb> kva, C6781kVa<Gb> kva2, C6781kVa<String> kva3) {
            C7471uYa.b(kva, "followersClickListener");
            C7471uYa.b(kva2, "followingsClickListener");
            C7471uYa.b(kva3, "linkClickListener");
            return new C5787gb(this.b.a(kva, kva2), this.c, this.a.a(kva3), this.d);
        }
    }

    /* renamed from: com.soundcloud.android.profile.gb$b */
    /* compiled from: UserDetailAdapter.kt */
    public enum b {
        BIO,
        FOLLOWS,
        LINKS,
        LOADING
    }

    public C5787gb(C5856ub ubVar, C5777eb ebVar, Nb nb, C5793hc hcVar) {
        C7471uYa.b(ubVar, "userFollowsRenderer");
        C7471uYa.b(ebVar, "userBioRenderer");
        C7471uYa.b(nb, "userLinksRenderer");
        C7471uYa.b(hcVar, "userLoadingRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(b.BIO.ordinal(), ebVar), new C5693cFa(b.FOLLOWS.ordinal(), ubVar), new C5693cFa(b.LINKS.ordinal(), nb), new C5693cFa(b.LOADING.ordinal(), hcVar)});
    }

    public int f(int i) {
        C5797ib ibVar = (C5797ib) g(i);
        if (ibVar instanceof C5772db) {
            return b.BIO.ordinal();
        }
        if (ibVar instanceof Gb) {
            return b.FOLLOWS.ordinal();
        }
        if (ibVar instanceof Mb) {
            return b.LINKS.ordinal();
        }
        if (ibVar instanceof C5788gc) {
            return b.LOADING.ordinal();
        }
        throw new FVa();
    }
}
