package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.b.C0045b;
import com.google.android.gms.dynamite.DynamiteModule.b.a;

final class b implements com.google.android.gms.dynamite.DynamiteModule.b {
    b() {
    }

    public final C0045b a(Context context, String str, a aVar) throws DynamiteModule.a {
        C0045b bVar = new C0045b();
        bVar.b = aVar.a(context, str, true);
        if (bVar.b != 0) {
            bVar.c = 1;
        } else {
            bVar.a = aVar.a(context, str);
            if (bVar.a != 0) {
                bVar.c = -1;
            }
        }
        return bVar;
    }
}
