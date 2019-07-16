package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import androidx.appcompat.app.AlertController.a;

/* renamed from: androidx.appcompat.app.j reason: case insensitive filesystem */
/* compiled from: AlertController */
class C0323j implements OnItemClickListener {
    final /* synthetic */ AlertController a;
    final /* synthetic */ a b;

    C0323j(a aVar, AlertController alertController) {
        this.b = aVar;
        this.a = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.x.onClick(this.a.b, i);
        if (!this.b.H) {
            this.a.b.dismiss();
        }
    }
}
