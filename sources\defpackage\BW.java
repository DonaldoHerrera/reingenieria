package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: BW reason: default package */
/* compiled from: UserStorageReader.kt */
public class BW implements C4610mga<C3508cda, C3784hea> {
    private final C1472lW a;

    public BW(C1472lW lWVar) {
        C7471uYa.b(lWVar, "userStorage");
        this.a = lWVar;
    }

    public C1472lW a() {
        return this.a;
    }

    public APa<List<C3784hea>> a(Set<C3508cda> set) {
        C7471uYa.b(set, "keys");
        APa<List<C3784hea>> h = a().a(C7676xWa.q(set)).h(AW.a);
        C7471uYa.a((Object) h, "userStorage.loadUserMap(…ap { it.values.toList() }");
        return h;
    }
}
