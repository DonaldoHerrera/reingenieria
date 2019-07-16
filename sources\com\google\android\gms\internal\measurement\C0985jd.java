package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.jd reason: case insensitive filesystem */
final class C0985jd extends IllegalArgumentException {
    C0985jd(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
