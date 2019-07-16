package androidx.appcompat.app;

import android.content.res.Resources.NotFoundException;
import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: AppCompatDelegateImpl */
class o implements UncaughtExceptionHandler {
    final /* synthetic */ UncaughtExceptionHandler a;

    o(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    private boolean a(Throwable th) {
        if (!(th instanceof NotFoundException)) {
            return false;
        }
        String message = th.getMessage();
        if (message == null) {
            return false;
        }
        if (message.contains("drawable") || message.contains("Drawable")) {
            return true;
        }
        return false;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (a(th)) {
            StringBuilder sb = new StringBuilder();
            sb.append(th.getMessage());
            sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            NotFoundException notFoundException = new NotFoundException(sb.toString());
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.a.uncaughtException(thread, notFoundException);
            return;
        }
        this.a.uncaughtException(thread, th);
    }
}
