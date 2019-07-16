package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: pka reason: default package and case insensitive filesystem */
/* compiled from: DateOfBirth */
abstract class C4638pka {
    C4638pka() {
    }

    static C4638pka a(long j, long j2) {
        return new C4566gka(j, j2);
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("month")
    public abstract long a();

    /* access modifiers changed from: 0000 */
    @JsonProperty("year")
    public abstract long b();
}
