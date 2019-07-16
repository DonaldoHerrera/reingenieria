package com.soundcloud.android.tracks;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.DownloadImageView;
import java.util.Date;

/* compiled from: TrackItemView */
public class Ea {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private View g;
    private View h;
    private TextView i;
    private TextView j;
    private TextView k;
    private View l;
    private View m;
    private TextView n;
    private View o;
    private TextView p;
    private View q;
    private DownloadImageView r;
    private TextView s;
    private TextView t;

    /* compiled from: TrackItemView */
    public static class a {
        private final int a = f.platinum;
        private final int b = f.list_primary;
        private int c = l.tracklist_item;

        public void a(int i) {
            this.c = i;
        }

        /* access modifiers changed from: 0000 */
        public int b() {
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public int a() {
            return this.a;
        }

        public View a(ViewGroup viewGroup) {
            return a(viewGroup, this.c);
        }

        public View a(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
            inflate.setTag(new Ea(inflate));
            return inflate;
        }
    }

    /* compiled from: TrackItemView */
    interface b {
        void a(View view);
    }

    public Ea(View view) {
        this.a = (ImageView) view.findViewById(i.image);
        this.b = (TextView) view.findViewById(i.list_item_header);
        this.c = (TextView) view.findViewById(i.list_item_subheader);
        this.d = (TextView) view.findViewById(i.list_item_right_info);
        this.e = (TextView) view.findViewById(i.list_item_counter);
        this.f = (TextView) view.findViewById(i.reposter);
        this.g = view.findViewById(i.now_playing);
        this.h = view.findViewById(i.private_indicator);
        this.i = (TextView) view.findViewById(i.promoted_track);
        this.j = (TextView) view.findViewById(i.posted_time);
        this.k = (TextView) view.findViewById(i.plays_and_posted_time);
        this.l = view.findViewById(i.preview_indicator);
        this.m = view.findViewById(i.go_indicator);
        this.n = (TextView) view.findViewById(i.track_list_item_geo_blocked_text);
        this.o = view.findViewById(i.left_spacer);
        this.p = (TextView) view.findViewById(i.position);
        this.q = view.findViewById(i.overflow_button);
        this.r = (DownloadImageView) view.findViewById(i.track_list_item_offline_state_image_view);
        this.s = (TextView) view.findViewById(i.track_list_item_offline_state_text);
        this.t = (TextView) view.findViewById(i.track_list_item_no_network_text);
    }

    private void b(b bVar) {
        this.q.setOnClickListener(new C6169h(bVar));
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        this.q.setVisibility(0);
        b(bVar);
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        this.i.setVisibility(0);
        this.i.setText(str);
    }

    public Resources d() {
        return this.c.getResources();
    }

    public String e() {
        return this.c.getText().toString();
    }

    public void f() {
        this.d.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        this.l.setVisibility(8);
        this.h.setVisibility(8);
        this.d.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        this.e.setVisibility(4);
        this.g.setVisibility(4);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.m.setVisibility(8);
        this.k.setVisibility(8);
        this.n.setVisibility(8);
        this.r.setState(C3823mda.NOT_OFFLINE);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        C6768kIa.f(this.i);
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        a(C3823mda.DOWNLOADED, p.offline_update_completed);
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        a(C3823mda.DOWNLOADING, p.offline_update_in_progress);
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        this.n.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        this.m.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void m() {
        this.t.setText(d().getString(p.offline_no_connection));
        this.t.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        this.t.setText(d().getString(p.offline_no_wifi));
        this.t.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void o() {
        a(C3823mda.UNAVAILABLE, p.offline_not_available_offline);
    }

    /* access modifiers changed from: 0000 */
    public void p() {
        this.g.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void q() {
        this.l.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void r() {
        this.h.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void s() {
        a(C3823mda.REQUESTED, p.offline_update_requested);
    }

    public String b() {
        return this.b.getText().toString();
    }

    static /* synthetic */ void a(b bVar, View view) {
        if (bVar != null) {
            bVar.a(view);
        }
    }

    public void b(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public ImageView c() {
        return this.a;
    }

    public void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        this.e.setText(str);
        this.e.setVisibility(0);
    }

    public void a(String str, int i2) {
        this.c.setText(str);
        this.c.setTextColor(a(i2));
    }

    private int a(int i2) {
        return a().getResources().getColor(i2);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.d.setText(str);
        this.d.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void a(Date date) {
        this.j.setVisibility(0);
        this.j.setText(d().getString(p.posted_time, new Object[]{C7315sGa.a(d(), date.getTime(), true)}));
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, Date date) {
        this.k.setVisibility(0);
        this.k.setText(d().getString(p.plays_and_posted_time, new Object[]{str, C7315sGa.a(d(), date.getTime(), true)}));
    }

    /* access modifiers changed from: 0000 */
    public void a(OnClickListener onClickListener) {
        C6768kIa.a((View) this.i, onClickListener);
    }

    public Context a() {
        return this.c.getContext();
    }

    private void a(C3823mda mda, int i2) {
        this.r.setState(mda);
        this.s.setText(d().getString(i2));
        this.s.setVisibility(0);
    }
}
