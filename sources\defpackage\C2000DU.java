package defpackage;

/* renamed from: DU reason: default package and case insensitive filesystem */
/* compiled from: UserPlanChangedEvent */
public class C2000DU {
    private final int a;
    final C2455aV b;
    final C2455aV c;

    private C2000DU(int i, C2455aV aVVar, C2455aV aVVar2) {
        this.a = i;
        this.b = aVVar;
        this.c = aVVar2;
    }

    static C2000DU a(C2455aV aVVar, C2455aV aVVar2) {
        return new C2000DU(0, aVVar, aVVar2);
    }

    static C2000DU b(C2455aV aVVar, C2455aV aVVar2) {
        return new C2000DU(1, aVVar, aVVar2);
    }
}
