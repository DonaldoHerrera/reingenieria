package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: Ra reason: default package and case insensitive filesystem */
/* compiled from: ComplexColorCompat */
public final class C0250Ra {
    private final Shader a;
    private final ColorStateList b;
    private int c;

    private C0250Ra(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    static C0250Ra a(Shader shader) {
        return new C0250Ra(shader, null, 0);
    }

    public Shader b() {
        return this.a;
    }

    public boolean c() {
        return this.a != null;
    }

    public boolean d() {
        if (this.a == null) {
            ColorStateList colorStateList = this.b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        return c() || this.c != 0;
    }

    static C0250Ra a(ColorStateList colorStateList) {
        return new C0250Ra(null, colorStateList, colorStateList.getDefaultColor());
    }

    public void b(int i) {
        this.c = i;
    }

    static C0250Ra a(int i) {
        return new C0250Ra(null, null, i);
    }

    private static C0250Ra b(Resources resources, int i, Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c2 = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c2 = 0;
                }
            } else if (name.equals("gradient")) {
                c2 = 1;
            }
            if (c2 == 0) {
                return a(C0246Qa.a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            if (c2 == 1) {
                return a(C0258Ta.a(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    public int a() {
        return this.c;
    }

    public boolean a(int[] iArr) {
        if (d()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public static C0250Ra a(Resources resources, int i, Theme theme) {
        try {
            return b(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }
}
