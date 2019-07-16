package com.soundcloud.android.onboarding;

import com.facebook.AccessToken;
import com.facebook.GraphRequest.b;
import com.facebook.L;
import com.facebook.login.E;
import com.soundcloud.android.onboarding.h.a;
import com.soundcloud.android.profile.C5815m;
import org.json.JSONObject;

/* compiled from: FacebookUserDetailsRequest.kt */
final class i implements b {
    final /* synthetic */ j a;
    final /* synthetic */ E b;

    i(j jVar, E e) {
        this.a = jVar;
        this.b = e;
    }

    public final void a(L l) {
        C4928GKa gKa;
        a aVar = (a) this.a.a.get();
        if (aVar != null) {
            C7471uYa.a((Object) l, "response");
            String str = "loginResult.accessToken";
            if (l.a() != null || l.b() == null) {
                AccessToken a2 = this.b.a();
                C7471uYa.a((Object) a2, str);
                aVar.a(a2.k(), C4928GKa.a(), C4928GKa.a());
                return;
            }
            JSONObject b2 = l.b();
            C7471uYa.a((Object) b2, "this");
            C4928GKa a3 = k.b(b2, "birthday");
            if (a3.c()) {
                gKa = C4928GKa.b(C5815m.a(C5626bGa.a, (String) a3.b()));
                C7471uYa.a((Object) gKa, "Optional.fromNullable(mapper(get()))");
            } else {
                gKa = C4928GKa.a();
                C7471uYa.a((Object) gKa, "Optional.absent()");
            }
            C4928GKa a4 = k.b(b2, "gender");
            AccessToken a5 = this.b.a();
            C7471uYa.a((Object) a5, str);
            aVar.a(a5.k(), gKa, a4);
        }
    }
}
