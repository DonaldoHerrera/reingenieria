package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.v.a;

/* compiled from: DecorToolbar */
public interface D {
    Ec a(int i, long j);

    void a(int i);

    void a(Menu menu, a aVar);

    void a(a aVar, l.a aVar2);

    void a(T t);

    void a(CharSequence charSequence);

    void a(boolean z);

    boolean a();

    void b(int i);

    void b(boolean z);

    boolean b();

    void c(int i);

    boolean c();

    void collapseActionView();

    boolean d();

    void e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    Menu h();

    int i();

    ViewGroup j();

    void k();

    void l();

    int m();

    void n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
