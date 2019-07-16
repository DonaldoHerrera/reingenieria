package defpackage;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/presentation/ItemMenuOptions;", "", "displayGoToArtistProfile", "", "(Z)V", "getDisplayGoToArtistProfile", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: Zta reason: default package and case insensitive filesystem */
/* compiled from: ItemMenuOptions.kt */
public final class C5512Zta {
    public static final a a = new a(null);
    private final boolean b;

    /* renamed from: Zta$a */
    /* compiled from: ItemMenuOptions.kt */
    public static final class a {
        private a() {
        }

        public final C5512Zta a() {
            return new C5512Zta(true);
        }

        public final C5512Zta b() {
            return new C5512Zta(false);
        }

        public final C5512Zta c() {
            return new C5512Zta(true);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C5512Zta() {
        this(false, 1, null);
    }

    public C5512Zta(boolean z) {
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5512Zta) {
                if (this.b == ((C5512Zta) obj).b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.b;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemMenuOptions(displayGoToArtistProfile=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C5512Zta(boolean z, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            z = true;
        }
        this(z);
    }
}
