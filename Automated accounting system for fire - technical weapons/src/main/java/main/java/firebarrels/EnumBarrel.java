package main.java.firebarrels;

public enum EnumBarrel{
    SPRK8("sprk8"),
    SPRK12("sprk12"),
    SPRK19("sprk19"),
    SPRK22("sprk22"),
    DU51("du51"),
    DU66("du66"),
    DU77("du77"),
    DU150("du150");

    private String translater;

    EnumBarrel(String translater) {
        this.translater = translater;
    }

    public static boolean isMatch(String str){
        for (int i = 0; i < EnumBarrel.values().length; i++ ){
            if (str.equals(EnumBarrel.values()[i].translater)){
                return true;
            }
        }
        return false;
    }
}
