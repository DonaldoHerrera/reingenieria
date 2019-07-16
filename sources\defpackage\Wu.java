package defpackage;

import java.io.IOException;
import java.util.Collections;

/* renamed from: Wu reason: default package */
public final class Wu extends C0292_s {
    private final transient Vt e;

    private Wu(C0288Zs zs, Vt vt) {
        super(zs);
        this.e = vt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[SYNTHETIC, Splitter:B:30:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[Catch:{ IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009a A[SYNTHETIC, Splitter:B:47:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e A[Catch:{ IOException -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[Catch:{ IOException -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af A[Catch:{ IOException -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    public static Wu a(C1646qt qtVar, C0279Xs xs) {
        String str;
        C1795vt vtVar;
        Vt vt;
        C0288Zs zs = new C0288Zs(xs.d(), xs.e(), xs.i());
        Pu.a(qtVar);
        Vt vt2 = null;
        try {
            if (xs.g() || !C1890yy.a("application/json; charset=UTF-8", xs.c()) || xs.b() == null) {
                str = xs.h();
                StringBuilder a = C0292_s.a(xs);
                if (!Uu.a(str)) {
                    a.append(C1339gu.a);
                    a.append(str);
                    zs.b(str);
                }
                zs.a(a.toString());
                return new Wu(zs, vt2);
            }
            try {
                vtVar = qtVar.a(xs.b());
                try {
                    Bt f = vtVar.f();
                    if (f == null) {
                        f = vtVar.e();
                    }
                    if (f != null) {
                        vtVar.a(Collections.singleton("error"));
                        if (vtVar.f() == Bt.VALUE_STRING) {
                            str = vtVar.c();
                        } else if (vtVar.f() == Bt.START_OBJECT) {
                            Vt vt3 = (Vt) vtVar.a(Vt.class, null);
                            try {
                                Vt vt4 = vt3;
                                str = vt3.l();
                                vt2 = vt4;
                            } catch (IOException e2) {
                                Throwable th = e2;
                                vt = vt3;
                                e = th;
                                try {
                                    Xu.a(e);
                                    if (vtVar == null) {
                                        try {
                                            xs.f();
                                        } catch (IOException e3) {
                                            e = e3;
                                            str = null;
                                            vt2 = vt;
                                            Xu.a(e);
                                            StringBuilder a2 = C0292_s.a(xs);
                                            if (!Uu.a(str)) {
                                            }
                                            zs.a(a2.toString());
                                            return new Wu(zs, vt2);
                                        }
                                    } else if (vt == null) {
                                        vtVar.a();
                                    }
                                    str = null;
                                    vt2 = vt;
                                    StringBuilder a22 = C0292_s.a(xs);
                                    if (!Uu.a(str)) {
                                    }
                                    zs.a(a22.toString());
                                    return new Wu(zs, vt2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (vtVar != null) {
                                        xs.f();
                                    } else if (vt == null) {
                                        vtVar.a();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                Throwable th4 = th3;
                                vt = vt3;
                                th = th4;
                                if (vtVar != null) {
                                }
                                throw th;
                            }
                        }
                        if (vtVar != null) {
                            try {
                                xs.f();
                            } catch (IOException e4) {
                                e = e4;
                                Xu.a(e);
                                StringBuilder a222 = C0292_s.a(xs);
                                if (!Uu.a(str)) {
                                }
                                zs.a(a222.toString());
                                return new Wu(zs, vt2);
                            }
                        } else if (vt2 == null) {
                            vtVar.a();
                        }
                        StringBuilder a2222 = C0292_s.a(xs);
                        if (!Uu.a(str)) {
                        }
                        zs.a(a2222.toString());
                        return new Wu(zs, vt2);
                    }
                    str = null;
                    if (vtVar != null) {
                    }
                } catch (IOException e5) {
                    e = e5;
                    vt = null;
                    Xu.a(e);
                    if (vtVar == null) {
                    }
                    str = null;
                    vt2 = vt;
                    StringBuilder a22222 = C0292_s.a(xs);
                    if (!Uu.a(str)) {
                    }
                    zs.a(a22222.toString());
                    return new Wu(zs, vt2);
                } catch (Throwable th5) {
                    th = th5;
                    vt = null;
                    if (vtVar != null) {
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                vtVar = null;
                vt = null;
                Xu.a(e);
                if (vtVar == null) {
                }
                str = null;
                vt2 = vt;
                StringBuilder a222222 = C0292_s.a(xs);
                if (!Uu.a(str)) {
                }
                zs.a(a222222.toString());
                return new Wu(zs, vt2);
            } catch (Throwable th6) {
                th = th6;
                vtVar = null;
                vt = null;
                if (vtVar != null) {
                }
                throw th;
            }
            StringBuilder a2222222 = C0292_s.a(xs);
            if (!Uu.a(str)) {
            }
            zs.a(a2222222.toString());
            return new Wu(zs, vt2);
        } catch (IOException e7) {
            e = e7;
            str = null;
            Xu.a(e);
            StringBuilder a22222222 = C0292_s.a(xs);
            if (!Uu.a(str)) {
            }
            zs.a(a22222222.toString());
            return new Wu(zs, vt2);
        }
    }
}
