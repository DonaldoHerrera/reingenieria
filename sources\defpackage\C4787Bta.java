package defpackage;

import java.util.Date;

/* renamed from: Bta reason: default package and case insensitive filesystem */
/* compiled from: PostsStorage.kt */
final class C4787Bta<T> implements C6295dLa<C7843zta> {
    public static final C4787Bta a = new C4787Bta();

    C4787Bta() {
    }

    public final C7843zta a(C5326TKa tKa) {
        C3508cda c = C3508cda.c(tKa.c(d.f));
        C7471uYa.a((Object) c, "Urn.forPlaylist(cursorRe…(Tables.Posts.TARGET_ID))");
        Date a2 = tKa.a(d.g);
        C7471uYa.a((Object) a2, "cursorReader.getDateFrom…(Tables.Posts.CREATED_AT)");
        return new C7843zta(c, a2);
    }
}
