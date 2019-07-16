package defpackage;

import java.util.Date;

/* renamed from: cCa reason: default package and case insensitive filesystem */
/* compiled from: DatabasePostRecord */
public abstract class C5688cCa implements C6760kCa {
    public static C5688cCa a(C3508cda cda, Date date) {
        return new C5620bCa(cda, date, false);
    }

    public static C5688cCa b(C3508cda cda, Date date) {
        return new C5620bCa(cda, date, true);
    }
}
