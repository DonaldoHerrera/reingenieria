package defpackage;

/* renamed from: yu reason: default package and case insensitive filesystem */
public final class C1886yu extends C1856xu<Bu> {
    @Yt
    private String namespace;
    @Yt
    private String project;

    protected C1886yu(C1766uu uuVar, String str, String str2, Cu cu) {
        super(uuVar.a.a, "POST", "v1/projects/{project}/namespaces/{namespace}:fetch", cu, Bu.class);
        C1216cu.a(str, "Required parameter project must be specified.");
        this.project = str;
        C1216cu.a(str2, "Required parameter namespace must be specified.");
        this.namespace = str2;
    }

    public final /* synthetic */ Tt a(String str, Object obj) {
        return (C1886yu) super.a(str, obj);
    }

    public final /* synthetic */ C1827wv c(String str, Object obj) {
        return (C1886yu) a(str, obj);
    }

    public final /* synthetic */ C1559ny d(String str, Object obj) {
        return (C1886yu) a(str, obj);
    }

    public final /* synthetic */ C1856xu e(String str, Object obj) {
        return (C1886yu) a(str, obj);
    }
}
