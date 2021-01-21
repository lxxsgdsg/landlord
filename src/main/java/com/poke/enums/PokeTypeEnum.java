package com.poke.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author liuxinxin
 * @date 2021/1/21 上午11:37
 */

@AllArgsConstructor
@Getter
public enum PokeTypeEnum {

    /**
     * 一整副
     */
    COMPLETE_POKE("COMPLETE_POKE"),

    /**
     * 没有JOKER
     */
    WITHOUT_JOKER("WITHOUT_JOKER");

    private final String type;
}
