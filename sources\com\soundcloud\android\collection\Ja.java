package com.soundcloud.android.collection;

import android.view.View;
import android.widget.ImageView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.view.DownloadImageView;
import java.util.Arrays;

/* compiled from: PlaylistItemIndicatorsView */
public class Ja {
    private final C4070ce a;
    private final C6834lGa b;

    Ja(C4070ce ceVar, C6834lGa lga) {
        this.a = ceVar;
        this.b = lga;
    }

    public void a(View view, boolean z, boolean z2, C3823mda mda) {
        int i = 8;
        view.findViewById(i.private_indicator).setVisibility(z ? 0 : 8);
        ImageView imageView = (ImageView) view.findViewById(i.no_network_indicator);
        View findViewById = view.findViewById(i.like_indicator);
        DownloadImageView downloadImageView = (DownloadImageView) view.findViewById(i.offline_state_indicator);
        C6768kIa.a((Iterable<View>) Arrays.asList(new View[]{downloadImageView, imageView, findViewById}));
        if (a(mda)) {
            a(imageView, downloadImageView, mda);
            return;
        }
        downloadImageView.setState(C3823mda.NOT_OFFLINE);
        if (z2) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }

    private void a(ImageView imageView, DownloadImageView downloadImageView, C3823mda mda) {
        if (C3823mda.REQUESTED != mda || !a()) {
            downloadImageView.setState(mda);
            return;
        }
        downloadImageView.setState(C3823mda.NOT_OFFLINE);
        imageView.setVisibility(0);
    }

    private boolean a(C3823mda mda) {
        return C3823mda.NOT_OFFLINE != mda;
    }

    private boolean a() {
        return (this.a.a() && !this.b.a()) || !this.b.d();
    }
}
