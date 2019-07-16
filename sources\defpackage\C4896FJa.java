package defpackage;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.view.C6231u;

/* renamed from: FJa reason: default package and case insensitive filesystem */
/* compiled from: TelescopeLayoutWrapper.kt */
public class C4896FJa {
    private final C5322TGa a;

    public C4896FJa(C5322TGa tGa) {
        C7471uYa.b(tGa, "bugReporter");
        this.a = tGa;
    }

    public C5322TGa a() {
        return this.a;
    }

    public View a(AppCompatActivity appCompatActivity, View view) {
        C7471uYa.b(appCompatActivity, "activity");
        C7471uYa.b(view, "layout");
        if (!j.g()) {
            return view;
        }
        C6231u uVar = new C6231u(appCompatActivity, a());
        uVar.addView(view);
        return uVar;
    }
}
