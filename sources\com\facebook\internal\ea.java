package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: SmartLoginOption */
public enum ea {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    public static final EnumSet<ea> d = null;
    private final long f;

    static {
        d = EnumSet.allOf(ea.class);
    }

    private ea(long j) {
        this.f = j;
    }

    public static EnumSet<ea> a(long j) {
        EnumSet<ea> noneOf = EnumSet.noneOf(ea.class);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            ea eaVar = (ea) it.next();
            if ((eaVar.a() & j) != 0) {
                noneOf.add(eaVar);
            }
        }
        return noneOf;
    }

    public long a() {
        return this.f;
    }
}
