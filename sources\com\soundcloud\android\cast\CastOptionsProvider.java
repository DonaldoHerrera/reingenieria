package com.soundcloud.android.cast;

import android.content.Context;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.C0640h;
import com.google.android.gms.cast.framework.C0668u;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.C0646a;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions.a;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.cast.activity.CastExpandedControllerRedirectActivity;
import com.soundcloud.android.cast.activity.CastNotificationRedirectActivity;
import com.soundcloud.android.ia.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CastOptionsProvider implements C0640h {
    C2730d a;

    public CastOptionsProvider() {
        SoundCloudApplication.f().a(this);
    }

    private CastMediaOptions a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.android.gms.cast.framework.action.REWIND");
        String str = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
        arrayList.add(str);
        arrayList.add("com.google.android.gms.cast.framework.action.FORWARD");
        String str2 = "com.google.android.gms.cast.framework.action.STOP_CASTING";
        arrayList.add(str2);
        int[] iArr = {arrayList.indexOf(str), arrayList.indexOf(str2)};
        a aVar = new a();
        aVar.a(arrayList, iArr);
        aVar.i(h.ic_notification_cloud);
        aVar.a(h.notifications_next);
        aVar.b(h.notifications_next);
        aVar.c(h.notifications_next);
        aVar.g(h.notifications_next);
        aVar.h(h.notifications_previous);
        aVar.d(h.notifications_previous);
        aVar.e(h.notifications_previous);
        aVar.f(h.notifications_previous);
        aVar.a(CastNotificationRedirectActivity.class.getName());
        NotificationOptions a2 = aVar.a();
        CastMediaOptions.a aVar2 = new CastMediaOptions.a();
        aVar2.a(a2);
        aVar2.a((C0646a) new C2734h());
        aVar2.b(CastMediaIntentReceiver.class.getName());
        aVar2.a(CastExpandedControllerRedirectActivity.class.getName());
        return aVar2.a();
    }

    public List<C0668u> a(Context context) {
        return null;
    }

    public CastOptions b(Context context) {
        CastOptions.a aVar = new CastOptions.a();
        aVar.a(this.a.a());
        aVar.a(true);
        aVar.b(true);
        aVar.a(a());
        aVar.a(b());
        return aVar.a();
    }

    private LaunchOptions b() {
        LaunchOptions.a aVar = new LaunchOptions.a();
        aVar.a(Locale.getDefault());
        return aVar.a();
    }
}
