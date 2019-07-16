package defpackage;

import java.util.List;

/* renamed from: fob reason: default package and case insensitive filesystem */
/* compiled from: UninitializedMessageException */
public class C6461fob extends RuntimeException {
    private final List<String> a = null;

    public C6461fob(Wnb wnb) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public Onb a() {
        return new Onb(getMessage());
    }
}
