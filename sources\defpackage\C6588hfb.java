package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: hfb reason: default package and case insensitive filesystem */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C6588hfb implements C6520gfb {
    private final List<C6792kfb> a;
    private final Set<C6792kfb> b;
    private final List<C6792kfb> c;

    public C6588hfb(List<C6792kfb> list, Set<C6792kfb> set, List<C6792kfb> list2) {
        C7471uYa.b(list, "allDependencies");
        C7471uYa.b(set, "modulesWhoseInternalsAreVisible");
        C7471uYa.b(list2, "expectedByDependencies");
        this.a = list;
        this.b = set;
        this.c = list2;
    }

    public List<C6792kfb> a() {
        return this.a;
    }

    public List<C6792kfb> b() {
        return this.c;
    }

    public Set<C6792kfb> c() {
        return this.b;
    }
}
