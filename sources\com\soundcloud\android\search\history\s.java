package com.soundcloud.android.search.history;

@EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/search/history/SearchHistoryItem;", "", "()V", "ClearItem", "SearchHistoryListItem", "Lcom/soundcloud/android/search/history/SearchHistoryItem$SearchHistoryListItem;", "Lcom/soundcloud/android/search/history/SearchHistoryItem$ClearItem;", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchHistoryItem.kt */
public abstract class s {

    /* compiled from: SearchHistoryItem.kt */
    public static final class a extends s {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: SearchHistoryItem.kt */
    public static final class b extends s {
        private final String a;
        private final int b;

        public b(String str, int i) {
            C7471uYa.b(str, "searchTerm");
            super(null);
            this.a = str;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
                        if (this.b == bVar.b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchHistoryListItem(searchTerm=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    private s() {
    }

    public /* synthetic */ s(C7264rYa rya) {
        this();
    }
}
