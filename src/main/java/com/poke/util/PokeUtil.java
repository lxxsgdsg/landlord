package com.poke.util;

import com.poke.entity.Card;
import com.poke.entity.Poke;
import com.poke.enums.PokeTypeEnum;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.*;

import static com.poke.constant.BaseConstant.ONE;
import static com.poke.enums.PokeTypeEnum.COMPLETE_POKE;
import static com.poke.enums.PokeTypeEnum.WITHOUT_JOKER;

/**
 * @author liuxinxin
 */
public class PokeUtil {

    /**
     * landlord
     *
     * @param playerArr 玩家
     * @throws IOException
     * @throws InvalidFormatException
     */
    public static void landlord(String... playerArr) throws IOException, InvalidFormatException {
        List<Collection<Card>> collections = getPlayerContainer(playerArr);
        LinkedList<Card> poke = getPoke(COMPLETE_POKE, ONE);
        // 底牌数
        int ahand = 3;
        // 发牌
        while (poke.size() > ahand) {
            for (int i = 0; i < collections.size(); i++) {
                collections.get(i).add(poke.removeFirst());
            }
        }
        // 底牌
        LinkedList<Card> aHandContainer = new LinkedList<>();
        aHandContainer.addAll(poke);

        for (int i = 0; i < collections.size(); i++) {
            ExportUtil.exportDoc(collections.get(i), playerArr[i]);
        }
        ExportUtil.exportDoc(aHandContainer, "底牌");
    }

    /**
     * 每个人发固定的牌
     *
     * @param num       每人发牌数量
     * @param playerArr 玩家
     * @throws IOException
     * @throws InvalidFormatException
     */
    public static void licensingByNum(int num, String... playerArr) throws IOException, InvalidFormatException {
        List<Collection<Card>> collections = getPlayerContainer(playerArr);
        LinkedList<Card> poke = getPoke(WITHOUT_JOKER, ONE);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < collections.size(); j++) {
                collections.get(j).add(poke.removeFirst());
            }
        }
        for (int i = 0; i < collections.size(); i++) {
            ExportUtil.exportDoc(collections.get(i), playerArr[i]);
        }
    }

    /**
     * 获取玩家容器
     *
     * @param playerArr
     * @return
     */
    private static List<Collection<Card>> getPlayerContainer(String[] playerArr) {
        List<Collection<Card>> collections = new ArrayList<>(playerArr.length);
        for (int i = 0; i < playerArr.length; i++) {
            // 存储牌的容器
            TreeSet<Card> playerContainer = new TreeSet<>();
            collections.add(playerContainer);
        }
        return collections;
    }

    /**
     * 取牌
     *
     * @param pokeTypeEnum 牌组类型
     * @param count        几副
     * @return
     */
    private static LinkedList<Card> getPoke(PokeTypeEnum pokeTypeEnum, int count) {
        LinkedList<Card> poke = new Poke(pokeTypeEnum, count).getPoke();
        // 洗牌
        Collections.shuffle(poke);
        return poke;
    }

}