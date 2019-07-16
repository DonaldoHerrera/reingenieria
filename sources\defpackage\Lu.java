package defpackage;

import java.util.logging.Logger;

/* renamed from: Lu reason: default package */
final class Lu {
    private static final Logger a = Logger.getLogger(Lu.class.getName());
    private static final Mu b = new a();

    /* renamed from: Lu$a */
    static final class a {
        private a() {
        }
    }

    private Lu() {
    }

    static boolean a(String str) {
        return str == null || str.isEmpty();
    }
}
