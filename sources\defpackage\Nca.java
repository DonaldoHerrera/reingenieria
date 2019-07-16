package defpackage;

import com.soundcloud.android.foundation.events.C3708j;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.I;

/* renamed from: Nca reason: default package */
/* compiled from: ShareOptions.kt */
public final class Nca {
    public static final Mca a(C3784hea hea) {
        C7471uYa.b(hea, "$this$toShareOptions");
        StringBuilder sb = new StringBuilder();
        sb.append("https://soundcloud.com/");
        sb.append(hea.e());
        Mca mca = new Mca(sb.toString(), false, null, C3710l.a.a(hea.a, Yca.USERS_INFO.a(), (I) null, false), null, C3708j.a.a(hea), hea.a);
        return mca;
    }
}
