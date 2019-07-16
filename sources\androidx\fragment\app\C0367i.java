package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.w;

/* renamed from: androidx.fragment.app.i reason: case insensitive filesystem */
/* compiled from: FragmentController */
public class C0367i {
    private final C0369k<?> a;

    private C0367i(C0369k<?> kVar) {
        this.a = kVar;
    }

    @SuppressLint({"RestrictedApi"})
    public static C0367i a(C0369k<?> kVar) {
        C0263Ub.a(kVar, "callbacks == null");
        return new C0367i(kVar);
    }

    public void b() {
        this.a.e.j();
    }

    public void c() {
        this.a.e.k();
    }

    public void d() {
        this.a.e.m();
    }

    public void e() {
        this.a.e.n();
    }

    public void f() {
        this.a.e.o();
    }

    public void g() {
        this.a.e.p();
    }

    public void h() {
        this.a.e.q();
    }

    public boolean i() {
        return this.a.e.s();
    }

    public C0370l j() {
        return this.a.e;
    }

    public void k() {
        this.a.e.v();
    }

    public Parcelable l() {
        return this.a.e.x();
    }

    public Fragment a(String str) {
        return this.a.e.b(str);
    }

    public void b(boolean z) {
        this.a.e.c(z);
    }

    public void a(Fragment fragment) {
        C0369k<?> kVar = this.a;
        kVar.e.a((C0369k) kVar, (C0366h) kVar, fragment);
    }

    public boolean b(Menu menu) {
        return this.a.e.b(menu);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.e.onCreateView(view, str, context, attributeSet);
    }

    public boolean b(MenuItem menuItem) {
        return this.a.e.b(menuItem);
    }

    public void a(Parcelable parcelable) {
        C0369k<?> kVar = this.a;
        if (kVar instanceof w) {
            kVar.e.a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void a() {
        this.a.e.i();
    }

    public void a(boolean z) {
        this.a.e.b(z);
    }

    public void a(Configuration configuration) {
        this.a.e.a(configuration);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.a.e.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.a.e.a(menuItem);
    }

    public void a(Menu menu) {
        this.a.e.a(menu);
    }
}
