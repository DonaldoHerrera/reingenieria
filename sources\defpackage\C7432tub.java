package defpackage;

/* renamed from: tub reason: default package and case insensitive filesystem */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C7432tub {
    public static final C7432tub a = new C7432tub();

    private C7432tub() {
    }

    public final boolean a(C6405eub eub, C6405eub eub2) {
        C7471uYa.b(eub, "a");
        C7471uYa.b(eub2, "b");
        boolean z = true;
        if (eub == eub2) {
            return true;
        }
        if ((eub instanceof Etb) && (eub2 instanceof Etb)) {
            return a((Etb) eub, (Etb) eub2);
        }
        if (!(eub instanceof C7223qtb) || !(eub2 instanceof C7223qtb)) {
            return false;
        }
        C7223qtb qtb = (C7223qtb) eub;
        C7223qtb qtb2 = (C7223qtb) eub2;
        if (!a(qtb.Da(), qtb2.Da()) || !a(qtb.Ea(), qtb2.Ea())) {
            z = false;
        }
        return z;
    }

    public final boolean a(Etb etb, Etb etb2) {
        C7471uYa.b(etb, "a");
        C7471uYa.b(etb2, "b");
        if (etb.Aa() != etb2.Aa() || Htb.c(etb) != Htb.c(etb2) || (!C7471uYa.a((Object) etb.za(), (Object) etb2.za())) || etb.ya().size() != etb2.ya().size()) {
            return false;
        }
        if (etb.ya() == etb2.ya()) {
            return true;
        }
        int size = etb.ya().size();
        for (int i = 0; i < size; i++) {
            Stb stb = (Stb) etb.ya().get(i);
            Stb stb2 = (Stb) etb2.ya().get(i);
            if (stb.a() != stb2.a()) {
                return false;
            }
            if (!stb.a() && (stb.b() != stb2.b() || !a(stb.getType().Ba(), stb2.getType().Ba()))) {
                return false;
            }
        }
        return true;
    }
}
