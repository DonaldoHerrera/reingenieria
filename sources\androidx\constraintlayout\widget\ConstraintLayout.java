package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    SparseArray<View> a = new SparseArray<>();
    private ArrayList<ConstraintHelper> b = new ArrayList<>(4);
    private final ArrayList<C1716ta> c = new ArrayList<>(100);
    C1746ua d = new C1746ua();
    private int e = 0;
    private int f = 0;
    private int g = BaseClientBuilder.API_PRIORITY_OTHER;
    private int h = BaseClientBuilder.API_PRIORITY_OTHER;
    private boolean i = true;
    private int j = 7;
    private b k = null;
    private int l = -1;
    private HashMap<String, Integer> m = new HashMap<>();
    private int n = -1;
    private int o = -1;
    int p = -1;
    int q = -1;
    int r = 0;
    int s = 0;
    private C1381ia t;

    public static class LayoutParams extends MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        float C = 0.0f;
        int D = 1;
        public float E = -1.0f;
        public float F = -1.0f;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public float O = 1.0f;
        public float P = 1.0f;
        public int Q = -1;
        public int R = -1;
        public int S = -1;
        public boolean T = false;
        public boolean U = false;
        boolean V = true;
        boolean W = true;
        boolean X = false;
        boolean Y = false;
        boolean Z = false;
        public int a = -1;
        boolean aa = false;
        public int b = -1;
        int ba = -1;
        public float c = -1.0f;
        int ca = -1;
        public int d = -1;
        int da = -1;
        public int e = -1;
        int ea = -1;
        public int f = -1;
        int fa = -1;
        public int g = -1;
        int ga = -1;
        public int h = -1;
        float ha = 0.5f;
        public int i = -1;
        int ia;
        public int j = -1;
        int ja;
        public int k = -1;
        float ka;
        public int l = -1;
        C1716ta la = new C1716ta();
        public int m = -1;
        public boolean ma = false;
        public int n = 0;
        public float o = 0.0f;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        private static class a {
            public static final SparseIntArray a = new SparseIntArray();

            static {
                a.append(d.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                a.append(d.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                a.append(d.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                a.append(d.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                a.append(d.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                a.append(d.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                a.append(d.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                a.append(d.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                a.append(d.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                a.append(d.ConstraintLayout_Layout_layout_constraintCircle, 2);
                a.append(d.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                a.append(d.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                a.append(d.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                a.append(d.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                a.append(d.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                a.append(d.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                a.append(d.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                a.append(d.ConstraintLayout_Layout_android_orientation, 1);
                a.append(d.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                a.append(d.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                a.append(d.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                a.append(d.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                a.append(d.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                a.append(d.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                a.append(d.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                a.append(d.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                a.append(d.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                a.append(d.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                a.append(d.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                a.append(d.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                a.append(d.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                a.append(d.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                a.append(d.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                a.append(d.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                a.append(d.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                a.append(d.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                a.append(d.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                a.append(d.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                a.append(d.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                a.append(d.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                a.append(d.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                a.append(d.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                a.append(d.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                a.append(d.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                a.append(d.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                a.append(d.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                a.append(d.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                a.append(d.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                a.append(d.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                a.append(d.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            int i2;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                String str = "ConstraintLayout";
                switch (a.a.get(index)) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        this.m = obtainStyledAttributes.getResourceId(index, this.m);
                        if (this.m != -1) {
                            break;
                        } else {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        this.o = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        float f2 = this.o;
                        if (f2 >= 0.0f) {
                            break;
                        } else {
                            this.o = (360.0f - f2) % 360.0f;
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        this.d = obtainStyledAttributes.getResourceId(index, this.d);
                        if (this.d != -1) {
                            break;
                        } else {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.e = obtainStyledAttributes.getResourceId(index, this.e);
                        if (this.e != -1) {
                            break;
                        } else {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f = obtainStyledAttributes.getResourceId(index, this.f);
                        if (this.f != -1) {
                            break;
                        } else {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.g = obtainStyledAttributes.getResourceId(index, this.g);
                        if (this.g != -1) {
                            break;
                        } else {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.h = obtainStyledAttributes.getResourceId(index, this.h);
                        if (this.h != -1) {
                            break;
                        } else {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.i = obtainStyledAttributes.getResourceId(index, this.i);
                        if (this.i != -1) {
                            break;
                        } else {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.j = obtainStyledAttributes.getResourceId(index, this.j);
                        if (this.j != -1) {
                            break;
                        } else {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.k = obtainStyledAttributes.getResourceId(index, this.k);
                        if (this.k != -1) {
                            break;
                        } else {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.l = obtainStyledAttributes.getResourceId(index, this.l);
                        if (this.l != -1) {
                            break;
                        } else {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.p = obtainStyledAttributes.getResourceId(index, this.p);
                        if (this.p != -1) {
                            break;
                        } else {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.q = obtainStyledAttributes.getResourceId(index, this.q);
                        if (this.q != -1) {
                            break;
                        } else {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.r = obtainStyledAttributes.getResourceId(index, this.r);
                        if (this.r != -1) {
                            break;
                        } else {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.s = obtainStyledAttributes.getResourceId(index, this.s);
                        if (this.s != -1) {
                            break;
                        } else {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        if (this.I != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.J = obtainStyledAttributes.getInt(index, 0);
                        if (this.J != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) != -2) {
                                break;
                            } else {
                                this.K = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) != -2) {
                                break;
                            } else {
                                this.M = -2;
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) != -2) {
                                break;
                            } else {
                                this.L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) != -2) {
                                break;
                            } else {
                                this.N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        break;
                    case 44:
                        this.B = obtainStyledAttributes.getString(index);
                        this.C = Float.NaN;
                        this.D = -1;
                        String str2 = this.B;
                        if (str2 == null) {
                            break;
                        } else {
                            int length = str2.length();
                            int indexOf = this.B.indexOf(44);
                            if (indexOf <= 0 || indexOf >= length - 1) {
                                i2 = 0;
                            } else {
                                String substring = this.B.substring(0, indexOf);
                                if (substring.equalsIgnoreCase("W")) {
                                    this.D = 0;
                                } else if (substring.equalsIgnoreCase("H")) {
                                    this.D = 1;
                                }
                                i2 = indexOf + 1;
                            }
                            int indexOf2 = this.B.indexOf(58);
                            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                String substring2 = this.B.substring(i2, indexOf2);
                                String substring3 = this.B.substring(indexOf2 + 1);
                                if (substring2.length() > 0 && substring3.length() > 0) {
                                    try {
                                        float parseFloat = Float.parseFloat(substring2);
                                        float parseFloat2 = Float.parseFloat(substring3);
                                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                            if (this.D != 1) {
                                                this.C = Math.abs(parseFloat / parseFloat2);
                                                break;
                                            } else {
                                                this.C = Math.abs(parseFloat2 / parseFloat);
                                                break;
                                            }
                                        }
                                    } catch (NumberFormatException unused5) {
                                        break;
                                    }
                                }
                            } else {
                                String substring4 = this.B.substring(i2);
                                if (substring4.length() <= 0) {
                                    break;
                                } else {
                                    this.C = Float.parseFloat(substring4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 45:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 46:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 47:
                        this.G = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 48:
                        this.H = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 49:
                        this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                        break;
                    case 50:
                        this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            if (this.width == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            if (this.height == -2 && this.U) {
                this.W = false;
                this.J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.V = false;
                if (this.width == 0 && this.I == 1) {
                    this.width = -2;
                    this.T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.W = false;
                if (this.height == 0 && this.J == 1) {
                    this.height = -2;
                    this.U = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.Y = true;
                this.V = true;
                this.W = true;
                if (!(this.la instanceof C1836xa)) {
                    this.la = new C1836xa();
                }
                ((C1836xa) this.la).v(this.S);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        @TargetApi(17)
        public void resolveLayoutDirection(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            float f2;
            int i7 = this.leftMargin;
            int i8 = this.rightMargin;
            super.resolveLayoutDirection(i2);
            this.da = -1;
            this.ea = -1;
            this.ba = -1;
            this.ca = -1;
            this.fa = -1;
            this.ga = -1;
            this.fa = this.t;
            this.ga = this.v;
            this.ha = this.z;
            this.ia = this.a;
            this.ja = this.b;
            this.ka = this.c;
            boolean z2 = false;
            if (1 == getLayoutDirection()) {
                int i9 = this.p;
                if (i9 != -1) {
                    this.da = i9;
                } else {
                    int i10 = this.q;
                    if (i10 != -1) {
                        this.ea = i10;
                    }
                    i3 = this.r;
                    if (i3 != -1) {
                        this.ca = i3;
                        z2 = true;
                    }
                    i4 = this.s;
                    if (i4 != -1) {
                        this.ba = i4;
                        z2 = true;
                    }
                    i5 = this.x;
                    if (i5 != -1) {
                        this.ga = i5;
                    }
                    i6 = this.y;
                    if (i6 != -1) {
                        this.fa = i6;
                    }
                    if (z2) {
                        this.ha = 1.0f - this.z;
                    }
                    if (this.Y && this.S == 1) {
                        f2 = this.c;
                        if (f2 == -1.0f) {
                            this.ka = 1.0f - f2;
                            this.ia = -1;
                            this.ja = -1;
                        } else {
                            int i11 = this.a;
                            if (i11 != -1) {
                                this.ja = i11;
                                this.ia = -1;
                                this.ka = -1.0f;
                            } else {
                                int i12 = this.b;
                                if (i12 != -1) {
                                    this.ia = i12;
                                    this.ja = -1;
                                    this.ka = -1.0f;
                                }
                            }
                        }
                    }
                }
                z2 = true;
                i3 = this.r;
                if (i3 != -1) {
                }
                i4 = this.s;
                if (i4 != -1) {
                }
                i5 = this.x;
                if (i5 != -1) {
                }
                i6 = this.y;
                if (i6 != -1) {
                }
                if (z2) {
                }
                f2 = this.c;
                if (f2 == -1.0f) {
                }
            } else {
                int i13 = this.p;
                if (i13 != -1) {
                    this.ca = i13;
                }
                int i14 = this.q;
                if (i14 != -1) {
                    this.ba = i14;
                }
                int i15 = this.r;
                if (i15 != -1) {
                    this.da = i15;
                }
                int i16 = this.s;
                if (i16 != -1) {
                    this.ea = i16;
                }
                int i17 = this.x;
                if (i17 != -1) {
                    this.fa = i17;
                }
                int i18 = this.y;
                if (i18 != -1) {
                    this.ga = i18;
                }
            }
            if (this.r == -1 && this.s == -1 && this.q == -1 && this.p == -1) {
                int i19 = this.f;
                if (i19 != -1) {
                    this.da = i19;
                    if (this.rightMargin <= 0 && i8 > 0) {
                        this.rightMargin = i8;
                    }
                } else {
                    int i20 = this.g;
                    if (i20 != -1) {
                        this.ea = i20;
                        if (this.rightMargin <= 0 && i8 > 0) {
                            this.rightMargin = i8;
                        }
                    }
                }
                int i21 = this.d;
                if (i21 != -1) {
                    this.ba = i21;
                    if (this.leftMargin <= 0 && i7 > 0) {
                        this.leftMargin = i7;
                        return;
                    }
                    return;
                }
                int i22 = this.e;
                if (i22 != -1) {
                    this.ca = i22;
                    if (this.leftMargin <= 0 && i7 > 0) {
                        this.leftMargin = i7;
                    }
                }
            }
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    private void b() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            this.c.clear();
            a();
        }
    }

    private void c() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Placeholder) {
                ((Placeholder) childAt).a(this);
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                ((ConstraintHelper) this.b.get(i3)).b(this);
            }
        }
    }

    public void a(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f2 = (float) i3;
                            float f3 = (float) (i3 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f4 = (float) i4;
                            float f5 = f2;
                            float f6 = f2;
                            float f7 = f4;
                            Paint paint2 = paint;
                            float f8 = f3;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f5, f7, f8, f4, paint3);
                            float f9 = (float) (i4 + parseInt4);
                            float f10 = f3;
                            float f11 = f9;
                            canvas2.drawLine(f10, f7, f8, f11, paint3);
                            float f12 = f9;
                            float f13 = f6;
                            canvas2.drawLine(f10, f12, f13, f11, paint3);
                            float f14 = f6;
                            canvas2.drawLine(f14, f12, f13, f4, paint3);
                            Paint paint4 = paint2;
                            paint4.setColor(-16711936);
                            Paint paint5 = paint4;
                            float f15 = f3;
                            Paint paint6 = paint5;
                            canvas2.drawLine(f14, f4, f15, f9, paint6);
                            canvas2.drawLine(f14, f9, f15, f4, paint6);
                        }
                    }
                }
            }
        }
    }

    public int getMaxHeight() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    public int getMinHeight() {
        return this.f;
    }

    public int getMinWidth() {
        return this.e;
    }

    public int getOptimizationLevel() {
        return this.d.M();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C1716ta taVar = layoutParams.la;
            if ((childAt.getVisibility() != 8 || layoutParams.Y || layoutParams.Z || isInEditMode) && !layoutParams.aa) {
                int g2 = taVar.g();
                int h2 = taVar.h();
                int s2 = taVar.s() + g2;
                int i7 = taVar.i() + h2;
                childAt.layout(g2, h2, s2, i7);
                if (childAt instanceof Placeholder) {
                    View content = ((Placeholder) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(g2, h2, s2, i7);
                    }
                }
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((ConstraintHelper) this.b.get(i8)).a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    public void onMeasure(int i2, int i3) {
        boolean z;
        int size;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        int i10 = i3;
        System.currentTimeMillis();
        int mode = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size3 = MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.d.r(paddingLeft);
        this.d.s(paddingTop);
        this.d.j(this.g);
        this.d.i(this.h);
        if (VERSION.SDK_INT >= 17) {
            this.d.c(getLayoutDirection() == 1);
        }
        c(i2, i3);
        int s2 = this.d.s();
        int i11 = this.d.i();
        if (this.i) {
            this.i = false;
            b();
            z = true;
        } else {
            z = false;
        }
        boolean z5 = (this.j & 8) == 8;
        if (z5) {
            this.d.T();
            this.d.f(s2, i11);
            b(i2, i3);
        } else {
            a(i2, i3);
        }
        c();
        if (getChildCount() > 0 && z) {
            C1504ma.a(this.d);
        }
        C1746ua uaVar = this.d;
        if (uaVar.Ia) {
            if (uaVar.Ja && mode == Integer.MIN_VALUE) {
                int i12 = uaVar.La;
                if (i12 < size2) {
                    uaVar.o(i12);
                }
                this.d.a(a.FIXED);
            }
            C1746ua uaVar2 = this.d;
            if (uaVar2.Ka && mode2 == Integer.MIN_VALUE) {
                int i13 = uaVar2.Ma;
                if (i13 < size3) {
                    uaVar2.g(i13);
                }
                this.d.b(a.FIXED);
            }
        }
        if ((this.j & 32) == 32) {
            int s3 = this.d.s();
            int i14 = this.d.i();
            if (this.n != s3 && mode == 1073741824) {
                C1504ma.a(this.d.Ha, 0, s3);
            }
            if (this.o != i14 && mode2 == 1073741824) {
                C1504ma.a(this.d.Ha, 1, i14);
            }
            C1746ua uaVar3 = this.d;
            if (uaVar3.Ja && uaVar3.La > size2) {
                C1504ma.a(uaVar3.Ha, 0, size2);
            }
            C1746ua uaVar4 = this.d;
            if (uaVar4.Ka && uaVar4.Ma > size3) {
                C1504ma.a(uaVar4.Ha, 1, size3);
                if (getChildCount() > 0) {
                    a("First pass");
                }
                size = this.c.size();
                int paddingBottom = paddingTop + getPaddingBottom();
                int paddingRight = paddingLeft + getPaddingRight();
                if (size <= 0) {
                    boolean z6 = this.d.j() == a.WRAP_CONTENT;
                    boolean z7 = this.d.q() == a.WRAP_CONTENT;
                    int max = Math.max(this.d.s(), this.e);
                    int max2 = Math.max(this.d.i(), this.f);
                    int i15 = 0;
                    boolean z8 = false;
                    int i16 = 0;
                    while (i15 < size) {
                        C1716ta taVar = (C1716ta) this.c.get(i15);
                        int i17 = size;
                        View view = (View) taVar.e();
                        if (view == null) {
                            i6 = s2;
                            z4 = z8;
                            i5 = i11;
                        } else {
                            i5 = i11;
                            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                            i6 = s2;
                            if (layoutParams.Z || layoutParams.Y) {
                                z4 = z8;
                            } else {
                                z4 = z8;
                                if (view.getVisibility() != 8 && (!z5 || !taVar.m().c() || !taVar.l().c())) {
                                    if (layoutParams.width != -2 || !layoutParams.V) {
                                        i7 = MeasureSpec.makeMeasureSpec(taVar.s(), 1073741824);
                                    } else {
                                        i7 = ViewGroup.getChildMeasureSpec(i9, paddingRight, layoutParams.width);
                                    }
                                    if (layoutParams.height != -2 || !layoutParams.W) {
                                        i8 = MeasureSpec.makeMeasureSpec(taVar.i(), 1073741824);
                                    } else {
                                        i8 = ViewGroup.getChildMeasureSpec(i10, paddingBottom, layoutParams.height);
                                    }
                                    view.measure(i7, i8);
                                    C1381ia iaVar = this.t;
                                    if (iaVar != null) {
                                        iaVar.b++;
                                    }
                                    int measuredWidth = view.getMeasuredWidth();
                                    int measuredHeight = view.getMeasuredHeight();
                                    if (measuredWidth != taVar.s()) {
                                        taVar.o(measuredWidth);
                                        if (z5) {
                                            taVar.m().a(measuredWidth);
                                        }
                                        if (z6 && taVar.n() > max) {
                                            max = Math.max(max, taVar.n() + taVar.a(c.RIGHT).b());
                                        }
                                        z4 = true;
                                    }
                                    if (measuredHeight != taVar.i()) {
                                        taVar.g(measuredHeight);
                                        if (z5) {
                                            taVar.l().a(measuredHeight);
                                        }
                                        if (z7 && taVar.d() > max2) {
                                            max2 = Math.max(max2, taVar.d() + taVar.a(c.BOTTOM).b());
                                        }
                                        z4 = true;
                                    }
                                    if (layoutParams.X) {
                                        int baseline = view.getBaseline();
                                        if (!(baseline == -1 || baseline == taVar.c())) {
                                            taVar.f(baseline);
                                            z4 = true;
                                        }
                                    }
                                    if (VERSION.SDK_INT >= 11) {
                                        i16 = ViewGroup.combineMeasuredStates(i16, view.getMeasuredState());
                                    } else {
                                        int i18 = i16;
                                    }
                                    z8 = z4;
                                    i15++;
                                    i9 = i2;
                                    s2 = i6;
                                    size = i17;
                                    i11 = i5;
                                }
                            }
                        }
                        i16 = i16;
                        z8 = z4;
                        i15++;
                        i9 = i2;
                        s2 = i6;
                        size = i17;
                        i11 = i5;
                    }
                    int i19 = size;
                    int i20 = s2;
                    int i21 = i11;
                    i4 = i16;
                    if (z8) {
                        this.d.o(i20);
                        this.d.g(i21);
                        if (z5) {
                            this.d.U();
                        }
                        a("2nd pass");
                        if (this.d.s() < max) {
                            this.d.o(max);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (this.d.i() < max2) {
                            this.d.g(max2);
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            a("3rd pass");
                        }
                    }
                    int i22 = i19;
                    for (int i23 = 0; i23 < i22; i23++) {
                        C1716ta taVar2 = (C1716ta) this.c.get(i23);
                        View view2 = (View) taVar2.e();
                        if (view2 != null && (view2.getMeasuredWidth() != taVar2.s() || view2.getMeasuredHeight() != taVar2.i())) {
                            if (taVar2.r() != 8) {
                                view2.measure(MeasureSpec.makeMeasureSpec(taVar2.s(), 1073741824), MeasureSpec.makeMeasureSpec(taVar2.i(), 1073741824));
                                C1381ia iaVar2 = this.t;
                                if (iaVar2 != null) {
                                    iaVar2.b++;
                                }
                            }
                        }
                    }
                } else {
                    i4 = 0;
                }
                int s4 = this.d.s() + paddingRight;
                int i24 = this.d.i() + paddingBottom;
                if (VERSION.SDK_INT < 11) {
                    int resolveSizeAndState = ViewGroup.resolveSizeAndState(i24, i10, i4 << 16) & 16777215;
                    int min = Math.min(this.g, ViewGroup.resolveSizeAndState(s4, i2, i4) & 16777215);
                    int min2 = Math.min(this.h, resolveSizeAndState);
                    if (this.d.Q()) {
                        min |= 16777216;
                    }
                    if (this.d.O()) {
                        min2 |= 16777216;
                    }
                    setMeasuredDimension(min, min2);
                    this.n = min;
                    this.o = min2;
                    return;
                }
                setMeasuredDimension(s4, i24);
                this.n = s4;
                this.o = i24;
                return;
            }
        }
        if (getChildCount() > 0) {
        }
        size = this.c.size();
        int paddingBottom2 = paddingTop + getPaddingBottom();
        int paddingRight2 = paddingLeft + getPaddingRight();
        if (size <= 0) {
        }
        int s42 = this.d.s() + paddingRight2;
        int i242 = this.d.i() + paddingBottom2;
        if (VERSION.SDK_INT < 11) {
        }
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C1716ta a2 = a(view);
        if ((view instanceof Guideline) && !(a2 instanceof C1836xa)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.la = new C1836xa();
            layoutParams.Y = true;
            ((C1836xa) layoutParams.la).v(layoutParams.S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.a();
            ((LayoutParams) view.getLayoutParams()).Z = true;
            if (!this.b.contains(constraintHelper)) {
                this.b.add(constraintHelper);
            }
        }
        this.a.put(view.getId(), view);
        this.i = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.a.remove(view.getId());
        C1716ta a2 = a(view);
        this.d.c(a2);
        this.b.remove(view);
        this.c.remove(a2);
        this.i = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.i = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    public void setConstraintSet(b bVar) {
        this.k = bVar;
    }

    public void setId(int i2) {
        this.a.remove(getId());
        super.setId(i2);
        this.a.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.h) {
            this.h = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.g) {
            this.g = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f) {
            this.f = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.e) {
            this.e = i2;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.d.u(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    private final C1716ta b(int i2) {
        C1716ta taVar;
        if (i2 == 0) {
            return this.d;
        }
        View view = (View) this.a.get(i2);
        if (view == null) {
            view = findViewById(i2);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.d;
        }
        if (view == null) {
            taVar = null;
        } else {
            taVar = ((LayoutParams) view.getLayoutParams()).la;
        }
        return taVar;
    }

    private void c(int i2, int i3) {
        a aVar;
        int i4;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size2 = MeasureSpec.getSize(i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        a aVar2 = a.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                aVar = a.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                aVar = aVar2;
            } else {
                i4 = Math.min(this.g, size) - paddingLeft;
                aVar = aVar2;
            }
            i4 = 0;
        } else {
            i4 = size;
            aVar = a.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                aVar2 = a.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.h, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            aVar2 = a.WRAP_CONTENT;
        }
        this.d.l(0);
        this.d.k(0);
        this.d.a(aVar);
        this.d.o(i4);
        this.d.b(aVar2);
        this.d.g(size2);
        this.d.l((this.e - getPaddingLeft()) - getPaddingRight());
        this.d.k((this.f - getPaddingTop()) - getPaddingBottom());
    }

    public Object a(int i2, Object obj) {
        if (i2 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.m;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.m.get(str);
            }
        }
        return null;
    }

    private void a(AttributeSet attributeSet) {
        this.d.a((Object) this);
        this.a.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == d.ConstraintLayout_Layout_android_minWidth) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == d.ConstraintLayout_Layout_android_minHeight) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == d.ConstraintLayout_Layout_android_maxWidth) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == d.ConstraintLayout_Layout_android_maxHeight) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == d.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.j = obtainStyledAttributes.getInt(index, this.j);
                } else if (index == d.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.k = new b();
                        this.k.a(getContext(), resourceId);
                    } catch (NotFoundException unused) {
                        this.k = null;
                    }
                    this.l = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d.u(this.j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    private void b(int i2, int i3) {
        long j2;
        int i4;
        int i5;
        long j3;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        int i8;
        C1381ia iaVar;
        int i9;
        ConstraintLayout constraintLayout = this;
        int i10 = i2;
        int i11 = i3;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            j2 = 1;
            i4 = 8;
            if (i12 >= childCount) {
                break;
            }
            View childAt = constraintLayout.getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C1716ta taVar = layoutParams.la;
                if (!layoutParams.Y && !layoutParams.Z) {
                    taVar.n(childAt.getVisibility());
                    int i13 = layoutParams.width;
                    int i14 = layoutParams.height;
                    if (i13 == 0 || i14 == 0) {
                        i9 = paddingTop;
                        taVar.m().b();
                        taVar.l().b();
                        i12++;
                        i11 = i3;
                        paddingTop = i9;
                    } else {
                        boolean z4 = i13 == -2;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingLeft, i13);
                        boolean z5 = i14 == -2;
                        childAt.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i11, paddingTop, i14));
                        C1381ia iaVar2 = constraintLayout.t;
                        if (iaVar2 != null) {
                            i9 = paddingTop;
                            iaVar2.a++;
                        } else {
                            i9 = paddingTop;
                        }
                        taVar.b(i13 == -2);
                        taVar.a(i14 == -2);
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        taVar.o(measuredWidth);
                        taVar.g(measuredHeight);
                        if (z4) {
                            taVar.q(measuredWidth);
                        }
                        if (z5) {
                            taVar.p(measuredHeight);
                        }
                        if (layoutParams.X) {
                            int baseline = childAt.getBaseline();
                            if (baseline != -1) {
                                taVar.f(baseline);
                            }
                        }
                        if (layoutParams.V && layoutParams.W) {
                            taVar.m().a(measuredWidth);
                            taVar.l().a(measuredHeight);
                        }
                        i12++;
                        i11 = i3;
                        paddingTop = i9;
                    }
                }
            }
            i9 = paddingTop;
            i12++;
            i11 = i3;
            paddingTop = i9;
        }
        int i15 = paddingTop;
        constraintLayout.d.U();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt2 = constraintLayout.getChildAt(i16);
            if (childAt2.getVisibility() != i4) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                C1716ta taVar2 = layoutParams2.la;
                if (!layoutParams2.Y && !layoutParams2.Z) {
                    taVar2.n(childAt2.getVisibility());
                    int i17 = layoutParams2.width;
                    int i18 = layoutParams2.height;
                    if (i17 == 0 || i18 == 0) {
                        C0192Ba d2 = taVar2.a(c.LEFT).d();
                        C0192Ba d3 = taVar2.a(c.RIGHT).d();
                        boolean z6 = (taVar2.a(c.LEFT).g() == null || taVar2.a(c.RIGHT).g() == null) ? false : true;
                        C0192Ba d4 = taVar2.a(c.TOP).d();
                        C0192Ba d5 = taVar2.a(c.BOTTOM).d();
                        i6 = childCount;
                        boolean z7 = (taVar2.a(c.TOP).g() == null || taVar2.a(c.BOTTOM).g() == null) ? false : true;
                        if (i17 != 0 || i18 != 0 || !z6 || !z7) {
                            i5 = i16;
                            LayoutParams layoutParams3 = layoutParams2;
                            boolean z8 = constraintLayout.d.j() != a.WRAP_CONTENT;
                            boolean z9 = constraintLayout.d.q() != a.WRAP_CONTENT;
                            if (!z8) {
                                taVar2.m().b();
                            }
                            if (!z9) {
                                taVar2.l().b();
                            }
                            if (i17 == 0) {
                                if (!z8 || !taVar2.C() || !z6 || !d2.c() || !d3.c()) {
                                    i7 = ViewGroup.getChildMeasureSpec(i10, paddingLeft, -2);
                                    z = true;
                                    z8 = false;
                                    if (i18 != 0) {
                                        int i19 = i3;
                                        if (i18 == -1) {
                                            z2 = z9;
                                            i8 = ViewGroup.getChildMeasureSpec(i19, i15, -1);
                                        } else {
                                            z3 = i18 == -2;
                                            z2 = z9;
                                            i8 = ViewGroup.getChildMeasureSpec(i19, i15, i18);
                                            childAt2.measure(i7, i8);
                                            constraintLayout = this;
                                            iaVar = constraintLayout.t;
                                            if (iaVar != null) {
                                            }
                                            taVar2.b(i17 == -2);
                                            taVar2.a(i18 == -2);
                                            int measuredWidth2 = childAt2.getMeasuredWidth();
                                            int measuredHeight2 = childAt2.getMeasuredHeight();
                                            taVar2.o(measuredWidth2);
                                            taVar2.g(measuredHeight2);
                                            if (z) {
                                            }
                                            if (z3) {
                                            }
                                            if (z8) {
                                            }
                                            if (z2) {
                                            }
                                            if (layoutParams3.X) {
                                            }
                                            i16 = i5 + 1;
                                            childCount = i6;
                                            j2 = j3;
                                            i4 = 8;
                                        }
                                    } else if (!z9 || !taVar2.B() || !z7 || !d4.c() || !d5.c()) {
                                        i8 = ViewGroup.getChildMeasureSpec(i3, i15, -2);
                                        z3 = true;
                                        z2 = false;
                                        childAt2.measure(i7, i8);
                                        constraintLayout = this;
                                        iaVar = constraintLayout.t;
                                        if (iaVar != null) {
                                            j3 = 1;
                                            iaVar.a++;
                                        } else {
                                            j3 = 1;
                                        }
                                        taVar2.b(i17 == -2);
                                        taVar2.a(i18 == -2);
                                        int measuredWidth22 = childAt2.getMeasuredWidth();
                                        int measuredHeight22 = childAt2.getMeasuredHeight();
                                        taVar2.o(measuredWidth22);
                                        taVar2.g(measuredHeight22);
                                        if (z) {
                                            taVar2.q(measuredWidth22);
                                        }
                                        if (z3) {
                                            taVar2.p(measuredHeight22);
                                        }
                                        if (z8) {
                                            taVar2.m().a(measuredWidth22);
                                        } else {
                                            taVar2.m().f();
                                        }
                                        if (z2) {
                                            taVar2.l().a(measuredHeight22);
                                        } else {
                                            taVar2.l().f();
                                        }
                                        if (layoutParams3.X) {
                                            int baseline2 = childAt2.getBaseline();
                                            if (baseline2 != -1) {
                                                taVar2.f(baseline2);
                                            }
                                        }
                                        i16 = i5 + 1;
                                        childCount = i6;
                                        j2 = j3;
                                        i4 = 8;
                                    } else {
                                        i18 = (int) (d5.f() - d4.f());
                                        taVar2.l().a(i18);
                                        z2 = z9;
                                        i8 = ViewGroup.getChildMeasureSpec(i3, i15, i18);
                                    }
                                    z3 = false;
                                    childAt2.measure(i7, i8);
                                    constraintLayout = this;
                                    iaVar = constraintLayout.t;
                                    if (iaVar != null) {
                                    }
                                    taVar2.b(i17 == -2);
                                    taVar2.a(i18 == -2);
                                    int measuredWidth222 = childAt2.getMeasuredWidth();
                                    int measuredHeight222 = childAt2.getMeasuredHeight();
                                    taVar2.o(measuredWidth222);
                                    taVar2.g(measuredHeight222);
                                    if (z) {
                                    }
                                    if (z3) {
                                    }
                                    if (z8) {
                                    }
                                    if (z2) {
                                    }
                                    if (layoutParams3.X) {
                                    }
                                    i16 = i5 + 1;
                                    childCount = i6;
                                    j2 = j3;
                                    i4 = 8;
                                } else {
                                    i17 = (int) (d3.f() - d2.f());
                                    taVar2.m().a(i17);
                                    i7 = ViewGroup.getChildMeasureSpec(i10, paddingLeft, i17);
                                }
                            } else if (i17 == -1) {
                                i7 = ViewGroup.getChildMeasureSpec(i10, paddingLeft, -1);
                            } else {
                                z = i17 == -2;
                                i7 = ViewGroup.getChildMeasureSpec(i10, paddingLeft, i17);
                                if (i18 != 0) {
                                }
                                z3 = false;
                                childAt2.measure(i7, i8);
                                constraintLayout = this;
                                iaVar = constraintLayout.t;
                                if (iaVar != null) {
                                }
                                taVar2.b(i17 == -2);
                                taVar2.a(i18 == -2);
                                int measuredWidth2222 = childAt2.getMeasuredWidth();
                                int measuredHeight2222 = childAt2.getMeasuredHeight();
                                taVar2.o(measuredWidth2222);
                                taVar2.g(measuredHeight2222);
                                if (z) {
                                }
                                if (z3) {
                                }
                                if (z8) {
                                }
                                if (z2) {
                                }
                                if (layoutParams3.X) {
                                }
                                i16 = i5 + 1;
                                childCount = i6;
                                j2 = j3;
                                i4 = 8;
                            }
                            z = false;
                            if (i18 != 0) {
                            }
                            z3 = false;
                            childAt2.measure(i7, i8);
                            constraintLayout = this;
                            iaVar = constraintLayout.t;
                            if (iaVar != null) {
                            }
                            taVar2.b(i17 == -2);
                            taVar2.a(i18 == -2);
                            int measuredWidth22222 = childAt2.getMeasuredWidth();
                            int measuredHeight22222 = childAt2.getMeasuredHeight();
                            taVar2.o(measuredWidth22222);
                            taVar2.g(measuredHeight22222);
                            if (z) {
                            }
                            if (z3) {
                            }
                            if (z8) {
                            }
                            if (z2) {
                            }
                            if (layoutParams3.X) {
                            }
                            i16 = i5 + 1;
                            childCount = i6;
                            j2 = j3;
                            i4 = 8;
                        } else {
                            int i20 = i3;
                            i5 = i16;
                            j3 = 1;
                            i16 = i5 + 1;
                            childCount = i6;
                            j2 = j3;
                            i4 = 8;
                        }
                    }
                }
            }
            i5 = i16;
            i6 = childCount;
            j3 = j2;
            int i21 = i3;
            i16 = i5 + 1;
            childCount = i6;
            j2 = j3;
            i4 = 8;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d6, code lost:
        if (r11 != -1) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b4  */
    private void a() {
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        String str;
        float f3;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        boolean z = false;
        if (isInEditMode) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    a(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    b(childAt.getId()).a(resourceName);
                } catch (NotFoundException unused) {
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            C1716ta a2 = a(getChildAt(i9));
            if (a2 != null) {
                a2.D();
            }
        }
        if (this.l != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = getChildAt(i10);
                if (childAt2.getId() == this.l && (childAt2 instanceof Constraints)) {
                    this.k = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        b bVar = this.k;
        if (bVar != null) {
            bVar.a(this);
        }
        this.d.L();
        int size = this.b.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((ConstraintHelper) this.b.get(i11)).c(this);
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt3 = getChildAt(i12);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).b(this);
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt4 = getChildAt(i13);
            C1716ta a3 = a(childAt4);
            if (a3 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt4.getLayoutParams();
                layoutParams.a();
                if (layoutParams.ma) {
                    layoutParams.ma = z;
                } else if (isInEditMode) {
                    try {
                        String resourceName2 = getResources().getResourceName(childAt4.getId());
                        a(z ? 1 : 0, resourceName2, Integer.valueOf(childAt4.getId()));
                        b(childAt4.getId()).a(resourceName2.substring(resourceName2.indexOf("id/") + 3));
                    } catch (NotFoundException unused2) {
                    }
                }
                a3.n(childAt4.getVisibility());
                if (layoutParams.aa) {
                    a3.n(8);
                }
                a3.a((Object) childAt4);
                this.d.b(a3);
                if (!layoutParams.W || !layoutParams.V) {
                    this.c.add(a3);
                }
                if (layoutParams.Y) {
                    C1836xa xaVar = (C1836xa) a3;
                    int i14 = layoutParams.ia;
                    int i15 = layoutParams.ja;
                    float f4 = layoutParams.ka;
                    if (VERSION.SDK_INT < 17) {
                        i14 = layoutParams.a;
                        i15 = layoutParams.b;
                        f4 = layoutParams.c;
                    }
                    if (f4 != -1.0f) {
                        xaVar.e(f4);
                    } else if (i14 != -1) {
                        xaVar.t(i14);
                    } else if (i15 != -1) {
                        xaVar.u(i15);
                    }
                } else if (layoutParams.d != -1 || layoutParams.e != -1 || layoutParams.f != -1 || layoutParams.g != -1 || layoutParams.q != -1 || layoutParams.p != -1 || layoutParams.r != -1 || layoutParams.s != -1 || layoutParams.h != -1 || layoutParams.i != -1 || layoutParams.j != -1 || layoutParams.k != -1 || layoutParams.l != -1 || layoutParams.Q != -1 || layoutParams.R != -1 || layoutParams.m != -1 || layoutParams.width == -1 || layoutParams.height == -1) {
                    int i16 = layoutParams.ba;
                    int i17 = layoutParams.ca;
                    int i18 = layoutParams.da;
                    int i19 = layoutParams.ea;
                    int i20 = layoutParams.fa;
                    int i21 = layoutParams.ga;
                    float f5 = layoutParams.ha;
                    if (VERSION.SDK_INT < 17) {
                        int i22 = layoutParams.d;
                        int i23 = layoutParams.e;
                        int i24 = layoutParams.f;
                        i19 = layoutParams.g;
                        int i25 = layoutParams.t;
                        int i26 = layoutParams.v;
                        f5 = layoutParams.z;
                        if (i22 == -1 && i23 == -1) {
                            int i27 = layoutParams.q;
                            if (i27 != -1) {
                                int i28 = i27;
                                i5 = i23;
                                i16 = i28;
                                if (i24 == -1 && i19 == -1) {
                                    i6 = layoutParams.r;
                                    if (i6 == -1) {
                                        i4 = i25;
                                        i2 = i26;
                                    } else {
                                        int i29 = layoutParams.s;
                                        if (i29 != -1) {
                                            i4 = i25;
                                            i2 = i26;
                                            f2 = f5;
                                            i3 = i29;
                                            i6 = i24;
                                            i7 = layoutParams.m;
                                            if (i7 == -1) {
                                                C1716ta b2 = b(i7);
                                                if (b2 != null) {
                                                    a3.a(b2, layoutParams.o, layoutParams.n);
                                                }
                                            } else {
                                                if (i16 != -1) {
                                                    C1716ta b3 = b(i16);
                                                    if (b3 != null) {
                                                        c cVar = c.LEFT;
                                                        f3 = f2;
                                                        a3.a(cVar, b3, cVar, layoutParams.leftMargin, i4);
                                                    } else {
                                                        f3 = f2;
                                                    }
                                                } else {
                                                    f3 = f2;
                                                    if (i5 != -1) {
                                                        C1716ta b4 = b(i5);
                                                        if (b4 != null) {
                                                            a3.a(c.LEFT, b4, c.RIGHT, layoutParams.leftMargin, i4);
                                                        }
                                                    }
                                                }
                                                if (i6 != -1) {
                                                    C1716ta b5 = b(i6);
                                                    if (b5 != null) {
                                                        a3.a(c.RIGHT, b5, c.LEFT, layoutParams.rightMargin, i2);
                                                    }
                                                } else if (i3 != -1) {
                                                    C1716ta b6 = b(i3);
                                                    if (b6 != null) {
                                                        c cVar2 = c.RIGHT;
                                                        a3.a(cVar2, b6, cVar2, layoutParams.rightMargin, i2);
                                                    }
                                                }
                                                int i30 = layoutParams.h;
                                                if (i30 != -1) {
                                                    C1716ta b7 = b(i30);
                                                    if (b7 != null) {
                                                        c cVar3 = c.TOP;
                                                        a3.a(cVar3, b7, cVar3, layoutParams.topMargin, layoutParams.u);
                                                    }
                                                } else {
                                                    int i31 = layoutParams.i;
                                                    if (i31 != -1) {
                                                        C1716ta b8 = b(i31);
                                                        if (b8 != null) {
                                                            a3.a(c.TOP, b8, c.BOTTOM, layoutParams.topMargin, layoutParams.u);
                                                        }
                                                    }
                                                }
                                                int i32 = layoutParams.j;
                                                if (i32 != -1) {
                                                    C1716ta b9 = b(i32);
                                                    if (b9 != null) {
                                                        a3.a(c.BOTTOM, b9, c.TOP, layoutParams.bottomMargin, layoutParams.w);
                                                    }
                                                } else {
                                                    int i33 = layoutParams.k;
                                                    if (i33 != -1) {
                                                        C1716ta b10 = b(i33);
                                                        if (b10 != null) {
                                                            c cVar4 = c.BOTTOM;
                                                            a3.a(cVar4, b10, cVar4, layoutParams.bottomMargin, layoutParams.w);
                                                        }
                                                    }
                                                }
                                                int i34 = layoutParams.l;
                                                if (i34 != -1) {
                                                    View view = (View) this.a.get(i34);
                                                    C1716ta b11 = b(layoutParams.l);
                                                    if (!(b11 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams))) {
                                                        LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                                                        layoutParams.X = true;
                                                        layoutParams2.X = true;
                                                        a3.a(c.BASELINE).a(b11.a(c.BASELINE), 0, -1, b.STRONG, 0, true);
                                                        a3.a(c.TOP).j();
                                                        a3.a(c.BOTTOM).j();
                                                    }
                                                }
                                                float f6 = f3;
                                                if (f6 >= 0.0f && f6 != 0.5f) {
                                                    a3.a(f6);
                                                }
                                                float f7 = layoutParams.A;
                                                if (f7 >= 0.0f && f7 != 0.5f) {
                                                    a3.c(f7);
                                                }
                                            }
                                            if (isInEditMode && !(layoutParams.Q == -1 && layoutParams.R == -1)) {
                                                a3.c(layoutParams.Q, layoutParams.R);
                                            }
                                            if (!layoutParams.V) {
                                                a3.a(a.FIXED);
                                                a3.o(layoutParams.width);
                                            } else if (layoutParams.width == -1) {
                                                a3.a(a.MATCH_PARENT);
                                                a3.a(c.LEFT).e = layoutParams.leftMargin;
                                                a3.a(c.RIGHT).e = layoutParams.rightMargin;
                                            } else {
                                                a3.a(a.MATCH_CONSTRAINT);
                                                a3.o(0);
                                            }
                                            if (!layoutParams.W) {
                                                z = false;
                                                a3.b(a.FIXED);
                                                a3.g(layoutParams.height);
                                            } else if (layoutParams.height == -1) {
                                                a3.b(a.MATCH_PARENT);
                                                a3.a(c.TOP).e = layoutParams.topMargin;
                                                a3.a(c.BOTTOM).e = layoutParams.bottomMargin;
                                                z = false;
                                            } else {
                                                a3.b(a.MATCH_CONSTRAINT);
                                                z = false;
                                                a3.g(0);
                                            }
                                            str = layoutParams.B;
                                            if (str != null) {
                                                a3.b(str);
                                            }
                                            a3.b(layoutParams.E);
                                            a3.d(layoutParams.F);
                                            a3.h(layoutParams.G);
                                            a3.m(layoutParams.H);
                                            a3.a(layoutParams.I, layoutParams.K, layoutParams.M, layoutParams.O);
                                            a3.b(layoutParams.J, layoutParams.L, layoutParams.N, layoutParams.P);
                                        }
                                    }
                                }
                                i4 = i25;
                                i2 = i26;
                                i6 = i24;
                            } else {
                                i5 = layoutParams.p;
                            }
                        }
                        i5 = i23;
                        i16 = i22;
                        i6 = layoutParams.r;
                        if (i6 == -1) {
                        }
                    } else {
                        i6 = i18;
                        i2 = i21;
                        i4 = i20;
                        i5 = i17;
                    }
                    float f8 = f5;
                    i3 = i19;
                    f2 = f8;
                    i7 = layoutParams.m;
                    if (i7 == -1) {
                    }
                    a3.c(layoutParams.Q, layoutParams.R);
                    if (!layoutParams.V) {
                    }
                    if (!layoutParams.W) {
                    }
                    str = layoutParams.B;
                    if (str != null) {
                    }
                    a3.b(layoutParams.E);
                    a3.d(layoutParams.F);
                    a3.h(layoutParams.G);
                    a3.m(layoutParams.H);
                    a3.a(layoutParams.I, layoutParams.K, layoutParams.M, layoutParams.O);
                    a3.b(layoutParams.J, layoutParams.L, layoutParams.N, layoutParams.P);
                }
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public final C1716ta a(View view) {
        C1716ta taVar;
        if (view == this) {
            return this.d;
        }
        if (view == null) {
            taVar = null;
        } else {
            taVar = ((LayoutParams) view.getLayoutParams()).la;
        }
        return taVar;
    }

    private void a(int i2, int i3) {
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C1716ta taVar = layoutParams.la;
                if (!layoutParams.Y && !layoutParams.Z) {
                    taVar.n(childAt.getVisibility());
                    int i9 = layoutParams.width;
                    int i10 = layoutParams.height;
                    boolean z3 = layoutParams.V;
                    if (z3 || layoutParams.W || (!z3 && layoutParams.I == 1) || layoutParams.width == -1 || (!layoutParams.W && (layoutParams.J == 1 || layoutParams.height == -1))) {
                        if (i9 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingLeft, -2);
                            z2 = true;
                        } else if (i9 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i9 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingLeft, i9);
                        }
                        if (i10 == 0) {
                            i5 = ViewGroup.getChildMeasureSpec(i7, paddingTop, -2);
                            z = true;
                        } else if (i10 == -1) {
                            i5 = ViewGroup.getChildMeasureSpec(i7, paddingTop, -1);
                            z = false;
                        } else {
                            z = i10 == -2;
                            i5 = ViewGroup.getChildMeasureSpec(i7, paddingTop, i10);
                        }
                        childAt.measure(i4, i5);
                        C1381ia iaVar = this.t;
                        if (iaVar != null) {
                            iaVar.a++;
                        }
                        taVar.b(i9 == -2);
                        taVar.a(i10 == -2);
                        i9 = childAt.getMeasuredWidth();
                        i10 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    taVar.o(i9);
                    taVar.g(i10);
                    if (z2) {
                        taVar.q(i9);
                    }
                    if (z) {
                        taVar.p(i10);
                    }
                    if (layoutParams.X) {
                        int baseline = childAt.getBaseline();
                        if (baseline != -1) {
                            taVar.f(baseline);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        this.d.K();
        C1381ia iaVar = this.t;
        if (iaVar != null) {
            iaVar.c++;
        }
    }

    public View a(int i2) {
        return (View) this.a.get(i2);
    }
}
