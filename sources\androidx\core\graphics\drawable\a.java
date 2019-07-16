package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat */
public final class a {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public static void a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static void b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof e) {
            ((e) drawable).setTint(i);
        }
    }

    public static int c(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static ColorFilter d(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static int e(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            String str = "DrawableCompat";
            if (!d) {
                try {
                    c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str, "Failed to retrieve getLayoutDirection() method", e);
                }
                d = true;
            }
            Method method = c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i(str, "Failed to invoke getLayoutDirection() via reflection", e2);
                    c = null;
                }
            }
        }
        return 0;
    }

    public static boolean f(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    public static void g(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static <T extends Drawable> T h(Drawable drawable) {
        return drawable instanceof f ? ((f) drawable).a() : drawable;
    }

    public static Drawable i(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        return i >= 21 ? !(drawable instanceof e) ? new h(drawable) : drawable : !(drawable instanceof e) ? new g(drawable) : drawable;
    }

    public static void a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void b(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                b(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof f) {
                b(((f) drawable).a());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        Drawable child = drawableContainerState.getChild(i2);
                        if (child != null) {
                            b(child);
                        }
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof e) {
            ((e) drawable).setTintList(colorStateList);
        }
    }

    public static void a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof e) {
            ((e) drawable).setTintMode(mode);
        }
    }

    public static void a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean a(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static boolean a(Drawable drawable, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            String str = "DrawableCompat";
            if (!b) {
                try {
                    a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str, "Failed to retrieve setLayoutDirection(int) method", e);
                }
                b = true;
            }
            Method method = a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i(str, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    a = null;
                }
            }
        }
        return false;
    }
}
