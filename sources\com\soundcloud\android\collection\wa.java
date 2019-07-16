package com.soundcloud.android.collection;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.j;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.N;
import java.util.List;

/* compiled from: CollectionPreviewRenderer */
public class wa extends C5541_ta<La> {
    private final C4581ija a;
    private final C4655rja b;
    private final Resources c;
    private final N d;
    private final C2014EO e;

    wa(C4581ija ija, C4655rja rja, Resources resources, N n, C2014EO eo) {
        this.a = ija;
        this.b = rja;
        this.c = resources;
        this.d = n;
        this.e = eo;
    }

    private CollectionPreviewView c(View view) {
        return (CollectionPreviewView) view.findViewById(i.collection_likes_preview);
    }

    /* access modifiers changed from: private */
    public void d(View view) {
        this.a.d(view.getContext());
    }

    private CollectionPreviewView e(View view) {
        CollectionPreviewView collectionPreviewView = (CollectionPreviewView) view.findViewById(i.collection_stations_preview);
        collectionPreviewView.setTitle(this.c.getString(p.stations_collection_title_liked_stations));
        collectionPreviewView.setVisibility(0);
        collectionPreviewView.setOnClickListener(new C2743e(this));
        return collectionPreviewView;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.collections_preview_item, viewGroup, false);
        c(inflate).setOnClickListener(new C2735a(this));
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.e.a(u.LIKED_STATIONS_LOAD);
        this.b.a(C4621nja.q());
    }

    private void b() {
        this.b.a(C4621nja.t());
    }

    public void a(int i, View view, La la) {
        a(la.d(), view);
        la.e().a((C7733yKa<? super T>) new C2741d<Object>(this, view));
        la.f().a((C7733yKa<? super T>) new C2739c<Object>(this, view));
    }

    public /* synthetic */ void b(View view, List list) {
        a(list, e(view));
    }

    public /* synthetic */ void a(View view, List list) {
        a(list, a(view, p.collections_playlists_header, (OnClickListener) new C2737b(this)));
    }

    public /* synthetic */ void b(View view) {
        a();
    }

    public /* synthetic */ void a(View view) {
        b();
    }

    private void a(List<Ga> list, View view) {
        CollectionPreviewView c2 = c(view);
        c2.setTitle(view.getResources().getString(p.collections_your_liked_tracks));
        a(list, c2);
    }

    private void a(List<? extends Vca> list, CollectionPreviewView collectionPreviewView) {
        collectionPreviewView.a(this.d, list, this.c.getInteger(j.collection_preview_thumbnail_count));
    }

    private CollectionPreviewView a(View view, int i, OnClickListener onClickListener) {
        CollectionPreviewView collectionPreviewView = (CollectionPreviewView) view.findViewById(i.collection_playlists_preview);
        view.findViewById(i.collection_playlists_preview_divider).setVisibility(0);
        collectionPreviewView.setVisibility(0);
        collectionPreviewView.setTitle(this.c.getString(i));
        collectionPreviewView.setOnClickListener(onClickListener);
        return collectionPreviewView;
    }
}
