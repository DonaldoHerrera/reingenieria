package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: hBa reason: default package and case insensitive filesystem */
/* compiled from: ApiPlaylistWrapper */
class C6554hBa {
    private final C3927zda a;

    @JsonCreator
    C6554hBa(@JsonProperty("playlist") C3927zda zda) {
        this.a = zda;
    }

    /* access modifiers changed from: 0000 */
    public C3927zda a() {
        return this.a;
    }
}
