package main.java;

public enum EnumValue {
    SPRK8("sprk8"),
    SPRK12("sprk12"),
    SPRK19("sprk19"),
    SPRK22("sprk22"),
    DU51("du51"),
    DU66("du66"),
    DU77("du77"),
    DU150("du150");

    private String translater;

    EnumValue(String translater) {
        this.translater = translater;
    }

    public static boolean isMatch(String str){
        for (int i = 0; i < EnumValue.values().length; i++ ){
            if (str.equals(EnumValue.values()[i].translater)){
                return true;
            }
        }
        return false;
    }
}
