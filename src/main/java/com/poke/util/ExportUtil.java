package com.poke.util;

import com.poke.constant.BaseConstant;
import com.poke.entity.Card;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;

/**
 * @author liuxinxin
 * @date 2021/1/21 上午11:57
 */

public class ExportUtil {

    private static final String IMG_URL = BaseConstant.IMAGE_BASE_URL_A;
    private static final String TARGET_URL = BaseConstant.POKE_EXPORT_TARGET;

    public static void exportDoc(Collection<Card> player, String name) throws IOException, InvalidFormatException {
        // 创建一个document对象，相当于新建一个word文档（后缀名为.docx）。
        XWPFDocument document = new XWPFDocument();
        // 创建一个段落对象。
        XWPFParagraph paragraph = document.createParagraph();
        // 创建一个run。run具体是什么，我也不知道。但是run是这里面的最小单元了。
        XWPFRun run = paragraph.createRun();
        // 插入图片
        int i = 0;
        for (Card card : player) {
            run.addPicture(new FileInputStream(IMG_URL + card.toString() + ".jpg"),
                    XWPFDocument.PICTURE_TYPE_PNG,
                    "poke" + i,
                    Units.toEMU(15),
                    Units.toEMU(25));
        }
        // 创建一个输出流 即是该文档的保存位置
        OutputStream outputStream = new FileOutputStream(TARGET_URL + name + ".docx");
        document.write(outputStream);
        outputStream.close();
    }
}
