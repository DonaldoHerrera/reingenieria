package androidx.preference;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: PreferenceViewHolder */
public class C extends ViewHolder {
    private final SparseArray<View> a = new SparseArray<>(4);
    private boolean b;
    private boolean c;

    C(View view) {
        super(view);
        this.a.put(16908310, view.findViewById(16908310));
        this.a.put(16908304, view.findViewById(16908304));
        this.a.put(16908294, view.findViewById(16908294));
        SparseArray<View> sparseArray = this.a;
        int i = F.icon_frame;
        sparseArray.put(i, view.findViewById(i));
        this.a.put(16908350, view.findViewById(16908350));
    }

    public View a(int i) {
        View view = (View) this.a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.a.put(i, findViewById);
        }
        return findViewById;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public void b(boolean z) {
        this.c = z;
    }

    public void a(boolean z) {
        this.b = z;
    }
}
