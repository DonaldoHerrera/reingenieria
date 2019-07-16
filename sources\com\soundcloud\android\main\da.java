package com.soundcloud.android.main;

import androidx.fragment.app.Fragment;

@EVa(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/main/PlayerNavigationResult;", "", "kind", "Lcom/soundcloud/android/main/PlayerNavigationResult$Kind;", "(Lcom/soundcloud/android/main/PlayerNavigationResult$Kind;)V", "getKind", "()Lcom/soundcloud/android/main/PlayerNavigationResult$Kind;", "Kind", "Pop", "Push", "Lcom/soundcloud/android/main/PlayerNavigationResult$Push;", "Lcom/soundcloud/android/main/PlayerNavigationResult$Pop;", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayerNavigationResolver.kt */
public abstract class da {
    private final a a;

    /* compiled from: PlayerNavigationResolver.kt */
    public enum a {
        PUSH,
        POP
    }

    /* compiled from: PlayerNavigationResolver.kt */
    public static final class b extends da {
        private final String b;

        public b(String str) {
            C7471uYa.b(str, "tag");
            super(a.POP, null);
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.main.da.b) r2).b) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.b;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Pop(tag=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayerNavigationResolver.kt */
    public static final class c extends da {
        private final Fragment b;

        public c(Fragment fragment) {
            C7471uYa.b(fragment, "fragment");
            super(a.PUSH, null);
            this.b = fragment;
        }

        public final Fragment a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.main.da.c) r2).b) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Fragment fragment = this.b;
            if (fragment != null) {
                return fragment.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Push(fragment=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    private da(a aVar) {
        this.a = aVar;
    }

    public /* synthetic */ da(a aVar, C7264rYa rya) {
        this(aVar);
    }
}
