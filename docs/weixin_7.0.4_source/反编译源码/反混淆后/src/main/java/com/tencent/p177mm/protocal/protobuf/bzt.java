package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bzt */
public final class bzt extends C1331a {
    public String wYO;
    public String wYP;
    public String wYQ;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28657);
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.wYO != null) {
                c6093a.mo13475e(1, this.wYO);
            }
            if (this.wYP != null) {
                c6093a.mo13475e(2, this.wYP);
            }
            if (this.wYQ != null) {
                c6093a.mo13475e(3, this.wYQ);
            }
            AppMethodBeat.m2505o(28657);
            return 0;
        } else if (i == 1) {
            if (this.wYO != null) {
                f = C6091a.m9575f(1, this.wYO) + 0;
            } else {
                f = 0;
            }
            if (this.wYP != null) {
                f += C6091a.m9575f(2, this.wYP);
            }
            if (this.wYQ != null) {
                f += C6091a.m9575f(3, this.wYQ);
            }
            AppMethodBeat.m2505o(28657);
            return f;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(28657);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bzt bzt = (bzt) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bzt.wYO = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28657);
                    return 0;
                case 2:
                    bzt.wYP = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28657);
                    return 0;
                case 3:
                    bzt.wYQ = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28657);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28657);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28657);
            return -1;
        }
    }
}
