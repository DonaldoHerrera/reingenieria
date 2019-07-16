package com.soundcloud.android.playback.ui.view;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

/* compiled from: PlayerCommentRenderer.kt */
public class i {
    private final N a;

    public i(N n) {
        C7471uYa.b(n, "imageOperations");
        this.a = n;
    }

    public N a() {
        return this.a;
    }

    public ViewGroup a(C3799jda jda, ViewGroup viewGroup) {
        C7471uYa.b(jda, "commentWithAuthor");
        C7471uYa.b(viewGroup, "playerCommentHolder");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.player_comment_layout, viewGroup, false);
        if (inflate != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            TextView textView = (TextView) viewGroup2.findViewById(com.soundcloud.android.ia.i.comment_text);
            C7471uYa.a((Object) textView, "commentText");
            textView.setText(jda.c().a());
            N a2 = a();
            C3508cda cda = jda.b().a;
            C4928GKa b = C4928GKa.b(jda.b().l);
            C7471uYa.a((Object) b, "Optional.fromNullable(co…hAuthor.author.avatarUrl)");
            C3721b c = C3721b.c(viewGroup2.getResources());
            C7471uYa.a((Object) c, "ApiImageSize.getListItemImageSize(resources)");
            View findViewById = viewGroup2.findViewById(com.soundcloud.android.ia.i.comment_avatar);
            C7471uYa.a((Object) findViewById, "findViewById(R.id.comment_avatar)");
            a2.a(cda, b, c, (ImageView) findViewById, a.c(viewGroup2.getContext(), h.circle_player_comment_avatar_placeholder));
            return viewGroup2;
        }
        throw new OVa("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public void a(ViewGroup viewGroup, boolean z, Fd fd) {
        int i;
        C7471uYa.b(viewGroup, "viewGroup");
        TextView textView = (TextView) viewGroup.findViewById(com.soundcloud.android.ia.i.comment_text);
        String str = "this";
        if (z) {
            C7471uYa.a((Object) textView, str);
            a((View) textView, a.a(textView.getContext(), f.white_10));
            return;
        }
        C7471uYa.a((Object) textView, str);
        if (fd != null) {
            Integer a2 = a(fd);
            if (a2 != null) {
                i = a2.intValue();
                a((View) textView, i);
            }
        }
        i = a.a(textView.getContext(), f.black_95);
        a((View) textView, i);
    }

    private Integer a(Fd fd) {
        d c = fd.c();
        if (c == null) {
            c = fd.b();
        }
        if (c != null) {
            return Integer.valueOf(c.d());
        }
        return null;
    }

    public void a(View view, int i) {
        C7471uYa.b(view, "v");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(view.getResources().getDimension(g.player_comment_bg_radius));
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
    }
}
