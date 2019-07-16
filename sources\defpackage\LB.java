package defpackage;

/* renamed from: LB reason: default package */
public final class LB {
    private static final C1893zA a = new C1893zA("SplitInstallInfoProvider");

    public static boolean a(String str) {
        return str.startsWith("config.");
    }

    public static boolean b(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static String c(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }
}
