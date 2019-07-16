package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.cast.C0679l.a;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0666s;
import com.google.android.gms.cast.framework.C0667t;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.C0650e.b;
import com.google.android.gms.cast.framework.media.C0651f;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.cast.framework.r;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.A;
import com.google.android.gms.internal.cast.B;
import com.google.android.gms.internal.cast.C;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.C0723p;
import com.google.android.gms.internal.cast.C0725q;
import com.google.android.gms.internal.cast.C0728s;
import com.google.android.gms.internal.cast.C0730u;
import com.google.android.gms.internal.cast.C0731v;
import com.google.android.gms.internal.cast.C0733x;
import com.google.android.gms.internal.cast.C0735z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: rr reason: default package and case insensitive filesystem */
public class C1673rr implements C0667t<C0636d>, b {
    private static final C0710ia a = new C0710ia("UIMediaController");
    private final Activity b;
    private final C0666s c;
    private final Map<View, List<C1644qr>> d = new HashMap();
    private final Set<C> e = new HashSet();
    C1703sr f = C1703sr.b();
    private b g;
    private C0650e h;

    public C1673rr(Activity activity) {
        this.b = activity;
        C0635c b2 = C0635c.b((Context) activity);
        this.c = b2 != null ? b2.c() : null;
        if (this.c != null) {
            C0666s c2 = C0635c.a((Context) activity).c();
            c2.a(this, C0636d.class);
            c((r) c2.a());
        }
    }

    private final void k() {
        for (C a2 : this.e) {
            a2.a(false);
        }
    }

    private final void l() {
        if (i()) {
            this.f.b = null;
            for (List<C1644qr> it : this.d.values()) {
                for (C1644qr d2 : it) {
                    d2.d();
                }
            }
            this.h.b((b) this);
            this.h = null;
        }
    }

    private final void m() {
        for (List<C1644qr> it : this.d.values()) {
            for (C1644qr b2 : it) {
                b2.b();
            }
        }
    }

    /* renamed from: a */
    public void b(C0636d dVar) {
    }

    public void a(C0636d dVar, String str) {
    }

    public void a(b bVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.g = bVar;
    }

    public void b(View view, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new C1853xr(this));
        b(view, (C1644qr) new A(view, i));
    }

    /* renamed from: b */
    public void a(C0636d dVar) {
    }

    /* access modifiers changed from: protected */
    public void c(ImageView imageView) {
        C0650e g2 = g();
        if (g2 != null && g2.m()) {
            g2.x();
        }
    }

    /* access modifiers changed from: protected */
    public void d(View view, long j) {
        C0650e g2 = g();
        if (g2 != null && g2.m()) {
            if (g() == null || !g().m() || !g().A()) {
                g2.a(g2.d() - j);
            } else {
                long d2 = g2.d() - j;
                C1703sr srVar = this.f;
                g2.a(Math.max(d2, ((long) srVar.f()) + srVar.h()));
            }
        }
    }

    /* renamed from: d */
    public void a(C0636d dVar, int i) {
    }

    /* access modifiers changed from: protected */
    public void e(View view) {
        C0650e g2 = g();
        if (g2 != null && g2.m()) {
            g2.d((JSONObject) null);
        }
    }

    public void f() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        l();
        this.d.clear();
        C0666s sVar = this.c;
        if (sVar != null) {
            sVar.b(this, C0636d.class);
        }
        this.g = null;
    }

    public C0650e g() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.h;
    }

    public void h() {
        for (List<C1644qr> it : this.d.values()) {
            for (C1644qr c2 : it) {
                c2.c();
            }
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.h();
        }
    }

    public boolean i() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.h != null;
    }

    public final C1703sr j() {
        return this.f;
    }

    public void a(ImageView imageView, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        imageView.setOnClickListener(new C1823wr(this));
        C0733x xVar = new C0733x(imageView, this.b, drawable, drawable2, drawable3, view, z);
        b((View) imageView, (C1644qr) xVar);
    }

    public void b(View view, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new C1913zr(this, j));
        b(view, (C1644qr) new C0735z(view, this.f));
    }

    /* access modifiers changed from: protected */
    public void c(View view) {
        C0650e g2 = g();
        if (g2 != null && g2.m() && (this.b instanceof FragmentActivity)) {
            C0651f Qb = C0651f.Qb();
            FragmentActivity fragmentActivity = (FragmentActivity) this.b;
            androidx.fragment.app.A a2 = fragmentActivity.getSupportFragmentManager().a();
            String str = "TRACKS_CHOOSER_DIALOG_TAG";
            Fragment a3 = fragmentActivity.getSupportFragmentManager().a(str);
            if (a3 != null) {
                a2.d(a3);
            }
            Qb.show(a2, str);
        }
    }

    public void e() {
        m();
        b bVar = this.g;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void a(View view, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new C1883yr(this));
        b(view, (C1644qr) new B(view, i));
    }

    public void b(View view) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        b(view, (C1644qr) new C0730u(view));
    }

    public void a(View view, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new Ar(this, j));
        b(view, (C1644qr) new com.google.android.gms.internal.cast.r(view, this.f));
    }

    /* access modifiers changed from: protected */
    public void b(ImageView imageView) {
        C0636d a2 = C0635c.a(this.b.getApplicationContext()).c().a();
        if (a2 != null && a2.b()) {
            try {
                a2.b(!a2.h());
            } catch (IOException | IllegalArgumentException e2) {
                a.b("Unable to call CastSession.setMute(boolean).", e2);
            }
        }
    }

    public void a(CastSeekBar castSeekBar, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        castSeekBar.e = new Br(this);
        b((View) castSeekBar, (C1644qr) new C0725q(castSeekBar, j, this.f));
    }

    /* access modifiers changed from: protected */
    public void d(View view) {
        C0650e g2 = g();
        if (g2 != null && g2.m()) {
            g2.c((JSONObject) null);
        }
    }

    /* access modifiers changed from: protected */
    public void c(View view, long j) {
        C0650e g2 = g();
        if (g2 != null && g2.m()) {
            if (g() == null || !g().m() || !g().A()) {
                g2.a(g2.d() + j);
            } else {
                long d2 = g2.d() + j;
                C1703sr srVar = this.f;
                g2.a(Math.min(d2, ((long) srVar.g()) + srVar.h()));
            }
        }
    }

    public void d() {
        m();
        b bVar = this.g;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void a(View view) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new Cr(this));
        b(view, (C1644qr) new C0723p(view, this.b));
    }

    /* access modifiers changed from: protected */
    public final void b(CastSeekBar castSeekBar) {
        k();
    }

    public void b(C0636d dVar, String str) {
        c((r) dVar);
    }

    public void a(ImageView imageView) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        imageView.setOnClickListener(new C1793vr(this));
        b((View) imageView, (C1644qr) new C0731v(imageView, this.b));
    }

    /* renamed from: b */
    public void d(C0636d dVar, int i) {
        l();
    }

    public void b() {
        m();
        b bVar = this.g;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void a(ImageView imageView, ImageHints imageHints, View view) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        C0728s sVar = new C0728s(imageView, this.b, imageHints, 0, view);
        b((View) imageView, (C1644qr) sVar);
    }

    private final void b(View view, C1644qr qrVar) {
        if (this.c != null) {
            List list = (List) this.d.get(view);
            if (list == null) {
                list = new ArrayList();
                this.d.put(view, list);
            }
            list.add(qrVar);
            if (i()) {
                qrVar.a(this.c.a());
                m();
            }
        }
    }

    public void a(View view, C1644qr qrVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        b(view, qrVar);
    }

    public void c(C0636d dVar, int i) {
        l();
    }

    public void c() {
        m();
        b bVar = this.g;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final void a(C c2) {
        this.e.add(c2);
    }

    /* access modifiers changed from: protected */
    public final void a(CastSeekBar castSeekBar) {
        a(castSeekBar.getProgress());
    }

    private final void a(int i) {
        boolean z;
        Iterator it = this.e.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            ((C) it.next()).a(true);
        }
        C0650e g2 = g();
        if (g2 != null && g2.m()) {
            long h2 = ((long) i) + this.f.h();
            a aVar = new a();
            aVar.a(h2);
            if (!g2.o() || !this.f.a(h2)) {
                z = false;
            }
            aVar.a(z);
            g2.a(aVar.a());
        }
    }

    private final void c(r rVar) {
        if (!i() && (rVar instanceof C0636d) && rVar.b()) {
            C0636d dVar = (C0636d) rVar;
            this.h = dVar.g();
            C0650e eVar = this.h;
            if (eVar != null) {
                eVar.a((b) this);
                C1703sr srVar = this.f;
                if (dVar != null) {
                    srVar.b = dVar.g();
                } else {
                    srVar.b = null;
                }
                for (List<C1644qr> it : this.d.values()) {
                    for (C1644qr a2 : it) {
                        a2.a(dVar);
                    }
                }
                m();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(CastSeekBar castSeekBar, int i, boolean z) {
        a(i, z);
    }

    private final void a(int i, boolean z) {
        if (z) {
            for (C a2 : this.e) {
                a2.a(((long) i) + this.f.h());
            }
        }
    }

    public void a(C0636d dVar, boolean z) {
        c((r) dVar);
    }

    /* renamed from: a */
    public void b(C0636d dVar, int i) {
        l();
    }

    public void a() {
        m();
        b bVar = this.g;
        if (bVar != null) {
            bVar.a();
        }
    }
}
