package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.r;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.C4536zc;
import java.util.List;

/* renamed from: wja reason: default package and case insensitive filesystem */
/* compiled from: Navigator.kt */
public final class C4700wja extends C5037Jua<C4605lja> {
    /* access modifiers changed from: private */
    public final Activity d;
    private final List<C4613mja> e;
    private final C5052KJa f;
    private final C4425ta g;

    public C4700wja(Activity activity, List<? extends C4613mja> list, C5052KJa kJa, C4425ta taVar) {
        C7471uYa.b(activity, "activity");
        C7471uYa.b(list, "resultHandlers");
        C7471uYa.b(kJa, "feedbackController");
        C7471uYa.b(taVar, "expandPlayerCommand");
        this.d = activity;
        this.e = list;
        this.f = kJa;
        this.g = taVar;
    }

    public void onComplete() {
        throw new IllegalStateException("Complete in Navigation Subscription. This should never happen since navigation won't work in the app anymore. Thus we'll force close the app.");
    }

    public void a(C4605lja lja) {
        String str = "Navigation failed: ";
        C7471uYa.b(lja, "result");
        StringBuilder sb = new StringBuilder();
        sb.append("Navigation result with target: [");
        sb.append(lja.d());
        sb.append("] , success: ");
        sb.append(lja.g());
        C7316sHa.a(4, "Navigator", sb.toString());
        try {
            if (!lja.g()) {
                C5052KJa kJa = this.f;
                Fca fca = new Fca(p.error_unknown_navigation, 0, 0, null, null, null, 62, null);
                kJa.a(fca);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(lja.d());
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Navigation failed for target: ");
                sb4.append(lja.d());
                C7316sHa.a(sb3, (Throwable) new IllegalArgumentException(sb4.toString()));
                return;
            }
            lja.f().a((C7733yKa<? super T>) new C4664sja<Object>(this));
            C4928GKa c = lja.c();
            String str2 = "Optional.absent()";
            if (!c.c()) {
                c = C4928GKa.a();
                C7471uYa.a((Object) c, str2);
            } else if (!((C4536zc) c.b()).b()) {
                c = C4928GKa.a();
                C7471uYa.a((Object) c, str2);
            }
            c.a((C7733yKa<? super T>) new C4691vja<Object>(new C4673tja(this.g)));
            lja.a().a((C7733yKa<? super T>) new C4682uja<Object>(this));
            for (C4613mja invoke : this.e) {
                if (((Boolean) invoke.invoke(lja)).booleanValue()) {
                    return;
                }
            }
            if (lja.b().c()) {
                if (!lja.e().isEmpty()) {
                    r a = r.a((Context) this.d);
                    C7471uYa.a((Object) a, "TaskStackBuilder.create(activity)");
                    for (Intent a2 : lja.e()) {
                        a.a(a2);
                    }
                    a.a((Intent) lja.b().b());
                    a.f();
                } else {
                    this.d.startActivity((Intent) lja.b().b());
                }
            }
        } catch (Exception e2) {
            C5052KJa kJa2 = this.f;
            Fca fca2 = new Fca(p.error_unknown_navigation, 0, 0, null, null, null, 62, null);
            kJa2.a(fca2);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(lja.d());
            C7316sHa.a(sb5.toString(), (Throwable) e2);
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public void a(Throwable th) {
        C7471uYa.b(th, "t");
        throw new IllegalStateException("Complete in Navigation Subscription. This should never happen since navigation won't work in the app anymore. Thus we'll force close the app.", th);
    }
}
