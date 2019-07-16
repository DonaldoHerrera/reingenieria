package com.soundcloud.android.cast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.cast.framework.C0636d;
import com.soundcloud.android.cast.C2732f.a;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: DefaultCastConnectionHelper */
class z extends DefaultActivityLightCycle<AppCompatActivity> implements C2732f {
    private final Set<a> a = new HashSet();
    private final C2733g b;
    private boolean c;
    private boolean d;

    z(C2733g gVar) {
        this.b = gVar;
    }

    private void c(a aVar) {
        if (b()) {
            aVar.f();
        } else {
            aVar.g();
        }
    }

    private void x() {
        for (a c2 : this.a) {
            c(c2);
        }
    }

    public void a(a aVar) {
        this.a.remove(aVar);
    }

    public void b(a aVar) {
        this.a.add(aVar);
        c(aVar);
    }

    public boolean e() {
        return this.c;
    }

    public String g() {
        C4928GKa a2 = this.b.a();
        String str = "";
        return (!a2.c() || ((C0636d) a2.b()).f() == null) ? str : (String) C4928GKa.b(((C0636d) a2.b()).f().G()).d(str);
    }

    public void a(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        x();
    }

    public boolean b() {
        return this.d;
    }
}
