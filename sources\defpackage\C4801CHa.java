package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* renamed from: CHa reason: default package and case insensitive filesystem */
/* compiled from: KeyboardHelper.kt */
public class C4801CHa {
    private final InputMethodManager a;

    public C4801CHa(Context context) {
        C7471uYa.b(context, "context");
        Object systemService = context.getSystemService("input_method");
        C7471uYa.a(systemService, "context.getSystemService…ext.INPUT_METHOD_SERVICE)");
        if (systemService instanceof InputMethodManager) {
            this.a = (InputMethodManager) systemService;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(systemService);
        sb.append(" not of type ");
        sb.append(InputMethodManager.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    public void a(Window window, View view) {
        C7471uYa.b(window, "currentWindow");
        C7471uYa.b(view, "view");
        window.setSoftInputMode(3);
        a(view);
    }

    public void b(Window window, View view) {
        C7471uYa.b(window, "currentWindow");
        C7471uYa.b(view, "view");
        window.setSoftInputMode(52);
        b(view);
    }

    public void a(View view) {
        C7471uYa.b(view, "view");
        this.a.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void b(View view) {
        C7471uYa.b(view, "view");
        this.a.showSoftInput(view, 1);
    }
}
