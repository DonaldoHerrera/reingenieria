package defpackage;

import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.b.C0094b;

/* renamed from: qia reason: default package and case insensitive filesystem */
/* compiled from: InAppUpdateController.kt */
final class C4645qia implements OB {
    final /* synthetic */ C4628oia a;

    C4645qia(C4628oia oia) {
        this.a = oia;
    }

    public final void a(Exception exc) {
        b a2 = SDb.a("InAppUpdateController");
        StringBuilder sb = new StringBuilder();
        sb.append("in app update error: ");
        sb.append(exc);
        a2.d(sb.toString(), new Object[0]);
        this.a.f.a((C3702d) new C0094b(LWa.b(NVa.a("event", C4699wia.FAILED), NVa.a("exception", exc))));
    }
}
