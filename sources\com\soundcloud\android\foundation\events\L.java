package com.soundcloud.android.foundation.events;

/* compiled from: UIEvent.kt */
public final class L {
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    public static final K b(K k, C3710l lVar) {
        String str;
        C3508cda l;
        C3508cda cda;
        C3508cda h;
        C3508cda cda2;
        Integer g;
        Integer num;
        C3508cda f = lVar.f();
        String e = lVar.e();
        C3704f b = lVar.b();
        p c = lVar.c();
        String a = c != null ? c.a() : null;
        v d = lVar.d();
        Boolean valueOf = Boolean.valueOf(lVar.o());
        Integer j = lVar.j();
        String n = lVar.n();
        C3508cda k2 = lVar.k();
        String i = lVar.i();
        if (i == null) {
            I m = lVar.m();
            if (m != null) {
                i = m.j();
            } else {
                str = null;
                l = lVar.l();
                if (l == null) {
                    I m2 = lVar.m();
                    if (m2 != null) {
                        l = m2.a();
                    } else {
                        cda = null;
                        h = lVar.h();
                        if (h == null) {
                            I m3 = lVar.m();
                            if (m3 != null) {
                                H l2 = m3.l();
                                if (l2 != null) {
                                    h = l2.a();
                                }
                            }
                            h = null;
                        }
                        if (h == null) {
                            I m4 = lVar.m();
                            if (m4 != null) {
                                B g2 = m4.g();
                                if (g2 != null) {
                                    h = g2.b();
                                }
                            }
                            cda2 = null;
                            g = lVar.g();
                            if (g == null) {
                                I m5 = lVar.m();
                                if (m5 != null) {
                                    B g3 = m5.g();
                                    if (g3 != null) {
                                        g = Integer.valueOf(g3.a());
                                    }
                                }
                                num = null;
                                return K.a(k, null, valueOf, null, null, null, null, null, null, f, e, b, d, a, null, null, str, cda, k2, j, n, cda2, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4169475, 255, null);
                            }
                            num = g;
                            return K.a(k, null, valueOf, null, null, null, null, null, null, f, e, b, d, a, null, null, str, cda, k2, j, n, cda2, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4169475, 255, null);
                        }
                        cda2 = h;
                        g = lVar.g();
                        if (g == null) {
                        }
                        num = g;
                        return K.a(k, null, valueOf, null, null, null, null, null, null, f, e, b, d, a, null, null, str, cda, k2, j, n, cda2, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4169475, 255, null);
                    }
                }
                cda = l;
                h = lVar.h();
                if (h == null) {
                }
                if (h == null) {
                }
                cda2 = h;
                g = lVar.g();
                if (g == null) {
                }
                num = g;
                return K.a(k, null, valueOf, null, null, null, null, null, null, f, e, b, d, a, null, null, str, cda, k2, j, n, cda2, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4169475, 255, null);
            }
        }
        str = i;
        l = lVar.l();
        if (l == null) {
        }
        cda = l;
        h = lVar.h();
        if (h == null) {
        }
        if (h == null) {
        }
        cda2 = h;
        g = lVar.g();
        if (g == null) {
        }
        num = g;
        return K.a(k, null, valueOf, null, null, null, null, null, null, f, e, b, d, a, null, null, str, cda, k2, j, n, cda2, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4169475, 255, null);
    }

    /* access modifiers changed from: private */
    public static final K b(K k, C3708j jVar) {
        return K.a(k, null, null, null, jVar.b(), jVar.c(), jVar.d(), jVar.f(), jVar.e().a(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -249, 255, null);
    }

    /* access modifiers changed from: private */
    public static final K b(K k, PromotedSourceInfo promotedSourceInfo) {
        C3508cda cda = null;
        String a = promotedSourceInfo != null ? promotedSourceInfo.a() : null;
        String str = promotedSourceInfo != null ? "promoted" : null;
        if (promotedSourceInfo != null) {
            cda = promotedSourceInfo.c();
        }
        return K.a(k, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a, str, null, cda, null, null, null, null, null, null, null, null, null, null, null, -369098753, 255, null);
    }
}
