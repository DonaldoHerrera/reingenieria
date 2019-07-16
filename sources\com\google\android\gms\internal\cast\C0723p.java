package com.google.android.gms.internal.cast;

import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0663o;
import com.google.android.gms.cast.framework.media.C0650e;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.p reason: case insensitive filesystem */
public final class C0723p extends C1644qr {
    private final View b;
    private final String c;
    private final String d;

    public C0723p(View view, Context context) {
        this.b = view;
        this.c = context.getString(C0663o.cast_closed_captions);
        this.d = context.getString(C0663o.cast_closed_captions_unavailable);
        this.b.setEnabled(false);
    }

    private final void e() {
        boolean z;
        C0650e a = a();
        if (a != null && a.m()) {
            MediaInfo g = a.g();
            if (g != null) {
                List Y = g.Y();
                if (Y != null && !Y.isEmpty()) {
                    Iterator it = Y.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MediaTrack mediaTrack = (MediaTrack) it.next();
                        if (mediaTrack.X() == 2) {
                            i++;
                            if (i > 1) {
                                break;
                            }
                        } else if (mediaTrack.X() == 1) {
                            break;
                        }
                    }
                    z = true;
                    if (z && !a.s()) {
                        this.b.setEnabled(true);
                        this.b.setContentDescription(this.c);
                        return;
                    }
                }
            }
            z = false;
            this.b.setEnabled(true);
            this.b.setContentDescription(this.c);
            return;
        }
        this.b.setEnabled(false);
        this.b.setContentDescription(this.d);
    }

    public final void a(C0636d dVar) {
        super.a(dVar);
        this.b.setEnabled(true);
        e();
    }

    public final void b() {
        e();
    }

    public final void c() {
        this.b.setEnabled(false);
    }

    public final void d() {
        this.b.setEnabled(false);
        super.d();
    }
}
