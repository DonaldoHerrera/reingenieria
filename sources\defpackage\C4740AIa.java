package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.app.C0325l.a;
import androidx.core.content.FileProvider;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: AIa reason: default package and case insensitive filesystem */
/* compiled from: ImageUtils */
public final class C4740AIa {
    private static final String a = "AIa";

    private C4740AIa() {
    }

    public static Options a(File file) throws IOException {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        FileInputStream fileInputStream = new FileInputStream(file);
        BitmapFactory.decodeStream(fileInputStream, null, options);
        fileInputStream.close();
        return options;
    }

    private static int b(File file) {
        if (file == null) {
            return -1;
        }
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            SDb.a(a).a((Throwable) e, "error", new Object[0]);
            return -1;
        }
    }

    private static Uri b(Activity activity, File file) {
        if (VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.a(activity, "com.soundcloud.android.provider.FileProvider", file);
    }

    private static Options a(File file, int i, int i2, boolean z) throws IOException {
        if (i == 0 || i2 == 0) {
            return new Options();
        }
        Options a2 = a(file);
        int i3 = a2.outHeight;
        int i4 = a2.outWidth;
        if (z) {
            if (i3 > i2 || i4 > i) {
                if (i2 / i3 < i / i4) {
                    a2.inSampleSize = Math.round(((float) i3) / ((float) i2));
                } else {
                    a2.inSampleSize = Math.round(((float) i4) / ((float) i));
                }
            }
        } else if (i2 / i3 > i / i4) {
            a2.inSampleSize = Math.round(((float) i3) / ((float) i2));
        } else {
            a2.inSampleSize = Math.round(((float) i4) / ((float) i));
        }
        return a2;
    }

    public static void a(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public static Bitmap a(File file, int i, int i2) {
        float f;
        float f2;
        try {
            Options a2 = a(file, i, i2, false);
            Options options = new Options();
            options.inSampleSize = a2.inSampleSize;
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            Matrix matrix = new Matrix();
            float f3 = 0.0f;
            if (decodeFile.getWidth() > decodeFile.getHeight()) {
                f2 = ((float) i2) / ((float) decodeFile.getHeight());
                f = (((float) i) - (((float) decodeFile.getWidth()) * f2)) * 0.5f;
            } else {
                f2 = ((float) i) / ((float) decodeFile.getWidth());
                f3 = (((float) i2) - (((float) decodeFile.getHeight()) * f2)) * 0.5f;
                f = 0.0f;
            }
            matrix.setScale(f2, f2);
            matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f3 + 0.5f)));
            int b = b(file);
            if (b != 0) {
                matrix.postRotate((float) b, (float) (i / 2), (float) (i2 / 2));
            }
            if (!matrix.isIdentity()) {
                decodeFile = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            }
            return decodeFile;
        } catch (IOException e) {
            SDb.a(a).a((Throwable) e, "error", new Object[0]);
            return null;
        }
    }

    public static boolean a(File file, ImageView imageView, int i, int i2) {
        try {
            Options a2 = a(file, i, i2, false);
            Options options = new Options();
            options.inSampleSize = a2.inSampleSize;
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (decodeFile == null) {
                SDb.a(a).f("error decoding %s", file);
                return false;
            }
            a(decodeFile, imageView, i, i2, b(file));
            return true;
        } catch (IOException e) {
            SDb.a(a).a((Throwable) e, "error", new Object[0]);
            return false;
        }
    }

    public static void a(Bitmap bitmap, ImageView imageView, int i, int i2, int i3) {
        float f;
        float f2;
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f3 = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
            f = 0.0f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f3 + 0.5f)));
        if (i3 != 0) {
            matrix.postRotate((float) i3, (float) (i / 2), (float) (i2 / 2));
        }
        imageView.setScaleType(ScaleType.MATRIX);
        imageView.setImageMatrix(matrix);
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
    }

    public static boolean a(File file, File file2, int i, int i2) throws IOException {
        int i3 = a(file, i, i2, false).inSampleSize;
        int b = b(file);
        if (i3 > 1 || b > 0) {
            FileInputStream fileInputStream = new FileInputStream(file);
            Options options = new Options();
            options.inSampleSize = i3;
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
            if (b != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) b);
                Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                decodeStream.recycle();
                decodeStream = createBitmap;
            }
            if (decodeStream != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                boolean compress = decodeStream.compress(CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.close();
                a(decodeStream);
                if (!compress) {
                    SDb.a(a).f("bitmap.compress returned false", new Object[0]);
                }
                return compress;
            }
            throw new IOException("error decoding bitmap (bitmap == null)");
        }
        SDb.a(a).f("not resizing: sampleSize %d, degree %d", Integer.valueOf(i3), Integer.valueOf(b));
        return false;
    }

    public static File a(Context context) {
        try {
            return File.createTempFile(Long.toString(System.currentTimeMillis()), ".bmp", C6630iGa.a(context, Environment.DIRECTORY_PICTURES));
        } catch (IOException e) {
            SDb.a(a).b(e, "error creating avatar temp file", new Object[0]);
            return null;
        }
    }

    public static void a(Activity activity, File file) {
        a aVar = new a(activity);
        aVar.b(new b(activity).c(p.image_where).a());
        aVar.c(p.take_new_picture, (OnClickListener) new C7731yIa(activity, file));
        aVar.a(p.use_existing_image, (OnClickListener) new C7800zIa(activity));
        C5232QGa.a((Dialog) aVar.a());
    }

    /* access modifiers changed from: private */
    public static void a(Activity activity, File file, int i) {
        if (file != null) {
            try {
                activity.startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", b(activity, file)), i);
            } catch (ActivityNotFoundException unused) {
                C5232QGa.a((Context) activity, p.take_new_picture_error, new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void a(Activity activity, int i) {
        try {
            activity.startActivityForResult(new Intent("android.intent.action.GET_CONTENT").setType("image/*"), i);
        } catch (ActivityNotFoundException unused) {
            C5232QGa.a((Context) activity, p.use_existing_image_error, new Object[0]);
        }
    }

    public static void a(Activity activity, Uri uri) {
        a(activity, uri, uri, 2048, 2048);
    }

    public static void a(Activity activity, Uri uri, Uri uri2) {
        a(activity, uri, uri2, 2048, 2048);
    }

    private static void a(Activity activity, Uri uri, Uri uri2, int i, int i2) {
        com.soundcloud.android.crop.b.a(uri, uri2).a().a(i, i2).a(activity);
    }

    public static void a(ImageView imageView) {
        if (imageView.getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
            if (bitmap != null && !bitmap.isRecycled()) {
                a(bitmap);
                imageView.setImageDrawable(null);
            }
        }
    }
}
