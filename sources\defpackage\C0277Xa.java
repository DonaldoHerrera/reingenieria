package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: Xa reason: default package and case insensitive filesystem */
/* compiled from: ResourcesCompat */
public final class C0277Xa {

    /* renamed from: Xa$a */
    /* compiled from: ResourcesCompat */
    public static abstract class a {
        public abstract void a(int i);

        public abstract void a(Typeface typeface);

        public final void a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0267Va(this, typeface));
        }

        public final void a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0272Wa(this, i));
        }
    }

    public static Drawable a(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static Typeface a(Context context, int i) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, new TypedValue(), 0, null, null, false);
    }

    public static void a(Context context, int i, a aVar, Handler handler) throws NotFoundException {
        C0263Ub.a(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
            return;
        }
        a(context, i, new TypedValue(), 0, aVar, handler, false);
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, typedValue, i2, aVar, null, true);
    }

    private static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a2 != null || aVar != null) {
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    private static Typeface a(Context context, Resources resources, TypedValue typedValue, int i, int i2, a aVar, Handler handler, boolean z) {
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i3 = i;
        int i4 = i2;
        a aVar2 = aVar;
        Handler handler2 = handler;
        String str = "ResourcesCompat";
        CharSequence charSequence = typedValue2.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                if (aVar2 != null) {
                    aVar2.a(-3, handler2);
                }
                return null;
            }
            Typeface a2 = C0517cb.a(resources2, i3, i4);
            if (a2 != null) {
                if (aVar2 != null) {
                    aVar2.a(a2, handler2);
                }
                return a2;
            }
            try {
                if (charSequence2.toLowerCase().endsWith(".xml")) {
                    defpackage.C0254Sa.a a3 = C0254Sa.a((XmlPullParser) resources2.getXml(i3), resources2);
                    if (a3 != null) {
                        return C0517cb.a(context, a3, resources, i, i2, aVar, handler, z);
                    }
                    Log.e(str, "Failed to find font-family tag");
                    if (aVar2 != null) {
                        aVar2.a(-3, handler2);
                    }
                    return null;
                }
                Context context2 = context;
                Typeface a4 = C0517cb.a(context, resources2, i3, charSequence2, i4);
                if (aVar2 != null) {
                    if (a4 != null) {
                        aVar2.a(a4, handler2);
                    } else {
                        aVar2.a(-3, handler2);
                    }
                }
                return a4;
            } catch (XmlPullParserException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse xml resource ");
                sb.append(charSequence2);
                Log.e(str, sb.toString(), e);
                if (aVar2 != null) {
                    aVar2.a(-3, handler2);
                }
                return null;
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to read xml resource ");
                sb2.append(charSequence2);
                Log.e(str, sb2.toString(), e2);
                if (aVar2 != null) {
                }
                return null;
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Resource \"");
            sb3.append(resources2.getResourceName(i3));
            sb3.append("\" (");
            sb3.append(Integer.toHexString(i));
            sb3.append(") is not a Font: ");
            sb3.append(typedValue2);
            throw new NotFoundException(sb3.toString());
        }
    }
}
