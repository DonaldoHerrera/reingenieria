package defpackage;

import java.util.Set;

/* renamed from: Web reason: default package */
/* compiled from: EnumEntrySyntheticClassDescriptor */
class Web extends C6871lpb {
    final /* synthetic */ Set a;
    final /* synthetic */ a b;

    Web(a aVar, Set set) {
        this.b = aVar;
        this.a = set;
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void a(C4935Gcb gcb) {
        if (gcb != null) {
            C7629wpb.a(gcb, null);
            this.a.add(gcb);
            return;
        }
        a(0);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void c(C4935Gcb gcb, C4935Gcb gcb2) {
        if (gcb == null) {
            a(1);
            throw null;
        } else if (gcb2 == null) {
            a(2);
            throw null;
        }
    }
}
