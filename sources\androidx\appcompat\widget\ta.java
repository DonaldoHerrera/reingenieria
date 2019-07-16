package androidx.appcompat.widget;

import android.view.View;

/* compiled from: ToolbarWidgetWrapper */
class ta extends Gc {
    private boolean a = false;
    final /* synthetic */ int b;
    final /* synthetic */ ua c;

    ta(ua uaVar, int i) {
        this.c = uaVar;
        this.b = i;
    }

    public void a(View view) {
        this.a = true;
    }

    public void b(View view) {
        if (!this.a) {
            this.c.a.setVisibility(this.b);
        }
    }

    public void c(View view) {
        this.c.a.setVisibility(0);
    }
}
