package defpackage;

import android.app.Activity;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.b.C0094b;

/* renamed from: pia reason: default package and case insensitive filesystem */
/* compiled from: InAppUpdateController.kt */
final class C4636pia<TResult> implements PB<C1284fA> {
    final /* synthetic */ C4628oia a;
    final /* synthetic */ Activity b;

    C4636pia(C4628oia oia, Activity activity) {
        this.a = oia;
        this.b = activity;
    }

    /* renamed from: a */
    public final void onSuccess(C1284fA fAVar) {
        String str = "InAppUpdateController";
        if (fAVar.b() == 11) {
            SDb.a(str).d("App update is already downloaded", new Object[0]);
            this.a.x();
        }
        C4628oia oia = this.a;
        C7471uYa.a((Object) fAVar, "it");
        if (oia.c(fAVar)) {
            this.a.f.a((C3702d) new C0094b(LWa.b(NVa.a("event", C4699wia.AVAILABLE), NVa.a("currentVersion", Integer.valueOf(this.a.g.b())), NVa.a("newVersion", Integer.valueOf(fAVar.a())))));
            b a2 = SDb.a(str);
            StringBuilder sb = new StringBuilder();
            sb.append("App update available - from ");
            sb.append(this.a.g.b());
            sb.append(" to ");
            sb.append(fAVar.a());
            a2.d(sb.toString(), new Object[0]);
            this.a.a(fAVar, this.b);
            return;
        }
        this.a.d(fAVar);
    }
}
