package defpackage;

import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.b.C0094b;

/* renamed from: ria reason: default package and case insensitive filesystem */
/* compiled from: InAppUpdateController.kt */
final class C4654ria implements C1713tA {
    final /* synthetic */ C4628oia a;

    C4654ria(C4628oia oia) {
        this.a = oia;
    }

    public final void a(C1683sA sAVar) {
        String str;
        b a2 = SDb.a("InAppUpdateController");
        StringBuilder sb = new StringBuilder();
        sb.append("State: ");
        int b = sAVar.b();
        if (b == 10) {
            str = "REQUIRES_UI_INTENT";
        } else if (b != 11) {
            switch (b) {
                case 1:
                    str = "PENDING";
                    break;
                case 2:
                    str = "DOWNLOADING";
                    break;
                case 3:
                    str = "INSTALLING";
                    break;
                case 4:
                    str = "INSTALLED";
                    break;
                case 5:
                    str = "FAILED";
                    break;
                case 6:
                    str = "CANCELED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "DOWNLOADED";
        }
        sb.append(str);
        sb.append(", error code: ");
        sb.append(sAVar.a());
        a2.d(sb.toString(), new Object[0]);
        if (sAVar.b() == 11) {
            this.a.f.a((C3702d) new C0094b(KWa.a(NVa.a("event", C4699wia.COMPLETED))));
            this.a.x();
        }
    }
}
