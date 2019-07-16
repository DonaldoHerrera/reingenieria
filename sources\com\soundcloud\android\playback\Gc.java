package com.soundcloud.android.playback;

/* compiled from: PlaybackPerformanceListener.kt */
final class Gc extends Exception {
    private final String a;
    private final int b;
    private final String c;

    public Gc(String str, int i, String str2) {
        C7471uYa.b(str, "message");
        C7471uYa.b(str2, "sourceFile");
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gc) {
                Gc gc = (Gc) obj;
                if (C7471uYa.a((Object) getMessage(), (Object) gc.getMessage())) {
                    if (!(this.b == gc.b) || !C7471uYa.a((Object) this.c, (Object) gc.c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String getMessage() {
        return this.a;
    }

    public StackTraceElement[] getStackTrace() {
        return new StackTraceElement[]{new StackTraceElement(getMessage(), new String(), this.c, this.b)};
    }

    public int hashCode() {
        String message = getMessage();
        int i = 0;
        int hashCode = (((message != null ? message.hashCode() : 0) * 31) + this.b) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayerException(message=");
        sb.append(getMessage());
        sb.append(", line=");
        sb.append(this.b);
        sb.append(", sourceFile=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
