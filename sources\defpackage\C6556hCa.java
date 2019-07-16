package defpackage;

import java.util.Date;
import java.util.List;

/* renamed from: hCa reason: default package and case insensitive filesystem */
/* compiled from: LoadLocalPostsCommand */
public class C6556hCa extends C1317gT<Object, List<C6760kCa>, C6556hCa> {
    private final C5500ZKa b;
    private final int c;

    /* renamed from: hCa$a */
    /* compiled from: LoadLocalPostsCommand */
    private static class a extends C4991ILa<C6760kCa> {
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        public C6760kCa a(C5326TKa tKa) {
            boolean equals = "repost".equals(tKa.d(d.d));
            C3508cda a2 = a(tKa.c(d.f));
            Date date = new Date(tKa.c(d.g));
            return equals ? C5688cCa.b(a2, date) : C5688cCa.a(a2, date);
        }

        private C3508cda a(long j) {
            return this.a ? C3508cda.c(j) : C3508cda.d(j);
        }
    }

    C6556hCa(C5500ZKa zKa, int i) {
        this.b = zKa;
        this.c = i;
    }

    public List<C6760kCa> call() throws Exception {
        boolean z = true;
        C5631bLa a2 = this.b.a(((C6975nLa) C6975nLa.a(d.c).a(d.f, d.g, d.d).a(d.e, (Object) Integer.valueOf(this.c))).a(d.g, b.DESC));
        if (this.c != 1) {
            z = false;
        }
        return a2.b(new a(z));
    }
}
