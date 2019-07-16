package com.soundcloud.android.image;

import android.graphics.Bitmap;
import com.soundcloud.android.image.ca.b;
import com.soundcloud.android.image.ca.c;
import com.soundcloud.android.image.ca.d;
import com.squareup.picasso.L;
import com.squareup.picasso.U;
import com.squareup.picasso.z;
import java.io.IOException;

/* compiled from: PicassoImageLoader.kt */
final class na<T> implements CPa<T> {
    final /* synthetic */ oa a;
    final /* synthetic */ String b;
    final /* synthetic */ z c;
    final /* synthetic */ Integer d;

    na(oa oaVar, String str, z zVar, Integer num) {
        this.a = oaVar;
        this.b = str;
        this.c = zVar;
        this.d = num;
    }

    public final void a(BPa<ca> bPa) {
        C7471uYa.b(bPa, "emitter");
        bPa.a(new d(this.b, null));
        bPa.a((C6708jQa) new ma(this, bPa));
        try {
            L a2 = this.a.g.a(this.b);
            if (this.c != null) {
                a2.a(this.c, new z[0]);
            }
            if (this.d != null) {
                a2.a((U) new C7123pVa(this.a.a(), this.d.intValue()));
            }
            Bitmap b2 = a2.b();
            String str = this.b;
            C7471uYa.a((Object) b2, "bitmap");
            bPa.a(new b(str, null, b2));
            bPa.onComplete();
        } catch (IOException e) {
            bPa.a(new c(this.b, null, e));
            bPa.onComplete();
        }
    }
}
