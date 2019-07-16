package defpackage;

import java.util.Arrays;

/* renamed from: jnb reason: default package and case insensitive filesystem */
/* compiled from: JvmMetadataVersion.kt */
public final class C6732jnb extends Bmb {
    public static final C6732jnb g = new C6732jnb(1, 1, 15);
    public static final C6732jnb h = new C6732jnb(new int[0]);
    public static final a i = new a(null);
    private final boolean j;

    /* renamed from: jnb$a */
    /* compiled from: JvmMetadataVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6732jnb(int[] iArr, boolean z) {
        C7471uYa.b(iArr, "versionArray");
        super(Arrays.copyOf(iArr, iArr.length));
        this.j = z;
    }

    public boolean d() {
        if (a() == 1 && b() == 0) {
            return false;
        }
        boolean z = this.j ? b(g) : a() == 1 && b() <= 4;
        if (z) {
            return true;
        }
        return false;
    }

    public C6732jnb(int... iArr) {
        C7471uYa.b(iArr, "numbers");
        this(iArr, false);
    }
}
