package defpackage;

import java.util.List;

/* renamed from: Cbb reason: default package and case insensitive filesystem */
/* compiled from: RuntimeErrorReporter.kt */
public final class C4810Cbb implements C7357srb {
    public static final C4810Cbb a = new C4810Cbb();

    private C4810Cbb() {
    }

    public void a(C5029Jcb jcb, List<String> list) {
        C7471uYa.b(jcb, "descriptor");
        C7471uYa.b(list, "unresolvedSuperClasses");
        StringBuilder sb = new StringBuilder();
        sb.append("Incomplete hierarchy for class ");
        sb.append(jcb.getName());
        sb.append(", unresolved classes ");
        sb.append(list);
        throw new IllegalStateException(sb.toString());
    }

    public void a(C4935Gcb gcb) {
        C7471uYa.b(gcb, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot infer visibility for ");
        sb.append(gcb);
        throw new IllegalStateException(sb.toString());
    }
}
