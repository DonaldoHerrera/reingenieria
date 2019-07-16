package com.soundcloud.android.foundation.events;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/foundation/events/Module;", "", "name", "", "position", "", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "events_release"}, mv = {1, 1, 15})
/* compiled from: Module.kt */
public final class v {
    public static final a a = new a(null);
    private final String b;
    private final int c;

    /* compiled from: Module.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public v(String str, int i) {
        C7471uYa.b(str, "name");
        this.b = str;
        this.c = i;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (C7471uYa.a((Object) this.b, (Object) vVar.b)) {
                    if (this.c == vVar.c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        return ((str != null ? str.hashCode() : 0) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Module(name=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
