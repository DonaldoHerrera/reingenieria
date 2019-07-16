package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.B;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.EmptyView.b;

/* renamed from: yY reason: default package and case insensitive filesystem */
/* compiled from: EmptyCardRenderer.kt */
public class C3914yY extends C5541_ta<a> {
    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        Context context = viewGroup.getContext();
        EmptyView a = new B().a(context.getString(p.discovery_empty)).a(g.empty_card_left_padding, g.empty_card_top_padding, g.empty_card_right_padding, g.empty_card_bottom_padding).a(context);
        C7471uYa.a((Object) a, "EmptyViewBuilder()\n     …          .build(context)");
        return a;
    }

    public void a(int i, View view, a aVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(aVar, "item");
        Throwable b = aVar.b();
        if (b == null) {
            b = new C7247rHa();
        }
        b a = C7316sHa.a(b);
        if (view instanceof EmptyView) {
            ((EmptyView) view).a(a);
        }
    }
}
