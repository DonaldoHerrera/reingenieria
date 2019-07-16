package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: Gab reason: default package and case insensitive filesystem */
/* compiled from: KPropertyImpl.kt */
public final class C4933Gab {
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0127  */
    public static final C6992nbb<?> b(a<?, ?> aVar, boolean z) {
        C6992nbb nbb;
        e eVar;
        C6992nbb<?> nbb2;
        Method method;
        c cVar;
        Method b;
        if (N_a.c.a().b(aVar.e().o())) {
            return C7406tbb.a;
        }
        C4840Dab dab = new C4840Dab(aVar);
        C4902Fab fab = new C4902Fab(aVar, z, new C4871Eab(aVar), dab);
        C5714c_a a = C5504Zab.b.a(aVar.e().i());
        if (a instanceof c) {
            c cVar2 = (c) a;
            e e = cVar2.e();
            if (z) {
                if (e.o()) {
                    cVar = e.k();
                    b = cVar != null ? aVar.e().g().b(cVar2.c().getString(cVar.k()), cVar2.c().getString(cVar.j())) : null;
                    if (b == null) {
                        if (!C6667ipb.a((C5123Mdb) aVar.e().i()) || !C7471uYa.a((Object) aVar.e().i().d(), (Object) _db.d)) {
                            Field n = aVar.e().n();
                            if (n != null) {
                                nbb = fab.invoke(n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("No accessors or field is found for property ");
                                sb.append(aVar.e());
                                throw new C5240Qab(sb.toString());
                            }
                        } else {
                            Class a2 = C7268rbb.a(aVar.e().i().e());
                            if (a2 != null) {
                                Method b2 = C7268rbb.b(a2, aVar.e().i());
                                if (b2 != null) {
                                    if (aVar.k()) {
                                        nbb = new a(b2, a(aVar));
                                    } else {
                                        nbb = new b(b2);
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Underlying property of inline class ");
                            sb2.append(aVar.e());
                            sb2.append(" should have a field");
                            throw new C5240Qab(sb2.toString());
                        }
                    } else if (!Modifier.isStatic(b.getModifiers())) {
                        if (aVar.k()) {
                            nbb = new a(b, a(aVar));
                        } else {
                            nbb = new d(b);
                        }
                    } else if (dab.d()) {
                        if (aVar.k()) {
                            nbb = new b(b);
                        } else {
                            nbb = new e(b);
                        }
                    } else if (aVar.k()) {
                        nbb = new c(b, a(aVar));
                    } else {
                        nbb = new f(b);
                    }
                }
            } else if (e.p()) {
                cVar = e.l();
                if (cVar != null) {
                }
                if (b == null) {
                }
            }
            cVar = null;
            if (cVar != null) {
            }
            if (b == null) {
            }
        } else if (a instanceof a) {
            nbb = fab.invoke(((a) a).b());
        } else if (a instanceof b) {
            if (z) {
                method = ((b) a).b();
            } else {
                b bVar = (b) a;
                method = bVar.c();
                if (method == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No source found for setter of Java method property: ");
                    sb3.append(bVar.b());
                    throw new C5240Qab(sb3.toString());
                }
            }
            if (aVar.k()) {
                nbb = new a(method, a(aVar));
            } else {
                nbb = new d(method);
            }
        } else if (a instanceof d) {
            if (z) {
                eVar = ((d) a).b();
            } else {
                eVar = ((d) a).c();
                if (eVar == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("No setter found for property ");
                    sb4.append(aVar.e());
                    throw new C5240Qab(sb4.toString());
                }
            }
            Method b3 = aVar.e().g().b(eVar.c(), eVar.b());
            if (b3 != null) {
                boolean z2 = !Modifier.isStatic(b3.getModifiers());
                if (!TVa.a || z2) {
                    if (aVar.k()) {
                        nbb2 = new a<>(b3, a(aVar));
                    } else {
                        nbb2 = new d<>(b3);
                    }
                    return nbb2;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Mapped property cannot have a static accessor: ");
                sb5.append(aVar.e());
                throw new AssertionError(sb5.toString());
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No accessor found for property ");
            sb6.append(aVar.e());
            throw new C5240Qab(sb6.toString());
        } else {
            throw new FVa();
        }
        return C7268rbb.a(nbb, aVar.i(), false, 2, null);
    }

    public static final Object a(a<?, ?> aVar) {
        C7471uYa.b(aVar, "$this$boundReceiver");
        return aVar.e().m();
    }

    /* access modifiers changed from: private */
    public static final boolean b(C7408tdb tdb) {
        C5272Rcb e = tdb.e();
        C7471uYa.a((Object) e, "containingDeclaration");
        if (!C6531gpb.k(e)) {
            return false;
        }
        C5272Rcb e2 = e.e();
        boolean z = true;
        if ((C6531gpb.o(e2) || C6531gpb.g(e2)) && (!(tdb instanceof C7842zsb) || !C6936mnb.a(((C7842zsb) tdb).ma()))) {
            z = false;
        }
        return z;
    }
}
