package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class Bd extends IOException {
    public Bd(String str) {
        super(str);
    }

    static Bd a() {
        return new Bd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static Bd b() {
        return new Bd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static Bd c() {
        return new Bd("CodedInputStream encountered a malformed varint.");
    }

    public Bd(String str, Exception exc) {
        super(str, exc);
    }
}
