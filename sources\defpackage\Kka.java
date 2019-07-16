package defpackage;

import java.util.EnumSet;

/* renamed from: Kka reason: default package */
/* compiled from: TaskResultKind */
public enum Kka {
    SUCCESS,
    FAILURE,
    EMAIL_TAKEN,
    SPAM,
    AGE_RESTRICTED,
    DENIED,
    EMAIL_INVALID,
    FLAKY_SIGNUP_ERROR,
    DEVICE_CONFLICT,
    DEVICE_BLOCK,
    UNAUTHORIZED,
    NETWORK_ERROR,
    SERVER_ERROR,
    VALIDATION_ERROR,
    GOOGLE_NEEDS_PERMISSIONS;
    
    private static final EnumSet<Kka> p = null;

    static {
        Kka kka;
        Kka kka2;
        Kka kka3;
        Kka kka4;
        Kka kka5;
        Kka kka6;
        Kka kka7;
        p = EnumSet.of(kka, new Kka[]{kka4, kka6, kka7, kka5, kka2, kka3});
    }

    public boolean a() {
        return p.contains(this);
    }
}
