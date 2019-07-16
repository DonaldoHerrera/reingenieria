package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender.SendIntentException;

/* renamed from: jA reason: default package and case insensitive filesystem */
final class C1407jA implements C1315gA {
    private final C1469lA a;
    private final C1377iA b;
    private final Context c;

    C1407jA(C1469lA lAVar, Context context) {
        this.a = lAVar;
        this.b = new C1377iA(context);
        this.c = context;
    }

    public final RB<Void> a() {
        return this.a.b(this.c.getPackageName());
    }

    public final synchronized void a(C1713tA tAVar) {
        this.b.a((BB<StateT>) tAVar);
    }

    public final boolean a(C1284fA fAVar, int i, Activity activity, int i2) throws SendIntentException {
        if (!fAVar.b(i)) {
            return false;
        }
        activity.startIntentSenderForResult(fAVar.a(i).getIntentSender(), i2, null, 0, 0, 0);
        return true;
    }

    public final RB<C1284fA> b() {
        return this.a.a(this.c.getPackageName());
    }

    public final synchronized void b(C1713tA tAVar) {
        this.b.b(tAVar);
    }
}
