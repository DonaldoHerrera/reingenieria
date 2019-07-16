package defpackage;

import java.util.List;

/* renamed from: rrb reason: default package and case insensitive filesystem */
/* compiled from: ErrorReporter */
class C7288rrb implements C7357srb {
    C7288rrb() {
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void a(C4935Gcb gcb) {
        if (gcb == null) {
            a(2);
            throw null;
        }
    }

    public void a(C5029Jcb jcb, List<String> list) {
        if (jcb == null) {
            a(0);
            throw null;
        } else if (list == null) {
            a(1);
            throw null;
        }
    }
}
