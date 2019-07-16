package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.widget.E;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: y reason: default package and case insensitive filesystem */
/* compiled from: SupportMenuInflater */
public class C1862y extends MenuInflater {
    static final Class<?>[] a = {Context.class};
    static final Class<?>[] b = a;
    final Object[] c;
    final Object[] d = this.c;
    Context e;
    private Object f;

    /* renamed from: y$a */
    /* compiled from: SupportMenuInflater */
    private static class a implements OnMenuItemClickListener {
        private static final Class<?>[] a = {MenuItem.class};
        private Object b;
        private Method c;

        public a(Object obj, String str) {
            this.b = obj;
            Class cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.c.invoke(this.b, new Object[]{menuItem})).booleanValue();
                }
                this.c.invoke(this.b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: y$b */
    /* compiled from: SupportMenuInflater */
    private class b {
        C0278Xb A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private Mode E = null;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            d();
        }

        public void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1862y.this.e.obtainStyledAttributes(attributeSet, C1406j.MenuGroup);
            this.b = obtainStyledAttributes.getResourceId(C1406j.MenuGroup_android_id, 0);
            this.c = obtainStyledAttributes.getInt(C1406j.MenuGroup_android_menuCategory, 0);
            this.d = obtainStyledAttributes.getInt(C1406j.MenuGroup_android_orderInCategory, 0);
            this.e = obtainStyledAttributes.getInt(C1406j.MenuGroup_android_checkableBehavior, 0);
            this.f = obtainStyledAttributes.getBoolean(C1406j.MenuGroup_android_visible, true);
            this.g = obtainStyledAttributes.getBoolean(C1406j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1862y.this.e.obtainStyledAttributes(attributeSet, C1406j.MenuItem);
            this.i = obtainStyledAttributes.getResourceId(C1406j.MenuItem_android_id, 0);
            this.j = (obtainStyledAttributes.getInt(C1406j.MenuItem_android_menuCategory, this.c) & -65536) | (obtainStyledAttributes.getInt(C1406j.MenuItem_android_orderInCategory, this.d) & 65535);
            this.k = obtainStyledAttributes.getText(C1406j.MenuItem_android_title);
            this.l = obtainStyledAttributes.getText(C1406j.MenuItem_android_titleCondensed);
            this.m = obtainStyledAttributes.getResourceId(C1406j.MenuItem_android_icon, 0);
            this.n = a(obtainStyledAttributes.getString(C1406j.MenuItem_android_alphabeticShortcut));
            this.o = obtainStyledAttributes.getInt(C1406j.MenuItem_alphabeticModifiers, 4096);
            this.p = a(obtainStyledAttributes.getString(C1406j.MenuItem_android_numericShortcut));
            this.q = obtainStyledAttributes.getInt(C1406j.MenuItem_numericModifiers, 4096);
            if (obtainStyledAttributes.hasValue(C1406j.MenuItem_android_checkable)) {
                this.r = obtainStyledAttributes.getBoolean(C1406j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.r = this.e;
            }
            this.s = obtainStyledAttributes.getBoolean(C1406j.MenuItem_android_checked, false);
            this.t = obtainStyledAttributes.getBoolean(C1406j.MenuItem_android_visible, this.f);
            this.u = obtainStyledAttributes.getBoolean(C1406j.MenuItem_android_enabled, this.g);
            this.v = obtainStyledAttributes.getInt(C1406j.MenuItem_showAsAction, -1);
            this.z = obtainStyledAttributes.getString(C1406j.MenuItem_android_onClick);
            this.w = obtainStyledAttributes.getResourceId(C1406j.MenuItem_actionLayout, 0);
            this.x = obtainStyledAttributes.getString(C1406j.MenuItem_actionViewClass);
            this.y = obtainStyledAttributes.getString(C1406j.MenuItem_actionProviderClass);
            boolean z2 = this.y != null;
            if (z2 && this.w == 0 && this.x == null) {
                this.A = (C0278Xb) a(this.y, C1862y.b, C1862y.this.d);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = obtainStyledAttributes.getText(C1406j.MenuItem_contentDescription);
            this.C = obtainStyledAttributes.getText(C1406j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C1406j.MenuItem_iconTintMode)) {
                this.E = E.a(obtainStyledAttributes.getInt(C1406j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (obtainStyledAttributes.hasValue(C1406j.MenuItem_iconTint)) {
                this.D = obtainStyledAttributes.getColorStateList(C1406j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            obtainStyledAttributes.recycle();
            this.h = false;
        }

        public boolean c() {
            return this.h;
        }

        public void d() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        private char a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private void a(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!C1862y.this.e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(C1862y.this.a(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z3 = menuItem instanceof p;
            if (z3) {
                p pVar = (p) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    ((p) menuItem).c(true);
                } else if (menuItem instanceof q) {
                    ((q) menuItem).a(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, C1862y.a, C1862y.this.c));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0278Xb xb = this.A;
            if (xb != null) {
                C0518cc.a(menuItem, xb);
            }
            C0518cc.a(menuItem, this.B);
            C0518cc.b(menuItem, this.C);
            C0518cc.a(menuItem, this.n, this.o);
            C0518cc.b(menuItem, this.p, this.q);
            Mode mode = this.E;
            if (mode != null) {
                C0518cc.a(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                C0518cc.a(menuItem, colorStateList);
            }
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public void a() {
            this.h = true;
            a(this.a.add(this.b, this.i, this.j, this.k));
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = C1862y.this.e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e2);
                return null;
            }
        }
    }

    public C1862y(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        String str;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = "menu";
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                String str3 = "item";
                String str4 = "group";
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            str2 = null;
                            z2 = false;
                        } else if (name2.equals(str4)) {
                            bVar.d();
                        } else if (name2.equals(str3)) {
                            if (!bVar.c()) {
                                C0278Xb xb = bVar.A;
                                if (xb == null || !xb.b()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals(str)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        bVar.a(attributeSet);
                    } else if (name3.equals(str3)) {
                        bVar.b(attributeSet);
                    } else if (name3.equals(str)) {
                        a(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str2 = name3;
                        z2 = true;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof C1505mb)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.e.getResources().getLayout(i);
            a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException(str, e2);
        } catch (IOException e3) {
            throw new InflateException(str, e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public Object a() {
        if (this.f == null) {
            this.f = a(this.e);
        }
        return this.f;
    }

    private Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }
}
