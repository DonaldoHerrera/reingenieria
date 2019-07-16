package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.z;

/* renamed from: androidx.appcompat.widget.v reason: case insensitive filesystem */
/* compiled from: AppCompatSpinner */
class C0354v extends H {
    final /* synthetic */ b j;
    final /* synthetic */ AppCompatSpinner k;

    C0354v(AppCompatSpinner appCompatSpinner, View view, b bVar) {
        this.k = appCompatSpinner;
        this.j = bVar;
        super(view);
    }

    public z a() {
        return this.j;
    }

    public boolean b() {
        if (!this.k.g.d()) {
            this.k.g.c();
        }
        return true;
    }
}
