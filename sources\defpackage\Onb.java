package defpackage;

import java.io.IOException;

/* renamed from: Onb reason: default package */
/* compiled from: InvalidProtocolBufferException */
public class Onb extends IOException {
    private Wnb a = null;

    public Onb(String str) {
        super(str);
    }

    static Onb b() {
        return new Onb("Protocol message end-group tag did not match expected tag.");
    }

    static Onb c() {
        return new Onb("Protocol message contained an invalid tag (zero).");
    }

    static Onb d() {
        return new Onb("Protocol message had invalid UTF-8.");
    }

    static Onb e() {
        return new Onb("Protocol message tag had invalid wire type.");
    }

    static Onb f() {
        return new Onb("CodedInputStream encountered a malformed varint.");
    }

    static Onb g() {
        return new Onb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static Onb h() {
        return new Onb("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static Onb i() {
        return new Onb("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static Onb j() {
        return new Onb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public Onb a(Wnb wnb) {
        this.a = wnb;
        return this;
    }

    public Wnb a() {
        return this.a;
    }
}
