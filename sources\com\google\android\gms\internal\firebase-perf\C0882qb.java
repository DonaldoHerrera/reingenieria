package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.qb reason: case insensitive filesystem */
enum C0882qb {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean f;

    private C0882qb(boolean z) {
        this.f = z;
    }
}
