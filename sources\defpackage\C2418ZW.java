package defpackage;

import androidx.fragment.app.A;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import java.util.HashMap;

/* renamed from: ZW reason: default package and case insensitive filesystem */
/* compiled from: LoggingDialogFragment.kt */
public class C2418ZW extends C0361c {
    private HashMap a;

    public void Qb() {
        HashMap hashMap = this.a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }

    public void show(C0370l lVar, String str) {
        C7471uYa.b(lVar, "manager");
        C7316sHa.a(4, getClass().getSimpleName(), "dialog show called");
        super.show(lVar, str);
    }

    public int show(A a2, String str) {
        C7471uYa.b(a2, "transaction");
        C7316sHa.a(4, getClass().getSimpleName(), "dialog show called");
        return super.show(a2, str);
    }
}
