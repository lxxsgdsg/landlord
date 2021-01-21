package com.poke.entity;

import com.poke.enums.FlowerEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liuxinxin
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card implements Comparable<Card> {
    /**
     * 号码
     */
    private String name;

    /**
     * 花色
     */
    private FlowerEnum flower;

    /**
     * 等级
     */
    private int grade;


    @Override
    public String toString() {
        return this.flower.getName() + name;
    }

    @Override
    public int compareTo(Card o) {
        return o.grade - this.grade;
    }

}