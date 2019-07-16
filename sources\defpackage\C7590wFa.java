package defpackage;

/* renamed from: wFa reason: default package and case insensitive filesystem */
/* compiled from: DefaultUserRepository.kt */
final class C7590wFa<T> implements C6776kQa<T> {
    final /* synthetic */ C2074HO a;
    final /* synthetic */ String b;

    C7590wFa(C2074HO ho, String str) {
        this.a = ho;
        this.b = str;
    }

    public final void accept(T t) {
        C2074HO ho = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("_hit");
        ho.a(sb.toString(), 1);
    }
}
