package com.soundcloud.android.trackinfo;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.soundcloud.android.trackinfo.C.a;
import com.soundcloud.android.trackinfo.C.b;
import com.soundcloud.android.trackinfo.C.c;
import com.soundcloud.android.trackinfo.C.d;
import com.soundcloud.android.trackinfo.x.h;
import com.soundcloud.android.trackinfo.x.i;
import com.soundcloud.android.trackinfo.x.m;
import com.soundcloud.android.trackinfo.x.n;
import java.util.Locale;

/* compiled from: NewTrackInfoAdapter.kt */
public final class l extends C5378VEa<B> {
    private final TextView a;
    private final TextView b;
    private final ViewGroup c;
    private final TextView d;
    private final CustomStatsView e;
    private final CustomStatsView f;
    private final CustomStatsView g;
    private final ProgressBar h;
    private final TextView i;
    private final View j;
    private final ViewGroup k;
    private final TextView l;
    private final ViewGroup m;
    private final TextView n;
    private final TextView o;
    /* access modifiers changed from: private */
    public final w p;

    public l(View view, w wVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(wVar, "onCommentDialogClickLister");
        super(view);
        this.p = wVar;
        View findViewById = view.findViewById(i.trackInfoTitle);
        C7471uYa.a((Object) findViewById, "itemView.findViewById(R.id.trackInfoTitle)");
        this.a = (TextView) findViewById;
        View findViewById2 = view.findViewById(i.trackInfoCreator);
        C7471uYa.a((Object) findViewById2, "itemView.findViewById(R.id.trackInfoCreator)");
        this.b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(i.trackInfoStatsHolderLayout);
        C7471uYa.a((Object) findViewById3, "itemView.findViewById(R.…ackInfoStatsHolderLayout)");
        this.c = (ViewGroup) findViewById3;
        View findViewById4 = view.findViewById(i.trackInfoPrivateIndicator);
        C7471uYa.a((Object) findViewById4, "itemView.findViewById(R.…rackInfoPrivateIndicator)");
        this.d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(i.trackInfoPlayStat);
        C7471uYa.a((Object) findViewById5, "itemView.findViewById(R.id.trackInfoPlayStat)");
        this.e = (CustomStatsView) findViewById5;
        View findViewById6 = view.findViewById(i.trackInfoLikeStat);
        C7471uYa.a((Object) findViewById6, "itemView.findViewById(R.id.trackInfoLikeStat)");
        this.f = (CustomStatsView) findViewById6;
        View findViewById7 = view.findViewById(i.trackInfoRepostStat);
        C7471uYa.a((Object) findViewById7, "itemView.findViewById(R.id.trackInfoRepostStat)");
        this.g = (CustomStatsView) findViewById7;
        View findViewById8 = view.findViewById(i.trackInfoLoading);
        C7471uYa.a((Object) findViewById8, "itemView.findViewById(R.id.trackInfoLoading)");
        this.h = (ProgressBar) findViewById8;
        View findViewById9 = view.findViewById(i.trackInfoComments);
        C7471uYa.a((Object) findViewById9, "itemView.findViewById(R.id.trackInfoComments)");
        this.i = (TextView) findViewById9;
        View findViewById10 = view.findViewById(i.trackInfoCommentsDivider);
        C7471uYa.a((Object) findViewById10, "itemView.findViewById(R.…trackInfoCommentsDivider)");
        this.j = findViewById10;
        View findViewById11 = view.findViewById(i.trackInfoCommentsHolder);
        C7471uYa.a((Object) findViewById11, "itemView.findViewById(R.….trackInfoCommentsHolder)");
        this.k = (ViewGroup) findViewById11;
        View findViewById12 = view.findViewById(i.trackInfoUploadedAt);
        C7471uYa.a((Object) findViewById12, "itemView.findViewById(R.id.trackInfoUploadedAt)");
        this.l = (TextView) findViewById12;
        View findViewById13 = view.findViewById(i.trackInfoDescriptionHolder);
        C7471uYa.a((Object) findViewById13, "itemView.findViewById(R.…ackInfoDescriptionHolder)");
        this.m = (ViewGroup) findViewById13;
        View findViewById14 = view.findViewById(i.trackInfoDescription);
        C7471uYa.a((Object) findViewById14, "itemView.findViewById(R.id.trackInfoDescription)");
        this.n = (TextView) findViewById14;
        View findViewById15 = view.findViewById(i.trackInfoNoDescription);
        C7471uYa.a((Object) findViewById15, "itemView.findViewById(R.id.trackInfoNoDescription)");
        this.o = (TextView) findViewById15;
    }

    private final Resources b() {
        View view = this.itemView;
        C7471uYa.a((Object) view, "itemView");
        Context context = view.getContext();
        C7471uYa.a((Object) context, "itemView.context");
        Resources resources = context.getResources();
        C7471uYa.a((Object) resources, "itemView.context.resources");
        return resources;
    }

    private final void c() {
        E.a(this.h);
    }

    private final void d() {
        E.b(this.h);
    }

    private final void e(String str) {
        this.a.setText(str);
        this.a.setVisibility(0);
    }

    private final void f(B b2) {
        if (!b2.e().a()) {
            E.a(this.e);
            return;
        }
        E.b(this.e);
        C e2 = b2.e();
        if (e2 != null) {
            c cVar = (c) e2;
            this.e.setStatValue(((c) b2.e()).b());
            this.e.setStatDrawable(h.ic_plays_grey_vector);
            return;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.trackinfo.TrackStats.PlaysStats");
    }

    private final void g(B b2) {
        if (!b2.f().a()) {
            E.a(this.g);
            return;
        }
        E.b(this.g);
        C f2 = b2.f();
        if (f2 != null) {
            d dVar = (d) f2;
            this.g.setStatValue(((d) b2.f()).b());
            this.g.setStatDrawable(h.ic_repost_grey_vector);
            return;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.trackinfo.TrackStats.RepostsStats");
    }

    private final void h(B b2) {
        if (b2.e().a() && b2.d().a()) {
            C6143a.a(this.e);
        }
        if (b2.e().a() && b2.f().a()) {
            C6143a.a(this.e);
        }
        if (b2.d().a() && b2.f().a()) {
            C6143a.a(this.f);
        }
    }

    private final void b(B b2) {
        if (b2.b().a()) {
            C b3 = b2.b();
            if (b3 != null) {
                a aVar = (a) b3;
                int b4 = ((a) b2.b()).b();
                TextView textView = this.i;
                E.a(textView, Integer.valueOf(h.ic_comments_grey_vector), null, null, null, 14, null);
                textView.setText(a(b4));
                this.k.setOnClickListener(new k(this, b2));
                E.b(this.k);
                E.b(this.i);
                E.b(this.j);
                return;
            }
            throw new OVa("null cannot be cast to non-null type com.soundcloud.android.trackinfo.TrackStats.CommentsStats");
        }
        E.a(this.k);
        E.a(this.i);
        E.a(this.j);
    }

    private final void c(String str) {
        E.b(this.m);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (!Cxb.a(str2)) {
            E.a(this.o);
            TextView textView = this.n;
            E.b(textView);
            String property = System.getProperty("line.separator");
            C7471uYa.a((Object) property, "getProperty(\"line.separator\")");
            textView.setText(Html.fromHtml(Cxb.a(str2, property, "<br/>", false, 4, (Object) null)));
        } else {
            E.a(this.n);
            E.b(this.o);
        }
        c();
    }

    private final void d(String str) {
        this.b.setText(str);
        E.b(this.b);
    }

    private final void e(B b2) {
        if (!b2.d().a()) {
            E.a(this.f);
            return;
        }
        E.b(this.f);
        C d2 = b2.d();
        if (d2 != null) {
            b bVar = (b) d2;
            this.f.setStatValue(((b) b2.d()).b());
            this.f.setStatDrawable(h.ic_like_grey_vector);
            return;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.trackinfo.TrackStats.LikesStats");
    }

    public void a(B b2) {
        C7471uYa.b(b2, "item");
        d();
        C3493aea a2 = b2.a();
        e(a2.b().w());
        d(a2.b().f());
        c(a2.a());
        a(a2.b().d().getTime());
        c(b2);
        b(b2);
    }

    private final void d(B b2) {
        f(b2);
        e(b2);
        g(b2);
        h(b2);
    }

    private final void a(long j2) {
        String a2 = C7315sGa.a(b(), j2, true);
        Locale locale = Locale.getDefault();
        C7471uYa.a((Object) locale, "Locale.getDefault()");
        if (a2 != null) {
            String lowerCase = a2.toLowerCase(locale);
            C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            E.b(this.l);
            this.l.setText(b().getString(n.uploaded_xtimeago, new Object[]{lowerCase}));
            return;
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    private final void c(B b2) {
        if (b2.a().b().A()) {
            E.a(this.c);
            TextView textView = this.d;
            E.a(textView, Integer.valueOf(h.ic_lock_orange_12_vector), null, null, null, 14, null);
            E.b(textView);
            return;
        }
        E.b(this.c);
        E.a(this.d);
        d(b2);
    }

    private final String a(int i2) {
        String quantityString = b().getQuantityString(m.trackinfo_comments, i2, new Object[]{Integer.valueOf(i2)});
        C7471uYa.a((Object) quantityString, "resources.getQuantityStr…entsCount, commentsCount)");
        return quantityString;
    }
}
