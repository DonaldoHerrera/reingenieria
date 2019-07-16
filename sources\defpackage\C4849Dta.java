package defpackage;

import java.util.Date;

/* renamed from: Dta reason: default package and case insensitive filesystem */
/* compiled from: PostsStorage.kt */
final class C4849Dta<T> implements C6295dLa<C7843zta> {
    public static final C4849Dta a = new C4849Dta();

    C4849Dta() {
    }

    public final C7843zta a(C5326TKa tKa) {
        C3508cda d = C3508cda.d(tKa.c(d.f));
        C7471uYa.a((Object) d, "Urn.forTrack(it.getLong(Tables.Posts.TARGET_ID))");
        Date a2 = tKa.a(d.g);
        C7471uYa.a((Object) a2, "it.getDateFromTimestamp(Tables.Posts.CREATED_AT)");
        return new C7843zta(d, a2);
    }
}
