package defpackage;

import com.soundcloud.android.properties.j;
import java.util.concurrent.TimeUnit;

/* renamed from: Lua reason: default package and case insensitive filesystem */
/* compiled from: ErrorReporter */
class C5099Lua {
    private final C3466UY a = new C3466UY();
    private final a b = C7776yua.a(this.a.getStackTrace(), j.e());

    C5099Lua() {
    }

    private void c() {
        this.b.c();
        C7776yua.a(this.b, 2, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        c();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.b.b();
    }

    /* access modifiers changed from: 0000 */
    public void a(Throwable th) {
        c();
        C7316sHa.a(th, this.a);
    }
}
