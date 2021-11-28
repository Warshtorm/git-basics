package main.java.firebarrels;

public enum EnumBarrel{
    SPRK8("sprk8"),
    SPRK12("sprk12"),
    SPRK19("sprk19"),
    SPRK22("sprk22");

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
