package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintsCommandHandler */
class d {
    private static final String a = i.a("ConstraintsCmdHandler");
    private final Context b;
    private final int c;
    private final g d;
    private final C1750ue e = new C1750ue(this.b, this.d.c(), null);

    d(Context context, int i, g gVar) {
        this.b = context;
        this.c = i;
        this.d = gVar;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        List<_e> a2 = this.d.d().g().t().a();
        ConstraintProxy.a(this.b, a2);
        this.e.c(a2);
        ArrayList<_e> arrayList = new ArrayList<>(a2.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (_e _eVar : a2) {
            String str = _eVar.c;
            if (currentTimeMillis >= _eVar.a() && (!_eVar.b() || this.e.a(str))) {
                arrayList.add(_eVar);
            }
        }
        for (_e _eVar2 : arrayList) {
            String str2 = _eVar2.c;
            Intent a3 = b.a(this.b, str2);
            i.a().a(a, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            g gVar = this.d;
            gVar.a((Runnable) new a(gVar, a3, this.c));
        }
        this.e.a();
    }
}
