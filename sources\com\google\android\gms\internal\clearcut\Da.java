package com.google.android.gms.internal.clearcut;

final class Da implements Ka {
    private Ka[] a;

    Da(Ka... kaArr) {
        this.a = kaArr;
    }

    public final Ja a(Class<?> cls) {
        Ka[] kaArr;
        for (Ka ka : this.a) {
            if (ka.b(cls)) {
                return ka.a(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final boolean b(Class<?> cls) {
        for (Ka b : this.a) {
            if (b.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
