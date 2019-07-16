package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.properties.m.C5884a;

/* renamed from: xN reason: default package and case insensitive filesystem */
/* compiled from: AdErrorAnalyticsToaster.kt */
public class C3356xN {
    private final Context a;
    private final a b;

    public C3356xN(Context context, a aVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(aVar, "appFeatures");
        this.a = context;
        this.b = aVar;
    }

    public void a(C3413CZ cz) {
        C7471uYa.b(cz, "event");
        if (j.e() && this.b.a((a) C5884a.a)) {
            Context context = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("Fired error trackers: ");
            sb.append(cz.i());
            Toast.makeText(context, sb.toString(), 1).show();
        }
    }
}
