package defpackage;

/* renamed from: Bva reason: default package and case insensitive filesystem */
/* compiled from: AutocompletionItemRenderer.kt */
final class C4789Bva<T> implements C7733yKa<a> {
    final /* synthetic */ a a;
    final /* synthetic */ int b;

    C4789Bva(a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    /* renamed from: a */
    public final void accept(a aVar) {
        String g = this.a.g();
        C7471uYa.a((Object) g, "autocompletionItem.userQuery()");
        String h = this.a.h();
        C7471uYa.a((Object) h, "autocompletionItem.apiQuery()");
        C4928GKa j = this.a.j();
        C7471uYa.a((Object) j, "autocompletionItem.queryUrn()");
        aVar.a(g, h, j, this.b);
    }
}
