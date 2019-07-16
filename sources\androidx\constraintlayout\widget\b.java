package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.Constraints.LayoutParams;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class b {
    private static final int[] a = {0, 4, 8};
    private static SparseIntArray b = new SparseIntArray();
    private HashMap<Integer, a> c = new HashMap<>();

    /* compiled from: ConstraintSet */
    private static class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;
        boolean a;
        public float aa;
        public int b;
        public float ba;
        public int c;
        public float ca;
        int d;
        public float da;
        public int e;
        public float ea;
        public int f;
        public float fa;
        public float g;
        public float ga;
        public int h;
        public boolean ha;
        public int i;
        public boolean ia;
        public int j;
        public int ja;
        public int k;
        public int ka;
        public int l;
        public int la;
        public int m;
        public int ma;
        public int n;
        public int na;
        public int o;
        public int oa;
        public int p;
        public float pa;
        public int q;
        public float qa;
        public int r;
        public boolean ra;
        public int s;
        public int sa;
        public int t;
        public int ta;
        public float u;
        public int[] ua;
        public float v;
        public String va;
        public String w;
        public int x;
        public int y;
        public float z;

        private a() {
            this.a = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.aa = 1.0f;
            this.ba = 1.0f;
            this.ca = Float.NaN;
            this.da = Float.NaN;
            this.ea = 0.0f;
            this.fa = 0.0f;
            this.ga = 0.0f;
            this.ha = false;
            this.ia = false;
            this.ja = 0;
            this.ka = 0;
            this.la = -1;
            this.ma = -1;
            this.na = -1;
            this.oa = -1;
            this.pa = 1.0f;
            this.qa = 1.0f;
            this.ra = false;
            this.sa = -1;
            this.ta = -1;
        }

        public a clone() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            aVar.l = this.l;
            aVar.m = this.m;
            aVar.n = this.n;
            aVar.o = this.o;
            aVar.p = this.p;
            aVar.q = this.q;
            aVar.r = this.r;
            aVar.s = this.s;
            aVar.t = this.t;
            aVar.u = this.u;
            aVar.v = this.v;
            aVar.w = this.w;
            aVar.A = this.A;
            aVar.B = this.B;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.C = this.C;
            aVar.D = this.D;
            aVar.E = this.E;
            aVar.F = this.F;
            aVar.G = this.G;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.J = this.J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.M = this.M;
            aVar.N = this.N;
            aVar.O = this.O;
            aVar.P = this.P;
            aVar.Q = this.Q;
            aVar.R = this.R;
            aVar.S = this.S;
            aVar.T = this.T;
            aVar.U = this.U;
            aVar.V = this.V;
            aVar.W = this.W;
            aVar.X = this.X;
            aVar.Y = this.Y;
            aVar.Z = this.Z;
            aVar.aa = this.aa;
            aVar.ba = this.ba;
            aVar.ca = this.ca;
            aVar.da = this.da;
            aVar.ea = this.ea;
            aVar.fa = this.fa;
            aVar.ga = this.ga;
            aVar.ha = this.ha;
            aVar.ia = this.ia;
            aVar.ja = this.ja;
            aVar.ka = this.ka;
            aVar.la = this.la;
            aVar.ma = this.ma;
            aVar.na = this.na;
            aVar.oa = this.oa;
            aVar.pa = this.pa;
            aVar.qa = this.qa;
            aVar.sa = this.sa;
            aVar.ta = this.ta;
            int[] iArr = this.ua;
            if (iArr != null) {
                aVar.ua = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.x = this.x;
            aVar.y = this.y;
            aVar.z = this.z;
            aVar.ra = this.ra;
            return aVar;
        }

        /* access modifiers changed from: private */
        public void a(ConstraintHelper constraintHelper, int i2, LayoutParams layoutParams) {
            a(i2, layoutParams);
            if (constraintHelper instanceof Barrier) {
                this.ta = 1;
                Barrier barrier = (Barrier) constraintHelper;
                this.sa = barrier.getType();
                this.ua = barrier.getReferencedIds();
            }
        }

        /* access modifiers changed from: private */
        public void a(int i2, LayoutParams layoutParams) {
            a(i2, (ConstraintLayout.LayoutParams) layoutParams);
            this.U = layoutParams.na;
            this.X = layoutParams.qa;
            this.Y = layoutParams.ra;
            this.Z = layoutParams.sa;
            this.aa = layoutParams.ta;
            this.ba = layoutParams.ua;
            this.ca = layoutParams.va;
            this.da = layoutParams.wa;
            this.ea = layoutParams.xa;
            this.fa = layoutParams.ya;
            this.ga = layoutParams.za;
            this.W = layoutParams.pa;
            this.V = layoutParams.oa;
        }

        private void a(int i2, ConstraintLayout.LayoutParams layoutParams) {
            this.d = i2;
            this.h = layoutParams.d;
            this.i = layoutParams.e;
            this.j = layoutParams.f;
            this.k = layoutParams.g;
            this.l = layoutParams.h;
            this.m = layoutParams.i;
            this.n = layoutParams.j;
            this.o = layoutParams.k;
            this.p = layoutParams.l;
            this.q = layoutParams.p;
            this.r = layoutParams.q;
            this.s = layoutParams.r;
            this.t = layoutParams.s;
            this.u = layoutParams.z;
            this.v = layoutParams.A;
            this.w = layoutParams.B;
            this.x = layoutParams.m;
            this.y = layoutParams.n;
            this.z = layoutParams.o;
            this.A = layoutParams.Q;
            this.B = layoutParams.R;
            this.C = layoutParams.S;
            this.g = layoutParams.c;
            this.e = layoutParams.a;
            this.f = layoutParams.b;
            this.b = layoutParams.width;
            this.c = layoutParams.height;
            this.D = layoutParams.leftMargin;
            this.E = layoutParams.rightMargin;
            this.F = layoutParams.topMargin;
            this.G = layoutParams.bottomMargin;
            this.Q = layoutParams.F;
            this.R = layoutParams.E;
            this.T = layoutParams.H;
            this.S = layoutParams.G;
            boolean z2 = layoutParams.T;
            this.ha = z2;
            this.ia = layoutParams.U;
            this.ja = layoutParams.I;
            this.ka = layoutParams.J;
            this.ha = z2;
            this.la = layoutParams.M;
            this.ma = layoutParams.N;
            this.na = layoutParams.K;
            this.oa = layoutParams.L;
            this.pa = layoutParams.O;
            this.qa = layoutParams.P;
            if (VERSION.SDK_INT >= 17) {
                this.H = layoutParams.getMarginEnd();
                this.I = layoutParams.getMarginStart();
            }
        }

        public void a(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.d = this.h;
            layoutParams.e = this.i;
            layoutParams.f = this.j;
            layoutParams.g = this.k;
            layoutParams.h = this.l;
            layoutParams.i = this.m;
            layoutParams.j = this.n;
            layoutParams.k = this.o;
            layoutParams.l = this.p;
            layoutParams.p = this.q;
            layoutParams.q = this.r;
            layoutParams.r = this.s;
            layoutParams.s = this.t;
            layoutParams.leftMargin = this.D;
            layoutParams.rightMargin = this.E;
            layoutParams.topMargin = this.F;
            layoutParams.bottomMargin = this.G;
            layoutParams.x = this.P;
            layoutParams.y = this.O;
            layoutParams.z = this.u;
            layoutParams.A = this.v;
            layoutParams.m = this.x;
            layoutParams.n = this.y;
            layoutParams.o = this.z;
            layoutParams.B = this.w;
            layoutParams.Q = this.A;
            layoutParams.R = this.B;
            layoutParams.F = this.Q;
            layoutParams.E = this.R;
            layoutParams.H = this.T;
            layoutParams.G = this.S;
            layoutParams.T = this.ha;
            layoutParams.U = this.ia;
            layoutParams.I = this.ja;
            layoutParams.J = this.ka;
            layoutParams.M = this.la;
            layoutParams.N = this.ma;
            layoutParams.K = this.na;
            layoutParams.L = this.oa;
            layoutParams.O = this.pa;
            layoutParams.P = this.qa;
            layoutParams.S = this.C;
            layoutParams.c = this.g;
            layoutParams.a = this.e;
            layoutParams.b = this.f;
            layoutParams.width = this.b;
            layoutParams.height = this.c;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.I);
                layoutParams.setMarginEnd(this.H);
            }
            layoutParams.a();
        }
    }

    static {
        b.append(d.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        b.append(d.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        b.append(d.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        b.append(d.ConstraintSet_layout_constraintRight_toRightOf, 30);
        b.append(d.ConstraintSet_layout_constraintTop_toTopOf, 36);
        b.append(d.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        b.append(d.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        b.append(d.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        b.append(d.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        b.append(d.ConstraintSet_layout_editor_absoluteX, 6);
        b.append(d.ConstraintSet_layout_editor_absoluteY, 7);
        b.append(d.ConstraintSet_layout_constraintGuide_begin, 17);
        b.append(d.ConstraintSet_layout_constraintGuide_end, 18);
        b.append(d.ConstraintSet_layout_constraintGuide_percent, 19);
        b.append(d.ConstraintSet_android_orientation, 27);
        b.append(d.ConstraintSet_layout_constraintStart_toEndOf, 32);
        b.append(d.ConstraintSet_layout_constraintStart_toStartOf, 33);
        b.append(d.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        b.append(d.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        b.append(d.ConstraintSet_layout_goneMarginLeft, 13);
        b.append(d.ConstraintSet_layout_goneMarginTop, 16);
        b.append(d.ConstraintSet_layout_goneMarginRight, 14);
        b.append(d.ConstraintSet_layout_goneMarginBottom, 11);
        b.append(d.ConstraintSet_layout_goneMarginStart, 15);
        b.append(d.ConstraintSet_layout_goneMarginEnd, 12);
        b.append(d.ConstraintSet_layout_constraintVertical_weight, 40);
        b.append(d.ConstraintSet_layout_constraintHorizontal_weight, 39);
        b.append(d.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        b.append(d.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        b.append(d.ConstraintSet_layout_constraintHorizontal_bias, 20);
        b.append(d.ConstraintSet_layout_constraintVertical_bias, 37);
        b.append(d.ConstraintSet_layout_constraintDimensionRatio, 5);
        b.append(d.ConstraintSet_layout_constraintLeft_creator, 75);
        b.append(d.ConstraintSet_layout_constraintTop_creator, 75);
        b.append(d.ConstraintSet_layout_constraintRight_creator, 75);
        b.append(d.ConstraintSet_layout_constraintBottom_creator, 75);
        b.append(d.ConstraintSet_layout_constraintBaseline_creator, 75);
        b.append(d.ConstraintSet_android_layout_marginLeft, 24);
        b.append(d.ConstraintSet_android_layout_marginRight, 28);
        b.append(d.ConstraintSet_android_layout_marginStart, 31);
        b.append(d.ConstraintSet_android_layout_marginEnd, 8);
        b.append(d.ConstraintSet_android_layout_marginTop, 34);
        b.append(d.ConstraintSet_android_layout_marginBottom, 2);
        b.append(d.ConstraintSet_android_layout_width, 23);
        b.append(d.ConstraintSet_android_layout_height, 21);
        b.append(d.ConstraintSet_android_visibility, 22);
        b.append(d.ConstraintSet_android_alpha, 43);
        b.append(d.ConstraintSet_android_elevation, 44);
        b.append(d.ConstraintSet_android_rotationX, 45);
        b.append(d.ConstraintSet_android_rotationY, 46);
        b.append(d.ConstraintSet_android_rotation, 60);
        b.append(d.ConstraintSet_android_scaleX, 47);
        b.append(d.ConstraintSet_android_scaleY, 48);
        b.append(d.ConstraintSet_android_transformPivotX, 49);
        b.append(d.ConstraintSet_android_transformPivotY, 50);
        b.append(d.ConstraintSet_android_translationX, 51);
        b.append(d.ConstraintSet_android_translationY, 52);
        b.append(d.ConstraintSet_android_translationZ, 53);
        b.append(d.ConstraintSet_layout_constraintWidth_default, 54);
        b.append(d.ConstraintSet_layout_constraintHeight_default, 55);
        b.append(d.ConstraintSet_layout_constraintWidth_max, 56);
        b.append(d.ConstraintSet_layout_constraintHeight_max, 57);
        b.append(d.ConstraintSet_layout_constraintWidth_min, 58);
        b.append(d.ConstraintSet_layout_constraintHeight_min, 59);
        b.append(d.ConstraintSet_layout_constraintCircle, 61);
        b.append(d.ConstraintSet_layout_constraintCircleRadius, 62);
        b.append(d.ConstraintSet_layout_constraintCircleAngle, 63);
        b.append(d.ConstraintSet_android_id, 38);
        b.append(d.ConstraintSet_layout_constraintWidth_percent, 69);
        b.append(d.ConstraintSet_layout_constraintHeight_percent, 70);
        b.append(d.ConstraintSet_chainUseRtl, 71);
        b.append(d.ConstraintSet_barrierDirection, 72);
        b.append(d.ConstraintSet_constraint_referenced_ids, 73);
        b.append(d.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    public void a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.c.containsKey(Integer.valueOf(id))) {
                    this.c.put(Integer.valueOf(id), new a());
                }
                a aVar = (a) this.c.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    aVar.a((ConstraintHelper) childAt, id, layoutParams);
                }
                aVar.a(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.c.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = (a) this.c.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.ta = 1;
                    }
                    int i2 = aVar.ta;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.sa);
                        barrier.setAllowsGoneWidget(aVar.ra);
                        int[] iArr = aVar.ua;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = aVar.va;
                            if (str != null) {
                                aVar.ua = a((View) barrier, str);
                                barrier.setReferencedIds(aVar.ua);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    aVar.a(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    childAt.setVisibility(aVar.J);
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.U);
                        childAt.setRotation(aVar.X);
                        childAt.setRotationX(aVar.Y);
                        childAt.setRotationY(aVar.Z);
                        childAt.setScaleX(aVar.aa);
                        childAt.setScaleY(aVar.ba);
                        if (!Float.isNaN(aVar.ca)) {
                            childAt.setPivotX(aVar.ca);
                        }
                        if (!Float.isNaN(aVar.da)) {
                            childAt.setPivotY(aVar.da);
                        }
                        childAt.setTranslationX(aVar.ea);
                        childAt.setTranslationY(aVar.fa);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.ga);
                            if (aVar.V) {
                                childAt.setElevation(aVar.W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.c.get(num);
            int i3 = aVar2.ta;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = aVar2.ua;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = aVar2.va;
                    if (str2 != null) {
                        aVar2.ua = a((View) barrier2, str2);
                        barrier2.setReferencedIds(aVar2.ua);
                    }
                }
                barrier2.setType(aVar2.sa);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.a();
                aVar2.a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a a2 = a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a2.a = true;
                    }
                    this.c.put(Integer.valueOf(a2.d), a2);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private a a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.ConstraintSet);
        a(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private void a(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = b.get(index);
            switch (i2) {
                case 1:
                    aVar.p = a(typedArray, index, aVar.p);
                    break;
                case 2:
                    aVar.G = typedArray.getDimensionPixelSize(index, aVar.G);
                    break;
                case 3:
                    aVar.o = a(typedArray, index, aVar.o);
                    break;
                case 4:
                    aVar.n = a(typedArray, index, aVar.n);
                    break;
                case 5:
                    aVar.w = typedArray.getString(index);
                    break;
                case 6:
                    aVar.A = typedArray.getDimensionPixelOffset(index, aVar.A);
                    break;
                case 7:
                    aVar.B = typedArray.getDimensionPixelOffset(index, aVar.B);
                    break;
                case 8:
                    aVar.H = typedArray.getDimensionPixelSize(index, aVar.H);
                    break;
                case 9:
                    aVar.t = a(typedArray, index, aVar.t);
                    break;
                case 10:
                    aVar.s = a(typedArray, index, aVar.s);
                    break;
                case 11:
                    aVar.N = typedArray.getDimensionPixelSize(index, aVar.N);
                    break;
                case 12:
                    aVar.O = typedArray.getDimensionPixelSize(index, aVar.O);
                    break;
                case 13:
                    aVar.K = typedArray.getDimensionPixelSize(index, aVar.K);
                    break;
                case 14:
                    aVar.M = typedArray.getDimensionPixelSize(index, aVar.M);
                    break;
                case 15:
                    aVar.P = typedArray.getDimensionPixelSize(index, aVar.P);
                    break;
                case 16:
                    aVar.L = typedArray.getDimensionPixelSize(index, aVar.L);
                    break;
                case 17:
                    aVar.e = typedArray.getDimensionPixelOffset(index, aVar.e);
                    break;
                case 18:
                    aVar.f = typedArray.getDimensionPixelOffset(index, aVar.f);
                    break;
                case 19:
                    aVar.g = typedArray.getFloat(index, aVar.g);
                    break;
                case 20:
                    aVar.u = typedArray.getFloat(index, aVar.u);
                    break;
                case 21:
                    aVar.c = typedArray.getLayoutDimension(index, aVar.c);
                    break;
                case 22:
                    aVar.J = typedArray.getInt(index, aVar.J);
                    aVar.J = a[aVar.J];
                    break;
                case 23:
                    aVar.b = typedArray.getLayoutDimension(index, aVar.b);
                    break;
                case 24:
                    aVar.D = typedArray.getDimensionPixelSize(index, aVar.D);
                    break;
                case 25:
                    aVar.h = a(typedArray, index, aVar.h);
                    break;
                case 26:
                    aVar.i = a(typedArray, index, aVar.i);
                    break;
                case 27:
                    aVar.C = typedArray.getInt(index, aVar.C);
                    break;
                case 28:
                    aVar.E = typedArray.getDimensionPixelSize(index, aVar.E);
                    break;
                case 29:
                    aVar.j = a(typedArray, index, aVar.j);
                    break;
                case 30:
                    aVar.k = a(typedArray, index, aVar.k);
                    break;
                case 31:
                    aVar.I = typedArray.getDimensionPixelSize(index, aVar.I);
                    break;
                case 32:
                    aVar.q = a(typedArray, index, aVar.q);
                    break;
                case 33:
                    aVar.r = a(typedArray, index, aVar.r);
                    break;
                case 34:
                    aVar.F = typedArray.getDimensionPixelSize(index, aVar.F);
                    break;
                case 35:
                    aVar.m = a(typedArray, index, aVar.m);
                    break;
                case 36:
                    aVar.l = a(typedArray, index, aVar.l);
                    break;
                case 37:
                    aVar.v = typedArray.getFloat(index, aVar.v);
                    break;
                case 38:
                    aVar.d = typedArray.getResourceId(index, aVar.d);
                    break;
                case 39:
                    aVar.R = typedArray.getFloat(index, aVar.R);
                    break;
                case 40:
                    aVar.Q = typedArray.getFloat(index, aVar.Q);
                    break;
                case 41:
                    aVar.S = typedArray.getInt(index, aVar.S);
                    break;
                case 42:
                    aVar.T = typedArray.getInt(index, aVar.T);
                    break;
                case 43:
                    aVar.U = typedArray.getFloat(index, aVar.U);
                    break;
                case 44:
                    aVar.V = true;
                    aVar.W = typedArray.getDimension(index, aVar.W);
                    break;
                case 45:
                    aVar.Y = typedArray.getFloat(index, aVar.Y);
                    break;
                case 46:
                    aVar.Z = typedArray.getFloat(index, aVar.Z);
                    break;
                case 47:
                    aVar.aa = typedArray.getFloat(index, aVar.aa);
                    break;
                case 48:
                    aVar.ba = typedArray.getFloat(index, aVar.ba);
                    break;
                case 49:
                    aVar.ca = typedArray.getFloat(index, aVar.ca);
                    break;
                case 50:
                    aVar.da = typedArray.getFloat(index, aVar.da);
                    break;
                case 51:
                    aVar.ea = typedArray.getDimension(index, aVar.ea);
                    break;
                case 52:
                    aVar.fa = typedArray.getDimension(index, aVar.fa);
                    break;
                case 53:
                    aVar.ga = typedArray.getDimension(index, aVar.ga);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.X = typedArray.getFloat(index, aVar.X);
                            break;
                        case 61:
                            aVar.x = a(typedArray, index, aVar.x);
                            break;
                        case 62:
                            aVar.y = typedArray.getDimensionPixelSize(index, aVar.y);
                            break;
                        case 63:
                            aVar.z = typedArray.getFloat(index, aVar.z);
                            break;
                        default:
                            String str = "   ";
                            String str2 = "ConstraintSet";
                            switch (i2) {
                                case 69:
                                    aVar.pa = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    aVar.qa = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e(str2, "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    aVar.sa = typedArray.getInt(index, aVar.sa);
                                    break;
                                case 73:
                                    aVar.va = typedArray.getString(index);
                                    break;
                                case 74:
                                    aVar.ra = typedArray.getBoolean(index, aVar.ra);
                                    break;
                                case 75:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("unused attribute 0x");
                                    sb.append(Integer.toHexString(index));
                                    sb.append(str);
                                    sb.append(b.get(index));
                                    Log.w(str2, sb.toString());
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Unknown attribute 0x");
                                    sb2.append(Integer.toHexString(index));
                                    sb2.append(str);
                                    sb2.append(b.get(index));
                                    Log.w(str2, sb2.toString());
                                    break;
                            }
                    }
            }
        }
    }

    private int[] a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a2 = ((ConstraintLayout) view.getParent()).a(0, (Object) trim);
                if (a2 != null && (a2 instanceof Integer)) {
                    i = ((Integer) a2).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
