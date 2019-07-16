package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

/* renamed from: nwa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistSuggestionItemRenderer */
class C7021nwa extends C4790Bwa {
    C7021nwa(N n) {
        super(n);
    }

    private int c() {
        return l.search_suggestion_default;
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(c(), viewGroup, false);
    }

    public void a(int i, View view, C7780ywa ywa) {
        a(i, view, (C7366swa) ywa, h.ic_search_playlist);
    }

    /* access modifiers changed from: protected */
    public void a(ImageView imageView, Vca vca, Resources resources) {
        a().a(vca.a(), vca.b(), C3721b.c(resources), imageView, false);
    }
}
