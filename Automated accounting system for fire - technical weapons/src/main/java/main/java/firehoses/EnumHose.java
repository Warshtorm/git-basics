package main.java.firehoses;

public enum EnumHose{
    DU51("du51"),
    DU66("du66"),
    DU77("du77"),
    DU150("du150");

    private String translater;

    EnumHose(String translater) {
        this.translater = translater;
    }


    public static boolean isMatch(String str) {
        for (int i = 0; i < EnumHose.values().length; i++) {
            if (str.equals(EnumHose.values()[i].translater)) {
                return true;
            }
        }
        return false;
    }
}
