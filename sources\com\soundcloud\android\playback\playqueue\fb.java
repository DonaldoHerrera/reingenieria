package com.soundcloud.android.playback.playqueue;

import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.tracks.C6188na;

/* compiled from: TrackPlayQueueItemRenderer */
class fb extends C5541_ta<hb> {
    private final N a;
    private final C6188na b;
    private a c;

    /* compiled from: TrackPlayQueueItemRenderer */
    interface a {
        void a(int i);
    }

    fb(N n, C6188na naVar) {
        this.a = n;
        this.b = naVar;
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.playqueue_track_item, viewGroup, false);
    }

    private void b(View view, hb hbVar) {
        view.setVisibility(hbVar.s() ? 0 : 8);
    }

    public void a(int i, View view, hb hbVar) {
        view.setSelected(hbVar.g());
        ViewGroup viewGroup = (ViewGroup) view.findViewById(i.status_place_holder);
        View findViewById = view.findViewById(i.text_holder);
        ImageView imageView = (ImageView) view.findViewById(i.image);
        TextView textView = (TextView) view.findViewById(i.title);
        TextView textView2 = (TextView) view.findViewById(i.creator);
        ImageView imageView2 = (ImageView) view.findViewById(i.overflow_button);
        View findViewById2 = view.findViewById(i.go_indicator);
        textView.setText(hbVar.o());
        textView2.setText(hbVar.k());
        Vca l = hbVar.l();
        this.a.a(l.a(), l.b(), C3721b.c(view.getResources()), imageView, false);
        b(findViewById2, hbVar);
        viewGroup.removeAllViews();
        a(view, i);
        a(view, hbVar);
        a(viewGroup, view, hbVar);
        a(hbVar, imageView, findViewById, findViewById2);
        a(hbVar, imageView2, i);
        a(hbVar, textView);
    }

    private void a(hb hbVar, TextView textView) {
        textView.setTextColor(hbVar.p());
    }

    private void a(ViewGroup viewGroup, View view, hb hbVar) {
        bb b2 = hbVar.b();
        if (b2 == bb.PLAYING) {
            ((AnimationDrawable) ((TextView) View.inflate(view.getContext(), l.playing, viewGroup).findViewById(i.now_playing)).getCompoundDrawables()[0]).start();
        } else if (b2 == bb.PAUSED) {
            View.inflate(view.getContext(), l.paused, viewGroup);
        } else if (hbVar.n() != -1) {
            View.inflate(view.getContext(), hbVar.n(), viewGroup);
        }
    }

    private void a(View view, int i) {
        view.setOnClickListener(new J(this, i));
    }

    public /* synthetic */ void a(int i, View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    private void a(View view, hb hbVar) {
        if (hbVar.r()) {
            view.setClickable(false);
        }
    }

    private void a(hb hbVar, ImageView imageView, View view, View view2) {
        float a2 = db.a(hbVar.c(), hbVar.b());
        imageView.setAlpha(a2);
        view.setAlpha(a2);
        view2.setAlpha(a2);
    }

    private void a(hb hbVar, ImageView imageView, int i) {
        C6768kIa.b((View) imageView);
        imageView.setSelected(false);
        if (hbVar.b() == bb.COMING_UP) {
            imageView.setImageResource(h.ic_drag_handle_medium_dark_gray_24dp);
            imageView.setOnClickListener(null);
            return;
        }
        imageView.setImageResource(h.playqueue_track_item_overflow);
        imageView.setOnClickListener(new I(this, hbVar));
    }

    public /* synthetic */ void a(hb hbVar, View view) {
        this.b.b(C6768kIa.c(view), view, hbVar.q());
    }

    public void a(a aVar) {
        this.c = aVar;
    }
}
