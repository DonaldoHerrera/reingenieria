package defpackage;

import java.io.IOException;

/* renamed from: ny reason: default package and case insensitive filesystem */
public class C1559ny<T> extends C1827wv<T> {
    private final Object l;

    protected C1559ny(C1497ly lyVar, String str, String str2, Object obj, Class<T> cls) {
        C1616pt ptVar;
        String str3 = null;
        if (obj == null) {
            ptVar = null;
        } else {
            C1616pt ptVar2 = new C1616pt(lyVar.d(), obj);
            if (!((C1705st) lyVar.c()).a().isEmpty()) {
                str3 = "data";
            }
            ptVar2.a(str3);
            ptVar = ptVar2;
        }
        super(lyVar, str, str2, ptVar, cls);
        this.l = obj;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IOException a(C0279Xs xs) {
        return Wu.a(((C1497ly) k()).d(), xs);
    }

    public /* synthetic */ C1827wv c(String str, Object obj) {
        return (C1559ny) a(str, obj);
    }

    /* renamed from: d */
    public C1559ny<T> a(String str, Object obj) {
        return (C1559ny) super.a(str, obj);
    }

    /* renamed from: o */
    public C1497ly k() {
        return (C1497ly) super.k();
    }
}
