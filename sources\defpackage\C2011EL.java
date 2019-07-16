package defpackage;

import java.util.List;

/* renamed from: EL reason: default package and case insensitive filesystem */
/* compiled from: BatchTrackingApi.kt */
public final class C2011EL extends IllegalStateException {
    private final List<C2110JM> a;

    public C2011EL(List<C2110JM> list) {
        C7471uYa.b(list, "events");
        super("Event Gateway did not accept your tracking event");
        this.a = list;
    }

    public String getLocalizedMessage() {
        return this.a.toString();
    }
}
