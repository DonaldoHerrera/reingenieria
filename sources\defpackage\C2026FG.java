package defpackage;

import android.content.Context;

/* renamed from: FG reason: default package and case insensitive filesystem */
public class C2026FG {
    private boolean a;

    private void b(Context context) {
        C3067jH.a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return "1.2.8-Soundcloud";
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context) {
        b(context);
        if (!b()) {
            a(true);
            C2442aH.a().a(context);
            C2367XG.a().a(context);
            C3010gH.a(context);
            C2385YG.a().a(context);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.a;
    }
}
