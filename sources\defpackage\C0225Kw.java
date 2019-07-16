package defpackage;

import java.io.IOException;

/* renamed from: Kw reason: default package and case insensitive filesystem */
public class C0225Kw extends IOException {
    private C1403ix a = null;

    public C0225Kw(String str) {
        super(str);
    }

    static C0225Kw b() {
        return new C0225Kw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C0225Kw c() {
        return new C0225Kw("CodedInputStream encountered a malformed varint.");
    }

    static C0225Kw d() {
        return new C0225Kw("Protocol message contained an invalid tag (zero).");
    }

    static C0225Kw e() {
        return new C0225Kw("Protocol message end-group tag did not match expected tag.");
    }

    static C0221Jw f() {
        return new C0221Jw("Protocol message tag had invalid wire type.");
    }

    static C0225Kw g() {
        return new C0225Kw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C0225Kw h() {
        return new C0225Kw("Failed to parse the message.");
    }

    static C0225Kw i() {
        return new C0225Kw("Protocol message had invalid UTF-8.");
    }

    public final C0225Kw a(C1403ix ixVar) {
        this.a = ixVar;
        return this;
    }

    static C0225Kw a() {
        return new C0225Kw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
