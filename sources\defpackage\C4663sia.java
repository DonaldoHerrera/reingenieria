package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.b.C0094b;

/* renamed from: sia reason: default package and case insensitive filesystem */
/* compiled from: InAppUpdateController.kt */
final class C4663sia implements OnClickListener {
    final /* synthetic */ C4628oia a;

    C4663sia(C4628oia oia) {
        this.a = oia;
    }

    public final void onClick(View view) {
        this.a.f.a((C3702d) new C0094b(KWa.a(NVa.a("event", C4699wia.RESTARTED))));
        this.a.c.a();
    }
}
