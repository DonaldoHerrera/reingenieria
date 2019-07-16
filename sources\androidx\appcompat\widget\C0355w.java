package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: androidx.appcompat.widget.w reason: case insensitive filesystem */
/* compiled from: AppCompatSpinner */
class C0355w implements OnItemClickListener {
    final /* synthetic */ AppCompatSpinner a;
    final /* synthetic */ b b;

    C0355w(b bVar, AppCompatSpinner appCompatSpinner) {
        this.b = bVar;
        this.a = appCompatSpinner;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AppCompatSpinner.this.setSelection(i);
        if (AppCompatSpinner.this.getOnItemClickListener() != null) {
            b bVar = this.b;
            AppCompatSpinner.this.performItemClick(view, i, bVar.L.getItemId(i));
        }
        this.b.dismiss();
    }
}
