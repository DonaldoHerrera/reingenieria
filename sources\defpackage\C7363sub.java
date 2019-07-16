package defpackage;

import java.util.ArrayDeque;
import java.util.Set;

/* renamed from: sub reason: default package and case insensitive filesystem */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C7363sub {
    public static final C7363sub a = new C7363sub();

    private C7363sub() {
    }

    private final boolean b(C7570vub vub, Etb etb, Etb etb2) {
        boolean z = C7294rub.b(etb) || C7294rub.c(etb) || vub.a((C6405eub) etb);
        String str = "Not singleClassifierType superType: ";
        if (!TVa.a || z) {
            boolean z2 = C7294rub.c(etb2) || vub.a((C6405eub) etb2);
            if (TVa.a && !z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(etb2);
                throw new AssertionError(sb.toString());
            } else if (etb2.Aa() || Htb.c(etb) || a(vub, etb, (c) a.a)) {
                return true;
            } else {
                if (!Htb.c(etb2) && !a(vub, etb2, (c) d.a) && !C7294rub.a(etb)) {
                    return a(vub, etb, etb2.za());
                }
                return false;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(etb2);
            throw new AssertionError(sb2.toString());
        }
    }

    public final boolean a(C7570vub vub, Etb etb, Etb etb2) {
        C7471uYa.b(vub, "context");
        C7471uYa.b(etb, "subType");
        C7471uYa.b(etb2, "superType");
        return b(vub, etb, etb2);
    }

    public final boolean a(C6405eub eub) {
        C7471uYa.b(eub, C1325gg.TYPE);
        return a(new C7570vub(false, false, 2, null), C7430ttb.c(eub), (c) a.a);
    }

    private final boolean a(C7570vub vub, Etb etb, c cVar) {
        Etb etb2 = etb;
        if ((C7294rub.a(etb) && !etb.Aa()) || Htb.c(etb)) {
            return true;
        }
        vub.d();
        ArrayDeque c = vub.c;
        if (c != null) {
            Set d = vub.d;
            if (d != null) {
                c.push(etb2);
                while (!c.isEmpty()) {
                    if (d.size() <= 1000) {
                        Etb etb3 = (Etb) c.pop();
                        C7471uYa.a((Object) etb3, "current");
                        if (d.add(etb3)) {
                            c cVar2 = etb3.Aa() ? C0185c.a : cVar;
                            if (!(!C7471uYa.a((Object) cVar2, (Object) C0185c.a))) {
                                cVar2 = null;
                            }
                            if (cVar2 != null) {
                                for (C7706xtb xtb : etb3.za().b()) {
                                    C7471uYa.a((Object) xtb, "supertype");
                                    Etb a2 = cVar2.a(xtb);
                                    if ((C7294rub.a(a2) && !a2.Aa()) || Htb.c(a2)) {
                                        vub.c();
                                        return true;
                                    }
                                    c.add(a2);
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(etb2);
                        sb.append(". Supertypes = ");
                        sb.append(C7676xWa.a(d, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                vub.c();
                return false;
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.a();
        throw null;
    }

    private final boolean a(C7570vub vub, Etb etb, Ptb ptb) {
        Etb etb2 = etb;
        Ptb ptb2 = ptb;
        if (!etb.Aa() && C7471uYa.a((Object) etb.za(), (Object) ptb2)) {
            return true;
        }
        vub.d();
        ArrayDeque c = vub.c;
        if (c != null) {
            Set d = vub.d;
            if (d != null) {
                c.push(etb2);
                while (!c.isEmpty()) {
                    if (d.size() <= 1000) {
                        Etb etb3 = (Etb) c.pop();
                        C7471uYa.a((Object) etb3, "current");
                        if (d.add(etb3)) {
                            c cVar = etb3.Aa() ? C0185c.a : a.a;
                            if (!(!C7471uYa.a((Object) cVar, (Object) C0185c.a))) {
                                cVar = null;
                            }
                            if (cVar != null) {
                                for (C7706xtb xtb : etb3.za().b()) {
                                    C7471uYa.a((Object) xtb, "supertype");
                                    Etb a2 = cVar.a(xtb);
                                    if (!a2.Aa() && C7471uYa.a((Object) a2.za(), (Object) ptb2)) {
                                        vub.c();
                                        return true;
                                    }
                                    c.add(a2);
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(etb2);
                        sb.append(". Supertypes = ");
                        sb.append(C7676xWa.a(d, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                vub.c();
                return false;
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.a();
        throw null;
    }
}
