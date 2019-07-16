package com.soundcloud.android.onboarding;

import com.facebook.C0584n;
import com.facebook.C0587q;
import com.facebook.C0594t;
import com.facebook.login.E;
import com.google.android.gms.common.Scopes;
import com.soundcloud.android.profile.C5815m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FacebookSessionCallback */
public class h implements C0587q<E> {
    static final List<String> a;
    static List<String> b;
    private final WeakReference<a> c;
    private final j d;

    /* compiled from: FacebookSessionCallback */
    public interface a {
        void a(String str, C4928GKa<C5815m> gKa, C4928GKa<String> gKa2);

        void h();

        void j();

        void l();

        void r();
    }

    static {
        String str = Scopes.EMAIL;
        a = Arrays.asList(new String[]{"public_profile", str, "user_birthday"});
        b = Collections.singletonList(str);
    }

    public h(a aVar) {
        this.c = new WeakReference<>(aVar);
        this.d = new j(aVar);
    }

    private static boolean b(C0594t tVar) {
        return (tVar instanceof C0584n) && (tVar.getMessage().equals("CONNECTION_FAILURE: CONNECTION_FAILURE") || tVar.getMessage().equals("net::ERR_INTERNET_DISCONNECTED"));
    }

    /* renamed from: a */
    public void onSuccess(E e) {
        String str = "ScOnboarding";
        C7316sHa.a(4, str, "Facebook authorization succeeded");
        a aVar = (a) this.c.get();
        if (aVar != null) {
            a(e, aVar);
        } else {
            C7316sHa.a(5, str, "Facebook callback called but activity was garbage collected.");
        }
    }

    public void onCancel() {
        String str = "ScOnboarding";
        SDb.a(str).d("Facebook authorization cancelled", new Object[0]);
        a aVar = (a) this.c.get();
        if (aVar != null) {
            aVar.j();
        } else {
            C7316sHa.a(5, str, "Facebook callback called but activity was garbage collected.");
        }
    }

    private void a(E e, a aVar) {
        String str = "ScOnboarding";
        if (e.b().contains(Scopes.EMAIL)) {
            C7316sHa.a(4, str, "Missing email permission, retrying");
            aVar.l();
            return;
        }
        C7316sHa.a(4, str, "Facebook authorization successful, trying to get user age.");
        this.d.a(e);
    }

    public void a(C0594t tVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Facebook authorization returned an exception ");
        sb.append(tVar.getMessage());
        String str = "ScOnboarding";
        C7316sHa.a(6, str, sb.toString());
        C7316sHa.d(tVar);
        a aVar = (a) this.c.get();
        if (aVar != null) {
            a(tVar, aVar);
        } else {
            C7316sHa.a(5, str, "Facebook callback called but activity was garbage collected.");
        }
    }

    private static void a(C0594t tVar, a aVar) {
        if (b(tVar)) {
            aVar.h();
        } else {
            aVar.r();
        }
    }
}
