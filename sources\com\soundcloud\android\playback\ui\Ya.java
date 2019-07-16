package com.soundcloud.android.playback.ui;

import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.stations.Ga;

/* compiled from: ErrorViewController */
class Ya {
    private final View a;
    private final a b;
    private final ViewStub c;
    private final Ga d;
    private C3508cda e;
    private View f;
    private a g;

    /* compiled from: ErrorViewController */
    enum a {
        FAILED,
        BLOCKED,
        UNPLAYABLE
    }

    Ya(Ga ga, View view) {
        this.d = ga;
        this.a = view;
        this.b = (a) view.getTag();
        this.c = (ViewStub) view.findViewById(i.track_page_error_stub);
    }

    private int b(a aVar) {
        if (Xa.a[aVar.ordinal()] != 2) {
            return h.player_error;
        }
        return h.player_error_geoblock;
    }

    private void d(a aVar) {
        boolean equals = a.BLOCKED.equals(aVar);
        int i = 8;
        this.f.findViewById(i.playback_error).setVisibility(equals ? 8 : 0);
        this.f.findViewById(i.playback_error_reason).setVisibility(equals ? 8 : 0);
        View findViewById = this.f.findViewById(i.playback_error_blocked);
        if (equals) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }

    private void e(a aVar) {
        Button button = (Button) this.f.findViewById(i.playback_error_station_button);
        if (aVar == a.BLOCKED) {
            a(button);
        } else {
            button.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        this.g = aVar;
        this.b.z.d();
        C6768kIa.a(this.b.R);
        d();
        d(aVar);
        ((TextView) this.f.findViewById(i.playback_error_reason)).setText(c(aVar));
        ((ImageView) this.f.findViewById(i.playback_error_image)).setImageResource(b(aVar));
        e(aVar);
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.g != null;
    }

    private int c(a aVar) {
        if (Xa.a[aVar.ordinal()] != 1) {
            return p.playback_error_unable_to_play;
        }
        return p.playback_error_connection;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (this.g != a.BLOCKED) {
            a();
        }
    }

    private void d() {
        this.f = this.a.findViewById(i.track_page_error);
        View view = this.f;
        if (view == null) {
            this.f = this.c.inflate();
        } else {
            view.setVisibility(0);
        }
    }

    public void a(C3508cda cda) {
        this.e = cda;
    }

    private void a(Button button) {
        button.setVisibility(0);
        button.setOnClickListener(new C4473n(this));
    }

    public /* synthetic */ void a(View view) {
        this.d.a(C3508cda.e(this.e.c()));
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (c()) {
            this.b.z.i();
            C6768kIa.b(this.b.R);
            this.f.setVisibility(8);
            this.g = null;
        }
    }
}
