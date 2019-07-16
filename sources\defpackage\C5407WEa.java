package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: WEa reason: default package and case insensitive filesystem */
/* compiled from: UniflowAdapter.kt */
public abstract class C5407WEa<T> extends a<C5378VEa<T>> {
    private final SparseArray<C6289dFa<? extends T>> c;
    private final C5109MEa d;
    private C7796zEa e;
    private final List<T> f;

    public C5407WEa(C5693cFa<? extends T>... cfaArr) {
        C7471uYa.b(cfaArr, "viewHolderBindings");
        this.d = g();
        this.e = C7796zEa.IDLE;
        this.f = new ArrayList();
        this.c = new SparseArray<>(cfaArr.length);
        for (C5693cFa<? extends T> cfa : cfaArr) {
            this.c.put(cfa.a(), cfa.b());
        }
    }

    /* renamed from: a */
    public void b(C5378VEa<T> vEa, int i) {
        C7471uYa.b(vEa, "scViewHolder");
        if (b(i) == Integer.MIN_VALUE) {
            C5109MEa mEa = this.d;
            View view = vEa.itemView;
            C7471uYa.a((Object) view, "scViewHolder.itemView");
            mEa.a(view, this.e == C7796zEa.ERROR);
            return;
        }
        vEa.a(h().get(i));
        b(vEa, i);
    }

    public void b(C5378VEa<T> vEa, int i) {
        C7471uYa.b(vEa, "scViewHolder");
    }

    public abstract int f(int i);

    public void f() {
        h().clear();
    }

    public C5109MEa g() {
        return new C4767BEa(k.list_loading_item);
    }

    public List<T> h() {
        return this.f;
    }

    public boolean i() {
        return h().isEmpty();
    }

    public T g(int i) {
        return h().get(i);
    }

    public void h(int i) {
        h().remove(i);
    }

    public int b() {
        if (h().isEmpty()) {
            return 0;
        }
        return this.e == C7796zEa.IDLE ? h().size() : h().size() + 1;
    }

    public void a(OnClickListener onClickListener) {
        C7471uYa.b(onClickListener, "onErrorRetryListener");
        this.d.a(onClickListener);
    }

    public C5378VEa<T> b(ViewGroup viewGroup, int i) {
        C7471uYa.b(viewGroup, "parent");
        if (i == Integer.MIN_VALUE) {
            return new C5140NEa(this.d.a(viewGroup));
        }
        C5378VEa<T> a = ((C6289dFa) this.c.get(i)).a(viewGroup);
        if (a != null) {
            return a;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.uniflow.android.ScViewHolder<T>");
    }

    public void a(C7796zEa zea) {
        C7471uYa.b(zea, "newState");
        if (this.e != zea) {
            this.e = zea;
            e();
        }
    }

    public int b(int i) {
        if (this.e == C7796zEa.IDLE || i != h().size()) {
            return f(i);
        }
        return Integer.MIN_VALUE;
    }

    public C5407WEa(C6289dFa<T> dfa) {
        C7471uYa.b(dfa, "viewHolderFactory");
        this.d = g();
        this.e = C7796zEa.IDLE;
        this.f = new ArrayList();
        this.c = new SparseArray<>(1);
        this.c.put(0, dfa);
    }

    public void a(T t) {
        h().add(t);
    }

    public void a(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "items");
        for (Object a : iterable) {
            a((T) a);
        }
        e();
    }
}
