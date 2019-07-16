package defpackage;

import com.adjust.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;

/* renamed from: Bv reason: default package */
public final class Bv implements FirebaseRemoteConfigValue {
    private final String a;
    private final int b;

    Bv(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean asBoolean() throws IllegalArgumentException {
        if (this.b == 0) {
            return false;
        }
        String trim = asString().trim();
        if (C1707sv.b.matcher(trim).matches()) {
            return true;
        }
        if (C1707sv.c.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "boolean"}));
    }

    public final byte[] asByteArray() {
        if (this.b == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
        }
        return this.a.getBytes(C1707sv.a);
    }

    public final double asDouble() {
        if (this.b == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        String trim = asString().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "double"}), e);
        }
    }

    public final long asLong() {
        if (this.b == 0) {
            return 0;
        }
        String trim = asString().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, Constants.LONG}), e);
        }
    }

    public final String asString() {
        if (this.b == 0) {
            return "";
        }
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    public final int getSource() {
        return this.b;
    }
}
