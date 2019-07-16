package defpackage;

import com.soundcloud.android.sync.T;
import java.util.concurrent.Callable;

/* renamed from: asa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistPostOperations */
class C5600asa {
    private final C4942Gta a;
    private final HPa b;
    private final T c;
    private final C5327TLa d;
    private final C5128Msa e;

    C5600asa(C4942Gta gta, HPa hPa, T t, C5327TLa tLa, C5128Msa msa) {
        this.a = gta;
        this.b = hPa;
        this.c = t;
        this.d = tLa;
        this.e = msa;
    }

    private IPa<RVa> b(C3508cda cda) {
        return this.e.c(cda).e(C7764yoa.a);
    }

    private IPa<RVa> c(C3508cda cda) {
        return this.a.b(cda).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C7626woa<Object,Object>(this));
    }

    /* access modifiers changed from: 0000 */
    public IPa<RVa> a(C3508cda cda) {
        return (cda.g() ? b(cda) : c(cda)).c(this.d.a(C3876taa.o, C3490aba.b(cda))).b(this.b);
    }

    public /* synthetic */ MPa a(C6431fLa fla) throws Exception {
        return this.c.a().b((Callable<? extends T>) C7695xoa.a);
    }
}
