package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.C0325l;
import androidx.appcompat.view.menu.v.a;

/* compiled from: MenuDialogHelper */
class m implements OnKeyListener, OnClickListener, OnDismissListener, a {
    private l a;
    private C0325l b;
    j c;
    private a d;

    public m(l lVar) {
        this.a = lVar;
    }

    public void a(IBinder iBinder) {
        l lVar = this.a;
        C0325l.a aVar = new C0325l.a(lVar.e());
        this.c = new j(aVar.b(), C1314g.abc_list_menu_item_layout);
        this.c.a((a) this);
        this.a.a((v) this.c);
        aVar.a(this.c.c(), (OnClickListener) this);
        View i = lVar.i();
        if (i != null) {
            aVar.a(i);
        } else {
            aVar.a(lVar.g());
            aVar.b(lVar.h());
        }
        aVar.a((OnKeyListener) this);
        this.b = aVar.a();
        this.b.setOnDismissListener(this);
        LayoutParams attributes = this.b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.b.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a((MenuItem) (p) this.c.c().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.b.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.b.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.a.a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }

    public void a() {
        C0325l lVar = this.b;
        if (lVar != null) {
            lVar.dismiss();
        }
    }

    public void a(l lVar, boolean z) {
        if (z || lVar == this.a) {
            a();
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(lVar, z);
        }
    }

    public boolean a(l lVar) {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.a(lVar);
        }
        return false;
    }
}
