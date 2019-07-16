package defpackage;

/* renamed from: zu reason: default package and case insensitive filesystem */
public final class C1916zu extends C1675rt {
    @Yt
    private String experimentId;
    @Yt
    private String experimentStartTime;
    @C1915zt
    @Yt
    private Long timeToLiveMillis;
    @Yt
    private String triggerEvent;
    @C1915zt
    @Yt
    private Long triggerTimeoutMillis;
    @Yt
    private String variantId;

    public final C1916zu a(String str) {
        this.experimentId = str;
        return this;
    }

    public final C1916zu b(String str) {
        this.experimentStartTime = str;
        return this;
    }

    public final C1916zu c(String str) {
        this.triggerEvent = str;
        return this;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (C1916zu) super.clone();
    }

    public final C1916zu d(String str) {
        this.variantId = str;
        return this;
    }

    public final /* synthetic */ Tt i() {
        return (C1916zu) clone();
    }

    public final /* synthetic */ C1675rt k() {
        return (C1916zu) clone();
    }

    public final C1916zu a(Long l) {
        this.timeToLiveMillis = l;
        return this;
    }

    public final C1916zu b(Long l) {
        this.triggerTimeoutMillis = l;
        return this;
    }

    public final /* synthetic */ C1675rt c(String str, Object obj) {
        return (C1916zu) a(str, obj);
    }

    public final /* synthetic */ Tt a(String str, Object obj) {
        return (C1916zu) super.a(str, obj);
    }
}
