package Lesson7.Task3;

import java.util.Date;

public class SupplyGoodsContract extends Document {
    String goodsType;
    int goodsNumber;

    public SupplyGoodsContract(int documentNumber, Date documentDate, String goodsType, int goodsNumber) {
        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.goodsNumber = goodsNumber;
    }

    public SupplyGoodsContract() {
    }

    @Override
    public String toString() {
        return "\t\nКонтракт на поставку товара" + "\t\nНомер документа: " + documentNumber + "\t\nДата документа: " + documentDate
                + "\t\nТип товара: " + goodsType + "\t\nКоличество товаров: " + goodsNumber;
    }
}
