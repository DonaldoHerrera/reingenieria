package com.soundcloud.android.features.library.likes.search;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.tracks.C6192pa;
import com.soundcloud.android.tracks.Ea;

/* compiled from: TrackLikesSearchItemRenderer.kt */
public final class z extends C5541_ta<x> {
    /* access modifiers changed from: private */
    public final C6781kVa<Integer> a;
    private final C6192pa b;

    public z(C6192pa paVar) {
        C7471uYa.b(paVar, "trackItemRenderer");
        this.b = paVar;
        C6781kVa<Integer> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Int>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.b.b(viewGroup);
    }

    public void a(int i, View view, x xVar, C5378VEa<x> vEa) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(xVar, "item");
        C7471uYa.b(vEa, "viewHolder");
        view.setOnClickListener(new y(this, vEa));
        C6192pa.a(this.b, xVar.c(), view, (I) null, 4, (Object) null);
        Object tag = view.getTag();
        C7471uYa.a(tag, "itemView.tag");
        if (tag instanceof Ea) {
            Ea ea = (Ea) tag;
            String a2 = xVar.a();
            String b2 = ea.b();
            C7471uYa.a((Object) b2, "trackViewHolder.creator");
            Context context = view.getContext();
            String str = "itemView.context";
            C7471uYa.a((Object) context, str);
            ea.a((CharSequence) a(a2, b2, context));
            String a3 = xVar.a();
            String e = ea.e();
            C7471uYa.a((Object) e, "trackViewHolder.title");
            Context context2 = view.getContext();
            C7471uYa.a((Object) context2, str);
            ea.b((CharSequence) a(a3, e, context2));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(tag);
        sb.append(" not of type ");
        sb.append(Ea.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    private final SpannableString a(String str, String str2, Context context) {
        C7642wwa a2 = C7711xwa.a(str, str2);
        SpannableString spannableString = new SpannableString(str2);
        C7711xwa.a(context, spannableString, a2);
        return spannableString;
    }

    public final APa<Integer> a() {
        return this.a;
    }
}
