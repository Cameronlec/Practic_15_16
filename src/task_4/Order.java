package task_4;

import task_2.Item;

public interface Order {
    /*
    −добавления позиции в заказ
    (принимает ссылку типа Item),
    при этом возвращает логическое значение.
     */
    boolean addItem(Item addingItem);

    /*
    −удаляет позицию из заказа по его названию
    (принимает название блюда или напитка в качестве параметра).
     Возвращает логическое значение.
     */
    boolean deleteItemByName(String removingItemName);

    /*
    −удаляет все позиции с заданным именем
    (принимает название в качестве параметра).
     Возвращает число удаленных элементов.
     */
    int deleteAllItemsWithName(String itemName);

    /*
    −возвращает общее число позиций заказа в заказе.
     */
    int getItemsCount();

    /*
    −возвращает массив позиций заказа.
     */
    Item[] getItemsArray();

    /*
    −возвращает общую стоимость заказа.
     */
    double getOrderCost();

    /*
    −возвращает число заказанных блюд или напитков
    (принимает название в качестве параметра).
     */
    int getItemCountByName(String itemName);

    /*
    −возвращает массив названий заказанных блюд и напитков (без повторов).
     */
    String[] getItemsNames();

    /*
    −возвращает массив позиций заказа, отсортированный по убыванию цены
     */
    Item[] getItemsArrayOrderedByCostDesc();


}
