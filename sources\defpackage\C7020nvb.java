package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: nvb reason: default package and case insensitive filesystem */
/* compiled from: scopeUtils.kt */
public final class C7020nvb {
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C7471uYa.b(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }
}
