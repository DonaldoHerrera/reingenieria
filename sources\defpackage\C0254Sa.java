package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: Sa reason: default package and case insensitive filesystem */
/* compiled from: FontResourcesParserCompat */
public class C0254Sa {

    /* renamed from: Sa$a */
    /* compiled from: FontResourcesParserCompat */
    public interface a {
    }

    /* renamed from: Sa$b */
    /* compiled from: FontResourcesParserCompat */
    public static final class b implements a {
        private final c[] a;

        public b(c[] cVarArr) {
            this.a = cVarArr;
        }

        public c[] a() {
            return this.a;
        }
    }

    /* renamed from: Sa$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class c {
        private final String a;
        private int b;
        private boolean c;
        private String d;
        private int e;
        private int f;

        public c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    /* renamed from: Sa$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class d implements a {
        private final C1807wb a;
        private final int b;
        private final int c;

        public d(C1807wb wbVar, int i, int i2) {
            this.a = wbVar;
            this.c = i;
            this.b = i2;
        }

        public int a() {
            return this.c;
        }

        public C1807wb b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        String str = "font-family";
        xmlPullParser.require(2, null, str);
        if (xmlPullParser.getName().equals(str)) {
            return c(xmlPullParser, resources);
        }
        a(xmlPullParser);
        return null;
    }

    private static a c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0242Pa.FontFamily);
        String string = obtainAttributes.getString(C0242Pa.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0242Pa.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0242Pa.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0242Pa.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0242Pa.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0242Pa.FontFamily_fontProviderFetchTimeout, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(d(xmlPullParser, resources));
                    } else {
                        a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new d(new C1807wb(string, string2, string3, a(resources, resourceId)), integer, integer2);
    }

    private static c d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0242Pa.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0242Pa.FontFamilyFont_fontWeight) ? C0242Pa.FontFamilyFont_fontWeight : C0242Pa.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0242Pa.FontFamilyFont_fontStyle) ? C0242Pa.FontFamilyFont_fontStyle : C0242Pa.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0242Pa.FontFamilyFont_ttcIndex) ? C0242Pa.FontFamilyFont_ttcIndex : C0242Pa.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0242Pa.FontFamilyFont_fontVariationSettings) ? C0242Pa.FontFamilyFont_fontVariationSettings : C0242Pa.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0242Pa.FontFamilyFont_font) ? C0242Pa.FontFamilyFont_font : C0242Pa.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        c cVar = new c(string2, i, z, string, i3, resourceId);
        return cVar;
    }

    private static int a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static List<List<byte[]>> a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
