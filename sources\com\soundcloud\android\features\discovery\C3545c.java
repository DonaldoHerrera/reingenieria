package com.soundcloud.android.features.discovery;

/* renamed from: com.soundcloud.android.features.discovery.c reason: case insensitive filesystem */
/* compiled from: DiscoveryFragment.kt */
final /* synthetic */ class C3545c extends C7402tYa implements C6308dYa<C3794jY, C3794jY, Boolean> {
    C3545c(DiscoveryFragment discoveryFragment) {
        super(2, discoveryFragment);
    }

    public final boolean a(C3794jY jYVar, C3794jY jYVar2) {
        C7471uYa.b(jYVar, "p1");
        C7471uYa.b(jYVar2, "p2");
        return ((DiscoveryFragment) this.c).a(jYVar, jYVar2);
    }

    public final String getName() {
        return "areItemsTheSame";
    }

    public final C7610wZa h() {
        return HYa.a(DiscoveryFragment.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((C3794jY) obj, (C3794jY) obj2));
    }

    public final String j() {
        return "areItemsTheSame(Lcom/soundcloud/android/discovery/DiscoveryCardViewModel;Lcom/soundcloud/android/discovery/DiscoveryCardViewModel;)Z";
    }
}
