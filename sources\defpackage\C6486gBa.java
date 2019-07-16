package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: gBa reason: default package and case insensitive filesystem */
/* compiled from: ApiPlaylistWithTracks */
public class C6486gBa {
    private final C3927zda a;
    private final Pca<Yda> b;

    @JsonCreator
    public C6486gBa(@JsonProperty("playlist") C3927zda zda, @JsonProperty("tracks") Pca<Yda> pca) {
        this.a = zda;
        this.b = pca;
    }

    public C3927zda a() {
        return this.a;
    }

    public Pca<Yda> b() {
        return this.b;
    }
}
