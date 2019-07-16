package defpackage;

import android.text.Layout.Alignment;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: wp reason: default package and case insensitive filesystem */
/* compiled from: TtmlDecoder */
public final class C1821wp extends Vo {
    private static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b u = new b(30.0f, 1, 1);
    private static final a v = new a(32, 15);
    private final XmlPullParserFactory w;

    /* renamed from: wp$a */
    /* compiled from: TtmlDecoder */
    private static final class a {
        final int a;
        final int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: wp$b */
    /* compiled from: TtmlDecoder */
    private static final class b {
        final float a;
        final int b;
        final int c;

        b(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    /* renamed from: wp$c */
    /* compiled from: TtmlDecoder */
    private static final class c {
        final int a;
        final int b;

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public C1821wp() {
        super("TtmlDecoder");
        try {
            this.w = XmlPullParserFactory.newInstance();
            this.w.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private c b(XmlPullParser xmlPullParser) {
        String a2 = C0502br.a(xmlPullParser, "extent");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = s.matcher(a2);
        String str = "TtmlDecoder";
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring non-pixel tts extent: ");
            sb.append(a2);
            Iq.d(str, sb.toString());
            return null;
        }
        try {
            return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring malformed tts extent: ");
            sb2.append(a2);
            Iq.d(str, sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Bp a(byte[] bArr, int i, boolean z) throws Zo {
        c cVar;
        a aVar;
        b bVar;
        Bp bp;
        b bVar2;
        try {
            XmlPullParser newPullParser = this.w.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            c cVar2 = null;
            hashMap2.put("", new C1881yp(null));
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar3 = u;
            a aVar2 = v;
            Bp bp2 = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C1851xp xpVar = (C1851xp) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    String str = "tt";
                    if (eventType == 2) {
                        if (str.equals(name)) {
                            b a2 = a(newPullParser);
                            aVar = a(newPullParser, v);
                            cVar = b(newPullParser);
                            bVar = a2;
                        } else {
                            cVar = cVar2;
                            bVar = bVar3;
                            aVar = aVar2;
                        }
                        String str2 = "TtmlDecoder";
                        if (!a(name)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring unsupported tag: ");
                            sb.append(newPullParser.getName());
                            Iq.c(str2, sb.toString());
                            i2++;
                            bVar3 = bVar;
                        } else {
                            if ("head".equals(name)) {
                                bp = bp2;
                                bVar2 = bVar;
                                a(newPullParser, hashMap, aVar, cVar, hashMap2, hashMap3);
                            } else {
                                bp = bp2;
                                bVar2 = bVar;
                                try {
                                    C1851xp a3 = a(newPullParser, xpVar, hashMap2, bVar2);
                                    arrayDeque.push(a3);
                                    if (xpVar != null) {
                                        xpVar.a(a3);
                                    }
                                } catch (Zo e) {
                                    Iq.b(str2, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar3 = bVar2;
                            bp2 = bp;
                        }
                    } else {
                        Bp bp3 = bp2;
                        if (eventType == 4) {
                            xpVar.a(C1851xp.a(newPullParser.getText()));
                        } else if (eventType == 3) {
                            bp2 = newPullParser.getName().equals(str) ? new Bp((C1851xp) arrayDeque.peek(), hashMap, hashMap2, hashMap3) : bp3;
                            arrayDeque.pop();
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                        bp2 = bp3;
                        cVar = cVar2;
                        aVar = aVar2;
                    }
                    aVar2 = aVar;
                    cVar2 = cVar;
                } else {
                    Bp bp4 = bp2;
                    if (eventType == 2) {
                        i2++;
                    } else if (eventType == 3) {
                        i2--;
                    }
                    bp2 = bp4;
                }
                newPullParser.next();
            }
            return bp2;
        } catch (XmlPullParserException e2) {
            throw new Zo("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }

    private String[] b(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C0471ar.a(trim, "\\s+");
    }

    private b a(XmlPullParser xmlPullParser) throws Zo {
        String str = "http://www.w3.org/ns/ttml#parameter";
        String attributeValue = xmlPullParser.getAttributeValue(str, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] a2 = C0471ar.a(attributeValue2, " ");
            if (a2.length == 2) {
                f = ((float) Integer.parseInt(a2[0])) / ((float) Integer.parseInt(a2[1]));
            } else {
                throw new Zo("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = u.b;
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = u.c;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new b(((float) parseInt) * f, i, i2);
    }

    private a a(XmlPullParser xmlPullParser, a aVar) throws Zo {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        String str = "Ignoring malformed cell resolution: ";
        String str2 = "TtmlDecoder";
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(attributeValue);
            Iq.d(str2, sb.toString());
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new Zo(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(attributeValue);
            Iq.d(str2, sb3.toString());
            return aVar;
        }
    }

    private Map<String, Ap> a(XmlPullParser xmlPullParser, Map<String, Ap> map, a aVar, c cVar, Map<String, C1881yp> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            String str = "style";
            if (C0502br.c(xmlPullParser, str)) {
                String a2 = C0502br.a(xmlPullParser, str);
                Ap a3 = a(xmlPullParser, new Ap());
                if (a2 != null) {
                    for (String str2 : b(a2)) {
                        a3.a((Ap) map.get(str2));
                    }
                }
                if (a3.f() != null) {
                    map.put(a3.f(), a3);
                }
            } else if (C0502br.c(xmlPullParser, "region")) {
                C1881yp a4 = a(xmlPullParser, aVar, cVar);
                if (a4 != null) {
                    map2.put(a4.a, a4);
                }
            } else if (C0502br.c(xmlPullParser, "metadata")) {
                a(xmlPullParser, map3);
            }
        } while (!C0502br.b(xmlPullParser, "head"));
        return map;
    }

    private void a(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (C0502br.c(xmlPullParser, "image")) {
                String a2 = C0502br.a(xmlPullParser, "id");
                if (a2 != null) {
                    map.put(a2, xmlPullParser.nextText());
                }
            }
        } while (!C0502br.b(xmlPullParser, "metadata"));
    }

    private C1881yp a(XmlPullParser xmlPullParser, a aVar, c cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        c cVar2 = cVar;
        String a2 = C0502br.a(xmlPullParser2, "id");
        if (a2 == null) {
            return null;
        }
        String a3 = C0502br.a(xmlPullParser2, "origin");
        String str = "TtmlDecoder";
        if (a3 != null) {
            Matcher matcher = r.matcher(a3);
            Matcher matcher2 = s.matcher(a3);
            String str2 = "Ignoring region with malformed origin: ";
            String str3 = "Ignoring region with missing tts:extent: ";
            if (matcher.matches()) {
                try {
                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                    f = Float.parseFloat(matcher.group(2)) / 100.0f;
                    f2 = parseFloat;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(a3);
                    Iq.d(str, sb.toString());
                    return null;
                }
            } else if (!matcher2.matches()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring region with unsupported origin: ");
                sb2.append(a3);
                Iq.d(str, sb2.toString());
                return null;
            } else if (cVar2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(a3);
                Iq.d(str, sb3.toString());
                return null;
            } else {
                try {
                    int parseInt = Integer.parseInt(matcher2.group(1));
                    f2 = ((float) parseInt) / ((float) cVar2.a);
                    f = ((float) Integer.parseInt(matcher2.group(2))) / ((float) cVar2.b);
                } catch (NumberFormatException unused2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append(a3);
                    Iq.d(str, sb4.toString());
                    return null;
                }
            }
            String a4 = C0502br.a(xmlPullParser2, "extent");
            if (a4 != null) {
                Matcher matcher3 = r.matcher(a4);
                Matcher matcher4 = s.matcher(a4);
                String str4 = "Ignoring region with malformed extent: ";
                if (matcher3.matches()) {
                    try {
                        f4 = Float.parseFloat(matcher3.group(2)) / 100.0f;
                        f3 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                    } catch (NumberFormatException unused3) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str4);
                        sb5.append(a3);
                        Iq.d(str, sb5.toString());
                        return null;
                    }
                } else if (!matcher4.matches()) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Ignoring region with unsupported extent: ");
                    sb6.append(a3);
                    Iq.d(str, sb6.toString());
                    return null;
                } else if (cVar2 == null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str3);
                    sb7.append(a3);
                    Iq.d(str, sb7.toString());
                    return null;
                } else {
                    try {
                        int parseInt2 = Integer.parseInt(matcher4.group(1));
                        f3 = ((float) parseInt2) / ((float) cVar2.a);
                        f4 = ((float) Integer.parseInt(matcher4.group(2))) / ((float) cVar2.b);
                    } catch (NumberFormatException unused4) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str4);
                        sb8.append(a3);
                        Iq.d(str, sb8.toString());
                        return null;
                    }
                }
                String a5 = C0502br.a(xmlPullParser2, "displayAlign");
                if (a5 != null) {
                    String g = C0471ar.g(a5);
                    char c2 = 65535;
                    int hashCode = g.hashCode();
                    if (hashCode != -1364013995) {
                        if (hashCode == 92734940 && g.equals("after")) {
                            c2 = 1;
                        }
                    } else if (g.equals("center")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        f += f4 / 2.0f;
                        i = 1;
                    } else if (c2 == 1) {
                        f += f4;
                        i = 2;
                    }
                    C1881yp ypVar = new C1881yp(a2, f2, f, 0, i, f3, 1, 1.0f / ((float) aVar.b));
                    return ypVar;
                }
                i = 0;
                C1881yp ypVar2 = new C1881yp(a2, f2, f, 0, i, f3, 1, 1.0f / ((float) aVar.b));
                return ypVar2;
            }
            Iq.d(str, "Ignoring region without an extent");
            return null;
        }
        Iq.d(str, "Ignoring region without an origin");
        return null;
    }

    private Ap a(XmlPullParser xmlPullParser, Ap ap) {
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        Ap ap2 = ap;
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            char c3 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 6;
                        break;
                    }
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 3;
                        break;
                    }
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 7;
                        break;
                    }
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = 8;
                        break;
                    }
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 5;
                        break;
                    }
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 0;
                        break;
                    }
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = 2;
                        break;
                    }
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = 4;
                        break;
                    }
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = 1;
                        break;
                    }
                default:
                    c2 = 65535;
                    break;
            }
            String str = "TtmlDecoder";
            switch (c2) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ap2 = a(ap2);
                        ap2.b(attributeValue);
                        break;
                    }
                case 1:
                    ap2 = a(ap2);
                    try {
                        ap2.a(Aq.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed parsing background value: ");
                        sb.append(attributeValue);
                        Iq.d(str, sb.toString());
                        break;
                    }
                case 2:
                    ap2 = a(ap2);
                    try {
                        ap2.b(Aq.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed parsing color value: ");
                        sb2.append(attributeValue);
                        Iq.d(str, sb2.toString());
                        break;
                    }
                case 3:
                    ap2 = a(ap2);
                    ap2.a(attributeValue);
                    break;
                case 4:
                    try {
                        ap2 = a(ap2);
                        a(attributeValue, ap2);
                        break;
                    } catch (Zo unused3) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Failed parsing fontSize value: ");
                        sb3.append(attributeValue);
                        Iq.d(str, sb3.toString());
                        break;
                    }
                case 5:
                    ap2 = a(ap2);
                    ap2.a("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    ap2 = a(ap2);
                    ap2.b("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    String g = C0471ar.g(attributeValue);
                    switch (g.hashCode()) {
                        case -1364013995:
                            if (g.equals("center")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 100571:
                            if (g.equals("end")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 3317767:
                            if (g.equals("left")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 108511772:
                            if (g.equals("right")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 109757538:
                            if (g.equals("start")) {
                                c3 = 1;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 != 2) {
                                if (c3 != 3) {
                                    if (c3 == 4) {
                                        ap2 = a(ap2);
                                        ap2.a(Alignment.ALIGN_CENTER);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    ap2 = a(ap2);
                                    ap2.a(Alignment.ALIGN_OPPOSITE);
                                    break;
                                }
                            } else {
                                ap2 = a(ap2);
                                ap2.a(Alignment.ALIGN_OPPOSITE);
                                break;
                            }
                        } else {
                            ap2 = a(ap2);
                            ap2.a(Alignment.ALIGN_NORMAL);
                            break;
                        }
                    } else {
                        ap2 = a(ap2);
                        ap2.a(Alignment.ALIGN_NORMAL);
                        break;
                    }
                case 8:
                    String g2 = C0471ar.g(attributeValue);
                    switch (g2.hashCode()) {
                        case -1461280213:
                            if (g2.equals("nounderline")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (g2.equals("underline")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (g2.equals("nolinethrough")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (g2.equals("linethrough")) {
                                c3 = 0;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 != 2) {
                                if (c3 == 3) {
                                    ap2 = a(ap2);
                                    ap2.d(false);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                ap2 = a(ap2);
                                ap2.d(true);
                                break;
                            }
                        } else {
                            ap2 = a(ap2);
                            ap2.c(false);
                            break;
                        }
                    } else {
                        ap2 = a(ap2);
                        ap2.c(true);
                        break;
                    }
            }
        }
        return ap2;
    }

    private Ap a(Ap ap) {
        return ap == null ? new Ap() : ap;
    }

    private C1851xp a(XmlPullParser xmlPullParser, C1851xp xpVar, Map<String, C1881yp> map, b bVar) throws Zo {
        long j;
        long j2;
        char c2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C1851xp xpVar2 = xpVar;
        b bVar2 = bVar;
        int attributeCount = xmlPullParser.getAttributeCount();
        Ap a2 = a(xmlPullParser2, (Ap) null);
        String str = null;
        String[] strArr = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser2.getAttributeName(i);
            String attributeValue = xmlPullParser2.getAttributeValue(i);
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 4;
                        break;
                    }
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 2;
                        break;
                    }
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 1;
                        break;
                    }
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 0;
                        break;
                    }
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 3;
                        break;
                    }
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                Map<String, C1881yp> map2 = map;
                j3 = a(attributeValue, bVar2);
            } else if (c2 == 1) {
                Map<String, C1881yp> map3 = map;
                j4 = a(attributeValue, bVar2);
            } else if (c2 == 2) {
                Map<String, C1881yp> map4 = map;
                j5 = a(attributeValue, bVar2);
            } else if (c2 == 3) {
                Map<String, C1881yp> map5 = map;
                String[] b2 = b(attributeValue);
                if (b2.length > 0) {
                    strArr = b2;
                }
            } else if (c2 != 4) {
                if (c2 == 5 && attributeValue.startsWith("#")) {
                    str = attributeValue.substring(1);
                }
                Map<String, C1881yp> map6 = map;
            } else if (map.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (xpVar2 != null) {
            long j6 = xpVar2.d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += xpVar2.d;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j5 + j7;
            } else if (xpVar2 != null) {
                long j8 = xpVar2.e;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return C1851xp.a(xmlPullParser.getName(), j7, j2, a2, strArr, str2, str);
        }
        j2 = j4;
        return C1851xp.a(xmlPullParser.getName(), j7, j2, a2, strArr, str2, str);
    }

    private static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static void a(String str, Ap ap) throws Zo {
        Matcher matcher;
        String[] a2 = C0471ar.a(str, "\\s+");
        if (a2.length == 1) {
            matcher = q.matcher(str);
        } else if (a2.length == 2) {
            matcher = q.matcher(a2[1]);
            Iq.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(a2.length);
            sb.append(".");
            throw new Zo(sb.toString());
        }
        String str2 = "'.";
        if (matcher.matches()) {
            String group = matcher.group(3);
            char c2 = 65535;
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && group.equals("px")) {
                        c2 = 0;
                    }
                } else if (group.equals("em")) {
                    c2 = 1;
                }
            } else if (group.equals("%")) {
                c2 = 2;
            }
            if (c2 == 0) {
                ap.c(1);
            } else if (c2 == 1) {
                ap.c(2);
            } else if (c2 == 2) {
                ap.c(3);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid unit for fontSize: '");
                sb2.append(group);
                sb2.append(str2);
                throw new Zo(sb2.toString());
            }
            ap.a(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append(str2);
        throw new Zo(sb3.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108  */
    private static long a(String str, b bVar) throws Zo {
        char c2;
        double d;
        double d2;
        Matcher matcher = o.matcher(str);
        if (matcher.matches()) {
            double parseLong = ((double) (Long.parseLong(matcher.group(1)) * 3600)) + ((double) (Long.parseLong(matcher.group(2)) * 60)) + ((double) Long.parseLong(matcher.group(3)));
            String group = matcher.group(4);
            double d3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double parseDouble = parseLong + (group != null ? Double.parseDouble(group) : 0.0d);
            String group2 = matcher.group(5);
            double parseLong2 = parseDouble + (group2 != null ? (double) (((float) Long.parseLong(group2)) / bVar.a) : 0.0d);
            String group3 = matcher.group(6);
            if (group3 != null) {
                d3 = (((double) Long.parseLong(group3)) / ((double) bVar.b)) / ((double) bVar.a);
            }
            return (long) ((parseLong2 + d3) * 1000000.0d);
        }
        Matcher matcher2 = p.matcher(str);
        if (matcher2.matches()) {
            double parseDouble2 = Double.parseDouble(matcher2.group(1));
            String group4 = matcher2.group(2);
            int hashCode = group4.hashCode();
            if (hashCode != 102) {
                if (hashCode != 104) {
                    if (hashCode != 109) {
                        if (hashCode != 3494) {
                            if (hashCode != 115) {
                                if (hashCode == 116 && group4.equals("t")) {
                                    c2 = 5;
                                    if (c2 == 0) {
                                        d = 3600.0d;
                                    } else if (c2 != 1) {
                                        if (c2 != 2) {
                                            if (c2 == 3) {
                                                d2 = 1000.0d;
                                            } else if (c2 == 4) {
                                                d2 = (double) bVar.a;
                                            } else if (c2 == 5) {
                                                d2 = (double) bVar.c;
                                            }
                                            parseDouble2 /= d2;
                                        }
                                        return (long) (parseDouble2 * 1000000.0d);
                                    } else {
                                        d = 60.0d;
                                    }
                                    parseDouble2 *= d;
                                    return (long) (parseDouble2 * 1000000.0d);
                                }
                            } else if (group4.equals("s")) {
                                c2 = 2;
                                if (c2 == 0) {
                                }
                                parseDouble2 *= d;
                                return (long) (parseDouble2 * 1000000.0d);
                            }
                        } else if (group4.equals("ms")) {
                            c2 = 3;
                            if (c2 == 0) {
                            }
                            parseDouble2 *= d;
                            return (long) (parseDouble2 * 1000000.0d);
                        }
                    } else if (group4.equals("m")) {
                        c2 = 1;
                        if (c2 == 0) {
                        }
                        parseDouble2 *= d;
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                } else if (group4.equals("h")) {
                    c2 = 0;
                    if (c2 == 0) {
                    }
                    parseDouble2 *= d;
                    return (long) (parseDouble2 * 1000000.0d);
                }
            } else if (group4.equals("f")) {
                c2 = 4;
                if (c2 == 0) {
                }
                parseDouble2 *= d;
                return (long) (parseDouble2 * 1000000.0d);
            }
            c2 = 65535;
            if (c2 == 0) {
            }
            parseDouble2 *= d;
            return (long) (parseDouble2 * 1000000.0d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Malformed time expression: ");
        sb.append(str);
        throw new Zo(sb.toString());
    }
}
