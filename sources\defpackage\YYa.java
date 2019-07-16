package defpackage;

import java.util.Random;

/* renamed from: YYa reason: default package */
/* compiled from: PlatformRandom.kt */
public final class YYa extends ThreadLocal<Random> {
    YYa() {
    }

    /* access modifiers changed from: protected */
    public Random initialValue() {
        return new Random();
    }
}
