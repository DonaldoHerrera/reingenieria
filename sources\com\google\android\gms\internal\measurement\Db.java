package com.google.android.gms.internal.measurement;

enum Db {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean f;

    private Db(boolean z) {
        this.f = z;
    }
}
