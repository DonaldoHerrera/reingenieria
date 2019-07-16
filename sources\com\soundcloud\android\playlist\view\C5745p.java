package com.soundcloud.android.playlist.view;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.view.JaggedTextView;
import com.soundcloud.android.view.SquareImageView;

/* renamed from: com.soundcloud.android.playlist.view.p reason: case insensitive filesystem */
/* compiled from: PlaylistCoverRenderer.kt */
public final class C5745p {
    private final N a;

    public C5745p(N n) {
        C7471uYa.b(n, "imageOperations");
        this.a = n;
    }

    private final void b(View view, C6532gqa gqa) {
        TextView c = c(view, gqa);
        c.setText(gqa.l().B());
        c.setVisibility(0);
    }

    private final TextView c(View view, C6532gqa gqa) {
        String str;
        JaggedTextView jaggedTextView;
        if (gqa == null || !gqa.l().m()) {
            jaggedTextView = (JaggedTextView) view.findViewById(i.title);
            str = "view.title";
        } else {
            jaggedTextView = (JaggedTextView) view.findViewById(i.title_private);
            str = "view.title_private";
        }
        C7471uYa.a((Object) jaggedTextView, str);
        return jaggedTextView;
    }

    public final void a(View view, C6532gqa gqa, C6368eQa eqa, C6368eQa eqa2) {
        C7471uYa.b(view, "view");
        C7471uYa.b(gqa, "item");
        C7471uYa.b(eqa, "onHeaderPlay");
        C7471uYa.b(eqa2, "onGoToCreator");
        b(view, gqa);
        b(view, gqa, eqa2);
        a(view, gqa);
        a(view, gqa, eqa);
    }

    private final void b(View view, C6532gqa gqa, C6368eQa eqa) {
        JaggedTextView jaggedTextView = (JaggedTextView) view.findViewById(i.username);
        jaggedTextView.setText(gqa.l().d());
        jaggedTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, gqa.l().C() ? h.pro_badge_inset : 0, 0);
        jaggedTextView.setEnabled(true);
        jaggedTextView.setVisibility(0);
        jaggedTextView.setOnClickListener(new C5744o(gqa, eqa));
    }

    private final void a(View view, C6532gqa gqa) {
        N n = this.a;
        C3508cda a2 = gqa.a();
        C4928GKa b = gqa.b();
        C3721b b2 = C3721b.b(view.getResources());
        C7471uYa.a((Object) b2, "ApiImageSize.getFullImageSize(view.resources)");
        SquareImageView squareImageView = (SquareImageView) view.findViewById(i.artwork);
        C7471uYa.a((Object) squareImageView, "view.artwork");
        n.c(a2, b, b2, squareImageView);
    }

    private final void a(View view, C6532gqa gqa, C6368eQa eqa) {
        ImageButton imageButton = (ImageButton) view.findViewById(i.btn_play);
        imageButton.setOnClickListener(new C5743n(eqa, gqa));
        String str = "this";
        if (!gqa.f() || gqa.q()) {
            C7471uYa.a((Object) imageButton, str);
            C6428fIa.a((View) imageButton);
            return;
        }
        C7471uYa.a((Object) imageButton, str);
        C6428fIa.b(imageButton);
    }
}
