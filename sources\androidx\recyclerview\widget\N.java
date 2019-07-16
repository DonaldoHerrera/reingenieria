package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0425t.c;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.a;
import java.util.List;

/* compiled from: ListAdapter */
public abstract class N<T, VH extends ViewHolder> extends a<VH> {
    private final C0413g<T> c;

    protected N(c<T> cVar) {
        this.c = new C0413g<>(new C0408b(this), new C0409c.a(cVar).a());
    }

    public void a(List<T> list) {
        this.c.a(list);
    }

    public int b() {
        return this.c.a().size();
    }

    /* access modifiers changed from: protected */
    public T f(int i) {
        return this.c.a().get(i);
    }
}
