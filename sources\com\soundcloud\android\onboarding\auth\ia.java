package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.onboarding.g;
import com.soundcloud.android.onboarding.s;
import java.io.IOException;

/* compiled from: SignInOperations */
public class ia {
    static String a = "isConflictingDevice";
    private final C2325UT b;
    private final s c;
    private final C2526g d;
    private final C5018JHa e;
    private final Context f;
    private final dfa g;
    private final C2322UP h;
    private final g i;

    public ia(Context context, dfa dfa, C2322UP up, C2325UT ut, s sVar, C2526g gVar, C5018JHa jHa, g gVar2) {
        this.f = context;
        this.g = dfa;
        this.h = up;
        this.b = ut;
        this.c = sVar;
        this.d = gVar;
        this.e = jHa;
        this.i = gVar2;
    }

    public static Bundle b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("facebook", str);
        return bundle;
    }

    public static Bundle c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("google", str);
        return bundle;
    }

    private String d(Bundle bundle) {
        return bundle.getString("username");
    }

    private boolean e(Bundle bundle) {
        return bundle.containsKey("facebook");
    }

    private boolean f(Bundle bundle) {
        return bundle.containsKey("google");
    }

    private boolean g(Bundle bundle) {
        return bundle.containsKey("username") && bundle.containsKey("password");
    }

    private C4719yka h(Bundle bundle) throws ifa {
        try {
            return (C4719yka) this.g.a(hfa.c(C2226PO.SIGN_IN.a()).c().a((Object) c(bundle)).b(), C4719yka.class);
        } catch (Lea | IOException e2) {
            throw new Nka(e2);
        }
    }

    public Eka a(Bundle bundle) {
        String str = "ScOnboarding";
        try {
            C4719yka h2 = h(bundle);
            C2358WP wp = h2.b;
            C4928GKa a2 = a(bundle, wp);
            if (a2.c()) {
                return (Eka) a2.b();
            }
            this.d.a(wp);
            if (!a(h2, wp)) {
                C7316sHa.d(new Lka());
                return Eka.a(this.f.getString(p.authentication_login_error_message));
            }
            this.c.a(Baa.a());
            return Eka.a(h2);
        } catch (ifa e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("error logging in: ");
            sb.append(e2.getMessage());
            C7316sHa.a(4, str, sb.toString());
            return C.a(e2);
        } catch (Exception e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error retrieving SC API token: ");
            sb2.append(e3.getMessage());
            C7316sHa.a(4, str, sb2.toString());
            return Eka.a((Exception) new Nka(e3));
        }
    }

    private String b(Bundle bundle) {
        return bundle.getString("password");
    }

    private C4683uka c(Bundle bundle) {
        String b2 = this.h.b();
        if (g(bundle)) {
            String d2 = d(bundle);
            return C4683uka.a(d2, b(bundle), b2, this.h.c(), this.i.a(d2, b2));
        } else if (e(bundle)) {
            String string = bundle.getString("facebook");
            return C4683uka.a(string, b2, this.h.c(), this.i.a(string, b2));
        } else if (f(bundle)) {
            String string2 = bundle.getString("google");
            return C4683uka.b(string2, b2, this.h.c(), this.i.a(string2, b2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid param ");
            sb.append(bundle);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean a(C4719yka yka, C2358WP wp) {
        return ((SoundCloudApplication) this.f.getApplicationContext()).a(yka.a.b(), wp);
    }

    private C4928GKa<Eka> a(Bundle bundle, C2358WP wp) throws ifa, IOException, Lea {
        if (!bundle.getBoolean(a)) {
            C2492cU b2 = this.b.b(wp);
            if (b2.a()) {
                bundle.putBoolean(a, true);
                return C4928GKa.c(Eka.a(bundle));
            } else if (b2.c()) {
                return C4928GKa.c(Eka.a());
            }
        } else if (this.b.a(wp).b()) {
            return C4928GKa.c(Eka.a(this.f.getString(p.error_server_problems_message)));
        }
        return C4928GKa.a();
    }

    public Uri a() {
        return a("/activate");
    }

    public Uri a(String str) {
        String a2 = this.d.e().a();
        Builder appendQueryParameter = Uri.parse("https://secure.soundcloud.com/oauth2_callback").buildUpon().appendQueryParameter("display", "chromeless").appendQueryParameter("state", str).appendQueryParameter("client_id", this.h.b());
        StringBuilder sb = new StringBuilder();
        sb.append("access_token=");
        sb.append(a2);
        Builder fragment = appendQueryParameter.fragment(sb.toString());
        this.e.b().a((C7733yKa<? super T>) new C4206d<Object>(fragment));
        return fragment.build();
    }
}
