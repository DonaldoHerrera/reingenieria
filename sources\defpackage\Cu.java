package defpackage;

import java.util.Map;

/* renamed from: Cu reason: default package */
public final class Cu extends C1675rt {
    @Yt
    private Map<String, String> analyticsUserProperties;
    @Yt
    private String appId;
    @Yt
    private String appInstanceId;
    @Yt
    private String appInstanceIdToken;
    @Yt
    private String appVersion;
    @Yt
    private String countryCode;
    @Yt
    private String languageCode;
    @Yt
    private String packageName;
    @Yt
    private String platformVersion;
    @Yt
    private String sdkVersion;
    @Yt
    private String timeZone;

    public final Cu a(Map<String, String> map) {
        this.analyticsUserProperties = map;
        return this;
    }

    public final Cu b(String str) {
        this.appInstanceId = str;
        return this;
    }

    public final Cu c(String str) {
        this.appInstanceIdToken = str;
        return this;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (Cu) super.clone();
    }

    public final Cu d(String str) {
        this.appVersion = str;
        return this;
    }

    public final Cu e(String str) {
        this.countryCode = str;
        return this;
    }

    public final Cu f(String str) {
        this.languageCode = str;
        return this;
    }

    public final Cu g(String str) {
        this.packageName = str;
        return this;
    }

    public final Cu h(String str) {
        this.platformVersion = str;
        return this;
    }

    public final Cu i(String str) {
        this.sdkVersion = str;
        return this;
    }

    public final Cu j(String str) {
        this.timeZone = str;
        return this;
    }

    public final /* synthetic */ C1675rt k() {
        return (Cu) clone();
    }

    public final Cu a(String str) {
        this.appId = str;
        return this;
    }

    public final /* synthetic */ C1675rt c(String str, Object obj) {
        return (Cu) a(str, obj);
    }

    public final /* synthetic */ Tt i() {
        return (Cu) clone();
    }

    public final /* synthetic */ Tt a(String str, Object obj) {
        return (Cu) super.a(str, obj);
    }
}
