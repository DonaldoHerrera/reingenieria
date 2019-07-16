package defpackage;

import java.util.List;

/* renamed from: WW reason: default package */
/* compiled from: VaultUserRepository.kt */
public class WW implements C3792iea {
    private final KW a;
    private final C1472lW b;

    public WW(KW kw, C1472lW lWVar) {
        C7471uYa.b(kw, "usersVault");
        C7471uYa.b(lWVar, "userStorage");
        this.a = kw;
        this.b = lWVar;
    }

    public C7531vPa<C3784hea> a(C3508cda cda) {
        C7471uYa.b(cda, "userUrn");
        C7531vPa f = this.a.c(RWa.a(cda)).f().f(new SW(this));
        C7471uYa.a((Object) f, "usersVault.local(setOf(u…map { it.unwrapResult() }");
        return a(f);
    }

    public C7531vPa<C3784hea> b(C3508cda cda) {
        C7471uYa.b(cda, "userUrn");
        C7531vPa f = this.a.a(RWa.a(cda)).f().f(new VW(this));
        C7471uYa.a((Object) f, "usersVault.syncedIfMissi…map { it.unwrapResult() }");
        return a(f);
    }

    private C7531vPa<C3784hea> a(C7531vPa<List<C3784hea>> vpa) {
        C7531vPa<C3784hea> a2 = vpa.a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) OW.a);
        C7471uYa.a((Object) a2, "flatMap {\n            if…)\n            }\n        }");
        return a2;
    }

    public APa<List<C3784hea>> a(List<C3508cda> list) {
        C7471uYa.b(list, "userUrns");
        APa<List<C3784hea>> h = this.a.a(C7676xWa.t(list)).h(new PW(this));
        C7471uYa.a((Object) h, "usersVault.syncedIfMissi…map { it.unwrapResult() }");
        return h;
    }

    public List<C3784hea> a(Wfa<C3508cda, List<C3784hea>> wfa) {
        C7471uYa.b(wfa, "$this$unwrapResult");
        if (wfa instanceof Yfa) {
            return (List) ((Yfa) wfa).a();
        }
        if (wfa instanceof Vfa) {
            return (List) ((Vfa) wfa).a();
        }
        if (wfa instanceof Rfa) {
            throw ((Rfa) wfa).a().getCause();
        }
        throw new FVa();
    }

    public IPa<Boolean> a(C3508cda cda, long j) {
        C7471uYa.b(cda, "urn");
        IPa<Boolean> e = this.b.a(cda, j).e(UW.a);
        C7471uYa.a((Object) e, "userStorage.updateFollow…unt).map { it.success() }");
        return e;
    }
}
