package com.soundcloud.android.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.payments.Fa.h;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: com.soundcloud.android.payments.fa reason: case insensitive filesystem */
/* compiled from: PaymentErrorView */
class C4239fa {
    private Activity a;
    private C0370l b;

    C4239fa() {
    }

    private void k() {
        Yka.a(this.b);
    }

    public void a(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
        this.b = fragmentActivity.getSupportFragmentManager();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Xka.a(this.b);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        View a2 = new b(this.a).a(h.dialog_payment_error, p.payments_error_title_canceled, p.payments_error_cancelled).a();
        a aVar = new a(this.a);
        aVar.b(a2);
        aVar.c(17039370, (OnClickListener) null);
        C5232QGa.a((Dialog) aVar.a());
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        k();
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        C3950ala.a(this.b);
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        C3958bla.a(this.b);
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        k();
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        C4543dla.a(this.b);
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        C4543dla.b(this.b);
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        C4551ela.a(this.b);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Wka.a(this.b);
    }
}
