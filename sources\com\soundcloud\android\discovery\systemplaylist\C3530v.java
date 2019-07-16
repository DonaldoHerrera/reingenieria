package com.soundcloud.android.discovery.systemplaylist;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ta;
import com.soundcloud.android.view.AutoResizeTextView;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.v reason: case insensitive filesystem */
/* compiled from: SystemPlaylistHeaderItemRenderer.kt */
public final class C3530v extends C5541_ta<C3527s> {
    private final C6781kVa<ea> a;
    private final N b;
    private final ta c;
    private final Resources d;

    public C3530v(N n, ta taVar, Resources resources) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(taVar, "simpleBlurredImageLoader");
        C7471uYa.b(resources, "resources");
        this.b = n;
        this.c = taVar;
        this.d = resources;
        C6781kVa<ea> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<TrackClickParams>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.system_playlist_header, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…st_header, parent, false)");
        return inflate;
    }

    private final void b(C3528t tVar, View view) {
        AutoResizeTextView autoResizeTextView = (AutoResizeTextView) view.findViewById(i.system_playlist_title);
        C7471uYa.a((Object) autoResizeTextView, "system_playlist_title");
        a((TextView) autoResizeTextView, tVar.h());
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.system_playlist_description);
        C7471uYa.a((Object) customFontTextView, "system_playlist_description");
        a((TextView) customFontTextView, tVar.d());
        CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.system_playlist_updated_at);
        C7471uYa.a((Object) customFontTextView2, "system_playlist_updated_at");
        a((TextView) customFontTextView2, a(tVar.j()));
        CustomFontTextView customFontTextView3 = (CustomFontTextView) view.findViewById(i.system_playlist_duration);
        C7471uYa.a((Object) customFontTextView3, "system_playlist_duration");
        customFontTextView3.setText(a(tVar.i(), tVar.f()));
    }

    public final C6781kVa<ea> a() {
        return this.a;
    }

    public void a(int i, View view, C3527s sVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(sVar, "item");
        C3528t b2 = sVar.b();
        a(b2, view);
        a(sVar, view);
        b(b2, view);
    }

    private final void a(C3528t tVar, View view) {
        SystemPlaylistArtworkView systemPlaylistArtworkView = (SystemPlaylistArtworkView) view.findViewById(i.artwork);
        ImageView imageView = (ImageView) view.findViewById(i.blurred_background);
        systemPlaylistArtworkView.a(this.b, tVar);
        if (tVar.e() != null) {
            this.c.a(tVar.e(), imageView);
            return;
        }
        N n = this.b;
        C7471uYa.a((Object) imageView, "blurredArtworkView");
        n.a(imageView);
    }

    private final void a(C3527s sVar, View view) {
        View findViewById = view.findViewById(i.btn_play);
        C7471uYa.a((Object) findViewById, "playButton");
        findViewById.setVisibility(sVar.b().g() ? 0 : 8);
        if (sVar.b().g()) {
            findViewById.setOnClickListener(new C3529u(this, sVar));
        }
    }

    private final void a(TextView textView, String str) {
        if (str != null) {
            textView.setText(str);
        }
        int i = 0;
        if (str == null) {
            i = 4;
        }
        textView.setVisibility(i);
    }

    private final String a(int i, long j) {
        String string = this.d.getString(p.system_playlist_duration, new Object[]{Integer.valueOf(i), C7315sGa.a(j, TimeUnit.MILLISECONDS)});
        C7471uYa.a((Object) string, "resources.getString(R.st…, TimeUnit.MILLISECONDS))");
        return string;
    }

    private final String a(Date date) {
        if (date == null) {
            return null;
        }
        Resources resources = this.d;
        return resources.getString(p.system_playlist_updated_at, new Object[]{C7315sGa.a(resources, date.getTime(), true)});
    }
}
