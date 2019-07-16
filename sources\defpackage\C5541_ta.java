package defpackage;

import android.view.View;
import android.view.ViewGroup;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ3\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u001a\u0010\u0012\u001a\f0\u0013R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\f\u001a\f0\u0013R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\t¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "ItemT", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "()V", "bindItemView", "", "position", "", "itemView", "Landroid/view/View;", "item", "(ILandroid/view/View;Ljava/lang/Object;)V", "viewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "(ILandroid/view/View;Ljava/lang/Object;Lcom/soundcloud/android/uniflow/android/ScViewHolder;)V", "createItemView", "parent", "Landroid/view/ViewGroup;", "createViewHolder", "Lcom/soundcloud/android/presentation/LegacyCellRenderer$LegacyViewHolder;", "view", "LegacyViewHolder", "base_release"}, mv = {1, 1, 15})
/* renamed from: _ta reason: default package and case insensitive filesystem */
/* compiled from: LegacyCellRenderer.kt */
public abstract class C5541_ta<ItemT> implements C6289dFa<ItemT> {

    /* renamed from: _ta$a */
    /* compiled from: LegacyCellRenderer.kt */
    public final class a extends C5378VEa<ItemT> {
        final /* synthetic */ C5541_ta a;

        public a(C5541_ta _ta, View view) {
            C7471uYa.b(view, "view");
            this.a = _ta;
            super(view);
        }

        public void a(ItemT itemt) {
            C5541_ta _ta = this.a;
            int adapterPosition = getAdapterPosition();
            View view = this.itemView;
            C7471uYa.a((Object) view, "itemView");
            _ta.a(adapterPosition, view, itemt, this);
        }
    }

    public abstract View b(ViewGroup viewGroup);

    public a a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return new a<>(this, b(viewGroup));
    }

    public void a(int i, View view, ItemT itemt) {
        C7471uYa.b(view, "itemView");
        throw new GVa(null, 1, null);
    }

    public void a(int i, View view, ItemT itemt, C5378VEa<ItemT> vEa) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(vEa, "viewHolder");
        a(i, view, itemt);
    }
}
