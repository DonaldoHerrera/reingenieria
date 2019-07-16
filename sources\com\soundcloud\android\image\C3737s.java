package com.soundcloud.android.image;

import android.content.Context;

/* renamed from: com.soundcloud.android.image.s reason: case insensitive filesystem */
/* compiled from: ImageLoaderConfig.kt */
public final class C3737s {
    private final Context a;
    private final boolean b;
    private final C3730k c;

    public C3737s(Context context, boolean z, C3730k kVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(kVar, "imageCache");
        this.a = context;
        this.b = z;
        this.c = kVar;
    }

    public final Context a() {
        return this.a;
    }

    public final C3730k b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3737s) {
                C3737s sVar = (C3737s) obj;
                if (C7471uYa.a((Object) this.a, (Object) sVar.a)) {
                    if (!(this.b == sVar.b) || !C7471uYa.a((Object) this.c, (Object) sVar.c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Context context = this.a;
        int i = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C3730k kVar = this.c;
        if (kVar != null) {
            i = kVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImageLoaderConfig(context=");
        sb.append(this.a);
        sb.append(", useHighQualityImagery=");
        sb.append(this.b);
        sb.append(", imageCache=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
