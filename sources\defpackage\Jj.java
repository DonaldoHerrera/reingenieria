package defpackage;

import android.util.Xml;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: Jj reason: default package */
/* compiled from: XmlUtils */
final class Jj {

    /* renamed from: Jj$a */
    /* compiled from: XmlUtils */
    public interface a {
        Object a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException;
    }

    /* renamed from: Jj$b */
    /* compiled from: XmlUtils */
    public interface b {
        void a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException;
    }

    public static final void a(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        Hj hj = new Hj();
        hj.setOutput(outputStream, "utf-8");
        hj.startDocument(null, Boolean.valueOf(true));
        hj.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        a(map, (String) null, (XmlSerializer) hj);
        hj.endDocument();
    }

    private static final ArrayList b(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected ");
                sb.append(str);
                sb.append(" end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Document ended before ");
        sb2.append(str);
        sb2.append(" end tag");
        throw new XmlPullParserException(sb2.toString());
    }

    public static final ArrayList c(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        return b(xmlPullParser, str, strArr, null);
    }

    public static final long[] d(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            long[] jArr = new long[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                String str2 = "item";
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(str2)) {
                        try {
                            jArr[i] = Long.parseLong(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected item tag at: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return jArr;
                    }
                    if (xmlPullParser.getName().equals(str2)) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected ");
                        sb2.append(str);
                        sb2.append(" end tag at: ");
                        sb2.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb2.toString());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Document ended before ");
            sb3.append(str);
            sb3.append(" end tag");
            throw new XmlPullParserException(sb3.toString());
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in long-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in long-array");
        }
    }

    public static final HashMap<String, ?> e(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        return a(xmlPullParser, str, strArr, (a) null);
    }

    public static final HashSet f(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        return c(xmlPullParser, str, strArr, null);
    }

    public static final String[] g(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            String[] strArr2 = new String[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                String str2 = "null";
                String str3 = "item";
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(str3)) {
                        try {
                            strArr2[i] = xmlPullParser.getAttributeValue(null, "value");
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else if (xmlPullParser.getName().equals(str2)) {
                        strArr2[i] = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected item tag at: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return strArr2;
                    }
                    if (xmlPullParser.getName().equals(str3) || xmlPullParser.getName().equals(str2)) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected ");
                        sb2.append(str);
                        sb2.append(" end tag at: ");
                        sb2.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb2.toString());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Document ended before ");
            sb3.append(str);
            sb3.append(" end tag");
            throw new XmlPullParserException(sb3.toString());
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }

    private static final HashSet c(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected ");
                sb.append(str);
                sb.append(" end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Document ended before ");
        sb2.append(str);
        sb2.append(" end tag");
        throw new XmlPullParserException(sb2.toString());
    }

    public static final void a(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        a(map, str, xmlSerializer, (b) null);
    }

    public static final void a(Map map, String str, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        if (map == null) {
            String str2 = "null";
            xmlSerializer.startTag(null, str2);
            xmlSerializer.endTag(null, str2);
            return;
        }
        String str3 = "map";
        xmlSerializer.startTag(null, str3);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        a(map, xmlSerializer, bVar);
        xmlSerializer.endTag(null, str3);
    }

    public static final int[] b(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            int[] iArr = new int[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                String str2 = "item";
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(str2)) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected item tag at: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals(str2)) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected ");
                        sb2.append(str);
                        sb2.append(" end tag at: ");
                        sb2.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb2.toString());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Document ended before ");
            sb3.append(str);
            sb3.append(" end tag");
            throw new XmlPullParserException(sb3.toString());
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final void a(Map map, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                a(entry.getValue(), (String) entry.getKey(), xmlSerializer, bVar);
            }
        }
    }

    public static final void a(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (list == null) {
            String str2 = "null";
            xmlSerializer.startTag(null, str2);
            xmlSerializer.endTag(null, str2);
            return;
        }
        String str3 = "list";
        xmlSerializer.startTag(null, str3);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i), (String) null, xmlSerializer);
        }
        xmlSerializer.endTag(null, str3);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.lang.Object>, for r3v0, types: [java.util.Set<java.lang.Object>, java.util.Set] */
    public static final void a(Set<Object> set, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (set == null) {
            String str2 = "null";
            xmlSerializer.startTag(null, str2);
            xmlSerializer.endTag(null, str2);
            return;
        }
        String str3 = "set";
        xmlSerializer.startTag(null, str3);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        for (Object a2 : set) {
            a(a2, (String) null, xmlSerializer);
        }
        xmlSerializer.endTag(null, str3);
    }

    public static final void a(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (bArr == null) {
            String str2 = "null";
            xmlSerializer.startTag(null, str2);
            xmlSerializer.endTag(null, str2);
            return;
        }
        String str3 = "byte-array";
        xmlSerializer.startTag(null, str3);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(r8));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 >> 4;
            sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
            byte b3 = b2 & 255;
            sb.append(b3 >= 10 ? (b3 + 97) - 10 : b3 + 48);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag(null, str3);
    }

    public static final void a(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (iArr == null) {
            String str2 = "null";
            xmlSerializer.startTag(null, str2);
            xmlSerializer.endTag(null, str2);
            return;
        }
        String str3 = "int-array";
        xmlSerializer.startTag(null, str3);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(r7));
        for (int num : iArr) {
            String str4 = "item";
            xmlSerializer.startTag(null, str4);
            xmlSerializer.attribute(null, "value", Integer.toString(num));
            xmlSerializer.endTag(null, str4);
        }
        xmlSerializer.endTag(null, str3);
    }

    public static final void a(long[] jArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (jArr == null) {
            String str2 = "null";
            xmlSerializer.startTag(null, str2);
            xmlSerializer.endTag(null, str2);
            return;
        }
        String str3 = "long-array";
        xmlSerializer.startTag(null, str3);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(r7));
        for (long l : jArr) {
            String str4 = "item";
            xmlSerializer.startTag(null, str4);
            xmlSerializer.attribute(null, "value", Long.toString(l));
            xmlSerializer.endTag(null, str4);
        }
        xmlSerializer.endTag(null, str3);
    }

    public static final void a(double[] dArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (dArr == null) {
            String str2 = "null";
            xmlSerializer.startTag(null, str2);
            xmlSerializer.endTag(null, str2);
            return;
        }
        String str3 = "double-array";
        xmlSerializer.startTag(null, str3);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(r7));
        for (double d : dArr) {
            String str4 = "item";
            xmlSerializer.startTag(null, str4);
            xmlSerializer.attribute(null, "value", Double.toString(d));
            xmlSerializer.endTag(null, str4);
        }
        xmlSerializer.endTag(null, str3);
    }

    public static final void a(String[] strArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2 = "null";
        if (strArr == null) {
            xmlSerializer.startTag(null, str2);
            xmlSerializer.endTag(null, str2);
            return;
        }
        String str3 = "string-array";
        xmlSerializer.startTag(null, str3);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        int length = strArr.length;
        xmlSerializer.attribute(null, "num", Integer.toString(length));
        for (int i = 0; i < length; i++) {
            if (strArr[i] == null) {
                xmlSerializer.startTag(null, str2);
                xmlSerializer.endTag(null, str2);
            } else {
                String str4 = "item";
                xmlSerializer.startTag(null, str4);
                xmlSerializer.attribute(null, "value", strArr[i]);
                xmlSerializer.endTag(null, str4);
            }
        }
        xmlSerializer.endTag(null, str3);
    }

    public static final void a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        a(obj, str, xmlSerializer, (b) null);
    }

    private static final void a(Object obj, String str, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        String str2;
        String str3 = "name";
        if (obj == null) {
            String str4 = "null";
            xmlSerializer.startTag(null, str4);
            if (str != null) {
                xmlSerializer.attribute(null, str3, str);
            }
            xmlSerializer.endTag(null, str4);
            return;
        }
        String str5 = "string";
        if (obj instanceof String) {
            xmlSerializer.startTag(null, str5);
            if (str != null) {
                xmlSerializer.attribute(null, str3, str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, str5);
            return;
        }
        if (obj instanceof Integer) {
            str2 = "int";
        } else if (obj instanceof Long) {
            str2 = Constants.LONG;
        } else if (obj instanceof Float) {
            str2 = "float";
        } else if (obj instanceof Double) {
            str2 = "double";
        } else if (obj instanceof Boolean) {
            str2 = "boolean";
        } else if (obj instanceof byte[]) {
            a((byte[]) obj, str, xmlSerializer);
            return;
        } else if (obj instanceof int[]) {
            a((int[]) obj, str, xmlSerializer);
            return;
        } else if (obj instanceof long[]) {
            a((long[]) obj, str, xmlSerializer);
            return;
        } else if (obj instanceof double[]) {
            a((double[]) obj, str, xmlSerializer);
            return;
        } else if (obj instanceof String[]) {
            a((String[]) obj, str, xmlSerializer);
            return;
        } else if (obj instanceof Map) {
            a((Map) obj, str, xmlSerializer);
            return;
        } else if (obj instanceof List) {
            a((List) obj, str, xmlSerializer);
            return;
        } else if (obj instanceof Set) {
            a((Set) obj, str, xmlSerializer);
            return;
        } else if (obj instanceof CharSequence) {
            xmlSerializer.startTag(null, str5);
            if (str != null) {
                xmlSerializer.attribute(null, str3, str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, str5);
            return;
        } else if (bVar != null) {
            bVar.a(obj, str, xmlSerializer);
            return;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("writeValueXml: unable to write value ");
            sb.append(obj);
            throw new RuntimeException(sb.toString());
        }
        xmlSerializer.startTag(null, str2);
        if (str != null) {
            xmlSerializer.attribute(null, str3, str);
        }
        xmlSerializer.attribute(null, "value", obj.toString());
        xmlSerializer.endTag(null, str2);
    }

    public static final HashMap<String, ?> a(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashMap) a(newPullParser, new String[1]);
    }

    public static final HashMap<String, ?> a(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        HashMap<String, ?> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashMap.put(strArr[0], a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected ");
                sb.append(str);
                sb.append(" end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Document ended before ");
        sb2.append(str);
        sb2.append(" end tag");
        throw new XmlPullParserException(sb2.toString());
    }

    public static final double[] a(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
            xmlPullParser.next();
            double[] dArr = new double[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                String str2 = "item";
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(str2)) {
                        try {
                            dArr[i] = Double.parseDouble(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected item tag at: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return dArr;
                    }
                    if (xmlPullParser.getName().equals(str2)) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected ");
                        sb2.append(str);
                        sb2.append(" end tag at: ");
                        sb2.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb2.toString());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Document ended before ");
            sb3.append(str);
            sb3.append(" end tag");
            throw new XmlPullParserException(sb3.toString());
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in double-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in double-array");
        }
    }

    public static final Object a(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            } else if (eventType != 4) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected text: ");
                sb2.append(xmlPullParser.getText());
                throw new XmlPullParserException(sb2.toString());
            }
        }
        return a(xmlPullParser, strArr, (a) null);
    }

    private static final Object a(XmlPullParser xmlPullParser, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        int next;
        String str;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            String str2 = "string";
            if (name.equals(str2)) {
                String str3 = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals(str2)) {
                            strArr[0] = attributeValue;
                            return str3;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected end tag in <string>: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    } else if (next2 == 4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append(xmlPullParser.getText());
                        str3 = sb2.toString();
                    } else if (next2 == 2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Unexpected start tag in <string>: ");
                        sb3.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb3.toString());
                    }
                }
            } else {
                obj = a(xmlPullParser, name);
                if (obj == null) {
                    String str4 = "int-array";
                    if (name.equals(str4)) {
                        int[] b2 = b(xmlPullParser, str4, strArr);
                        strArr[0] = attributeValue;
                        return b2;
                    }
                    String str5 = "long-array";
                    if (name.equals(str5)) {
                        long[] d = d(xmlPullParser, str5, strArr);
                        strArr[0] = attributeValue;
                        return d;
                    }
                    String str6 = "double-array";
                    if (name.equals(str6)) {
                        double[] a2 = a(xmlPullParser, str6, strArr);
                        strArr[0] = attributeValue;
                        return a2;
                    }
                    String str7 = "string-array";
                    if (name.equals(str7)) {
                        String[] g = g(xmlPullParser, str7, strArr);
                        strArr[0] = attributeValue;
                        return g;
                    }
                    String str8 = "map";
                    if (name.equals(str8)) {
                        xmlPullParser.next();
                        HashMap e = e(xmlPullParser, str8, strArr);
                        strArr[0] = attributeValue;
                        return e;
                    }
                    String str9 = "list";
                    if (name.equals(str9)) {
                        xmlPullParser.next();
                        ArrayList c = c(xmlPullParser, str9, strArr);
                        strArr[0] = attributeValue;
                        return c;
                    }
                    String str10 = "set";
                    if (name.equals(str10)) {
                        xmlPullParser.next();
                        HashSet f = f(xmlPullParser, str10, strArr);
                        strArr[0] = attributeValue;
                        return f;
                    } else if (aVar != null) {
                        Object a3 = aVar.a(xmlPullParser, name);
                        strArr[0] = attributeValue;
                        return a3;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Unknown tag: ");
                        sb4.append(name);
                        throw new XmlPullParserException(sb4.toString());
                    }
                }
            }
        }
        do {
            next = xmlPullParser.next();
            if (next != 1) {
                str = ">: ";
                if (next == 3) {
                    if (xmlPullParser.getName().equals(name)) {
                        strArr[0] = attributeValue;
                        return obj;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Unexpected end tag in <");
                    sb5.append(name);
                    sb5.append(str);
                    sb5.append(xmlPullParser.getName());
                    throw new XmlPullParserException(sb5.toString());
                } else if (next == 4) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Unexpected text in <");
                    sb6.append(name);
                    sb6.append(str);
                    sb6.append(xmlPullParser.getName());
                    throw new XmlPullParserException(sb6.toString());
                }
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Unexpected end of document in <");
                sb7.append(name);
                sb7.append(">");
                throw new XmlPullParserException(sb7.toString());
            }
        } while (next != 2);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Unexpected start tag in <");
        sb8.append(name);
        sb8.append(str);
        sb8.append(xmlPullParser.getName());
        throw new XmlPullParserException(sb8.toString());
    }

    private static final Object a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = ">";
        try {
            String str3 = "value";
            if (str.equals("int")) {
                return Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, str3)));
            }
            if (str.equals(Constants.LONG)) {
                return Long.valueOf(xmlPullParser.getAttributeValue(null, str3));
            }
            if (str.equals("float")) {
                return Float.valueOf(xmlPullParser.getAttributeValue(null, str3));
            }
            if (str.equals("double")) {
                return Double.valueOf(xmlPullParser.getAttributeValue(null, str3));
            }
            if (str.equals("boolean")) {
                return Boolean.valueOf(xmlPullParser.getAttributeValue(null, str3));
            }
            return null;
        } catch (NullPointerException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Need value attribute in <");
            sb.append(str);
            sb.append(str2);
            throw new XmlPullParserException(sb.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Not a number in value attribute in <");
            sb2.append(str);
            sb2.append(str2);
            throw new XmlPullParserException(sb2.toString());
        }
    }
}
