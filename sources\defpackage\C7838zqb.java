package defpackage;

import java.util.ArrayList;

/* renamed from: zqb reason: default package and case insensitive filesystem */
/* compiled from: GivenFunctionsMemberScope.kt */
public final class C7838zqb extends C6871lpb {
    final /* synthetic */ Aqb a;
    final /* synthetic */ ArrayList b;

    C7838zqb(Aqb aqb, ArrayList arrayList) {
        this.a = aqb;
        this.b = arrayList;
    }

    public void a(C4935Gcb gcb) {
        C7471uYa.b(gcb, "fakeOverride");
        C7629wpb.a(gcb, null);
        this.b.add(gcb);
    }

    /* access modifiers changed from: protected */
    public void c(C4935Gcb gcb, C4935Gcb gcb2) {
        C7471uYa.b(gcb, "fromSuper");
        C7471uYa.b(gcb2, "fromCurrent");
        StringBuilder sb = new StringBuilder();
        sb.append("Conflict in scope of ");
        sb.append(this.a.d());
        sb.append(": ");
        sb.append(gcb);
        sb.append(" vs ");
        sb.append(gcb2);
        throw new IllegalStateException(sb.toString().toString());
    }
}
