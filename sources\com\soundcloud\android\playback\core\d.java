package com.soundcloud.android.playback.core;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/playback/core/Logger;", "", "debug", "", "tag", "", "message", "error", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "info", "playback-core_release"}, mv = {1, 1, 15})
/* compiled from: Logger.kt */
public interface d {

    /* compiled from: Logger.kt */
    public static final class a {
        public static /* synthetic */ void a(d dVar, Exception exc, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                dVar.a(exc, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exception");
        }
    }

    void a(Exception exc, String str);

    void a(String str, String str2);

    void b(String str, String str2);

    void c(String str, String str2);
}
