package defpackage;

/* renamed from: WU reason: default package and case insensitive filesystem */
/* compiled from: FeatureStorage */
class C2362WU implements C7118pQa<String, Boolean> {
    final /* synthetic */ C2380XU a;

    C2362WU(C2380XU xu) {
        this.a = xu;
    }

    /* renamed from: a */
    public Boolean apply(String str) {
        return Boolean.valueOf(this.a.a.getBoolean(str, false));
    }
}
