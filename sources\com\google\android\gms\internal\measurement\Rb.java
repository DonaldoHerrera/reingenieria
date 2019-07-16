package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class Rb extends IOException {
    private C1026qc a = null;

    public Rb(String str) {
        super(str);
    }

    static Rb b() {
        return new Rb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static Rb c() {
        return new Rb("CodedInputStream encountered a malformed varint.");
    }

    static Rb d() {
        return new Rb("Protocol message contained an invalid tag (zero).");
    }

    static Rb e() {
        return new Rb("Protocol message end-group tag did not match expected tag.");
    }

    static Qb f() {
        return new Qb("Protocol message tag had invalid wire type.");
    }

    static Rb g() {
        return new Rb("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static Rb h() {
        return new Rb("Failed to parse the message.");
    }

    static Rb i() {
        return new Rb("Protocol message had invalid UTF-8.");
    }

    public final Rb a(C1026qc qcVar) {
        this.a = qcVar;
        return this;
    }

    static Rb a() {
        return new Rb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
