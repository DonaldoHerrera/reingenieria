package defpackage;

import java.util.List;

/* renamed from: rdb reason: default package and case insensitive filesystem */
/* compiled from: typeParameterUtils.kt */
public final class C7270rdb {
    private final C5152Ncb a;
    private final List<Stb> b;
    private final C7270rdb c;

    public C7270rdb(C5152Ncb ncb, List<? extends Stb> list, C7270rdb rdb) {
        C7471uYa.b(ncb, "classifierDescriptor");
        C7471uYa.b(list, "arguments");
        this.a = ncb;
        this.b = list;
        this.c = rdb;
    }

    public final List<Stb> a() {
        return this.b;
    }

    public final C5152Ncb b() {
        return this.a;
    }

    public final C7270rdb c() {
        return this.c;
    }
}
