package com.soundcloud.android.playback.ui;

import android.view.View;
import android.view.ViewStub;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;

/* compiled from: EmptyViewController */
public class Ua {
    private final View a;
    private final a b;
    private final ViewStub c;
    private View d;
    private boolean e = false;

    Ua(View view) {
        this.a = view;
        this.b = (a) view.getTag();
        this.c = (ViewStub) view.findViewById(i.track_page_empty_stub);
    }

    private void c() {
        this.b.z.i();
        this.b.K.setVisibility(0);
        C6768kIa.b(this.b.S);
        this.d.setVisibility(8);
    }

    private void d() {
        this.d = this.a.findViewById(i.track_page_empty);
        View view = this.d;
        if (view == null) {
            this.d = this.c.inflate();
        } else {
            view.setVisibility(0);
        }
    }

    public void a() {
        if (this.e) {
            c();
            this.e = false;
        }
    }

    public void b() {
        this.e = true;
        d();
        this.b.z.d();
        this.b.K.setVisibility(8);
        this.b.J.setText(p.playback_empty);
        C6768kIa.a(this.b.S);
    }
}
