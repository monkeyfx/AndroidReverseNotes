package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class boa extends btd {
    public int kCl;
    public String kCm;
    public LinkedList<atf> wvw = new LinkedList();

    public boa() {
        AppMethodBeat.i(48942);
        AppMethodBeat.o(48942);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(48943);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(48943);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.kCl);
            if (this.kCm != null) {
                aVar.e(3, this.kCm);
            }
            aVar.e(4, 8, this.wvw);
            AppMethodBeat.o(48943);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.kCl);
            if (this.kCm != null) {
                ix += e.a.a.b.b.a.f(3, this.kCm);
            }
            int c = ix + e.a.a.a.c(4, 8, this.wvw);
            AppMethodBeat.o(48943);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wvw.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(48943);
                throw bVar;
            }
            AppMethodBeat.o(48943);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            boa boa = (boa) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        boa.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(48943);
                    return 0;
                case 2:
                    boa.kCl = aVar3.BTU.vd();
                    AppMethodBeat.o(48943);
                    return 0;
                case 3:
                    boa.kCm = aVar3.BTU.readString();
                    AppMethodBeat.o(48943);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        atf atf = new atf();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = atf.populateBuilderWithField(aVar4, atf, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        boa.wvw.add(atf);
                    }
                    AppMethodBeat.o(48943);
                    return 0;
                default:
                    AppMethodBeat.o(48943);
                    return -1;
            }
        } else {
            AppMethodBeat.o(48943);
            return -1;
        }
    }
}
