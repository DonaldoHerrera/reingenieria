package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: TJa reason: default package and case insensitive filesystem */
/* compiled from: ApiWaveform */
public class C5325TJa {
    @JsonProperty("height")
    public final int a;
    @JsonProperty("samples")
    public final int[] b;

    @JsonCreator
    public C5325TJa(@JsonProperty("height") int i, @JsonProperty("samples") int[] iArr) {
        this.a = i;
        this.b = iArr;
    }
}
