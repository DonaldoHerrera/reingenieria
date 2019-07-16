package com.soundcloud.android.ads;

import android.view.View;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.VideoAdTracking;
import com.soundcloud.android.foundation.ads.ca;
import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.ads.wb reason: case insensitive filesystem */
/* compiled from: DefaultAdViewabilityController.kt */
public class C2638wb implements C3678e {
    private final Set<C3678e> a;

    public C2638wb(Set<? extends C3678e> set) {
        C7471uYa.b(set, "viewabilityControllers");
        this.a = set;
    }

    public void a(C3508cda cda, long j, View view, List<? extends View> list, VideoAdTracking videoAdTracking) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(view, "viewabilityLayer");
        C7471uYa.b(list, "adObstructionViews");
        C7471uYa.b(videoAdTracking, "videoAdTracking");
        for (C3678e a2 : this.a) {
            a2.a(cda, j, view, list, videoAdTracking);
        }
    }

    public void b(String str, long j) {
        C7471uYa.b(str, "uuid");
        for (C3678e b : this.a) {
            b.b(str, j);
        }
    }

    public void c(String str, long j) {
        C7471uYa.b(str, "uuid");
        for (C3678e c : this.a) {
            c.c(str, j);
        }
    }

    public void d(String str) {
        C7471uYa.b(str, "uuid");
        for (C3678e d : this.a) {
            d.d(str);
        }
    }

    public void e(String str, long j) {
        C7471uYa.b(str, "uuid");
        for (C3678e e : this.a) {
            e.e(str, j);
        }
    }

    public void f(String str, long j) {
        C7471uYa.b(str, "uuid");
        for (C3678e f : this.a) {
            f.f(str, j);
        }
    }

    public void g(String str, long j) {
        C7471uYa.b(str, "uuid");
        for (C3678e g : this.a) {
            g.g(str, j);
        }
    }

    public void h(String str, long j) {
        C7471uYa.b(str, "uuid");
        for (C3678e h : this.a) {
            h.h(str, j);
        }
    }

    public void a(VideoAdTracking videoAdTracking) {
        C7471uYa.b(videoAdTracking, "videoAdTracking");
        for (C3678e a2 : this.a) {
            a2.a(videoAdTracking);
        }
    }

    public void b(String str) {
        C7471uYa.b(str, "uuid");
        for (C3678e b : this.a) {
            b.b(str);
        }
    }

    public void c(String str) {
        C7471uYa.b(str, "uuid");
        for (C3678e c : this.a) {
            c.c(str);
        }
    }

    public void d() {
        for (C3678e d : this.a) {
            d.d();
        }
    }

    public void e() {
        for (C3678e e : this.a) {
            e.e();
        }
    }

    public void a(String str) {
        C7471uYa.b(str, "uuid");
        for (C3678e a2 : this.a) {
            a2.a(str);
        }
    }

    public void b() {
        for (C3678e b : this.a) {
            b.b();
        }
    }

    public void c() {
        for (C3678e c : this.a) {
            c.c();
        }
    }

    public void d(String str, long j) {
        C7471uYa.b(str, "uuid");
        for (C3678e d : this.a) {
            d.d(str, j);
        }
    }

    public void a(String str, View view) {
        C7471uYa.b(str, "uuid");
        C7471uYa.b(view, "view");
        for (C3678e a2 : this.a) {
            a2.a(str, view);
        }
    }

    public void a(String str, long j, float f) {
        C7471uYa.b(str, "uuid");
        for (C3678e a2 : this.a) {
            a2.a(str, j, f);
        }
    }

    public void a(String str, long j) {
        C7471uYa.b(str, "uuid");
        for (C3678e a2 : this.a) {
            a2.a(str, j);
        }
    }

    public void a(String str, boolean z) {
        C7471uYa.b(str, "uuid");
        for (C3678e a2 : this.a) {
            a2.a(str, z);
        }
    }

    public void a() {
        for (C3678e a2 : this.a) {
            a2.a();
        }
    }

    public void a(View view, ca caVar) {
        C7471uYa.b(view, "imageView");
        C7471uYa.b(caVar, "adData");
        for (C3678e a2 : this.a) {
            a2.a(view, caVar);
        }
    }
}
