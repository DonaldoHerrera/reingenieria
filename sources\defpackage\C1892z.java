package defpackage;

import android.view.View;

/* renamed from: z reason: default package and case insensitive filesystem */
/* compiled from: ViewPropertyAnimatorCompatSet */
class C1892z extends Gc {
    private boolean a = false;
    private int b = 0;
    final /* synthetic */ A c;

    C1892z(A a2) {
        this.c = a2;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.b = 0;
        this.a = false;
        this.c.b();
    }

    public void b(View view) {
        int i = this.b + 1;
        this.b = i;
        if (i == this.c.a.size()) {
            Fc fc = this.c.d;
            if (fc != null) {
                fc.b(null);
            }
            a();
        }
    }

    public void c(View view) {
        if (!this.a) {
            this.a = true;
            Fc fc = this.c.d;
            if (fc != null) {
                fc.c(null);
            }
        }
    }
}
