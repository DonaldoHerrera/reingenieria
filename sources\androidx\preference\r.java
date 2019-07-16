package androidx.preference;

import androidx.preference.PreferenceGroup.b;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.c;

/* compiled from: PreferenceFragmentCompat */
class r implements Runnable {
    final /* synthetic */ Preference a;
    final /* synthetic */ String b;
    final /* synthetic */ s c;

    r(s sVar, Preference preference, String str) {
        this.c = sVar;
        this.a = preference;
        this.b = str;
    }

    public void run() {
        int i;
        a adapter = this.c.mList.getAdapter();
        if (adapter instanceof b) {
            Preference preference = this.a;
            if (preference != null) {
                i = ((b) adapter).a(preference);
            } else {
                i = ((b) adapter).a(this.b);
            }
            if (i != -1) {
                this.c.mList.i(i);
            } else {
                adapter.a((c) new e(adapter, this.c.mList, this.a, this.b));
            }
        } else if (adapter != null) {
            throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
        }
    }
}
