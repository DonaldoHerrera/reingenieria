package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: eh reason: default package and case insensitive filesystem */
/* compiled from: AnswersRetryFilesSender */
class C1264eh implements C7323sOa {
    private final C1843xh a;
    private final C1723th b;

    C1264eh(C1843xh xhVar, C1723th thVar) {
        this.a = xhVar;
        this.b = thVar;
    }

    public static C1264eh a(C1843xh xhVar) {
        return new C1264eh(xhVar, new C1723th(new C6842lOa(new C1693sh(new C6706jOa(1000, 8), 0.1d), new C6638iOa(5))));
    }

    public boolean a(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.b.a(nanoTime)) {
            if (this.a.a(list)) {
                this.b.a();
                return true;
            }
            this.b.b(nanoTime);
        }
        return false;
    }
}
