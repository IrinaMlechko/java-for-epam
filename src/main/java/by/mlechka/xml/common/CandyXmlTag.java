package by.mlechka.xml.common;

public enum CandyXmlTag {

    CANDIES("candies"),
    CANDY("candy"),
    INGREDIENTS("ingredients"),
    VALUE("value"),
    NAME("name"),
    ENERGY("energy"),
    WATER("water"),
    SUGAR("sugar"),
    FRUCTOSE("fructose"),
    CHOCOLATE("chocolateType"),
    VANILLA("vanilla"),
    PROTEIN("protein"),
    FAT("fat"),
    CARBOHYDRATES("carbohydrates"),
    MANUFACTURER("manufacturer"),
    VARIETY("variety")
    ;

    private String value;

    CandyXmlTag(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

}
