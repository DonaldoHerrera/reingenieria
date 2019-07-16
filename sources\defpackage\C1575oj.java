package defpackage;

import android.content.Context;

/* renamed from: oj reason: default package and case insensitive filesystem */
/* compiled from: ResourceUnityVersionProvider */
class C1575oj implements C1755uj {
    private final Context a;
    private final C1755uj b;
    private boolean c = false;
    private String d;

    public C1575oj(Context context, C1755uj ujVar) {
        this.a = context;
        this.b = ujVar;
    }

    public String a() {
        if (!this.c) {
            this.d = C7391tNa.o(this.a);
            this.c = true;
        }
        String str = this.d;
        if (str != null) {
            return str;
        }
        C1755uj ujVar = this.b;
        if (ujVar != null) {
            return ujVar.a();
        }
        return null;
    }
}
