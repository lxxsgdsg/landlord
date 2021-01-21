package com.poke.entity;

import com.poke.enums.PokeTypeEnum;
import lombok.Data;

import java.util.LinkedList;

import static com.poke.constant.BaseConstant.*;
import static com.poke.enums.FlowerEnum.JOKER;
import static com.poke.enums.PokeTypeEnum.COMPLETE_POKE;

/**
 * @author liuxinxin
 * @date 2021/1/21 上午11:33
 */

@Data
public class Poke {

    private LinkedList<Card> poke = new LinkedList<>();

    public Poke(PokeTypeEnum pokeTypeEnum, int count) {
        int counter = 0;
        while (counter < count) {
            for (int i = 0; i < POKE_NAME.length; i++) {
                for (int j = 0; j < FLOWERS.length; j++) {
                    this.poke.add(new Card(POKE_NAME[i], FLOWERS[j], j + i * FLOWERS.length));
                }
            }
            if (COMPLETE_POKE.equals(pokeTypeEnum)) {
                this.poke.add(new Card(SPECIAL_POKE_NAME[0], JOKER, 99));
                this.poke.add(new Card(SPECIAL_POKE_NAME[1], JOKER, 100));
            }
            counter++;
        }
    }

}
