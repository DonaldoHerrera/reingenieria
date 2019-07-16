package androidx.appcompat.app;

import android.view.View;

/* renamed from: androidx.appcompat.app.g reason: case insensitive filesystem */
/* compiled from: AlertController */
class C0320g implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ AlertController c;

    C0320g(AlertController alertController, View view, View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    public void run() {
        AlertController.a(this.c.g, this.a, this.b);
    }
}
