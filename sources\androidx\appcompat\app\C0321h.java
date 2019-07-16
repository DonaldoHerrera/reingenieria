package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.appcompat.app.AlertController.a;

/* renamed from: androidx.appcompat.app.h reason: case insensitive filesystem */
/* compiled from: AlertController */
class C0321h extends ArrayAdapter<CharSequence> {
    final /* synthetic */ RecycleListView a;
    final /* synthetic */ a b;

    C0321h(a aVar, Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
        this.b = aVar;
        this.a = recycleListView;
        super(context, i, i2, charSequenceArr);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.b.F;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
