package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Vp reason: default package */
/* compiled from: BaseDataSource */
public abstract class Vp implements Zp {
    private final boolean a;
    private final ArrayList<C1702sq> b = new ArrayList<>(1);
    private int c;
    private C0470aq d;

    protected Vp(boolean z) {
        this.a = z;
    }

    public /* synthetic */ Map<String, List<String>> a() {
        return Yp.a(this);
    }

    public final void a(C1702sq sqVar) {
        if (!this.b.contains(sqVar)) {
            this.b.add(sqVar);
            this.c++;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(C0470aq aqVar) {
        for (int i = 0; i < this.c; i++) {
            ((C1702sq) this.b.get(i)).c(this, aqVar, this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void c(C0470aq aqVar) {
        this.d = aqVar;
        for (int i = 0; i < this.c; i++) {
            ((C1702sq) this.b.get(i)).b(this, aqVar, this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        C0470aq aqVar = this.d;
        C0471ar.a(aqVar);
        C0470aq aqVar2 = aqVar;
        for (int i = 0; i < this.c; i++) {
            ((C1702sq) this.b.get(i)).a(this, aqVar2, this.a);
        }
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        C0470aq aqVar = this.d;
        C0471ar.a(aqVar);
        C0470aq aqVar2 = aqVar;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((C1702sq) this.b.get(i2)).a(this, aqVar2, this.a, i);
        }
    }
}
