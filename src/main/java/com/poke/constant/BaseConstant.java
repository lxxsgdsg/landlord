package com.poke.constant;

import com.poke.enums.FlowerEnum;

import static com.poke.enums.FlowerEnum.*;
import static com.poke.enums.FlowerEnum.DIAMOND;

/**
 * @author liuxinxin
 * @date 2021/1/21 上午11:31
 */

public class BaseConstant {
    /**
     * 牌模版1
     */
    public static final String IMAGE_BASE_URL_A = "src/main/resources/image/template1/";

    /**
     * 牌输出位置
     */
    public static final String POKE_EXPORT_TARGET = "/Users/liuxinxin/Downloads/poke/";

    /**
     * 基础牌面
     */
    public static final String[] POKE_NAME = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

    /**
     * 基础花色
     */
    public static final FlowerEnum[] FLOWERS = {SPADE, HEART, CLUB, DIAMOND};

    /**
     * 特殊牌面
     */
    public static final String[] SPECIAL_POKE_NAME = {"JOKER", "BIG_JOKER"};

    /**
     * 一副
     */
    public static final int ONE = 1;

    /**
     * 两幅
     */
    public static final int TWO = 2;

    /**
     * 三副
     */
    public static final int THREE = 3;

}
