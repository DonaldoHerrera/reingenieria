package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;

/* renamed from: SHa reason: default package and case insensitive filesystem */
/* compiled from: ScrollHelper */
public class C5293SHa implements b {
    private final a a;
    private int b = 0;

    /* renamed from: SHa$a */
    /* compiled from: ScrollHelper */
    public interface a {
        void a(int i);

        Toolbar c();

        void d(boolean z);

        View e();

        AppBarLayout o();

        float p();

        View s();
    }

    public C5293SHa(a aVar) {
        this.a = aVar;
    }

    private int c() {
        return (this.a.e().getHeight() - this.a.o().getTotalScrollRange()) - this.b;
    }

    private void d() {
        this.a.a(c());
        this.a.d(this.b >= 0);
    }

    private void e() {
        C1778vc.b((View) this.a.c(), a(this.b));
    }

    public void a() {
        C1778vc.a((View) this.a.c(), 0.0f);
        this.a.o().a((b) this);
    }

    public void b() {
        this.a.o().b((b) this);
    }

    public void a(AppBarLayout appBarLayout, int i) {
        this.b = i;
        e();
        d();
    }

    private float a(int i) {
        float height = ((float) this.a.s().getHeight()) / 2.0f;
        return Math.min(this.a.p(), height - Math.abs(((float) i) + height));
    }
}
