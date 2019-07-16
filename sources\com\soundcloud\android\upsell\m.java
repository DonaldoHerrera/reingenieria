package com.soundcloud.android.upsell;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.upsell.l.b;

@EVa(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001*B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u0018J%\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H$J\u0010\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H$J\u0018\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016H$J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/soundcloud/android/upsell/UpsellItemRenderer;", "BaseT", "", "ItemT", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "(Lcom/soundcloud/android/configuration/plans/FeatureOperations;)V", "hasBeenBound", "", "itemCallback", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/upsell/UpsellItemCallback;", "getItemCallback", "()Lio/reactivex/subjects/PublishSubject;", "listener", "Lcom/soundcloud/android/upsell/UpsellItemRenderer$Listener;", "bindActionButton", "", "view", "Landroid/view/View;", "position", "", "item", "(Landroid/view/View;ILjava/lang/Object;)V", "bindItemView", "itemView", "(ILandroid/view/View;Ljava/lang/Object;)V", "createItemView", "parent", "Landroid/view/ViewGroup;", "getDescription", "", "context", "Landroid/content/Context;", "getTitle", "getTrialActionButtonText", "trialDays", "setButtonText", "action", "Landroid/widget/Button;", "setListener", "Listener", "base_release"}, mv = {1, 1, 15})
/* compiled from: UpsellItemRenderer.kt */
public abstract class m<BaseT, ItemT extends BaseT> extends C5541_ta<ItemT> {
    /* access modifiers changed from: private */
    public a<ItemT> a;
    private boolean b;
    private final C6781kVa<l> c;
    private final C2436_U d;

    /* compiled from: UpsellItemRenderer.kt */
    public interface a<T> {
        void a(int i, T t);

        void a(Context context, int i, T t);

        void a(T t);
    }

    public m(C2436_U _u) {
        C7471uYa.b(_u, "featureOperations");
        this.d = _u;
        C6781kVa<l> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.c = s;
    }

    /* access modifiers changed from: protected */
    public abstract String a(Context context);

    /* access modifiers changed from: protected */
    public abstract String a(Context context, int i);

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        this.c.a(b.a);
        return viewGroup;
    }

    /* access modifiers changed from: protected */
    public abstract String b(Context context);

    public final C6781kVa<l> a() {
        return this.c;
    }

    public void a(int i, View view, ItemT itemt) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(itemt, "item");
        if (!this.b) {
            a<ItemT> aVar = this.a;
            if (aVar != null) {
                aVar.a(itemt);
            }
        }
        View findViewById = view.findViewById(i.title);
        C7471uYa.a((Object) findViewById, "itemView.findViewById<TextView>(R.id.title)");
        TextView textView = (TextView) findViewById;
        Context context = view.getContext();
        String str = "itemView.context";
        C7471uYa.a((Object) context, str);
        textView.setText(b(context));
        View findViewById2 = view.findViewById(i.description);
        C7471uYa.a((Object) findViewById2, "itemView.findViewById<TextView>(R.id.description)");
        TextView textView2 = (TextView) findViewById2;
        Context context2 = view.getContext();
        C7471uYa.a((Object) context2, str);
        textView2.setText(a(context2));
        view.setEnabled(false);
        ((ImageButton) view.findViewById(i.close_button)).setOnClickListener(new o(this, i, itemt));
        a(view, i, itemt);
    }

    private final void a(View view, int i, ItemT itemt) {
        Button button = (Button) view.findViewById(i.action_button);
        C7471uYa.a((Object) button, "action");
        a(view, button);
        button.setOnClickListener(new n(this, view, i, itemt));
    }

    private final void a(View view, Button button) {
        if (this.d.k()) {
            Context context = view.getContext();
            C7471uYa.a((Object) context, "view.context");
            button.setText(a(context, this.d.g()));
            return;
        }
        button.setText(p.upsell_upgrade_button);
    }

    public final void a(a<ItemT> aVar) {
        C7471uYa.b(aVar, CastExtraArgs.LISTENER);
        this.a = aVar;
    }
}
