package defpackage;

import java.util.List;

/* renamed from: KS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations.kt */
final class C2135KS<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C1938AS a;
    final /* synthetic */ C3871sda b;

    C2135KS(C1938AS as, C3871sda sda) {
        this.a = as;
        this.b = sda;
    }

    /* renamed from: a */
    public final APa<List<C3863rda>> apply(Boolean bool) {
        C7471uYa.b(bool, "hasSynced");
        if (bool.booleanValue()) {
            return this.a.c(this.b);
        }
        return this.a.b(this.b);
    }
}
