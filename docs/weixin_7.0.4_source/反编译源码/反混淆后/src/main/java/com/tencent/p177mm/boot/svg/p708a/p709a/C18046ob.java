package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;
import com.tencent.view.C31128d;

/* renamed from: com.tencent.mm.boot.svg.a.a.ob */
public final class C18046ob extends C5163c {
    private final int height = 22;
    private final int width = 20;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 20;
            case 1:
                return 22;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-12404711);
                canvas.saveLayerAlpha(null, C31128d.MIC_PTU_ZIPAI_LIGHTWHITE, 4);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(10.0f, 0.0f);
                l.cubicTo(13.33002f, 3.351164f, 16.779324f, 6.5837026f, 20.0f, 10.043607f);
                l.cubicTo(19.990059f, 11.556079f, 19.264414f, 12.188747f, 17.823061f, 11.951496f);
                l.cubicTo(15.129225f, 9.470251f, 12.624254f, 6.791297f, 10.00994f, 4.240854f);
                l.cubicTo(7.365805f, 6.7814116f, 4.870775f, 9.470251f, 2.1769383f, 11.951496f);
                l.cubicTo(0.73558646f, 12.188747f, 0.009940358f, 11.546193f, 0.0f, 10.043607f);
                l.cubicTo(3.2107356f, 6.5738173f, 6.6799207f, 3.351164f, 10.0f, 0.0f);
                l.lineTo(10.0f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(20.0f, 20.046492f);
                l.cubicTo(19.990059f, 21.54951f, 19.264414f, 22.18236f, 17.833002f, 21.95493f);
                l.cubicTo(15.129225f, 19.472971f, 12.624254f, 16.793247f, 10.00994f, 14.242071f);
                l.cubicTo(7.365805f, 16.793247f, 4.870775f, 19.472971f, 2.166998f, 21.95493f);
                l.cubicTo(0.73558646f, 22.18236f, 0.009940358f, 21.54951f, 0.0f, 20.046492f);
                l.cubicTo(3.2107356f, 16.575705f, 6.6799207f, 13.362015f, 10.0f, 10.0f);
                l.cubicTo(13.33002f, 13.352126f, 16.789265f, 16.585594f, 20.0f, 20.046492f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
