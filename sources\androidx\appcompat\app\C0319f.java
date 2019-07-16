package androidx.appcompat.app;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: androidx.appcompat.app.f reason: case insensitive filesystem */
/* compiled from: AlertController */
class C0319f implements OnScrollListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ AlertController c;

    C0319f(AlertController alertController, View view, View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.a(absListView, this.a, this.b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
