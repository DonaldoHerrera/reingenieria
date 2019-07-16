package com.soundcloud.android.image;

import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.TransitionDrawable;
import com.squareup.picasso.C;
import com.squareup.picasso.C6246k;
import com.squareup.picasso.E;
import com.squareup.picasso.E.a;
import com.squareup.picasso.r;

/* renamed from: com.soundcloud.android.image.t reason: case insensitive filesystem */
/* compiled from: ImageModule */
public abstract class C3738t {
    static oa a(C3737s sVar, E e, qa qaVar, C3724e eVar, C3469VY vy) {
        oa oaVar = new oa(sVar.a(), sVar.c(), sVar.b(), qaVar, eVar, vy, e);
        return oaVar;
    }

    static C6246k b() {
        return new ya();
    }

    static C2964dS<String, TransitionDrawable> c() {
        return C2964dS.a(50);
    }

    static E a(Application application, C4806CMa<C7440tyb> cMa, C6246k kVar) {
        a aVar = new a(application);
        aVar.b(false);
        aVar.a(false);
        aVar.a((r) new C((a) new C3720a(cMa)));
        aVar.a(kVar);
        return aVar.a();
    }

    static C2964dS<C3508cda, Bitmap> a() {
        return C2964dS.a(10);
    }

    static SharedPreferences a(Application application) {
        return application.getSharedPreferences("image_configuration", 0);
    }
}
