package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.k.c;
import androidx.core.app.k.d;
import androidx.core.app.k.e;
import androidx.core.app.n;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.profile.VerifyAgeActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: Zza reason: default package and case insensitive filesystem */
/* compiled from: MyFollowingsSyncer */
public class C5518Zza implements Callable<Boolean> {
    private final a a;
    private final dfa b;
    private final Cba c;
    private final C3240rR d;
    private final n e;
    private final Nea f;
    private final C1472lW g;

    /* renamed from: Zza$a */
    /* compiled from: MyFollowingsSyncer */
    static class a {
        private final Context a;

        a(Context context) {
            this.a = context;
        }

        /* access modifiers changed from: 0000 */
        public Notification a(C3508cda cda, String str) {
            return a(this.a.getString(p.follow_blocked_title), this.a.getString(p.follow_blocked_content_username, new Object[]{str}), this.a.getString(p.follow_blocked_content_long_username, new Object[]{str}), Aja.a(this.a, cda));
        }

        /* access modifiers changed from: 0000 */
        public Notification b(C3508cda cda, String str) {
            return a(this.a.getString(p.follow_age_unknown_title), this.a.getString(p.follow_age_unknown_content_username, new Object[]{str}), this.a.getString(p.follow_age_unknown_content_long_username, new Object[]{str}), a(cda));
        }

        /* access modifiers changed from: 0000 */
        public Notification a(C3508cda cda, int i, String str) {
            return a(this.a.getString(p.follow_age_restricted_title), this.a.getString(p.follow_age_restricted_content_age_username, new Object[]{String.valueOf(i), str}), this.a.getString(p.follow_age_restricted_content_long_age_username, new Object[]{String.valueOf(i), str}), Aja.a(this.a, cda));
        }

        private Notification a(String str, String str2, String str3, PendingIntent pendingIntent) {
            d dVar = new d(this.a, "channel_account");
            dVar.e(h.ic_notification_cloud);
            dVar.c((CharSequence) str);
            dVar.b((CharSequence) str2);
            c cVar = new c();
            cVar.a((CharSequence) str3);
            cVar.b(str);
            dVar.a((e) cVar);
            dVar.a(true);
            dVar.a(pendingIntent);
            return dVar.a();
        }

        private PendingIntent a(C3508cda cda) {
            Intent a2 = VerifyAgeActivity.a(this.a, cda);
            a2.addFlags(805306368);
            return PendingIntent.getActivity(this.a, 0, a2, 0);
        }
    }

    C5518Zza(a aVar, dfa dfa, C3240rR rRVar, n nVar, Nea nea, Cba cba, C1472lW lWVar) {
        this.a = aVar;
        this.b = dfa;
        this.c = cba;
        this.d = rRVar;
        this.e = nVar;
        this.f = nea;
        this.g = lWVar;
    }

    private List<C3508cda> a() throws IOException, ifa, Lea {
        return C2063HD.a(((Pca) this.b.a(hfa.b(C2226PO.MY_FOLLOWINGS.a()).c().b(), (C4990IKa<ResourceType>) new C5489Yza<ResourceType>(this))).f(), C5402Vza.a);
    }

    private boolean a(int i) {
        return i == 403 || i == 400 || i == 404;
    }

    private boolean b() throws IOException, ifa {
        if (this.c.c()) {
            for (C3837oba a2 : this.c.f()) {
                a(a2);
            }
        }
        return true;
    }

    private boolean c() throws IOException, Lea, ifa {
        Set d2 = this.c.d();
        List a2 = a();
        if (d2.equals(new HashSet(a2))) {
            return false;
        }
        ArrayList arrayList = new ArrayList(d2);
        arrayList.removeAll(a2);
        this.c.a((List<C3508cda>) arrayList);
        this.c.b(a2);
        return true;
    }

    public Boolean call() throws Exception {
        return Boolean.valueOf(b() && c());
    }

    private void b(C3508cda cda, hfa hfa) throws ifa {
        jfa a2 = this.b.a(hfa);
        int d2 = a2.d();
        if (a2.g() || a2.d() == 404 || a2.d() == 422) {
            this.c.c(cda);
            return;
        }
        b a3 = SDb.a("MyFollowingsSyncer");
        StringBuilder sb = new StringBuilder();
        sb.append("failure ");
        sb.append(d2);
        sb.append(" in user association removal of ");
        sb.append(cda);
        a3.f(sb.toString(), new Object[0]);
        throw a2.a();
    }

    private void a(C3837oba oba) throws IOException, ifa {
        C3508cda c2 = oba.c();
        if (oba.a() != null) {
            a(c2, hfa.c(C2226PO.USER_FOLLOWS.a(c2)).c().b());
        } else if (oba.b() != null) {
            b(c2, hfa.a(C2226PO.USER_FOLLOWS.a(c2)).c().b());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("FollowingWithUser does not need syncing: ");
            sb.append(oba);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void a(C3508cda cda, hfa hfa) throws IOException, ifa {
        jfa a2 = this.b.a(hfa);
        int d2 = a2.d();
        if (a(d2)) {
            a(cda, a(a2));
        } else if (a2.g()) {
            this.c.c(cda);
        } else {
            b a3 = SDb.a("MyFollowingsSyncer");
            StringBuilder sb = new StringBuilder();
            sb.append("failure ");
            sb.append(d2);
            sb.append(" in user association addition of ");
            sb.append(cda);
            a3.f(sb.toString(), new Object[0]);
            throw a2.a();
        }
    }

    private C5460Xza a(jfa jfa) throws IOException {
        if (!jfa.e()) {
            return null;
        }
        try {
            return (C5460Xza) this.f.a(jfa.c(), C4990IKa.a(C5460Xza.class));
        } catch (Lea unused) {
            return null;
        }
    }

    private void a(C3508cda cda, C5460Xza xza) {
        ((C4928GKa) this.g.a(cda).f(C5344Tza.a).d(C4928GKa.a()).b()).a((C7733yKa<? super T>) new C5315Sza<Object>(this, cda, xza));
        this.d.a(cda, false).a((C7117pPa) new C4974Hua());
    }

    public /* synthetic */ void a(C3508cda cda, C5460Xza xza, C3784hea hea) {
        C4928GKa a2 = a(cda, hea.c, xza);
        if (a2.c()) {
            this.e.a(cda.toString(), 7, (Notification) a2.b());
        }
    }

    private C4928GKa<Notification> a(C3508cda cda, String str, C5460Xza xza) {
        if (xza == null) {
            return C4928GKa.a();
        }
        if (xza.a()) {
            return C4928GKa.c(this.a.a(cda, xza.b.intValue(), str));
        }
        if (xza.b()) {
            return C4928GKa.c(this.a.b(cda, str));
        }
        if (xza.c()) {
            return C4928GKa.c(this.a.a(cda, str));
        }
        return C4928GKa.a();
    }
}
