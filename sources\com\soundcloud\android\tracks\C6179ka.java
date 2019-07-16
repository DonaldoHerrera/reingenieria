package com.soundcloud.android.tracks;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;
import java.util.Locale;

/* renamed from: com.soundcloud.android.tracks.ka reason: case insensitive filesystem */
/* compiled from: TrackInfoPresenter */
public class C6179ka {
    private final Resources a;
    private final C5408WFa b;
    private final Va c;

    /* renamed from: com.soundcloud.android.tracks.ka$a */
    /* compiled from: TrackInfoPresenter */
    interface a {
        void a();
    }

    C6179ka(Resources resources, C5408WFa wFa, Va va) {
        this.a = resources;
        this.b = wFa;
        this.c = va;
    }

    private void c(View view, C6185ma maVar) {
        String lowerCase = C7315sGa.a(this.a, maVar.I().getTime(), true).toLowerCase(Locale.getDefault());
        a(view, i.uploaded_at, this.a.getString(p.uploaded_xtimeago, new Object[]{lowerCase}));
    }

    private void d(View view, C6185ma maVar) {
        f(view, maVar);
        e(view, maVar);
        g(view, maVar);
        d(view);
        c(view);
    }

    private void e(View view, C6185ma maVar) {
        if (this.c.a((C3855qda) maVar)) {
            a(view, i.likes, this.b.a((long) maVar.q()));
        } else {
            view.findViewById(i.likes).setVisibility(8);
        }
    }

    private void f(View view, C6185ma maVar) {
        if (this.c.b(maVar)) {
            a(view, i.plays, this.b.a((long) maVar.S()));
        } else {
            view.findViewById(i.plays).setVisibility(8);
        }
    }

    private void g(View view, C6185ma maVar) {
        if (this.c.b((C3855qda) maVar)) {
            a(view, i.reposts, this.b.a((long) maVar.z()));
        } else {
            view.findViewById(i.reposts).setVisibility(8);
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(l.track_info, viewGroup, false);
    }

    /* access modifiers changed from: 0000 */
    public void b(View view) {
        a(view, i.description);
        b(view, i.loading);
    }

    public void a(View view, C6185ma maVar, a aVar) {
        a(view, i.track_info_title, maVar.B());
        a(view, i.creator, maVar.d());
        b(view, i.description_holder);
        c(view, maVar);
        b(view, maVar, aVar);
        b(view, maVar);
    }

    private void b(View view, C6185ma maVar) {
        if (maVar.m()) {
            a(view, i.stats_holder);
            b(view, i.private_indicator);
            return;
        }
        b(view, i.stats_holder);
        a(view, i.private_indicator);
        d(view, maVar);
    }

    private void c(View view) {
        ((TextView) view.findViewById(i.likes)).setCompoundDrawablesWithIntrinsicBounds(h.ic_like_grey_vector, 0, 0, 0);
    }

    private void d(View view) {
        boolean z = true;
        int i = 0;
        boolean z2 = view.findViewById(i.plays).getVisibility() == 0;
        boolean z3 = view.findViewById(i.likes).getVisibility() == 0;
        boolean z4 = view.findViewById(i.reposts).getVisibility() == 0;
        if ((!z2 || !z3) && (!z2 || !z4)) {
            z = false;
        }
        view.findViewById(i.divider1).setVisibility(z ? 0 : 8);
        View findViewById = view.findViewById(i.divider2);
        if (!z3 || !z4) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, C6185ma maVar) {
        String str = (String) maVar.F().d("");
        if (str.isEmpty()) {
            a(view);
        } else {
            a(view, i.no_description);
            a(view, i.description, Html.fromHtml(str.replace(System.getProperty("line.separator"), "<br/>")));
        }
        a(view, i.loading);
    }

    private void b(View view, C6185ma maVar, a aVar) {
        if (this.c.a(maVar)) {
            int C = maVar.C();
            a(view, i.comments, this.a.getQuantityString(o.trackinfo_comments, C, new Object[]{Integer.valueOf(C)}));
            b(view, i.comments_divider);
            view.findViewById(i.comments).setOnClickListener(new C6151b(aVar));
            return;
        }
        a(view, i.comments);
        a(view, i.comments_divider);
    }

    /* access modifiers changed from: 0000 */
    public void a(View view) {
        b(view, i.no_description);
        a(view, i.loading);
        a(view, i.description);
    }

    private void b(View view, int i) {
        view.findViewById(i).setVisibility(0);
    }

    private void a(View view, int i, String str) {
        TextView textView = (TextView) view.findViewById(i);
        textView.setText(str);
        textView.setVisibility(0);
    }

    private void a(View view, int i, Spanned spanned) {
        TextView textView = (TextView) view.findViewById(i);
        textView.setText(spanned);
        textView.setVisibility(0);
    }

    private void a(View view, int i) {
        view.findViewById(i).setVisibility(8);
    }
}
