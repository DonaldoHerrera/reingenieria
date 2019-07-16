package com.soundcloud.android.playlist.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.C6192pa;
import com.soundcloud.android.tracks.Ea;

/* compiled from: PlaylistTrackItemRenderer */
public class aa extends C5541_ta<e> {
    private final C6192pa a;
    private final C6781kVa<e> b = C6781kVa.s();

    /* compiled from: PlaylistTrackItemRenderer */
    static class a {
        a() {
        }

        static ImageView a(View view) {
            return (ImageView) view.findViewById(i.drag_handle);
        }

        static void b(View view) {
            e(view).f();
        }

        static ImageView c(View view) {
            return (ImageView) view.findViewById(i.overflow_button);
        }

        static View d(View view) {
            return view.findViewById(i.preview_indicator);
        }

        private static Ea e(View view) {
            return (Ea) view.getTag();
        }
    }

    aa(C6192pa paVar) {
        this.a = paVar;
        this.a.i.a(l.edit_playlist_track_item);
    }

    public View b(ViewGroup viewGroup) {
        return this.a.b(viewGroup);
    }

    public void a(int i, View view, e eVar) {
        C6185ma i2 = eVar.i();
        this.a.a(i2, view, i, eVar.g(), a(eVar, i), !eVar.j());
        a(view, eVar);
        view.setOnClickListener(new C5739j(this, eVar));
    }

    public /* synthetic */ void a(e eVar, View view) {
        this.b.a(eVar);
    }

    /* access modifiers changed from: 0000 */
    public APa<e> a() {
        return this.b;
    }

    private I a(e eVar, int i) {
        I i2 = new I(Yca.PLAYLIST_DETAILS.a(), true);
        i2.a(eVar.g(), i, eVar.f());
        if (eVar.h() != null) {
            i2.a(eVar.h());
        }
        return i2;
    }

    private void a(View view, e eVar) {
        if (eVar.j()) {
            a(view);
        } else {
            a.a(view).setVisibility(8);
        }
    }

    private void a(View view) {
        ImageView a2 = a.a(view);
        a2.setVisibility(0);
        a.c(view).setVisibility(8);
        a.d(view).setVisibility(8);
        a.b(view);
        C6768kIa.a((View) a2, g.playlist_drag_handler_touch_extension);
    }
}
