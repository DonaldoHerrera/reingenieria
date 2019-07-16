package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.ma reason: case insensitive filesystem */
public class C0773ma extends IOException {
    private La a = null;

    public C0773ma(String str) {
        super(str);
    }

    static C0773ma a() {
        return new C0773ma("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static C0773ma b() {
        return new C0773ma("Protocol message contained an invalid tag (zero).");
    }

    static C0776na c() {
        return new C0776na("Protocol message tag had invalid wire type.");
    }

    static C0773ma d() {
        return new C0773ma("Failed to parse the message.");
    }

    static C0773ma e() {
        return new C0773ma("Protocol message had invalid UTF-8.");
    }

    public final C0773ma a(La la) {
        this.a = la;
        return this;
    }
}
