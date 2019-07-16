package defpackage;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* renamed from: bi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C0493bi implements Callable<Boolean> {
    final /* synthetic */ Ii a;
    final /* synthetic */ C1874yi b;

    C0493bi(C1874yi yiVar, Ii ii) {
        this.b = yiVar;
        this.a = ii;
    }

    public Boolean call() throws Exception {
        TreeSet<File> treeSet = this.a.a;
        String c = this.b.p();
        if (c != null && !treeSet.isEmpty()) {
            File file = (File) treeSet.first();
            if (file != null) {
                C1874yi yiVar = this.b;
                yiVar.a(yiVar.j.e(), file, c);
            }
        }
        this.b.a((Set<File>) treeSet);
        return Boolean.TRUE;
    }
}
