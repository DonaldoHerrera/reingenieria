package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: bV reason: default package and case insensitive filesystem */
/* compiled from: Plan.kt */
public final class C2474bV {
    public static final boolean a(C2455aV aVVar, C2455aV aVVar2) {
        C7471uYa.b(aVVar, "$this$isDowngradeFrom");
        C7471uYa.b(aVVar2, "existingPlan");
        C2455aV aVVar3 = C2455aV.UNDEFINED;
        return (aVVar == aVVar3 || aVVar2 == aVVar3 || aVVar.compareTo(aVVar2) >= 0) ? false : true;
    }

    public static final boolean b(C2455aV aVVar, C2455aV aVVar2) {
        C7471uYa.b(aVVar, "$this$isUpgradeFrom");
        C7471uYa.b(aVVar2, "existingPlan");
        C2455aV aVVar3 = C2455aV.UNDEFINED;
        return (aVVar == aVVar3 || aVVar2 == aVVar3 || aVVar.compareTo(aVVar2) <= 0) ? false : true;
    }

    public static final Set<String> a(Collection<? extends C2455aV> collection) {
        C7471uYa.b(collection, "$this$toPlanIds");
        ArrayList<C2455aV> arrayList = new ArrayList<>();
        for (Object next : collection) {
            if (((C2455aV) next) != C2455aV.UNDEFINED) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        for (C2455aV a : arrayList) {
            arrayList2.add(a.a());
        }
        return C7676xWa.t(arrayList2);
    }
}
