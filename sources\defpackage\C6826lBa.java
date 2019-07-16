package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: lBa reason: default package and case insensitive filesystem */
/* compiled from: DirtyPlaylistsCleanupHelper.kt */
public final class C6826lBa extends Xda {
    private final String a = "DirtyPlaylists";
    private final C5363Upa b;
    private final C7031oBa c;

    public C6826lBa(C5363Upa upa, C7031oBa oba) {
        C7471uYa.b(upa, "loadPlaylistPendingRemovalCommand");
        C7471uYa.b(oba, "loadLocalPlaylistsCommand");
        this.b = upa;
        this.c = oba;
    }

    public Set<C3508cda> b() {
        Object a2 = this.b.a();
        C7471uYa.a(a2, "loadPlaylistPendingRemovalCommand.call()");
        Set<C3508cda> s = C7676xWa.s((Iterable) a2);
        List<C7376tBa> call = this.c.call();
        C7471uYa.a((Object) call, "loadLocalPlaylistsCommand.call()");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) call, 10));
        for (C7376tBa c2 : call) {
            arrayList.add(c2.c());
        }
        s.addAll(arrayList);
        return s;
    }

    public String getKey() {
        return this.a;
    }
}
