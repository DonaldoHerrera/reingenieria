package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.appcompat.app.AlertController.a;

/* renamed from: androidx.appcompat.app.k reason: case insensitive filesystem */
/* compiled from: AlertController */
class C0324k implements OnItemClickListener {
    final /* synthetic */ RecycleListView a;
    final /* synthetic */ AlertController b;
    final /* synthetic */ a c;

    C0324k(a aVar, RecycleListView recycleListView, AlertController alertController) {
        this.c = aVar;
        this.a = recycleListView;
        this.b = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.c.F;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        this.c.J.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
