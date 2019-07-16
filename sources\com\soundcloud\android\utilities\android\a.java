package com.soundcloud.android.utilities.android;

import android.os.Bundle;

/* compiled from: BundleExtensions.kt */
final class a extends C7540vYa implements _Xa<String, String> {
    final /* synthetic */ Bundle a;

    /* renamed from: a */
    public final String invoke(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(this.a.get(str));
        return sb.toString();
    }
}
