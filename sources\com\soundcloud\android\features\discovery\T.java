package com.soundcloud.android.features.discovery;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.soundcloud.android.features.discovery.Q.i;
import com.soundcloud.android.features.discovery.Q.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.view.CircularBorderImageView;
import com.soundcloud.android.view.ParallaxImageView;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.List;

/* compiled from: SingleSelectionContentCardRenderer.kt */
public class T extends C5541_ta<d> {
    /* access modifiers changed from: private */
    public final C6781kVa<C3445NY> a;
    private final N b;
    private final Resources c;

    public T(N n, Resources resources) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(resources, "resources");
        this.b = n;
        this.c = resources;
        C6781kVa<C3445NY> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.discovery_single_selection_card, viewGroup, false);
        C7471uYa.a((Object) inflate, "inflate(R.layout.discove…tion_card, parent, false)");
        C7471uYa.a((Object) inflate, "with(LayoutInflater.from…ard, parent, false)\n    }");
        return inflate;
    }

    public void a(int i, View view, d dVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(dVar, "item");
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.single_card_title);
        C7471uYa.a((Object) customFontTextView, "itemView.single_card_title");
        a((TextView) customFontTextView, dVar.g());
        CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.single_card_description);
        C7471uYa.a((Object) customFontTextView2, "itemView.single_card_description");
        a((TextView) customFontTextView2, dVar.b());
        ParallaxImageView parallaxImageView = (ParallaxImageView) view.findViewById(i.single_card_artwork);
        C7471uYa.a((Object) parallaxImageView, "itemView.single_card_artwork");
        a((ImageView) parallaxImageView, dVar.c());
        b(view, dVar);
        a(view, dVar);
    }

    private void b(View view, d dVar) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i.single_card_social_proof_container);
        C7471uYa.a((Object) linearLayout, "socialProofView.single_card_social_proof_container");
        a(linearLayout, dVar.e(), dVar.f());
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.single_card_social_proof);
        C7471uYa.a((Object) customFontTextView, "socialProofView.single_card_social_proof");
        a((TextView) customFontTextView, dVar.e());
        a(view, dVar.f());
    }

    public C6781kVa<C3445NY> a() {
        return this.a;
    }

    private void a(TextView textView, String str) {
        if (str != null) {
            textView.setVisibility(0);
            textView.setText(str);
            return;
        }
        textView.setVisibility(8);
    }

    private void a(ImageView imageView, C3445NY ny) {
        C3508cda f = ny.f();
        if (f != null) {
            N n = this.b;
            C4928GKa b2 = C4928GKa.b(ny.b());
            C7471uYa.a((Object) b2, "fromNullable(selectionItem.artworkUrlTemplate)");
            C3721b b3 = C3721b.b(this.c);
            C7471uYa.a((Object) b3, "ApiImageSize.getFullImageSize(resources)");
            n.a(f, b2, b3, imageView, false);
        }
    }

    private void a(LinearLayout linearLayout, String str, List<String> list) {
        if (str != null || (!list.isEmpty())) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    private void a(View view, List<String> list) {
        CircularBorderImageView circularBorderImageView = (CircularBorderImageView) view.findViewById(i.single_card_user_artwork_1);
        C7471uYa.a((Object) circularBorderImageView, "container.single_card_user_artwork_1");
        int i = 0;
        CircularBorderImageView circularBorderImageView2 = (CircularBorderImageView) view.findViewById(i.single_card_user_artwork_2);
        C7471uYa.a((Object) circularBorderImageView2, "container.single_card_user_artwork_2");
        CircularBorderImageView circularBorderImageView3 = (CircularBorderImageView) view.findViewById(i.single_card_user_artwork_3);
        C7471uYa.a((Object) circularBorderImageView3, "container.single_card_user_artwork_3");
        CircularBorderImageView circularBorderImageView4 = (CircularBorderImageView) view.findViewById(i.single_card_user_artwork_4);
        C7471uYa.a((Object) circularBorderImageView4, "container.single_card_user_artwork_4");
        CircularBorderImageView circularBorderImageView5 = (CircularBorderImageView) view.findViewById(i.single_card_user_artwork_5);
        C7471uYa.a((Object) circularBorderImageView5, "container.single_card_user_artwork_5");
        List<ImageView> b2 = C6918mWa.b((Object[]) new ImageView[]{circularBorderImageView, circularBorderImageView2, circularBorderImageView3, circularBorderImageView4, circularBorderImageView5});
        String str = "container.single_card_user_artwork_single";
        if (list.size() == 1) {
            for (ImageView visibility : b2) {
                visibility.setVisibility(8);
            }
            CircularBorderImageView circularBorderImageView6 = (CircularBorderImageView) view.findViewById(i.single_card_user_artwork_single);
            C7471uYa.a((Object) circularBorderImageView6, str);
            a((ImageView) circularBorderImageView6, a(list, 0));
            return;
        }
        CircularBorderImageView circularBorderImageView7 = (CircularBorderImageView) view.findViewById(i.single_card_user_artwork_single);
        C7471uYa.a((Object) circularBorderImageView7, str);
        circularBorderImageView7.setVisibility(8);
        for (Object next : b2) {
            int i2 = i + 1;
            if (i >= 0) {
                a((ImageView) next, a(list, i));
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
    }

    private C4928GKa<String> a(List<String> list, int i) {
        String str;
        C4928GKa<String> gKa;
        if (list.size() > i) {
            gKa = C4928GKa.c(list.get(i));
            str = "Optional.of(get(position))";
        } else {
            gKa = C4928GKa.a();
            str = "absent()";
        }
        C7471uYa.a((Object) gKa, str);
        return gKa;
    }

    private void a(ImageView imageView, C4928GKa<String> gKa) {
        if (gKa.c()) {
            imageView.setVisibility(0);
            N n = this.b;
            C3508cda cda = C3508cda.a;
            C7471uYa.a((Object) cda, "Urn.NOT_SET");
            C3721b c2 = C3721b.c(this.c);
            C7471uYa.a((Object) c2, "ApiImageSize.getListItemImageSize(resources)");
            N.a(n, cda, gKa, c2, imageView, null, 16, null);
            return;
        }
        imageView.setVisibility(8);
    }

    private void a(View view, d dVar) {
        view.setOnClickListener(new S(this, dVar));
    }
}
