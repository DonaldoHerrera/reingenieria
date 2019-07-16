package defpackage;

import java.io.InputStream;

/* renamed from: Trb reason: default package */
/* compiled from: BuiltInsLoaderImpl.kt */
final /* synthetic */ class Trb extends C7402tYa implements _Xa<String, InputStream> {
    Trb(Wrb wrb) {
        super(1, wrb);
    }

    /* renamed from: a */
    public final InputStream invoke(String str) {
        C7471uYa.b(str, "p1");
        return ((Wrb) this.c).a(str);
    }

    public final String getName() {
        return "loadResource";
    }

    public final C7610wZa h() {
        return HYa.a(Wrb.class);
    }

    public final String j() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }
}
