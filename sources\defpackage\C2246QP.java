package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: QP reason: default package and case insensitive filesystem */
/* compiled from: ApiStreamPlaylistPost */
public class C2246QP {
    private final C3927zda a;
    private final long b;

    @JsonCreator
    public C2246QP(@JsonProperty("playlist") C3927zda zda, @JsonProperty("created_at") Date date) {
        this.a = zda;
        this.b = date.getTime();
    }

    public C3927zda a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }
}
