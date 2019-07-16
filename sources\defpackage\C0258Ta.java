package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: Ta reason: default package and case insensitive filesystem */
/* compiled from: GradientColorInflaterCompat */
final class C0258Ta {

    /* renamed from: Ta$a */
    /* compiled from: GradientColorInflaterCompat */
    static final class a {
        final int[] a;
        final float[] b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = ((Integer) list.get(i)).intValue();
                this.b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    static Shader a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Theme theme2 = theme;
            TypedArray a2 = C0286Za.a(resources, theme2, attributeSet, C0242Pa.GradientColor);
            float a3 = C0286Za.a(a2, xmlPullParser2, "startX", C0242Pa.GradientColor_android_startX, 0.0f);
            float a4 = C0286Za.a(a2, xmlPullParser2, "startY", C0242Pa.GradientColor_android_startY, 0.0f);
            float a5 = C0286Za.a(a2, xmlPullParser2, "endX", C0242Pa.GradientColor_android_endX, 0.0f);
            float a6 = C0286Za.a(a2, xmlPullParser2, "endY", C0242Pa.GradientColor_android_endY, 0.0f);
            float a7 = C0286Za.a(a2, xmlPullParser2, "centerX", C0242Pa.GradientColor_android_centerX, 0.0f);
            float a8 = C0286Za.a(a2, xmlPullParser2, "centerY", C0242Pa.GradientColor_android_centerY, 0.0f);
            int b = C0286Za.b(a2, xmlPullParser2, C1325gg.TYPE, C0242Pa.GradientColor_android_type, 0);
            int a9 = C0286Za.a(a2, xmlPullParser2, "startColor", C0242Pa.GradientColor_android_startColor, 0);
            String str = "centerColor";
            boolean a10 = C0286Za.a(xmlPullParser2, str);
            int a11 = C0286Za.a(a2, xmlPullParser2, str, C0242Pa.GradientColor_android_centerColor, 0);
            int a12 = C0286Za.a(a2, xmlPullParser2, "endColor", C0242Pa.GradientColor_android_endColor, 0);
            int b2 = C0286Za.b(a2, xmlPullParser2, "tileMode", C0242Pa.GradientColor_android_tileMode, 0);
            float f = a7;
            float a13 = C0286Za.a(a2, xmlPullParser2, "gradientRadius", C0242Pa.GradientColor_android_gradientRadius, 0.0f);
            a2.recycle();
            a a14 = a(b(resources, xmlPullParser, attributeSet, theme), a9, a12, a10, a11);
            if (b == 1) {
                float f2 = f;
                if (a13 > 0.0f) {
                    int[] iArr = a14.a;
                    RadialGradient radialGradient = new RadialGradient(f2, a8, a13, iArr, a14.b, a(b2));
                    return radialGradient;
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (b != 2) {
                LinearGradient linearGradient = new LinearGradient(a3, a4, a5, a6, a14.a, a14.b, a(b2));
                return linearGradient;
            } else {
                return new SweepGradient(f, a8, a14.a, a14.b);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    private static a b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C0242Pa.GradientColorItem);
                boolean hasValue = a2.hasValue(C0242Pa.GradientColorItem_android_color);
                boolean hasValue2 = a2.hasValue(C0242Pa.GradientColorItem_android_offset);
                if (!hasValue || !hasValue2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(xmlPullParser.getPositionDescription());
                    sb.append(": <item> tag requires a 'color' attribute and a 'offset' ");
                    sb.append("attribute!");
                } else {
                    int color = a2.getColor(C0242Pa.GradientColorItem_android_color, 0);
                    float f = a2.getFloat(C0242Pa.GradientColorItem_android_offset, 0.0f);
                    a2.recycle();
                    arrayList2.add(Integer.valueOf(color));
                    arrayList.add(Float.valueOf(f));
                }
            }
        }
        if (arrayList2.size() > 0) {
            return new a((List<Integer>) arrayList2, (List<Float>) arrayList);
        }
        return null;
    }

    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i, i3, i2);
        }
        return new a(i, i2);
    }

    private static TileMode a(int i) {
        if (i == 1) {
            return TileMode.REPEAT;
        }
        if (i != 2) {
            return TileMode.CLAMP;
        }
        return TileMode.MIRROR;
    }
}
