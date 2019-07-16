package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.onboarding.g;
import com.soundcloud.android.profile.C5815m;
import java.io.IOException;

/* compiled from: SignUpOperations */
public class ka {
    private final dfa a;
    private final C4806CMa<Nea> b;
    private final C c;
    private final C2322UP d;
    private final SoundCloudApplication e;
    private final C2325UT f;
    private final g g;

    /* compiled from: SignUpOperations */
    private class a extends Throwable {
        public final Eka a;

        a(Eka eka) {
            this.a = eka;
        }
    }

    public ka(Context context, dfa dfa, C4806CMa<Nea> cMa, C c2, C2322UP up, C2325UT ut, g gVar) {
        this.e = (SoundCloudApplication) context.getApplicationContext();
        this.a = dfa;
        this.b = cMa;
        this.c = c2;
        this.d = up;
        this.f = ut;
        this.g = gVar;
    }

    public static Bundle a(String str, C5815m mVar, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("method", "facebook");
        bundle.putString("token", str);
        bundle.putString("gender", str2);
        bundle.putSerializable("birthday", mVar);
        return bundle;
    }

    public static Bundle b(String str, C5815m mVar, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("method", "google");
        bundle.putString("token", str);
        bundle.putString("gender", str2);
        bundle.putSerializable("birthday", mVar);
        return bundle;
    }

    private C4692vka c(Bundle bundle) {
        if (f(bundle)) {
            return d(bundle);
        }
        if (g(bundle)) {
            return e(bundle);
        }
        throw new IllegalStateException("No signup method could be found");
    }

    private C4647qka d(Bundle bundle) {
        String string = bundle.getString("username");
        String b2 = this.d.b();
        C5815m mVar = (C5815m) bundle.getSerializable("birthday");
        return C4647qka.a(b2, this.d.c(), string, bundle.getString("password"), bundle.getString("gender"), (long) mVar.b(), (long) mVar.a(), this.g.a(string, b2));
    }

    private C4701wka e(Bundle bundle) {
        String string = bundle.getString("token");
        String b2 = this.d.b();
        C5815m mVar = (C5815m) bundle.getSerializable("birthday");
        String str = "method";
        String string2 = bundle.getString(str);
        String str2 = "gender";
        if ("facebook".equals(string2)) {
            String c2 = this.d.c();
            String string3 = bundle.getString(str);
            return C4701wka.a(b2, c2, string3, string, bundle.getString(str2), (long) mVar.b(), (long) mVar.a(), this.g.a(string, b2));
        } else if ("google".equals(string2)) {
            String c3 = this.d.c();
            String string4 = bundle.getString(str);
            return C4701wka.b(b2, c3, string4, string, bundle.getString(str2), (long) mVar.b(), (long) mVar.a(), this.g.a(string, b2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown authentication method: ");
            sb.append(string2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean f(Bundle bundle) {
        return bundle.containsKey("password") && bundle.containsKey("username");
    }

    private boolean g(Bundle bundle) {
        return bundle.containsKey("method");
    }

    private C4719yka h(Bundle bundle) throws IOException, Lea, a {
        jfa a2 = this.a.a(hfa.c(C2226PO.SIGN_UP.a()).c().a((Object) c(bundle)).b());
        if (a2.g()) {
            return (C4719yka) ((Nea) this.b.get()).a(a2.c(), C4990IKa.a(C4719yka.class));
        }
        throw new a(this.c.a(a2));
    }

    private Eka b(Bundle bundle) {
        try {
            return Eka.a(h(bundle));
        } catch (Nka unused) {
            return Eka.a(this.e.getString(p.signup_scope_revoked));
        } catch (Lea unused2) {
            return Eka.a(this.e.getString(p.authentication_signup_error_message));
        } catch (IOException e2) {
            return Eka.a((Exception) e2);
        } catch (a e3) {
            return e3.a;
        }
    }

    public Eka a(Bundle bundle) {
        Eka b2 = b(bundle);
        if (!b2.q()) {
            return b2;
        }
        C2358WP wp = b2.b().b;
        if (wp == null || !this.e.a(b2.b().a.b(), wp)) {
            return Eka.a(this.e.getString(p.authentication_signup_error_message));
        }
        this.f.a(b2.b().a.a());
        return b2;
    }
}
