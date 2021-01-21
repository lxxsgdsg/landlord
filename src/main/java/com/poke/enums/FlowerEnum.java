package com.poke.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author liuxinxin
 * @date 2021/1/21 上午9:35
 */

@AllArgsConstructor
@Getter
public enum FlowerEnum {

    /**
     * 黑
     */
    SPADE("SPADE_", "♠"),

    /**
     * 红
     */
    HEART("HEART_", "♥"),

    /**
     * 梅
     */
    CLUB("CLUB_", "♣"),

    /**
     * 方
     */
    DIAMOND("DIAMOND_", "♦"),

    /**
     * 鬼
     */
    JOKER("JOKER_", "JOKER");

    private String name;
    private String shape;
}
