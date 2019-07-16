package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class _a implements Comparator<Ya> {
    _a() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Ya ya = (Ya) obj;
        Ya ya2 = (Ya) obj2;
        C0935cb cbVar = (C0935cb) ya.iterator();
        C0935cb cbVar2 = (C0935cb) ya2.iterator();
        while (cbVar.hasNext() && cbVar2.hasNext()) {
            int compare = Integer.compare(Ya.b(cbVar.nextByte()), Ya.b(cbVar2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(ya.size(), ya2.size());
    }
}
