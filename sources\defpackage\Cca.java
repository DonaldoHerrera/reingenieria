package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0012B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0012J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0012J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/features/upsell/UpsellHeaderItemRenderer;", "T", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "()V", "itemCallback", "Lcom/jakewharton/rxrelay2/Relay;", "", "getItemCallback", "()Lcom/jakewharton/rxrelay2/Relay;", "adjustForMultiColumnGrid", "view", "Landroid/view/View;", "buildViewHolder", "Lcom/soundcloud/android/features/upsell/UpsellHeaderItemRenderer$Holder;", "parent", "Landroid/view/ViewGroup;", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "Holder", "upsell_release"}, mv = {1, 1, 15})
/* renamed from: Cca reason: default package */
/* compiled from: UpsellHeaderItemRenderer.kt */
public class Cca<T> implements C6289dFa<T> {
    private final C2350WH<RVa> a;

    /* renamed from: Cca$a */
    /* compiled from: UpsellHeaderItemRenderer.kt */
    private static final class a<T> extends C5378VEa<T> {
        public a(View view) {
            C7471uYa.b(view, "view");
            super(view);
        }

        public void a(T t) {
        }
    }

    public Cca() {
        C2332VH s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create()");
        this.a = s;
    }

    private a<T> b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(k.upsell_header_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "view");
        a(inflate);
        inflate.setOnClickListener(new Dca(this));
        return new a<>(inflate);
    }

    public C2350WH<RVa> a() {
        return this.a;
    }

    public C5378VEa<T> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return b(viewGroup);
    }

    private void a(View view) {
        if (view.getLayoutParams() instanceof LayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((LayoutParams) layoutParams).a(true);
                return;
            }
            throw new OVa("null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        }
    }
}
