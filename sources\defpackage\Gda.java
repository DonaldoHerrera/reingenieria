package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: Gda reason: default package */
/* compiled from: PlaylistStats */
public abstract class Gda {
    @JsonCreator
    public static Gda a(@JsonProperty("reposts_count") int i, @JsonProperty("likes_count") int i2) {
        return new Dda(i, i2);
    }

    public abstract int a();

    public abstract int b();
}
