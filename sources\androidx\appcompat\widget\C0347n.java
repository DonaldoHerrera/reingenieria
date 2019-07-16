package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* renamed from: androidx.appcompat.widget.n reason: case insensitive filesystem */
/* compiled from: ActivityChooserView */
class C0347n extends DataSetObserver {
    final /* synthetic */ ActivityChooserView a;

    C0347n(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public void onChanged() {
        super.onChanged();
        this.a.d();
    }
}
