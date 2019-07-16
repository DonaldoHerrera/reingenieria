package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.wa reason: case insensitive filesystem */
final class C1059wa extends C1047ua<Boolean> {
    C1059wa(Ba ba, String str, Boolean bool) {
        super(ba, str, bool, null);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C0969ha.c.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C0969ha.d.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        String c = super.c();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(c);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
