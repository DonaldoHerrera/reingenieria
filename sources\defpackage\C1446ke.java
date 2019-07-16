package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ke reason: default package and case insensitive filesystem */
/* compiled from: AnimatorInflaterCompat */
public class C1446ke {

    /* renamed from: ke$a */
    /* compiled from: AnimatorInflaterCompat */
    private static class a implements TypeEvaluator<b[]> {
        private b[] a;

        a() {
        }

        /* renamed from: a */
        public b[] evaluate(float f, b[] bVarArr, b[] bVarArr2) {
            if (C0486bb.a(bVarArr, bVarArr2)) {
                b[] bVarArr3 = this.a;
                if (bVarArr3 == null || !C0486bb.a(bVarArr3, bVarArr)) {
                    this.a = C0486bb.a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.a[i].a(bVarArr[i], bVarArr2[i], f);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static Animator a(Context context, int i) throws NotFoundException {
        if (VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return a(context, context.getResources(), context.getTheme(), i);
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator a(Context context, Resources resources, Theme theme, int i) throws NotFoundException {
        return a(context, resources, theme, i, 1.0f);
    }

    public static Animator a(Context context, Resources resources, Theme theme, int i, float f) throws NotFoundException {
        String str = "Can't load animation resource ID #0x";
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator a2 = a(context, resources, theme, (XmlPullParser) animation, f);
            if (animation != null) {
                animation.close();
            }
            return a2;
        } catch (XmlPullParserException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Integer.toHexString(i));
            NotFoundException notFoundException = new NotFoundException(sb.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(Integer.toHexString(i));
            NotFoundException notFoundException2 = new NotFoundException(sb2.toString());
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        PropertyValuesHolder propertyValuesHolder;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !a(i7)) && (!z2 || !a(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            b[] a2 = C0486bb.a(string);
            b[] a3 = C0486bb.a(string2);
            if (a2 == null && a3 == null) {
                return null;
            }
            if (a2 != null) {
                a aVar = new a();
                if (a3 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, new Object[]{a2});
                } else if (C0486bb.a(a2, a3)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, new Object[]{a2, a3});
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" Can't morph from ");
                    sb.append(string);
                    sb.append(" to ");
                    sb.append(string2);
                    throw new InflateException(sb.toString());
                }
                return propertyValuesHolder2;
            } else if (a3 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new a(), new Object[]{a3});
            }
        } else {
            TypeEvaluator a4 = i == 3 ? C1477le.a() : null;
            if (z3) {
                if (z) {
                    if (i7 == 5) {
                        f2 = typedArray.getDimension(i2, 0.0f);
                    } else {
                        f2 = typedArray.getFloat(i2, 0.0f);
                    }
                    if (z2) {
                        if (i8 == 5) {
                            f3 = typedArray.getDimension(i3, 0.0f);
                        } else {
                            f3 = typedArray.getFloat(i3, 0.0f);
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f2, f3});
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f2});
                    }
                } else {
                    if (i8 == 5) {
                        f = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f});
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                if (i7 == 5) {
                    i5 = (int) typedArray.getDimension(i2, 0.0f);
                } else if (a(i7)) {
                    i5 = typedArray.getColor(i2, 0);
                } else {
                    i5 = typedArray.getInt(i2, 0);
                }
                if (z2) {
                    if (i8 == 5) {
                        i6 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (a(i8)) {
                        i6 = typedArray.getColor(i3, 0);
                    } else {
                        i6 = typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, new int[]{i5, i6});
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, new int[]{i5});
                }
            } else if (z2) {
                if (i8 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (a(i8)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, new int[]{i4});
            }
            if (propertyValuesHolder3 == null || a4 == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(a4);
            return propertyValuesHolder3;
        }
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long b = (long) C0286Za.b(typedArray, xmlPullParser, "duration", 1, 300);
        long b2 = (long) C0286Za.b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int b3 = C0286Za.b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0286Za.a(xmlPullParser, "valueFrom") && C0286Za.a(xmlPullParser, "valueTo")) {
            if (b3 == 4) {
                b3 = a(typedArray, 5, 6);
            }
            PropertyValuesHolder a2 = a(typedArray, b3, 5, 6, "");
            if (a2 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{a2});
            }
        }
        valueAnimator.setDuration(b);
        valueAnimator.setStartDelay(b2);
        valueAnimator.setRepeatCount(C0286Za.b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0286Za.b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            a(valueAnimator, typedArray2, b3, f, xmlPullParser);
        }
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a2 = C0286Za.a(typedArray, xmlPullParser, "pathData", 1);
        if (a2 != null) {
            String a3 = C0286Za.a(typedArray, xmlPullParser, "propertyXName", 2);
            String a4 = C0286Za.a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a3 == null && a4 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            a(C0486bb.b(a2), objectAnimator, f * 0.5f, a3, a4);
            return;
        }
        objectAnimator.setPropertyName(C0286Za.a(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    private static Animator a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [android.animation.AnimatorSet] */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.animation.AnimatorSet] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v13, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x000e, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2
  assigns: []
  uses: []
  mth insns count: 109
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Unknown variable types count: 6 */
    private static Animator a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) throws XmlPullParserException, IOException {
        ? r0;
        int i2;
        ? r02;
        Resources resources2 = resources;
        Theme theme2 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AnimatorSet animatorSet2 = animatorSet;
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = null;
        ? r03 = 0;
        while (true) {
            int next = xmlPullParser.next();
            i2 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        r02 = a(context, resources, theme, attributeSet, f, xmlPullParser);
                    } else if (name.equals("animator")) {
                        r02 = a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                    } else {
                        if (name.equals("set")) {
                            ? animatorSet3 = new AnimatorSet();
                            TypedArray a2 = C0286Za.a(resources2, theme2, attributeSet, C1292fe.h);
                            TypedArray typedArray = a2;
                            a(context, resources, theme, xmlPullParser, attributeSet, animatorSet3, C0286Za.b(a2, xmlPullParser2, "ordering", 0, 0), f);
                            typedArray.recycle();
                            Context context2 = context;
                            r0 = animatorSet3;
                        } else if (name.equals("propertyValuesHolder")) {
                            PropertyValuesHolder[] a3 = a(context, resources2, theme2, xmlPullParser2, Xml.asAttributeSet(xmlPullParser));
                            if (!(a3 == null || r0 == null || !(r0 instanceof ValueAnimator))) {
                                r0.setValues(a3);
                            }
                            i2 = 1;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown animator name: ");
                            sb.append(xmlPullParser.getName());
                            throw new RuntimeException(sb.toString());
                        }
                        if (animatorSet2 != null && i2 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(r0);
                            r0 = r0;
                        }
                    }
                    Context context3 = context;
                    r0 = r02;
                    if (arrayList == null) {
                    }
                    arrayList.add(r0);
                    r0 = r0;
                }
                r03 = r0;
            }
        }
        if (!(animatorSet2 == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i3 = i2 + 1;
                animatorArr[i2] = (Animator) it.next();
                i2 = i3;
            }
            if (i == 0) {
                animatorSet2.playTogether(animatorArr);
            } else {
                animatorSet2.playSequentially(animatorArr);
            }
        }
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    private static PropertyValuesHolder[] a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                if (arrayList != null) {
                    int size = arrayList.size();
                    propertyValuesHolderArr = new PropertyValuesHolder[size];
                    for (int i = 0; i < size; i++) {
                        propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
                    }
                }
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1292fe.i);
                    String a3 = C0286Za.a(a2, xmlPullParser2, "propertyName", 3);
                    int b = C0286Za.b(a2, xmlPullParser2, "valueType", 2, 4);
                    int i2 = b;
                    PropertyValuesHolder a4 = a(context, resources, theme, xmlPullParser, a3, b);
                    if (a4 == null) {
                        a4 = a(a2, i2, 0, 1, a3);
                    }
                    if (a4 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(a4);
                    }
                    a2.recycle();
                } else {
                    Resources resources2 = resources;
                    Theme theme2 = theme;
                    AttributeSet attributeSet2 = attributeSet;
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
        }
        return propertyValuesHolderArr;
    }

    private static int a(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1292fe.j);
        int i = 0;
        TypedValue b = C0286Za.b(a2, xmlPullParser, "value", 0);
        if ((b != null) && a(b.type)) {
            i = 3;
        }
        a2.recycle();
        return i;
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        int i4 = z ? peekValue2.type : 0;
        if ((!z2 || !a(i3)) && (!z || !a(i4))) {
            return 0;
        }
        return 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    private static PropertyValuesHolder a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        PropertyValuesHolder propertyValuesHolder = null;
        int i2 = i;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size > 0) {
                        Keyframe keyframe = (Keyframe) arrayList.get(0);
                        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
                        float fraction = keyframe2.getFraction();
                        if (fraction < 1.0f) {
                            if (fraction < 0.0f) {
                                keyframe2.setFraction(1.0f);
                            } else {
                                arrayList.add(arrayList.size(), a(keyframe2, 1.0f));
                                size++;
                            }
                        }
                        float fraction2 = keyframe.getFraction();
                        if (fraction2 != 0.0f) {
                            if (fraction2 < 0.0f) {
                                keyframe.setFraction(0.0f);
                            } else {
                                arrayList.add(0, a(keyframe, 0.0f));
                                size++;
                            }
                        }
                        Keyframe[] keyframeArr = new Keyframe[size];
                        arrayList.toArray(keyframeArr);
                        for (int i3 = 0; i3 < size; i3++) {
                            Keyframe keyframe3 = keyframeArr[i3];
                            if (keyframe3.getFraction() < 0.0f) {
                                if (i3 == 0) {
                                    keyframe3.setFraction(0.0f);
                                } else {
                                    int i4 = size - 1;
                                    if (i3 == i4) {
                                        keyframe3.setFraction(1.0f);
                                    } else {
                                        int i5 = i3 + 1;
                                        int i6 = i3;
                                        while (i5 < i4 && keyframeArr[i5].getFraction() < 0.0f) {
                                            i6 = i5;
                                            i5++;
                                        }
                                        a(keyframeArr, keyframeArr[i6 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i6);
                                    }
                                }
                            }
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
                        if (i2 == 3) {
                            propertyValuesHolder.setEvaluator(C1477le.a());
                        }
                    }
                }
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe a2 = a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i2, xmlPullParser);
                if (a2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a2);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
        }
        return propertyValuesHolder;
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static Keyframe a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe keyframe;
        TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1292fe.j);
        float a3 = C0286Za.a(a2, xmlPullParser, "fraction", 3, -1.0f);
        String str = "value";
        TypedValue b = C0286Za.b(a2, xmlPullParser, str, 0);
        boolean z = b != null;
        if (i == 4) {
            i = (!z || !a(b.type)) ? 0 : 3;
        }
        if (z) {
            if (i == 0) {
                keyframe = Keyframe.ofFloat(a3, C0286Za.a(a2, xmlPullParser, str, 0, 0.0f));
            } else if (i == 1 || i == 3) {
                keyframe = Keyframe.ofInt(a3, C0286Za.b(a2, xmlPullParser, str, 0, 0));
            } else {
                keyframe = null;
            }
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(a3);
        } else {
            keyframe = Keyframe.ofInt(a3);
        }
        int c = C0286Za.c(a2, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe.setInterpolator(C1415je.a(context, c));
        }
        a2.recycle();
        return keyframe;
    }

    private static ObjectAnimator a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws NotFoundException {
        TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1292fe.g);
        TypedArray a3 = C0286Za.a(resources, theme, attributeSet, C1292fe.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        a(valueAnimator, a2, a3, f, xmlPullParser);
        int c = C0286Za.c(a2, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C1415je.a(context, c));
        }
        a2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator;
    }
}
