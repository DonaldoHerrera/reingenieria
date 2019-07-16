package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import java.util.List;

/* renamed from: qH reason: default package and case insensitive filesystem */
public class C3210qH extends C3143nH {
    /* access modifiers changed from: private */
    public WebView f;
    private List<C2199OG> g;
    private final String h;

    public C3210qH(List<C2199OG> list, String str) {
        this.g = list;
        this.h = str;
    }

    public void a() {
        super.a();
        j();
    }

    public void b() {
        super.b();
        new Handler().postDelayed(new C3191pH(this), 2000);
        this.f = null;
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        this.f = new WebView(C2385YG.a().b());
        this.f.getSettings().setJavaScriptEnabled(true);
        a(this.f);
        C2423_G.a().a(this.f, this.h);
        for (C2199OG a : this.g) {
            C2423_G.a().b(this.f, a.a().toExternalForm());
        }
    }
}
