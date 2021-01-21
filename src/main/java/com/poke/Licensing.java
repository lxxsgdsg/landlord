package com.poke;

import com.poke.util.PokeUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

import static com.poke.constant.PlayerConstant.*;

/**
 * @author liuxinxin
 */
public class Licensing {

    public static void main(String[] args) throws IOException, InvalidFormatException {
        PokeUtil.landlord(LIUXINXIN, LUOYANG, WEIWEI);
//        PokeUtil.licensingByNum(3, LIUXINXIN, LIERBAO);
    }

}