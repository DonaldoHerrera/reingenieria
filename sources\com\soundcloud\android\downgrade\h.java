package com.soundcloud.android.downgrade;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.upgrade.n;
import com.soundcloud.android.view.LoadingButton;

/* compiled from: GoOffboardingView */
class h {
    private TextView a;
    private TextView b;
    private LoadingButton c;
    private LoadingButton d;
    private f e;

    h() {
    }

    private void g() {
        this.e.g();
    }

    private void h() {
        this.e.h();
    }

    /* access modifiers changed from: 0000 */
    public void a(Activity activity, f fVar, C2455aV aVVar) {
        this.e = fVar;
        a(activity);
        a(aVVar);
    }

    public /* synthetic */ void b(View view) {
        g();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        a(false);
        this.d.setLoading(true);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        a(true);
        this.c.a();
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.d.setEnabled(false);
        this.c.setEnabled(false);
        this.c.setLoading(true);
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a(true);
        this.d.a();
    }

    private void a(Activity activity) {
        this.a = (TextView) activity.findViewById(i.offboarding_primary_text);
        this.b = (TextView) activity.findViewById(i.offboarding_secondary_text);
        this.c = (LoadingButton) activity.findViewById(i.btn_offboarding_resubscribe);
        this.d = (LoadingButton) activity.findViewById(i.btn_offboarding_continue);
        this.c.setOnClickListener(new b(this));
        this.d.setOnClickListener(new a(this));
    }

    public /* synthetic */ void a(View view) {
        h();
    }

    private void a(C2455aV aVVar) {
        this.a.setText(aVVar == C2455aV.MID_TIER ? p.go_offboard_to_mid_title : p.go_offboard_to_free_title);
        this.b.setText(aVVar == C2455aV.MID_TIER ? p.go_offboard_to_mid_description : p.go_offboard_to_free_description);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        a(true);
        this.d.setLoading(false);
        this.c.setLoading(false);
    }

    private void a(boolean z) {
        this.d.setEnabled(z);
        this.c.setEnabled(z);
    }

    /* access modifiers changed from: 0000 */
    public void a(C0370l lVar) {
        n.a(lVar);
    }
}
