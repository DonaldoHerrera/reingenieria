package androidx.appcompat.app;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.b;

/* renamed from: androidx.appcompat.app.d reason: case insensitive filesystem */
/* compiled from: AlertController */
class C0317d implements b {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ AlertController c;

    C0317d(AlertController alertController, View view, View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        AlertController.a(nestedScrollView, this.a, this.b);
    }
}
