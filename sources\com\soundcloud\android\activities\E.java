package com.soundcloud.android.activities;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

/* compiled from: ActivityItemRenderer */
public class E extends C5541_ta<B> {
    private final Resources a;
    private final N b;
    private final C2332VH<B> c = C2332VH.s();

    E(Resources resources, N n) {
        this.a = resources;
        this.b = n;
    }

    private void c(View view, B b2) {
        this.b.a(b2.f(), C4928GKa.b(b2.c()), C3721b.c(this.a), (ImageView) view.findViewById(i.image), true);
    }

    private void d(View view, B b2) {
        ((TextView) view.findViewById(i.username)).setText(b2.h());
    }

    private void e(View view, B b2) {
        view.findViewById(i.pro_badge).setVisibility(b2.g() ? 0 : 8);
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.engagement_list_item, viewGroup, false);
    }

    private void b(View view, B b2) {
        ((TextView) view.findViewById(i.date)).setText(C7315sGa.a(this.a, b2.b().getTime(), true));
    }

    public void a(int i, View view, B b2) {
        d(view, b2);
        b(view, b2);
        a(view, b2);
        c(view, b2);
        e(view, b2);
        view.setOnClickListener(new C2538c(this, b2));
    }

    public /* synthetic */ void a(B b2, View view) {
        this.c.accept(b2);
    }

    public APa<B> a() {
        return this.c.h();
    }

    private void a(View view, B b2) {
        String str;
        int i;
        switch (D.a[b2.d().ordinal()]) {
            case 1:
                str = this.a.getString(p.notification_username_started_following_you);
                i = h.ic_followers_grey_vector;
                break;
            case 2:
            case 3:
                str = this.a.getString(p.notification_username_liked_tracktitle, new Object[]{b2.e()});
                i = h.ic_like_grey_vector;
                break;
            case 4:
            case 5:
                str = this.a.getString(p.notification_username_reposted_tracktitle, new Object[]{b2.e()});
                i = h.ic_repost_grey_vector;
                break;
            case 6:
                str = this.a.getString(p.notification_username_commented_on_tracktitle, new Object[]{b2.e()});
                i = h.ic_comments_grey_vector;
                break;
            default:
                throw new IllegalArgumentException("Unexpected activity type");
        }
        TextView textView = (TextView) view.findViewById(i.body);
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }
}
