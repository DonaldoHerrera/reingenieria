package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* renamed from: fJa reason: default package and case insensitive filesystem */
/* compiled from: UserItemRenderer.kt */
public class C6429fJa extends C5541_ta<C4954HFa> {
    private final N a;
    private final C5408WFa b;

    public C6429fJa(N n, C5408WFa wFa) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(wFa, "numberFormatter");
        this.a = n;
        this.b = wFa;
    }

    private void c(View view, C4954HFa hFa) {
        C4928GKa c = hFa.c();
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.list_item_subheader);
        c.a((C7733yKa<? super T>) new C6361eJa<Object>(customFontTextView));
        C7471uYa.a((Object) customFontTextView, "countryText");
        customFontTextView.setVisibility(c.c() ? 0 : 8);
    }

    private void d(View view, C4954HFa hFa) {
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.list_item_counter);
        long d = hFa.d();
        C7471uYa.a((Object) customFontTextView, "followersCountText");
        int i = 0;
        int i2 = (d > ((long) -1) ? 1 : (d == ((long) -1) ? 0 : -1));
        if (!(i2 > 0)) {
            i = 8;
        }
        customFontTextView.setVisibility(i);
        if (i2 > 0) {
            customFontTextView.setText(this.b.a(d));
        }
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.user_list_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…list_item, parent, false)");
        return inflate;
    }

    private void b(View view, C4954HFa hFa) {
        N n = this.a;
        C3508cda a2 = hFa.a();
        C4928GKa b2 = hFa.b();
        C3721b c = C3721b.c(view.getResources());
        C7471uYa.a((Object) c, "ApiImageSize.getListItem…eSize(itemView.resources)");
        View findViewById = view.findViewById(i.image);
        C7471uYa.a((Object) findViewById, "itemView.findViewById(R.id.image)");
        n.a(a2, b2, c, (ImageView) findViewById, true);
    }

    public void a(int i, View view, C4954HFa hFa) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(hFa, "item");
        a(view, hFa);
    }

    public void a(View view, C4954HFa hFa) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(hFa, "user");
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.list_item_header);
        C7471uYa.a((Object) customFontTextView, "itemView.list_item_header");
        customFontTextView.setText(hFa.f());
        ImageView imageView = (ImageView) view.findViewById(i.pro_badge);
        C7471uYa.a((Object) imageView, "itemView.pro_badge");
        imageView.setVisibility(hFa.e() ? 0 : 8);
        c(view, hFa);
        d(view, hFa);
        b(view, hFa);
    }
}
