package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PreferenceInflater */
class y {
    private static final Class<?>[] a = {Context.class, AttributeSet.class};
    private static final HashMap<String, Constructor> b = new HashMap<>();
    private final Context c;
    private final Object[] d = new Object[2];
    private z e;
    private String[] f;

    public y(Context context, z zVar) {
        this.c = context;
        a(zVar);
    }

    private void a(z zVar) {
        this.e = zVar;
        StringBuilder sb = new StringBuilder();
        sb.append(Preference.class.getPackage().getName());
        String str = ".";
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(SwitchPreference.class.getPackage().getName());
        sb2.append(str);
        a(new String[]{sb.toString(), sb2.toString()});
    }

    private Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return a(str, attributeSet);
            }
            return a(str, (String[]) null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Error inflating class (not found)");
            sb.append(str);
            InflateException inflateException = new InflateException(sb.toString());
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Error inflating class ");
            sb2.append(str);
            InflateException inflateException2 = new InflateException(sb2.toString());
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    public void a(String[] strArr) {
        this.f = strArr;
    }

    public Context a() {
        return this.c;
    }

    public Preference a(int i, PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = a().getResources().getXml(i);
        try {
            return a((XmlPullParser) xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    public Preference a(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup a2;
        synchronized (this.d) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.d[0] = this.c;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e2) {
                    throw e2;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException = new InflateException(e3.getMessage());
                    inflateException.initCause(e3);
                    throw inflateException;
                } catch (IOException e4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(xmlPullParser.getPositionDescription());
                    sb.append(": ");
                    sb.append(e4.getMessage());
                    InflateException inflateException2 = new InflateException(sb.toString());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                a2 = a(preferenceGroup, (PreferenceGroup) b(xmlPullParser.getName(), asAttributeSet));
                a(xmlPullParser, (Preference) a2, asAttributeSet);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(xmlPullParser.getPositionDescription());
                sb2.append(": No start tag found!");
                throw new InflateException(sb2.toString());
            }
        }
        return a2;
    }

    private PreferenceGroup a(PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.a(this.e);
        return preferenceGroup2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append(r12.getPositionDescription());
        r2.append(r1);
        r2.append(r10);
        r0 = new android.view.InflateException(r2.toString());
        r0.initCause(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[ExcHandler: Exception (r11v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    private Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        Class cls;
        int i;
        ClassNotFoundException e2;
        Constructor constructor = (Constructor) b.get(str);
        String str2 = ": Error inflating class ";
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.c.getClassLoader();
                if (strArr != null) {
                    if (strArr.length != 0) {
                        int length = strArr.length;
                        i = 0;
                        cls = null;
                        e2 = null;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            String str3 = strArr[i];
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append(str);
                            cls = classLoader.loadClass(sb.toString());
                            break;
                        }
                        if (cls == null) {
                            if (e2 == null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(attributeSet.getPositionDescription());
                                sb2.append(str2);
                                sb2.append(str);
                                throw new InflateException(sb2.toString());
                            }
                            throw e2;
                        }
                        constructor = cls.getConstructor(a);
                        constructor.setAccessible(true);
                        b.put(str, constructor);
                    }
                }
                cls = classLoader.loadClass(str);
                constructor = cls.getConstructor(a);
                constructor.setAccessible(true);
                b.put(str, constructor);
            } catch (ClassNotFoundException e3) {
                e2 = e3;
                i++;
            } catch (Exception e4) {
            }
        }
        Object[] objArr = this.d;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* access modifiers changed from: protected */
    public Preference a(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return a(str, this.f, attributeSet);
    }

    private void a(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                String str = "Error parsing preference";
                if ("intent".equals(name)) {
                    try {
                        preference.a(Intent.parseIntent(a().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException(str);
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else {
                    String str2 = "extra";
                    if (str2.equals(name)) {
                        a().getResources().parseBundleExtra(str2, attributeSet, preference.c());
                        try {
                            a(xmlPullParser);
                        } catch (IOException e3) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException(str);
                            xmlPullParserException2.initCause(e3);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference b2 = b(name, attributeSet);
                        ((PreferenceGroup) preference).b(b2);
                        a(xmlPullParser, b2, attributeSet);
                    }
                }
            }
        }
    }

    private static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }
}
