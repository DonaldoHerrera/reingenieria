package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceFragmentCompat */
class q implements Runnable {
    final /* synthetic */ s a;

    q(s sVar) {
        this.a = sVar;
    }

    public void run() {
        RecyclerView recyclerView = this.a.mList;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
