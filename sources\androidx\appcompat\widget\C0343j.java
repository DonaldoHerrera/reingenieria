package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* renamed from: androidx.appcompat.widget.j reason: case insensitive filesystem */
/* compiled from: ActivityChooserView */
class C0343j extends DataSetObserver {
    final /* synthetic */ ActivityChooserView a;

    C0343j(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public void onChanged() {
        super.onChanged();
        this.a.a.notifyDataSetChanged();
    }

    public void onInvalidated() {
        super.onInvalidated();
        this.a.a.notifyDataSetInvalidated();
    }
}
