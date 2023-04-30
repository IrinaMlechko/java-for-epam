package by.mlechka.xml.entity;

import by.mlechka.xml.common.ChocolateTypeEnum;

public class Candy {

    private String id;
    private String name;
    private int energy;
    private IngredientType ingredientType = new IngredientType();
    private Value value = new Value();
    private String manufacturer;
    private String variety;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nId:");
        sb.append(id).append("\nName: ").append(name);
        sb.append("\nEnergy: ").append(energy).append(ingredientType).append(value);
        sb.append("\nManufacturer: ").append(manufacturer);
        sb.append("\nVariety: ").append(variety).append('\n');
        return sb.toString();
    }

    public Candy() {
    }

    public Candy(String id, String name, int energy, IngredientType ingredientType, Value value, String manufacturer, String variety) {
        this.id = id;
        this.name = name;
        this.energy = energy;
        this.ingredientType = ingredientType;
        this.value = value;
        this.manufacturer = manufacturer;
        this.variety = variety;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public IngredientType getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

//    public static class IngredientType {
//
//    private Integer water;
//    private Integer sugar;
//    private Integer fructose;
//    private ChocolateTypeEnum chocolateType;
//    private Integer vanilla;
//
//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("\nIngredientType:\n\tWater:");
//            sb.append(water).append("\n\tSugar: ").append(sugar);
//            sb.append("\n\tFructose: ").append(fructose);
//            sb.append("\n\tChocolateType: ").append(chocolateType);
//            sb.append("\n\tVanilla: ").append(vanilla).append('\n');
//            return sb.toString();
//        }
//
//        public IngredientType() {
//        }
//
//        public IngredientType(Integer water, Integer sugar, Integer fructose, ChocolateTypeEnum chocolateType, Integer vanilla) {
//            this.water = water;
//            this.sugar = sugar;
//            this.fructose = fructose;
//            this.chocolateType = chocolateType;
//            this.vanilla = vanilla;
//        }
//
//        public Integer getWater() {
//        return water;
//    }
//
//    public void setWater(int water) {
//        this.water = water;
//    }
//
//    public Integer getSugar() {
//        return sugar;
//    }
//
//    public void setSugar(Integer sugar) {
//        this.sugar = sugar;
//    }
//
//    public Integer getFructose() {
//        return fructose;
//    }
//
//    public void setFructose(Integer fructose) {
//        this.fructose = fructose;
//    }
//
//    public ChocolateTypeEnum getChocolateType() {
//        return chocolateType;
//    }
//
//    public void setChocolateType(ChocolateTypeEnum chocolateType) {
//        this.chocolateType = chocolateType;
//    }
//
//    public Integer getVanilla() {
//        return vanilla;
//    }
//
//    public void setVanilla(Integer vanilla) {
//        this.vanilla = vanilla;
//    }
//    }

    public static class IngredientType {
        private String name;
        private int amount;

        public IngredientType(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public IngredientType() {
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("\nIngredientType:\n\t:");
            sb.append(name).append("\n\tAmount: ").append(amount).append('\n');
            return sb.toString();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }

    public static class Value {

        private int protein;
        private int fat;
        private int carbohydrates;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("\nValue:\n\tProtein:");
            sb.append(protein).append("\n\tFat: ").append(fat);
            sb.append("\n\tCarbohydrates: ").append(carbohydrates).append('\n');
            return sb.toString();
        }

        public Value(int protein, int fat, int carbohydrates) {
            this.protein = protein;
            this.fat = fat;
            this.carbohydrates = carbohydrates;
        }

        public Value() {
        }

        public int getProtein() {
            return protein;
        }

        public void setProtein(int protein) {
            this.protein = protein;
        }


        public int getFat() {
            return fat;
        }

        public void setFat(int fat) {
            this.fat = fat;
        }


        public int getCarbohydrates() {
            return carbohydrates;
        }

        public void setCarbohydrates(int carbohydrates) {
            this.carbohydrates = carbohydrates;
        }
    }
}

