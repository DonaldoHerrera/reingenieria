package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: cDa reason: default package and case insensitive filesystem */
/* compiled from: TimelineSyncer */
public class C5690cDa<TimelineModel> implements Callable<Boolean> {
    private final C2226PO a;
    private final Uri b;
    private final dfa c;
    private final C1255eT<Iterable<TimelineModel>, ?> d;
    private final C1255eT<Iterable<TimelineModel>, ?> e;
    private final C5622bDa f;
    private final C4990IKa<Pca<TimelineModel>> g;
    private String h;

    protected C5690cDa(C2226PO po, Uri uri, dfa dfa, C1255eT<Iterable<TimelineModel>, ?> eTVar, C1255eT<Iterable<TimelineModel>, ?> eTVar2, C5622bDa bda, C4990IKa<Pca<TimelineModel>> iKa, String str) {
        this.a = po;
        this.b = uri;
        this.c = dfa;
        this.d = eTVar;
        this.e = eTVar2;
        this.f = bda;
        this.g = iKa;
        this.h = str;
    }

    private boolean a() throws Exception {
        if (this.f.d()) {
            String c2 = this.f.c();
            StringBuilder sb = new StringBuilder();
            sb.append("Building request from stored next link ");
            sb.append(c2);
            a(sb.toString());
            Pca pca = (Pca) this.c.a(hfa.b(c2).c().b(), this.g);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("New items: ");
            sb2.append(pca.f().size());
            a(sb2.toString());
            this.f.a(pca.h());
            if (pca.f().isEmpty()) {
                return false;
            }
            this.d.b(pca.f());
            return true;
        }
        a("No next link found. Aborting append.");
        return false;
    }

    private boolean b() throws Exception {
        C1255eT<Iterable<TimelineModel>, ?> eTVar;
        String b2 = this.f.b();
        StringBuilder sb = new StringBuilder();
        sb.append("Building request from stored future link ");
        sb.append(b2);
        a(sb.toString());
        Pca pca = (Pca) this.c.a(hfa.b(b2).c().b(), this.g);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("New items: ");
        sb2.append(pca.f().size());
        a(sb2.toString());
        Map g2 = pca.g();
        String str = "future";
        if (g2.containsKey(str)) {
            this.f.a((Oca) g2.get(str));
        }
        if (pca.h().c()) {
            eTVar = this.e;
        } else {
            eTVar = this.d;
        }
        if (pca.f().isEmpty()) {
            return false;
        }
        eTVar.b(pca.f());
        return true;
    }

    private boolean c() throws Exception {
        Pca pca = (Pca) this.c.a(hfa.b(this.a.a()).a(c.PAGE_SIZE, Integer.valueOf(100)).c().b(), this.g);
        StringBuilder sb = new StringBuilder();
        sb.append("New items: ");
        sb.append(pca.f().size());
        a(sb.toString());
        this.e.b(pca.f());
        this.f.a(pca.h());
        Map g2 = pca.g();
        String str = "future";
        if (g2.containsKey(str)) {
            this.f.a((Oca) g2.get(str));
        }
        return true;
    }

    private boolean d() throws Exception {
        try {
            return b();
        } catch (ifa e2) {
            if (!e2.c()) {
                this.f.a();
            }
            throw e2;
        }
    }

    public Boolean call() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("Syncing with action=");
        sb.append(this.h);
        a(sb.toString());
        if ("com.soundcloud.android.sync.action.APPEND".equals(this.h)) {
            return Boolean.valueOf(a());
        }
        if ("com.soundcloud.android.sync.action.HARD_REFRESH".equals(this.h) || this.f.e()) {
            return Boolean.valueOf(c());
        }
        return Boolean.valueOf(d());
    }

    private void a(String str) {
        b a2 = SDb.a("Timeline");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.b.getPath());
        sb.append("] ");
        sb.append(str);
        a2.a(sb.toString(), new Object[0]);
    }
}
